package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class WeekDay {
    private int id_day;
    private String name;
    
    public WeekDay(String name) { // to create
        this.name = name;
    }
    
    public WeekDay(int id_day, String name) { // to update
        this.id_day = id_day;
        this.name = name;
    }

    public int getId_day() {
        return id_day;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
