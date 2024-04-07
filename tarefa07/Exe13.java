package tarefa07;
import java.util.Scanner;
public class Exe13 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a descrição do produto: ");
    String descricao = scanner.nextLine();
    
    System.out.print("Digite a quantidade adquirida: ");
    int quantidade = scanner.nextInt();
    
    System.out.print("Digite o preço unitário do produto: ");
    float precoUnitario = scanner.nextFloat();
    
  
    float total = quantidade * precoUnitario;
    

    float desconto;
    if (quantidade <= 5) {
        desconto = total * 0.02f;
    } else if (quantidade <= 10) {
        desconto = total * 0.03f;
    } else {
        desconto = total * 0.05f;
    }
    
   
    float totalAPagar = total - desconto;
    
 
    System.out.println("Descrição do produto: " + descricao);
    System.out.println("Total: R$ " + total);
    System.out.println("Desconto: R$ " + desconto);
    System.out.println("Total a pagar: R$ " + totalAPagar);
    
    scanner.close();
}
}