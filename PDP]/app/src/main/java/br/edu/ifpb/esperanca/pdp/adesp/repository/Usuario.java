package main.java.br.edu.ifpb.esperanca.pdp.adesp.repository;

public interface Usuario {

    public void accessSchedules();

    public void accessMaterial();

    public void accessCurriculum();

    public void markPaidSubjects(Subject subject);

    public void accessContacts(); //acessar contato dos professores

}