package interfaceAndAbstract;

public class DemoInf2 implements Demo {
    private String message;

    @Override
    public void echo() {
        System.out.println("DemoInf2 : "+message);
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
