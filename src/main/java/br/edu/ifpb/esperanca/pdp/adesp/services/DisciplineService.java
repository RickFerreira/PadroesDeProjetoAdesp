package br.edu.ifpb.esperanca.pdp.adesp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.esperanca.pdp.adesp.models.Discipline;
import br.edu.ifpb.esperanca.pdp.adesp.repositories.DisciplineRepository;

@Service
public class DisciplineService {
    
    @Autowired
    private DisciplineRepository repository;

    public List<Discipline> getAllDiscipline() {
        return repository.findAll();
    }
}
