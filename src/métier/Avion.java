package métier;

public class Avion {
    private int id;
    private String modele;
    private int capacite;

    public Avion(int id, String modele, int capacite){

        this.id = id;
        this.modele = modele;
        this.capacite = capacite;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public void afficherinfos(){

        System.out.println("Avion :" + modele + "," + capacite );
    }
}
