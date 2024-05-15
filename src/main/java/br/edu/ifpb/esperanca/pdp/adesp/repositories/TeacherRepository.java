package br.edu.ifpb.esperanca.pdp.adesp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.esperanca.pdp.adesp.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
