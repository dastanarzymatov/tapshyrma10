import java.util.Scanner;

public class tapshyrma10 {
    // public static int[]array=new int[10];
    //public static int []getArray1= get(array);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        get(scanner.nextInt(), 3, 4, 5, 6, 7, 8, 9, 10);

    }

    public static boolean get(int a, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                System.out.println(true + " " + a);


            } else {
                System.out.println(false + " " + a);



            }
        }
        return true;
    }
}
