package tarefa07;
import java.util.Scanner;
public class Exe03 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
	int numero1 = scanner.nextInt();

System.out.print("Digite o segundo número: ");
	int numero2 = scanner.nextInt();

System.out.print("Digite o terceiro número: ");
	int numero3 = scanner.nextInt();

int soma;

if (numero1 > numero2) {
if (numero2 > numero3) 
{
soma = numero1 + numero2; 
} 
else 
{
soma = numero1 + numero3; 
}
} 
else 
{
if (numero1 > numero3) 
{
soma = numero2 + numero1; 
} 
else 
{
soma = numero2 + numero3;
}
}

    System.out.println("A soma dos dois maiores números é: " + soma);

    scanner.close();
    }

}