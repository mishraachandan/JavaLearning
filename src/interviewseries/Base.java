package interviewseries;

public class Base {
    protected void foo(){};
}

class Derived extends Base{
    public void foo(){};
}

class Main{
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.foo();
    }
}
