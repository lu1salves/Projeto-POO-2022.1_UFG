package com.br.escolar.controller;

import com.br.escolar.domain.Aluno;
import com.br.escolar.domain.dto.AlunoDto;
import com.br.escolar.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/alunos")
@AllArgsConstructor
public class AlunoController {

    private AlunoService alunoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoDto> listar() {
        return alunoService.findAll();
    }

    @GetMapping("/{mattricula}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<AlunoDto> buscar(@PathVariable String mattricula) {
        return alunoService.findById(mattricula);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlunoDto salvar(@RequestBody @Valid Aluno alunos) {
        return alunoService.create(alunos);
    }

    @PutMapping("/{matricula}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoDto atualizar(@PathVariable String matricula, @RequestBody Aluno alunos) {

        alunos.setMatricula(matricula);
        AlunoDto alunosAtualizado = alunoService.update(alunos);
        return  alunosAtualizado;
    }


    @DeleteMapping("/{matricula}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String matricula) {

        alunoService.delete(matricula);
    }


}
