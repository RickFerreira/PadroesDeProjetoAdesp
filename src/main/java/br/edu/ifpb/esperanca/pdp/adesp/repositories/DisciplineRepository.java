package br.edu.ifpb.esperanca.pdp.adesp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.esperanca.pdp.adesp.models.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
