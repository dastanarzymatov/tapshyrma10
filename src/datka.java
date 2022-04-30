import java.util.Scanner;

public class datka {

    public static int[]array=new int[10];
//    public static int []getArray1=main();
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int d=scanner.nextInt();

        System.out.println((int) pow(d));
        System.out.println((int) sqrt(d));
        System.out.println((int)pow(d)+(int) sqrt(d));
    }

    public static double pow(int f) {


        return (int)Math.pow(f,2);
    }

    public static double sqrt(int g) {


        return (int)Math.sqrt(g);
    }
    }


    //Scanner scanner=new Scanner(System.in);
//        int a= scanner.nextInt();
//        int d=0;
//        for (int i = 0; i < a;) {
//           a/=10;
//            d++;
//
//        }System.out.println(d+" orunduu san datka aiitty");