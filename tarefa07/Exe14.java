package tarefa07;
import java.util.Scanner;
public class Exe14 {
public static void main(String[] args) {	
Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a primeira nota (N1): ");
    float N1 = scanner.nextFloat();
    
    System.out.print("Digite a segunda nota (N2): ");
    float N2 = scanner.nextFloat();
    
    System.out.print("Digite a terceira nota (N3): ");
    float N3 = scanner.nextFloat();
    
    System.out.print("Digite a média dos exercícios: ");
    float mediaExercicios = scanner.nextFloat();
    

   float mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;
   char conceito;
    
   
    if (mediaAproveitamento >= 9.0) 
    {
        conceito = 'A';
    } 
    else if (mediaAproveitamento >= 7.5) 
    {
        conceito = 'B';
    } 
    else if 
    (mediaAproveitamento >= 6.0) 
    {
        conceito = 'C';
    } 
    else 
    {
        conceito = 'D';
    }
    
   
    System.out.printf("A média de aproveitamento é: %.2f\n", mediaAproveitamento);
    System.out.println("O conceito do aluno é: " + conceito);
    
    scanner.close();
}
}
