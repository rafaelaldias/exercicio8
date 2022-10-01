import java.util.Scanner;


public class ListaMontanha8 {

    public static void main(String[] args) {
        int hora, salario, total;
        Scanner leia = new Scanner (System.in);
        System.out.println("Quantos reais voce recebe por hora? ");
        salario = leia.nextInt();
        System.out.println("Qual a sua carga horaria mensal? ");
        hora =  leia.nextInt();
        total = hora * salario;
        System.out.println("Seu salario mensal e: " + total);
    }
    
}