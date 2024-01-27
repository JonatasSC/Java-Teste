package ExerciciosEP2;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Voçê telefonou para a vitima?");
            String cond1 = scan.next();
            System.out.println("Voçê esteve no local do crime?");
            String cond2 = scan.next();
            System.out.println("Voçê mora perto da vitima?");
            String cond3 = scan.next();
            System.out.println("Voçê Devia a vitima?");
            String cond4 = scan.next();
            System.out.println("Voçê já trabalhou com a vitima?");
            String cond5 = scan.next();

            int cont = 0;
            if ((cond1.equalsIgnoreCase("sim"))) {
                    cont ++;
            }    
            if ((cond2.equalsIgnoreCase("sim"))) {
                    cont ++;
            }
            if (cond3.equalsIgnoreCase("sim")) {
                    cont ++;
            }
            if (cond4.equalsIgnoreCase("sim")) {
                    cont ++;
            }
            if (cond5.equalsIgnoreCase("sim")) {
                    cont ++;
            }
            if (cont == 2) {
                    System.out.println("Suspeito!");
            } else if (cont == 3 || cont == 4) {
                    System.out.println("Cumplice!");
            } else if (cont == 5) {
                    System.out.println("Assassino!");
            } else if (cont == 0 || cont == 1) {
                    System.out.println("inocente!");
            }
        }       
    }
}
