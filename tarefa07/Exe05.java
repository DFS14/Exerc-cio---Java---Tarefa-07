package tarefa07;
import java.util.Scanner;
public class Exe05 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o valor do lado A: ");
	float A = scanner.nextFloat();
	
System.out.print("Digite o valor do lado B: ");
	float B = scanner.nextFloat();
	
System.out.print("Digite o valor do lado C: ");
	float C = scanner.nextFloat();

	if (A < B + C 
			&& 
		B < A + C 
			&& 
		C < A + B) 
	{
		System.out.println("Os valores formam um triângulo.");
	} else {
		System.out.println("Os valores não formam um triângulo.");
	}

	scanner.close();
}
}
