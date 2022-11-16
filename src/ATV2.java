import java.sql.SQLOutput;
import java.util.Scanner;

public class ATV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][4];
        int arr2[][] = new int[4][4];
        int arr3[][] = new int[4][4];

        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                System.out.println("Matriz - 1 - Digite o valor da linha "+l+" e coluna "+c+" :");
                arr[l][c]=sc.nextInt();
            }

        }
        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                System.out.println("Matriz - 2 - Digite o valor da linha "+l+" e coluna "+c+" :");
                arr2[l][c]=sc.nextInt();
            }

        }
        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                if(arr[l][c]>arr2[l][c]){
                    arr3[l][c]=arr[l][c];
                }
                if(arr[l][c]<arr2[l][c]){
                    arr3[l][c]=arr2[l][c];
                }
            }
        }
        for (int l=0; l<4;l++){

            for (int c=0; c<4;c++){
                System.out.println(arr[l][c]);
            }
        }


    }

}
