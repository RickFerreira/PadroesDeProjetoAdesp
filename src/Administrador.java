public interface Administrador {
    public void acessarAdm(String nome, String senha);


    public void acessarHorarioCurso(Periodo periodo);
    public void acessarHorarioProfessor(Professor professor);
    public void addHorario(Periodo periodo); //disciplina - horario - diaSemana - professor | POO - 8H40 - Quarta
    public void updateHorario(Periodo periodo);
    public void deleteHorario(Periodo periodo);


    public void addDisciplina();
    public void deleteDisciplina();
    public void updateDisciplina();


    public void addProfessor(String nome, String contato);
    public void updateProfessor(String contato);
    public void deleteProfessor(Id id);


    public void addSala();
    public void updateSala();
    public void deleteSala();


    public void addLab();
    public void updateLab();
    public void deleteLab();


    public void acessarMatriz();
    public void addMatriz();
    public  void updateMatriz();
    public void deleteMatriz();


    public void acessarMaterial(Disciplina disciplina);
    public void addMaterial(Disciplina disciplina); //disciplina
    public void updateMaterial();
    public void deleteMaterial();


    public void addContatos();
    public void updateContatos();
    public void deleteContatos();
}
