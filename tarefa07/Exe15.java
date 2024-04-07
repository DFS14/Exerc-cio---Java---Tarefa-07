package tarefa07;
import java.util.Scanner;
public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = scanner.nextInt();
        
        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();
        
        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scanner.nextInt();
        
       
        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;
        

        boolean AposentadoriaAprovada = idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25);
        
     
        System.out.println("Idade do empregado: " + idade);
        System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho);
        System.out.println(AposentadoriaAprovada ? "Requerer aposentadoria" : "Não requerer");
        
        scanner.close();
    }
}