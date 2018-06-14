package Insecte;
public class Fourmis extends Insecte {

    private String type = "Fourmis";
    private int nbPattes = 8;
    private boolean antennes = true;
    private int strengh = 10;
    private int life = 100;

    public Fourmis(String name) {
        super(name);
    }


    public int getPattes() {
        return this.nbPattes;
    }


    public void presentation() {
        System.out.println("Hello je suis un insecte, " + this.type + ", et je m'appel " + getName());
    }
}
