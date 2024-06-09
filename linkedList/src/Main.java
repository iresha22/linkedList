import java.awt.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // objects
        Fruit apple = new Fruit("Apple");
        Fruit orange = new Fruit("Orange");

        //linkedList
        LinkedList<Fruit> myListOfFruits = new LinkedList<Fruit>();
        myListOfFruits.add(apple);
        myListOfFruits.add(orange);
        System.out.println("my list of fruits " + myListOfFruits);

        // creating new objects and adding it to the linked list
        Fruit mango = new Fruit("Mango");
        Fruit waterMelon = new Fruit("waterMelon");
        myListOfFruits.addFirst(mango);
        myListOfFruits.addLast(waterMelon);
        System.out.println("Updated list of fruits" + myListOfFruits);


    }
}
