package métier;
import métier.Aeroport;
import métier.Avion;
import métier.Vol;

public class TestVol {
    public static void main(String[] args) {

        Aeroport a1 = new Aeroport(
                1,
                "Aéroport Modibo Keita",
                "Bamako",
                "Mali"
        );

        Aeroport a2 = new Aeroport(
                2,
                "Charles De Gaulle",
                "Paris",
                "France"
        );

        Avion avion = new Avion(
                00001,
                "Boeing 737",
                180
        );

        Vol vol = new Vol(
                3,
                10/06/2026,
                "08:00",
                "14:00",
                350000,
                a1,
                a2,
                avion
        );


    }
}

