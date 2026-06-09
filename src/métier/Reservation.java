package métier;

import java.util.Date;

public class Reservation {
    private int numeroReservation;
    private Date dateReservation;
    private String statut;

    public Reservation(String numeroReservation, Passager dateReservation, Vol statut) {

        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public Reservation(int r001, Passager p1, Vol vol) {
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "statut='" + statut + '\'' +
                '}';
    }

    public String confirmer() {
        statut = confirmer();
        return null;
    }
}
