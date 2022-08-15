import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        //Teste de Cadastro de cliente básico

        String[] informacoes = new String[4];
        int i;

        Scanner scan = new Scanner(System.in);

        for(i=0;i< informacoes.length;i++){
            if(i==0){
                System.out.println("Digite o nome do cliente: ");
                informacoes[i] = scan.next();
            } else if (i==1) {
                System.out.println("Digite a cidade do cliente: ");
                informacoes[i] = scan.next();
            } else if (i==2) {
                System.out.println("Digite o estado do cliente: ");
                informacoes[i] = scan.next();
            }
            else{
                System.out.println("Digite o telefone do cliente: ");
                informacoes[i] = scan.next();
            }
        }

        System.out.println("Dados do cliente "+informacoes[0]+": ");

        for (i=1;i< informacoes.length;i++){
            System.out.println(informacoes[i]);
        }

    }
}
