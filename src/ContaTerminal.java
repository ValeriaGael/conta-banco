    import java.util.Locale;
    import java.util.Scanner;
    
        public class ContaTerminal {
        public static void main(String[] args) {
           
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Por favor, digite o número inteiro!");
            int numero = scanner.nextInt();
            
            System.out.println("Por favor, digite o número da sua Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();    
                  
            System.out.println("Digite seu saldo");
            double saldo = scanner.nextDouble();              
           
            System.out.println("Ola, " + nome + " " + sobrenome + ", obrigada por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");
            
        }
    }

