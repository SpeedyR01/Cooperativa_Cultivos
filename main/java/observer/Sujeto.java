package observer;

import modelo.LoteCafe;

public interface Sujeto {

    void suscribir(Observador o);

    void eliminar(Observador o);

    void notificar(LoteCafe lote);
}