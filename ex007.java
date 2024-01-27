package ExerciciosEP2;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int pri = scan.nextInt();  

            System.out.println("Digite um segundo numero: ");
            int seg = scan.nextInt();

            System.out.println("Digite um terceiro valor: ");
            int ter = scan.nextInt();

            if (pri > seg && pri > ter && seg > ter) {
                System.out.println(pri);
                System.err.println(seg);
                System.err.println(ter);
            } else if (seg > pri && seg > ter && pri > ter) {
                System.err.println(seg);
                System.err.println(pri);
                System.err.println(ter);
            } else if (ter > pri && ter > seg && pri > seg) {
                System.err.println(ter);
                System.err.println(pri);
                System.err.println(seg);  
            } else if (pri > seg && pri > ter && ter > seg) {
                System.err.println(pri);
                System.err.println(ter);
                System.err.println(seg);  
            } else if (seg > pri && seg > ter && ter > pri) {
                System.err.println(seg);
                System.out.println(ter);
                System.out.println(pri);
            }else{
               System.out.println(ter);
               System.out.println(seg);
               System.out.println(pri);
            }
        } 
    }
}
