public class Corta extends Arma{

    private static final int LIMITE_LARGO_CORTO_ALCANCE = 200;
    private boolean esAutomatica;

    public Corta(Policia policia, int cantidadMuniciones, int alcanceAproximadoMetros, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policia, cantidadMuniciones, alcanceAproximadoMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public String isLargoAlcance(){
        return (getAlcanceAproximadoMetros() > LIMITE_LARGO_CORTO_ALCANCE ? " Si, tiene un alcance mayor a 200 metros\n" : " No, Tiene un alcance menor a 200 metros\n");

    }

}
