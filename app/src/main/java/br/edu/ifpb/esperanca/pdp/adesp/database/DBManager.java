package br.edu.ifpb.esperanca.pdp.adesp.database;

import br.edu.ifpb.esperanca.pdp.adesp.domain.*;

import java.sql.Connection;
import java.util.List;

public class DBManager implements DBService {

    private Connection con;
    public DBManager() {
        con = DBConnection.getInstance().getConnection();
    }
    @Override
    public List<ClassSchedule> getAllClassSchedules() {
        return null;
    }

    @Override
    public List<Discipline> getAllDisciplines() {
        return null;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return null;
    }

    @Override
    public List<ClassLocation> getAllLocations() {
        return null;
    }

    @Override
    public List<WeekDay> getAlDays() {
        return null;
    }

    @Override
    public List<Schedule> getAllSchedules() {
        return null;
    }

    @Override
    public List<Material> getAllMaterials() {
        return null;
    }

    @Override
    public List<ClassSchedule> getTeacherSchedule(Teacher teacher) {
        return null;
    }

    @Override
    public List<ClassSchedule> getLocationSchedule(ClassLocation classLocation) {
        return null;
    }

    @Override
    public List<ClassSchedule> getPeriodSchedule(int period) {
        return null;
    }

    @Override
    public void createClassSchedule(List<ClassSchedule> classSchedules) {

    }

    @Override
    public void updateClassSchedule(List<ClassSchedule> classSchedules) {

    }

    @Override
    public void deleteClassSchedule(int idClassSchedule) {

    }

    @Override
    public void createMaterial(Material material) {

    }

    @Override
    public void updateMaterial(Material material) {

    }

    @Override
    public void deleteMaterial(int idMaterial) {

    }
}
