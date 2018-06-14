package Insecte;
public class Cafard extends Insecte {

    private String type = "Cafard";
    private int nbPattes = 6;
    private int strenght = 5;
    private int life = 200;

    public Cafard(String name) {
        super(name);
    }


    public int getPattes() {
        return this.nbPattes;
    }

    public String getType() {
        return this.type;
    }


    public void presentation() {
        System.out.println("Hello je suis un insecte, "+this.type+ ", et je m'appel " +getName() );
    }


}
