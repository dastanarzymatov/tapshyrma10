import java.util.Arrays;
import java.util.Random;

public class homework10 {
    public static         int[]array=new int[10];

    public static int []getArray1=(array);
    public static void main(String[] args) {

     Array(getArray1);

        System.out.println(Arrays.toString(getArray1));
        System.out.println();
        getAray(getArray1);
        System.out.println();
        getNumbers(getArray1);

    }

    public static int[] Array( int [] array) {
        Random random=new Random();
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(100);

        }
    return array;
    }

    public static void getAray(int[]array1) {
        int sum=0;
        int count=0;
        for (int i = 0; i < array1.length ; i++) {
            if (array1[i]<=50){
                System.out.print(array1[i]+" ");
                sum++;
                count+=array1[i];
            }


            }
        System.out.println("ortocho san"+(count/sum));

        }

    public static void getNumbers(int[] array3) {
        int joop=0;
        int san=0;
        for (int i = 0; i <array3.length ; i++) {
            if (array3[i]>=50){
                System.out.print(array3[i]+" ");
                san++;
                joop+=array3[i];

            }

        }            System.out.println("ortocho san "+(joop/san));

    }
}

