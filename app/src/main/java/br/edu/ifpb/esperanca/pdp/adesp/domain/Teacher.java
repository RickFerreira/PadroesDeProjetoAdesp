package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class Teacher {
    private int id_teacher;
    private String name, contact;

    public Teacher(String name, String contact) { // to create
        this.name = name;
        this.contact = contact;
    }

    public Teacher(int id_teacher, String name, String contact) { // to update
        this.id_teacher = id_teacher;
        this.name = name;
        this.contact = contact;
    }

    public int getId_teacher() {
        return id_teacher;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
}
