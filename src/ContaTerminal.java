    import java.util.Locale;
    import java.util.Scanner;
    
        public class ContaTerminal {
        public static void main(String[] args) {
           
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Por favor, digite o número da Conta!");
            int numeroConta = scanner.nextInt();
            
            System.out.println("Por favor, digite o número da sua Agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite seu nome!");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite seu sobrenome");
            String sobrenomeCliente = scanner.next();    
                  
            System.out.println("Por favor, digite seu saldo");
            double saldo = scanner.nextDouble(); 
                
             System.out.println("Ola, " + nomeCliente + " " + sobrenomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
            
        }
    }

