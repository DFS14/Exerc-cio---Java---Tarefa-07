package tarefa07;
import java.util.Scanner;
public class Exe04 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
    int a = scanner.nextInt();
    
System.out.print("Digite o segundo número: ");
    int b = scanner.nextInt();
    
System.out.print("Digite o terceiro número: ");
    int c = scanner.nextInt();

 int numero;

    if (a > b) {numero = a; a = b; b = numero;}

    if (b > c) {numero = b; b = c; c = numero;}
    
    if (a > b) {numero = a; a = b; b = numero;}
   // if (c > a) {numero = c; c = a; a = numero;}

    System.out.println("Os números em ordem crescente são: " + a + ", " + b + ", " + c);

    scanner.close();
}
}
