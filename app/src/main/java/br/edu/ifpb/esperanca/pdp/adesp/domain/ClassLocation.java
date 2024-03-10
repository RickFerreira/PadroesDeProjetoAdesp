package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class ClassLocation {
    private int id_location;
    private String name, type; // type: 'lab' or 'classroom'

    public ClassLocation(String name, String type) { // to create
        this.name = name;
        this.type = type;
    }

    public ClassLocation(int id_location, String name, String type) { // to update
        this.id_location = id_location;
        this.name = name;
        this.type = type;
    }

    public int getId_location() {
        return id_location;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
