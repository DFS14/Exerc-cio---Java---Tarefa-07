package tarefa07;
import java.util.Scanner;
public class Exe10 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite a idade do primeiro homem: ");
    int idadeHomem1 = scanner.nextInt();
    
System.out.print("Digite a idade do segundo homem: ");
    int idadeHomem2 = scanner.nextInt();
    
System.out.print("Digite a idade da primeira mulher: ");
    int idadeMulher1 = scanner.nextInt();
    
System.out.print("Digite a idade da segunda mulher: ");
    int idadeMulher2 = scanner.nextInt();

    int idadeHomemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
    int idadeMulherMaisNova = Math.min(idadeMulher1, idadeMulher2);
    
    int idadeHomemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
    int idadeMulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
    
    int soma = idadeHomemMaisVelho + idadeMulherMaisNova;
    int produto = idadeHomemMaisNovo + idadeMulherMaisVelha;
    

System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);
    
    scanner.close();
 }
}