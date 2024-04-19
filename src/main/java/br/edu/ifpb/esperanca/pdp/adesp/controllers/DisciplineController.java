package br.edu.ifpb.esperanca.pdp.adesp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.esperanca.pdp.adesp.models.Discipline;
import br.edu.ifpb.esperanca.pdp.adesp.services.DisciplineService;

@RestController
public class DisciplineController {
    
    @Autowired
    private DisciplineService service;

    @GetMapping("/disciplines")
    public List<Discipline> getAllDiscipline() {
        return service.getAllDiscipline();
    }
}
