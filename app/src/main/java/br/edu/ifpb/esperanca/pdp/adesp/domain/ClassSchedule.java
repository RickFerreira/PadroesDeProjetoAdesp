package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class ClassSchedule {
    private int id_classSchedule;
    private int id_adm;
    private int id_Discipline, id_teacher, id_schedule, id_day, id_location;

    public ClassSchedule(
    int id_adm, 
    int id_Discipline, 
    int id_teacher, 
    int id_schedule, 
    int id_day, 
    int id_location) { // to create
        this.id_adm = id_adm;
        this.id_Discipline = id_Discipline;
        this.id_teacher = id_teacher;
        this.id_schedule = id_schedule;
        this.id_day = id_day;
        this.id_location = id_location;
    }

    public ClassSchedule(int id_classSchedule, 
    int id_adm, 
    int id_Discipline, 
    int id_teacher, 
    int id_schedule,
    int id_day, 
    int id_location) { // to update
        this.id_classSchedule = id_classSchedule;
        this.id_adm = id_adm;
        this.id_Discipline = id_Discipline;
        this.id_teacher = id_teacher;
        this.id_schedule = id_schedule;
        this.id_day = id_day;
        this.id_location = id_location;
    }

    public int getId_classSchedule() {
        return id_classSchedule;
    }
    
    public int getId_adm() {
        return id_adm;
    }
    
    public int getId_Discipline() {
        return id_Discipline;
    }
    
    public void setId_Discipline(int id_Discipline) {
        this.id_Discipline = id_Discipline;
    }
    
    public int getId_teacher() {
        return id_teacher;
    }
    
    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }
    
    public int getId_schedule() {
        return id_schedule;
    }
    
    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }
    
    public int getId_day() {
        return id_day;
    }
    
    public void setId_day(int id_day) {
        this.id_day = id_day;
    }
    
    public int getId_location() {
        return id_location;
    }
    
    public void setId_location(int id_location) {
        this.id_location = id_location;
    }
}
