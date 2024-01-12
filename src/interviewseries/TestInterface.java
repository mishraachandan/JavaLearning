package interviewseries;

public interface TestInterface {
    void func();

    default void function(){
        System.out.println("This is default.");
    }

    static void staticFunc(){
        System.out.println("Making a static method here");
    }

}
