package ExerciciosEP2;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double totalbruto;
            double FGTS = 0.11;
            double INSS = 0.1;
            double IR;
            double totalliquido; 

            System.out.print("informe o valor ganho por hora:  ");
            float valorH = scan.nextFloat();

            System.out.println("Informe o total de Horas trabalhadas no mês: ");
            int totalHoras = scan.nextInt();
            totalbruto = valorH * totalHoras;

            if (totalbruto <= 900) {
                IR = 0;
            }else if (totalbruto > 900 && totalbruto <= 1500) {
                IR = 0.05;
            }else if (totalbruto > 1500 && totalbruto <= 2500) {
                IR = 0.1;
            }else{
                IR = 0.2;
            }

            
            System.out.println("Salario bruto: " + totalHoras + "*" + valorH +  ": R$ " + totalbruto );
            IR = totalbruto * IR;
            System.out.println("(-) IR (5%) " + ": R$ " + IR);
            INSS = totalbruto * INSS;
            System.out.println("(-) INSS (10%)" +": R$ " + INSS);
            FGTS = FGTS * totalbruto;
            System.out.println("FGTS (11%) " + ": R$" + FGTS);
            double totaldesc = IR + INSS;
            System.out.println("Total de descontos: " + ": R$ " + totaldesc);
            totalliquido = totalbruto - IR - INSS;
            System.out.println("Total Liquido " + ": R$ " + totalliquido);
        }
    }
}
