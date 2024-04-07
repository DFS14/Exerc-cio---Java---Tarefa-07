package tarefa07;
import java.util.Scanner;
public class Exe12 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

final int codigoCorreto = 1234;
final int senhaCorreta = 9999;

System.out.print("Digite o código do usuário: ");
int codigoUsuario = scanner.nextInt();

if (codigoUsuario != codigoCorreto) 
	{
		System.out.println("Usuário inválido!");
	} 
	else 
	{

System.out.print("Digite a senha: ");
int senhaUsuario = scanner.nextInt();

		if (senhaUsuario != senhaCorreta) 
		{
System.out.println("Senha incorreta.");
		} 
		else 
		{
System.out.println("Acesso permitido.");
		}
	}

	scanner.close();
}
}