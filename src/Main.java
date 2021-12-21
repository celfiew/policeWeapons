public class Main {
    public static void main(String[] args) {

        Policia andres = new Policia("Andres", "Santos","23k2");
        Policia miguel = new Policia("Miguel", "Perdomo","23m3");
        Policia daneira = new Policia("Daneira", "Heredia","23sde");


        Arma corta1 = new Corta(andres,100,300,"kx",32,"EN USO",true);
        Arma corta2 = new Corta(andres,110,100,"kx",8,"NUEVA",false);
        Arma corta3 = new Corta(daneira,300,1000,"ak45",33,"EN USO", false);


        System.out.println("--------armaCorta1------------- " );
        corta1.DatosdelPolicia();
        System.out.println("El arma corta1 está en condiciones: " + (corta1.estaEnCondiciones()? "Si\n" : "No\n"));
        System.out.println("El arma corta1 es de largo alcance: " + ((Corta)corta1).isLargoAlcance());

        System.out.println("--------armaCorta2------------- " );
        corta2.DatosdelPolicia();
        System.out.println("El arma corta2 está en condiciones: " + (corta2.estaEnCondiciones()? "Si\n" : "No\n"));
        System.out.println("El arma corta1 es de largo alcance: " + ((Corta)corta2).isLargoAlcance());

        System.out.println("------------------------------------");

        Arma larga1 = new Larga(miguel,20,400,"us",22,"EN USO", true,"Atrapar ladrones",10);
        Arma larga2 = new Larga(miguel,10,200,"us",30,"EN USO", false,"Atrapar ladrones",5);


        Larga armaLarga1 = (Larga) larga1;
        Larga armaLarga2 = (Larga) larga2;

        System.out.println("--------armaLarga1------------- " );
        larga1.DatosdelPolicia();
        System.out.println("El arma larga1 está en condiciones: " + (larga1.estaEnCondiciones()? "Si\n" : "No\n"));
        System.out.println("Es mayor el arma Larga1 que el arma larga2 ? " + (armaLarga1.compareTo(larga2) == 1 ? " Si\n" : " No\n"));

        System.out.println("--------armaLarga2------------- " );
        larga2.DatosdelPolicia();
        System.out.println("El arma larga2 está en condiciones: " + (larga2.estaEnCondiciones()? "Si\n" : "No\n"));
        System.out.println("Es mayor el arma Larga2 que el arma larga1 ? " + (armaLarga1.compareTo(larga2) == -1 ? " Si\n" : " No\n"));

    }
}
