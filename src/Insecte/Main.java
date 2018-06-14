package Insecte;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.lang.reflect.Constructor;

public class Main {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {


        Scanner toto = new Scanner(System.in);
        System.out.println("Voulez-vous creer un insecte ? 0/N");
        char resp1 = toto.next().toUpperCase().charAt(0);
        if (resp1 == 'O') {
            HashMap<String, Insecte> listInsecte = new HashMap<String, Insecte>();
            do {
                int id = 0;
                System.out.println("Fourmis ou Cafard ? F/C");
                char resp2 = toto.next().toUpperCase().charAt(0);

                // FourmisType = 1 && CafardType = 2

                String type;
                if(resp2 == 'F') {
                     type = "Fourmis";
                } else {
                     type = "Cafard";
                }

                System.out.println("Quel est sont nom ?");
                String resp3 = toto.next();

                Class cla = Class.forName("Insecte." + type);
                Constructor c = cla.getConstructor(String.class);
                Insecte insecte = (Insecte) c.newInstance(resp3);

                // method presentation in abstract class Insecte
                insecte.presentation();

                String nameId = resp3+ " " +id;
                listInsecte.put(nameId, insecte);

                for (Map.Entry<String, Insecte> it : listInsecte.entrySet()) {
                     String key = it.getKey();
                     Object value = it.getValue();

                    System.out.println(key+ " ----> "+value+"\n");

                }

                System.out.println("Voulez-vous creer encore un insecte ? O/N");
                resp1 = toto.next().toUpperCase().charAt(0);
                id ++;
            } while (resp1 != 'N');

        } else{
        System.out.println("Vous êtes pas drôle !!!!");
        }

    }


}

