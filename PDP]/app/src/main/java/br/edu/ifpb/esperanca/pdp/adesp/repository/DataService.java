package main.java.br.edu.ifpb.esperanca.pdp.adesp.repository;

import javax.security.auth.Subject;

import main.java.br.edu.ifpb.esperanca.pdp.adesp.domain.ClassSchedule;
import main.java.br.edu.ifpb.esperanca.pdp.adesp.domain.LocationClassroom;
import main.java.br.edu.ifpb.esperanca.pdp.adesp.domain.Teacher;

public interface DataService {
    void login(Admin adm);
    
    void createClassSchedule(ClassSchedule classSchedule); // cria horario de aula
    void updateClassSchedule(ClassSchedule classSchedule);
    void deleteClassSchedule(ClassSchedule classSchedule);

    void getAllClassSchedule();
    void filterByPeriod(Subject subject);
    void filterByTeacher(Teacher teacher);
    void filterByLocation(LocationClassroom location);
}
