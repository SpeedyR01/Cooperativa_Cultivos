package app;

import modelo.LoteCafe;
import servicio.Barista;
import servicio.Cooperativa;

public class Main {

    public static void main(String[] args) {

        Cooperativa cooperativa = new Cooperativa();

        Barista b1 = new Barista("Laura", "101");
        Barista b2 = new Barista("Andrés", "202");

        cooperativa.suscribir(b1);
        cooperativa.suscribir(b2);

        LoteCafe lote = new LoteCafe(
                "Geisha",
                "Frutos rojos, florales, acidez brillante",
                "Génova, Quindío",
                1800,
                "Don Felipe",
                48
        );

        cooperativa.registrarNuevoLote(lote);
    }
}