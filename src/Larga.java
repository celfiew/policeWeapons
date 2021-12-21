public class Larga extends Arma implements Comparable{

    private boolean tieneSelloRenar;
    private String descripcion;
    private int nivelDelArma;

    public Larga(Policia policia, int cantidadMuniciones, int alcanceAproximadoMetros, String marca, int calibre, String estado, boolean tieneSelloRenar, String descripcion, int nivelDelArma) {
        super(policia, cantidadMuniciones, alcanceAproximadoMetros, marca, calibre, estado);
        this.tieneSelloRenar = tieneSelloRenar;
        this.descripcion = descripcion;
        this.nivelDelArma = nivelDelArma;
    }

    @Override
    public int compareTo(Object o) {
        Larga armaComparable = (Larga) o;
        int resultado = 0;
        if (this.nivelDelArma > armaComparable.nivelDelArma){
            resultado = 1;
        } else if (this.nivelDelArma < armaComparable.nivelDelArma){
            resultado = -1;
        }
        return resultado;
    }
}
