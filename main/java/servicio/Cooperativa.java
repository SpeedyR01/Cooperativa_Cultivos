package servicio;

import modelo.LoteCafe;
import observer.Observador;
import observer.Sujeto;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa implements Sujeto {

    private List<Observador> baristas;

    public Cooperativa() {
        baristas = new ArrayList<>();
    }

    @Override
    public void suscribir(Observador o) {
        baristas.add(o);
    }

    @Override
    public void eliminar(Observador o) {
        baristas.remove(o);
    }

    @Override
    public void notificar(LoteCafe lote) {
        for (Observador o : baristas) {
            o.actualizar(lote);
        }
    }

    public void registrarNuevoLote(LoteCafe lote) {
        System.out.println("Nuevo microlote registrado en la cooperativa");
        notificar(lote);
    }
}