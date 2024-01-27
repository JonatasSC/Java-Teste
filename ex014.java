package ExerciciosEP2;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um ano aleatorio: ");
            int ano = scan.nextInt();

            if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
                
                System.out.println("Ano bixesto");
                
            }else{
                System.out.println("Não é ano bixesto");
            }
        }

    }
}
