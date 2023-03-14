package composite;

public class Master {

    public static void main(String[] args) {
        GrupoForma formas = new GrupoForma("forma");
        Forma forma1 = new Forma("Circulo", "azul");
        Forma forma2 = new Forma("Quadrado", "amarelo");



        forma1.imprimir();
        forma2.imprimir();

        formas.addForma(forma2);
        formas.addForma(forma1);

        formas.imprimir();

    }

}
