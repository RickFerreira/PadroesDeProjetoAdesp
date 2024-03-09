package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class Admin {
    private int id_adm;
    private String name, password;
    
    public Admin(String name, String password) { // to create
        this.name = name;
        this.password = password;
    }

    public Admin(int id_adm, String name, String password) { // to update
        this.id_adm = id_adm;
        this.name = name;
        this.password = password;
    }

    public int getId_adm() {
        return id_adm;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
