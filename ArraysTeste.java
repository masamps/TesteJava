import java.util.Scanner;

public class ArraysTeste {
    public static void main(String[] args) {
        double [][] notasAlunos = new double[5][4];

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<notasAlunos.length;i++){
            for (int j=0;j<notasAlunos[i].length;j++){
                System.out.println("Digite a nota "+(j+1)+" do aluno "+(i+1)+": ");
                notasAlunos[i][j]= scan.nextDouble();
            }
        }

        for(int i=0; i< notasAlunos.length;i++){
            for (int j=0;j<notasAlunos[i].length;j++){
                System.out.println("A nota do aluno "+i+"é: "+ notasAlunos[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Fim teste");
    }
}
