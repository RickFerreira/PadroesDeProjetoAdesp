package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class ClassSchedule {
    private int id_classSchedule;
    private Discipline discipline;
    private Teacher teacher;
    private Schedule schedule;
    private ClassLocation classLocation;
    private WeekDay weekDay;

    // to create
    public ClassSchedule(Discipline discipline, Teacher teacher, Schedule schedule, ClassLocation classLocation, WeekDay weekDay) {
        this.discipline = discipline;
        this.teacher = teacher;
        this.schedule = schedule;
        this.classLocation = classLocation;
        this.weekDay = weekDay;
    }

    // to update
    public ClassSchedule(int id_classSchedule, Discipline discipline, Teacher teacher, Schedule schedule, ClassLocation classLocation, WeekDay weekDay) {
        this.id_classSchedule = id_classSchedule;
        this.discipline = discipline;
        this.teacher = teacher;
        this.schedule = schedule;
        this.classLocation = classLocation;
        this.weekDay = weekDay;
    }

    public int getId_classSchedule() {
        return id_classSchedule;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public ClassLocation getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(ClassLocation classLocation) {
        this.classLocation = classLocation;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

}
