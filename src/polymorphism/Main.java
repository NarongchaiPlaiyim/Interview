package polymorphism;

public class Main {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.echo();
        deer.echo("TEST : Narongchai");
        System.out.println(deer.getName());
    }
}
