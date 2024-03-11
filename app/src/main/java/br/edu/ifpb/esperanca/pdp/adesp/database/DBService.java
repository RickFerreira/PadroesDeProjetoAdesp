package br.edu.ifpb.esperanca.pdp.adesp.database;
import br.edu.ifpb.esperanca.pdp.adesp.domain.*;
import java.util.List;

// review
public interface DBService {
    List<ClassSchedule> getAllClassSchedules();
    List<Discipline> getAllDisciplines();
    List<Teacher> getAllTeachers();
    List<ClassLocation> getAllLocations();
    List<WeekDay> getAlDays();
    List<Schedule> getAllSchedules();
    List<Material> getAllMaterials();

    List<ClassSchedule> getTeacherSchedule(Teacher teacher);
    List<ClassSchedule> getLocationSchedule(ClassLocation classLocation);
    List<ClassSchedule> getPeriodSchedule(int period);

    void createClassSchedule(List<ClassSchedule> classSchedules);
    void updateClassSchedule(List<ClassSchedule> classSchedules);
    void deleteClassSchedule(int idClassSchedule);

    void createMaterial(Material material);
    void updateMaterial(Material material);
    void deleteMaterial(int idMaterial);
}
