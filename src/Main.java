import interfaceAndAbstract.Demo;
import interfaceAndAbstract.DemoInf;
import interfaceAndAbstract.DemoInf2;

public class Main {

    public static void main(String[] args) {
        Demo demo = new DemoInf();
        demo.setMessage("TEST");
        demo.echo();

        demo = new DemoInf2();
        demo.setMessage("TEST");
        demo.echo();
    }
}
