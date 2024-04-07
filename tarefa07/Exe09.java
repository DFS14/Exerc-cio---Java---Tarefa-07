package tarefa07;
import java.util.Scanner;
public class Exe09 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite o número de litros vendidos: ");
float litros = scanner.nextFloat();
scanner.nextLine(); 
        
System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
char tipoCombustivel = scanner.nextLine().charAt(0);
        
        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        double valorAPagar = 0.0;
        
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') 
        {
            valorAPagar = litros * precoAlcool;
        } 
        else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') 
        {
            valorAPagar = litros * precoGasolina;
        } 
        else 
        {
            System.out.println("Tipo de combustível inválido.");
        }
        
 if (valorAPagar > 0) 
{
System.out.printf("O valor a ser pago é: R$ %.2f%n", valorAPagar);
}
        
        scanner.close();
    }
}
