
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner (System.in);


        System.out.print("Digite nome do aluno:");
        String nome = entrada.nextLine();

        System.out.print("\n Digite sobrenome do aluno:");
        String sobrenome = entrada.nextLine();

        System.out.print("\nDigite a nota do aluno:");
        String nota = entrada.nextLine();

        Aluno aluno1 = new Aluno(nome, sobrenome, nota);

        System.out.println("\n nome do aluno: " + aluno1.nome + "  "+ aluno1.sobrenome);
          System.out.println("nota do aluno: " + aluno1.nota);

          System.out.println("altera nome");
          String nomeAlterado = entrada.next();

          aluno1.setNome(nomeAlterado);

        System.out.println("\n nome do aluno: " + aluno1.nome + "  "+ aluno1.sobrenome);
        System.out.println("nota do aluno: " + aluno1.nota);

*/

        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("jose");


        for (int i = 0; i<listaDeNomes.size(); i ++){

            System.out.println("nome:" + listaDeNomes.get(i));




        }
    }
}
