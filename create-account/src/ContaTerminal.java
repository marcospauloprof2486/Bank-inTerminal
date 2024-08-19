import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
       System.out.println("Olá, insira seu nome: ");
       String name =  scanner.nextLine();
       
       System.out.println("Qual sua agência? ");
       String agencia = scanner.nextLine();

       System.out.println("Quanto vc tinha em conta?");
       int saldo = scanner.nextInt();    
      System.out.println("Obrigado por usar nossa plataforma," + name + ". Sua agencia é: " + agencia + " e seu saldo em conta é de: " + saldo + "R$");
    }
}
