package ExerciciosEP2;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite M para Matutino, V para Vespertino e N para Noturno: ");
            String turno = scan.nextLine();

            switch (turno) {
                case "M":
                case "m":  System.out.println("Bom dia!");               
                    break;
                case "V": 
                case "v": System.out.println("Boa tarde!");
                    break;
                case "N":
                case "n": System.out.println("Boa noite!");
                    break;
                default: System.out.println("Valor invalido");
                    break;
            }
        }
    }
}
