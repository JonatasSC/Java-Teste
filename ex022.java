package ExerciciosEP2;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a quatidade de carne em KG's: ");
            int peso = scan.nextInt();
            
            System.out.println("(F) para File Duplo (A) para Alcatra (P) para Picanha");
            System.out.println("tipo de carne: ");
            String tipo = scan.next();
            System.out.println("Aplicar desconto do cartão ? (s) ou (n)");
            String cartao = scan.next();

            double file = 0;
            double alcatra = 0;
            double picanha = 0;
            double preco = 0;
            
            if (tipo.equalsIgnoreCase("f")) {
                System.out.println("File duplo");
                if (peso < 5) {
                    file = 5.8;    
                } else {
                    file = 4.9;
                }
                preco = file * peso;
            } else if (tipo.equalsIgnoreCase("a")){
                System.out.println("Alcatra");
                if (peso < 5) {
                    alcatra = 6.8;    
                }
                else {
                    alcatra = 5.9;
                }
                preco = alcatra * peso;
            } else if (tipo.equalsIgnoreCase("p")) {
                System.out.println("Picanha");
                if (peso < 5) {
                    picanha = 7.8;  
                } else {
                    picanha = 6.9;
                }
                preco = picanha * peso;        
            } 

            if (cartao.equalsIgnoreCase("s")) {
                double disconto = preco * 0.05;
                preco = preco - disconto;
                System.out.println("O valor total é: " + preco);
                System.out.println("Desconto por utilizar o cartão: " + disconto);
            } else {
                System.out.println("O valor total é: " + preco);
                System.out.println("Sem direito a desconto!");
            }
            
        }
    }
}
