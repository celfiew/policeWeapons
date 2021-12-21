public abstract class Arma {

    private Policia policia;
    private int cantidadMuniciones;
    private int alcanceAproximadoMetros;
    private String marca;
    private int calibre;
    private String estado; //(“NUEVA”, “ENMANTENIMIENTO”, “EN USO”).


    public Arma(Policia policia, int cantidadMuniciones, int alcanceAproximadoMetros, String marca, int calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceAproximadoMetros = alcanceAproximadoMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public int getAlcanceAproximadoMetros() {
        return alcanceAproximadoMetros;
    }

    public boolean estaEnCondiciones(){
        return ((this.estado == "EN USO") && (this.calibre >= 9));
        }

        // Agrego esta parte como para jugar con el codigo, no la agrego al uml (para que tenga solo lo del ejercicio
    public void DatosdelPolicia(){

        System.out.println("\n Toda nuestra policía está capacitada para proteger su vida");
        System.out.println(" Recuerden que el uso de un arma conlleva una gran responsabilidad");
        System.out.println("\n Aquí encontrará los datos del policia\n ");
        System.out.println(policia.toString());
    }
}


