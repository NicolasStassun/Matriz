
import java.util.Scanner;

public class Exemplo {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int arr [][] = new int[2][2];

        for (int l=0; l<2;l++){

            for (int j=0; j<2;j++){
                System.out.println("Digite o valor da linha "+l+" e coluna "+j+" :");
                arr[l][j]=sc.nextInt();
            }
        }
        for (int i=0; i<2;i++){

            for (int j=0; j<2;j++){
                System.out.println(arr[i][j]);
            }
        }

    }


}
