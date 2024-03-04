package main.java.br.edu.ifpb.esperanca.pdp.adesp.repository;


public interface Administrator {
    public void accessAdmin(String name, String password);


    public void accessCourseSchedule(Period period);
    public void accessTeacherSchedule(Teacher teacher);
    public void addSchedule(Period period); //disciplina - horario - diaSemana - professor | POO - 8H40 - Quarta
    public void updateSchedule(Period period);
    public void deleteSchedule(Period period);

    
    public void addSubject(); //Disciplina
    public void deleteSubject();
    public void updateSubject();


    public void addTeacher(String name, String contact); //Professor
    public void updateTeacher(String contact);
    public void deleteTeacher(Id id);


    public void addRoom(); //Sala
    public void updateRoom();
    public void deleteRoom();


    public void accessCurriculum(); //Matriz
    public void addCurriculum();
    public void updateCurriculum();
    public void deleteCurriculum();


    public void accessMaterial(Subject subject);
    public void addMaterial(Subject subject); //Disciplina e materiais
    public void updateMaterial();
    public void deleteMaterial();


    public void addContacts(); //Contatos
    public void updateContacts();
    public void deleteContacts();
}