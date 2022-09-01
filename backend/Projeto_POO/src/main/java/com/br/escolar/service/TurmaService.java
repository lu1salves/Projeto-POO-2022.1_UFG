package com.br.escolar.service;

import com.br.escolar.domain.Turma;
import com.br.escolar.domain.dto.TurmaDto;
import com.br.escolar.excption.ObjectNotFounExcption;
import com.br.escolar.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TurmaService {

    private TurmaRepository turmaRepository;


    public Optional<TurmaDto> findById(String id) {

        if(!turmaRepository.existsById(id)) {
            throw new ObjectNotFounExcption();
        }

        return Optional.of(new TurmaDto(turmaRepository.findById(id)));
    }


    public List<TurmaDto> findAll(){

        List<TurmaDto> listDtoTurmas = turmaRepository.findAll()
                .stream()
                .map(turmas -> new TurmaDto(Optional.ofNullable(turmas)))
                .collect(Collectors.toList());

        return listDtoTurmas;
    }

    public TurmaDto create(Turma turma){
        Turma turmaSave = turmaRepository.save(turma);
        return new TurmaDto(turmaSave);
    }

    public TurmaDto update(Turma turma){
        this.findById(turma.getCodigoTurma());
        turmaRepository.save(turma);
        return new TurmaDto(turma);
    }

    public void delete(String codigo){
        this.findById(codigo);
         turmaRepository.deleteById(codigo);
    }
}
