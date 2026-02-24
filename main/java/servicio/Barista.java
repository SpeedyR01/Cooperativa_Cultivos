package servicio;

import modelo.LoteCafe;
import observer.Observador;

public class Barista implements Observador {

    private String nombre;
    private String identificacion;

    public Barista(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    @Override
    public void actualizar(LoteCafe lote) {
        System.out.println("Notificación para: " + nombre);
        System.out.println(lote.getInformacion());
        System.out.println("--------------------------------");
    }

    public String getNombre() {
        return nombre;
    }
}