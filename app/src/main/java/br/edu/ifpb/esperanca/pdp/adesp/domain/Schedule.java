package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class Schedule {
    private int id_schedule;
    private String start_end; // 8:40 - 9:30
    
    public Schedule(String start_end) { // to create
        this.start_end = start_end;
    }
    
    public Schedule(int id_schedule, String start_end) { // to update
        this.id_schedule = id_schedule;
        this.start_end = start_end;
    }
    
    public int getId_schedule() {
        return id_schedule;
    }
    
    public String getStart_end() {
        return start_end;
    }
    
    public void setStart_end(String start_end) {
        this.start_end = start_end;
    }
}
