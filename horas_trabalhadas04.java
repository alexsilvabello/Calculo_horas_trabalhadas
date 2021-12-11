import java.util.Locale;
import java.util.Scanner;

public class horas_trabalhadas04 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);       
        Scanner sc = new Scanner(System.in);

        int horas, numero;
        double valorhora, salario;
        
        System.out.println("Digite o código do funcionário: ");
        numero = sc.nextInt();

        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        horas = sc.nextInt();

        System.out.println("Digite o Valor da hora: ");
        valorhora = sc.nextDouble();

        salario = valorhora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
