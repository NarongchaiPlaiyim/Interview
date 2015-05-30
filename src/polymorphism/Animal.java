package polymorphism;

public abstract class Animal {
    protected void echo(){
        System.out.println("echo");
    }

    public void echo2(){
        System.out.println("echo2");
    }

    private void echo3(){
        System.out.println("echo3");
    }

    abstract void echo(String message);
}
