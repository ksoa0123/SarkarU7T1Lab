import java.util.ArrayList;
import java.util.Locale;

public class CatRunner {
    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat cat1 = new Cat("garfeild1");
        Cat cat2 = new Cat("garfeild2");
        Cat cat3 = new Cat("garfeild3");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);

        //New

        Cat cat4 = new Cat("newCat");
        Cat replacedCat = cats.set(2,cat4 );
        System.out.println(cats);

        //New x2
        cat4.setName(cat4.getName() + "Meow");
        System.out.println(cat4);

        System.out.println(cats);

        //new x 3
        for (int i = 0; i < cats.size(); i++){
            String newName = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(newName);
        }
        System.out.println(cats);
    }
}
