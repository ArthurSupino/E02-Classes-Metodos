import java.util.Random;
import java.util.Scanner;

public class metodos
{
    private static int option;
    Scanner sc = new Scanner(System.in);
    private static int deposito;


    static void depositar()
    {
        System.out.println("deseja fazer um deposito : [S]=1 ou [N]=0");
        option = sc.nextInt();

        if (Cliente.saldo < Limite){
            if(option == 1)
            {
                System.out.println("digite o valor a ser depositado: ");
                deposito = sc.nextInt();

                Cliente.saldo += deposito;
            }
        } 
        else
        {
            System.out.println("Nao foi possivel realizar o deposito , pois o limite estourou");
        }
      
    }
    
    static void criar_conta()
    {
        Random random;
        Cliente nome_dono;
        Cliente genero;
        Cliente numero_conta;
        Cliente saldo = 0;
        Cliente endereco;
        Cliente cpf;
        
        

        System.out.println("digite seu nome");
        Cliente.nome_dono = sc.nextLine();
        random   =  new Random();
        Cliente.numero_conta = random.nextInt(1000);

        System.out.println("digite seu genero 'm' ou 'f'");
        Cliente.genero = sc.next().chatAt(0);

        System.out.println("digite seu cep : ");
        endereco = sc.nextLine();

        System.out.println("digite seu cpf : ");
        cpf = sc.nextLine();

        

    }

    public static void main(String[] args)
    {
        int cadastrar;
        int efetua_deposito;
        System.out.println("digite [1] para cadastrar");
        cadastrar = sc.nextInt();
        criar_conta();
        
        if(cadastrar == 1)
        {
            System.out.println("deseja depositar? Se sim digite [1]");
            efetua_deposito = sc.nextInt();
            depositar();

            
        }

      
  
    }
}
