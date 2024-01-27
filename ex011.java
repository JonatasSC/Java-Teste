package ExerciciosEP2;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota: ");
            int nota1 = scan.nextInt();
            System.out.println("Digite a segunda nota: ");
            int nota2 = scan.nextInt();
            System.out.println("Digite a terceira nota: ");
            int nota3 = scan.nextInt();
            System.out.println("Digite a quarta nota: ");
            int nota4 = scan.nextInt();
            System.out.println("Digite a quinta nota: ");
            int nota5 = scan.nextInt();

            double media = nota1 + nota2 + nota3 + nota4 + nota5;
            media = media / 5;
            String teste = "";
            if (media < 4) {
                teste = "E";
            } else if (media > 4 && media < 6) {
                teste = "D";
            } else if (media > 6 && media < 7.5) {
                teste = "C";
            } else if (media > 7.5 && media < 9) {
                teste = "B";
            } else {
                teste = "A";
            }

            System.out.println("Media de Aproveitamento");
            System.out.println("A nota do aluno é: " + media);
            System.out.println("O seu aproveitamento é: " + teste);
        }
    }
}
