package br.edu.ifpb.esperanca.pdp.adesp.domain;

// review
public class Material {
    private int id_material;
    private String title, link;
    private int id_Discipline;
    
    public Material(String title, String link, int id_Discipline) { // to create
        this.title = title;
        this.link = link;
        this.id_Discipline = id_Discipline;
    }

    public Material(int id_material, String title, String link, int id_Discipline) { // to update
        this.id_material = id_material;
        this.title = title;
        this.link = link;
        this.id_Discipline = id_Discipline;
    }

    public int getId_material() {
        return id_material;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getLink() {
        return link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }
    
    public int getId_Discipline() {
        return id_Discipline;
    }
    
    public void setId_Discipline(int id_Discipline) {
        this.id_Discipline = id_Discipline;
    }
}
