package modelo;

public class LoteCafe {

    private String varietal;
    private String notas;
    private String origen;
    private double alturaCultivo;
    private String productor;
    private double cantidadLibras;

    public LoteCafe(String varietal, String notas, String origen,
                    double alturaCultivo, String productor,
                    double cantidadLibras) {
        this.varietal = varietal;
        this.notas = notas;
        this.origen = origen;
        this.alturaCultivo = alturaCultivo;
        this.productor = productor;
        this.cantidadLibras = cantidadLibras;
    }

    public String getInformacion() {
        return "Varietal: " + varietal +
                "\nNotas: " + notas +
                "\nOrigen: " + origen +
                "\nAltura: " + alturaCultivo + " msnm" +
                "\nProductor: " + productor +
                "\nCantidad: " + cantidadLibras + " libras";
    }
}