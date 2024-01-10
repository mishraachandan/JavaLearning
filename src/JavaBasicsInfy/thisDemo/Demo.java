package JavaBasicsInfy.thisDemo;

public class Demo {
    int i = 100;
    public Demo(int i){
        System.out.println(this.i);  // Line 3
        this.i = i;
    }

    public static void main(String[] args) {
        Demo obj = new Demo(10);
        System.out.println(obj.i);
    }


}
