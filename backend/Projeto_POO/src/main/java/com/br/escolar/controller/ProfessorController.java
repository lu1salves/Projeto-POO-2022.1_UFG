package com.br.escolar.controller;

import com.br.escolar.domain.Professor;
import com.br.escolar.domain.dto.ProfessorDto;
import com.br.escolar.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/professores")
@AllArgsConstructor
public class ProfessorController {

    private ProfessorService professorService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProfessorDto> listar() {
        return professorService.findAll();
    }

    @GetMapping("/{mattricula}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProfessorDto> buscar(@PathVariable String mattricula) {
        return professorService.findById(mattricula);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProfessorDto salvar(@RequestBody @Valid Professor professors) {
        return professorService.create(professors);
    }

    @PutMapping("/{matricula}")
    @ResponseStatus(HttpStatus.OK)
    public ProfessorDto atualizar(@PathVariable String matricula, @RequestBody Professor professors) {

        professors.setMatricula(matricula);
        ProfessorDto professorsAtualizado = professorService.update(professors);
        return  professorsAtualizado;
    }


    @DeleteMapping("/{matricula}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String matricula) {

        professorService.delete(matricula);
    }


}
