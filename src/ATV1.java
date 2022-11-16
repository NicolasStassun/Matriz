import java.util.Scanner;
import java.util.Random;

public class ATV1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int arr[][] = new int[20][10];
        int soma[] = new int[10];

        for (int l = 0; l < 20; l++) {

            for (int c = 0; c < 10; c++) {
                arr[l][c] = rn.nextInt(10);
            }
        }
        System.out.println("----------------------");
        for (int l = 0; l < 20; l++) {

            for (int c = 0; c < 10; c++) {
                System.out.printf(""+arr[l][c]+" ");
            }
            System.out.printf("\n");
        }
        System.out.println("----------------------");
        for (int l = 0; l < 20; l++) {

            for (int c = 0; c < 10; c++) {
                soma[c] += arr[l][c];
            }
        }
        for (int c = 0; c < 10; c++) {
            System.out.println("----------------------");
            System.out.printf("A soma da coluna "+c+" é = "+soma[c]+"\n");
        }
        for (int l = 0; l < 20; l++) {

            for (int c = 0; c < 10; c++) {
                arr[l][c] *= soma[c];
            }
        }
        System.out.println("----------------------");
        for (int l = 0; l < 20; l++) {

            for (int c = 0; c < 10; c++) {
                System.out.printf(""+arr[l][c]+" ");
            }
            System.out.printf("\n");
        }
        System.out.println("----------------------");


    }
}
