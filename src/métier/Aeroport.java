package métier;

public class Aeroport {
    private int id;
    private String nom;
    private String ville;
    private String pays;

    public Aeroport(int id, String nom, String ville, String pays){

        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void afficheinfo(){

        System.out.println("Aoreport :"  + nom + "," + ville + ", " + pays);
    }

}
