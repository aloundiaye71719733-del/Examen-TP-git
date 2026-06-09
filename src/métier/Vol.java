package métier;

public class Vol {
    private String numeroVol;
    private String dateDepart;
    private String heureDepart;
    private String heureArrivee;
    private double prix;

    public Vol(String numeroVol, String dateDepart, String heureDepart, String heureArrivee, double prix, Aeroport a0, Aeroport a1, Avion a){

        this.numeroVol = numeroVol;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.prix = prix;


    }

    public Vol(int i, int i1, String time, String time1, int prix, Aeroport a1, Aeroport a2, Avion avion) {
    }

    public Vol(String numero, String date, String hDep, String hArr, double prix) {
    }

    public static void afficherVol() {
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "numeroVol='" + numeroVol + '\'' +
                ", dateDepart=" + dateDepart +
                ", heureDepart='" + heureDepart + '\'' +
                ", heureArrivee='" + heureArrivee + '\'' +
                ", prix=" + prix +
                '}';
    }


}
