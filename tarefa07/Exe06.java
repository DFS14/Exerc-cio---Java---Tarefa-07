package tarefa07;
import java.util.Scanner;
public class Exe06 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o nome do primeiro time: ");
String palmeiras = scanner.nextLine();

System.out.print("Digite o número de gols marcados pelo " + palmeiras + ": ");
int golsPalmeiras = scanner.nextInt();
scanner.nextLine();
	        
System.out.print("Digite o nome do segundo time: ");
String corinthians = scanner.nextLine();

System.out.print("Digite o número de gols marcados pelo " + corinthians + ": ");

int golsCorinthians = scanner.nextInt();
	        
	        if (golsPalmeiras > golsCorinthians) {
	            System.out.println("O vencedor é: " + palmeiras);
	        } 
	        else if (golsCorinthians > golsPalmeiras) 
	        {
	            System.out.println("O vencedor é: " + corinthians);
	        } 
	        else 
	        {
	            System.out.println("EMPATE");
	        }
	        
	        scanner.close();
	    }
	}