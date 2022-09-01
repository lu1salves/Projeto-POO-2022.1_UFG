package com.br.escolar.controller;

import com.br.escolar.domain.Turma;
import com.br.escolar.domain.dto.TurmaDto;
import com.br.escolar.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/turmas")
@AllArgsConstructor
public class TurmaController {

    private TurmaService turmaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TurmaDto> listar() {
        return turmaService.findAll();
    }

    @GetMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<TurmaDto> buscar(@PathVariable String codigo) {
        return turmaService.findById(codigo);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TurmaDto salvar(@RequestBody @Valid Turma turmas) {
        return turmaService.create(turmas);
    }

    @PutMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public TurmaDto atualizar(@PathVariable String codigo, @RequestBody Turma turmas) {

        turmas.setCodigoTurma(codigo);
        TurmaDto turmasAtualizado = turmaService.update(turmas);
        return  turmasAtualizado;
    }


    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String codigo) {

        turmaService.delete(codigo);
    }


}
