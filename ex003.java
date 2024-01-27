package ExerciciosEP2;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite M para Masculino e F para Feminino: ");
            String sexo = scan.nextLine();

            if (sexo.equalsIgnoreCase("m")) {
                System.out.println("Masculino");
            }else if (sexo.equalsIgnoreCase("f")) {
                System.out.println("Feminino");
            } else{
                System.out.println("Sexo invalido!");
            }
        }
    }
}
