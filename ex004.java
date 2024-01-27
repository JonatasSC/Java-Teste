package ExerciciosEP2;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite uma Vogal ou uma Consoante: ");
            String letra = scan.nextLine();

            if (letra.length() > 1 &&  letra.length() < 0) {
                System.out.println("Não é uma letra valida!");
            }else {
                switch (letra) {
                    case "a": 
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U":
                    System.out.println("É uma vogal!");
                        break;
              
                    default: System.out.println("É uma consoante!");
                        break;
              } 

            }

    
        }
    }
}
