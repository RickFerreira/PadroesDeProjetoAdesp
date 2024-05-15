package br.edu.ifpb.esperanca.pdp.adesp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.esperanca.pdp.adesp.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
