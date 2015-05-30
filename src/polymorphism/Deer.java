package polymorphism;

public class Deer extends Animal implements Vegetarian {
    @Override
    void echo(String message) {
        System.out.println(message);
    }

    @Override
    public String getName() {
        return "Narongchai";
    }

   /*
    A Deer IS-A Animal

    A Deer IS-A Vegetarian

    A Deer IS-A Deer

    A Deer IS-A Object
    */
}
