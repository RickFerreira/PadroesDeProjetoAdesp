package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class Discipline {
    private int id_discipline;
    private String name, course, period;

    public Discipline(String name, String course, String period) { // to create
        this.name = name;
        this.course = course;
        this.period = period;
    }

    public Discipline(int id_discipline, String name, String course, String period) { // to update
        this.id_discipline = id_discipline;
        this.name = name;
        this.course = course;
        this.period = period;
    }

    public int getId_discipline() {
        return id_discipline;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public String getPeriod() {
        return period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }
}
