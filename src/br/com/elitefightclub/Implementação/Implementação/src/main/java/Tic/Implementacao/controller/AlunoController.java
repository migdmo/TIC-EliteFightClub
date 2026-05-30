package Tic.Implementacao.controller;


import Tic.Implementacao.service.AlunoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aluno")
public class AlunoController {

    private AlunoService service;

    public AlunoController(AlunoService service){
        this.service = service;
    }


}
