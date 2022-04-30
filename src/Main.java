import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[]array=new int[10];
    public static int []getArray1= getArray(array);

    public static void main(String[] args) {

        evenNumbers(getArray1);
        oddNumbers(getArray1);
    }



    public static int[] getArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50);
            System.out.print(a[i] + " ");

        }
        return a;
    }

    public static void oddNumbers(int[] arr) {
        int[] array = getArray1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                System.out.println("\n tak san  " + array[i]);
                System.out.println();
            }
        }

    }

    public static void evenNumbers(int[] array) {
        int[] array2 = getArray1;
        for (int j = 0; j < array.length; j++) {
            if (array2[j] % 2 == 0) {
                System.out.println();
                System.out.println("\njup san " + array2[j]);
            }

        }

    }
}

