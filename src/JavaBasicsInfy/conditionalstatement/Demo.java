package JavaBasicsInfy.conditionalstatement;

public class Demo {
    public static void main(String[] args) {
        int i=1, j = -1;
        switch (i){
            case 0, 1:
                j = 1;
                System.out.println(j);
            case 2:
                j = 2;
            default:
                j = 0;
        }
        System.out.println("j=" + j);

    }
}
