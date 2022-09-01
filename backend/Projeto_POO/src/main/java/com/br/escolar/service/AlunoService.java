package com.br.escolar.service;

import com.br.escolar.domain.Aluno;
import com.br.escolar.domain.dto.AlunoDto;
import com.br.escolar.excption.ObjectNotFounExcption;
import com.br.escolar.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AlunoService {

    private AlunoRepository alunoRepository;


    public Optional<AlunoDto> findById(String id) {

        if(!alunoRepository.existsById(id)) {
            throw new ObjectNotFounExcption();
        }

        return Optional.of(new AlunoDto(alunoRepository.findById(id)));
    }


    public List<AlunoDto> findAll(){

        List<AlunoDto> listDtoAlunos = alunoRepository.findAll()
                .stream()
                .map(alunos -> new AlunoDto(Optional.ofNullable(alunos)))
                .collect(Collectors.toList());

        return listDtoAlunos;
    }

    public AlunoDto create(Aluno aluno){
        Aluno alunoSave = alunoRepository.save(aluno);
        return new AlunoDto(alunoSave);
    }

    public AlunoDto update(Aluno aluno){
        this.findById(aluno.getMatricula());
        alunoRepository.save(aluno);
        return new AlunoDto(aluno);
    }

    public void delete(String matricula){
        this.findById(matricula);
         alunoRepository.deleteById(matricula);
    }
}
