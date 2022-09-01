package com.br.escolar.service;

import com.br.escolar.domain.Professor;
import com.br.escolar.domain.dto.ProfessorDto;
import com.br.escolar.excption.ObjectNotFounExcption;
import com.br.escolar.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProfessorService {

    private ProfessorRepository professorRepository;


    public Optional<ProfessorDto> findById(String id) {

        if(!professorRepository.existsById(id)) {
            throw new ObjectNotFounExcption();
        }

        return Optional.of(new ProfessorDto(professorRepository.findById(id)));
    }


    public List<ProfessorDto> findAll(){

        List<ProfessorDto> listDtoProfessors = professorRepository.findAll()
                .stream()
                .map(professors -> new ProfessorDto(Optional.ofNullable(professors)))
                .collect(Collectors.toList());

        return listDtoProfessors;
    }

    public ProfessorDto create(Professor professor){
        Professor professorSave = professorRepository.save(professor);
        return new ProfessorDto(professorSave);
    }

    public ProfessorDto update(Professor professor){
        this.findById(professor.getMatricula());
        professorRepository.save(professor);
        return new ProfessorDto(professor);
    }

    public void delete(String matricula){
        this.findById(matricula);
         professorRepository.deleteById(matricula);
    }
}
