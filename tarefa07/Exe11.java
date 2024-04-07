package tarefa07;
import java.util.Scanner;
public class Exe11 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
     
float precoMorangoAte5kg = 2.50f;
float precoMacaAte5kg = 1.80f;
float precoMorangoAcima5kg = 2.20f;
float precoMacaAcima5kg = 1.50f;


System.out.print("Digite a quantidade (em Kg) de morangos: ");
float kgMorangos = scanner.nextFloat();
System.out.print("Digite a quantidade (em Kg) de maçãs: ");
float kgMacas = scanner.nextFloat();


float valorMorangos = (kgMorangos <= 5) ? kgMorangos * precoMorangoAte5kg : kgMorangos * precoMorangoAcima5kg;
float valorMacas = (kgMacas <= 5) ? kgMacas * precoMacaAte5kg : kgMacas * precoMacaAcima5kg;
float valorTotal = valorMorangos + valorMacas;


if (kgMorangos + kgMacas > 8 || valorTotal > 25) {
	valorTotal *= 0.9; 
}


     System.out.printf("O valor a ser pago é: R$ %.2f%n", valorTotal);
     
     scanner.close();
 }
}