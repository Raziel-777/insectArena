package Insecte;
public abstract class Insecte {

    private int maxSize;
    private int minSize;
    private String name;

    public Insecte(String name) {

        maxSize = 5;
        minSize = 1;

        this.setName(name);

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public abstract void presentation();

}
