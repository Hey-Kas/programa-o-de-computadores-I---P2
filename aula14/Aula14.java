import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Aula14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // NÍVEL 1
        try {

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(teclado.nextLine());

            System.out.println("Idade cadastrada: " + idade);

        } catch (NumberFormatException e) {

            System.out.println("Erro: Insira apenas caracteres numéricos.");
        }

        // NÍVEL 2
        try {

            FileWriter arquivoLog = new FileWriter("log_sistema.txt");

            arquivoLog.write("Sistema iniciado com sucesso.\n");

            arquivoLog.close();

            System.out.println("Arquivo de log criado com sucesso.");

        } catch (IOException e) {

            System.out.println("Erro ao gravar log.");

        } finally {

            System.out.println("Rotina de persistência finalizada, recursos liberados.");
        }

        // NÍVEL 3
        try {

            File arquivo = new File("dados_financeiros.json");

            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }

            leitor.close();

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não encontrado. Criando arquivo padrão...");

            try {

                FileWriter arquivoNovo =
                        new FileWriter("dados_financeiros.json", true);

                arquivoNovo.write("{\n");
                arquivoNovo.write("    \"dados\": []\n");
                arquivoNovo.write("}\n");

                arquivoNovo.close();

                System.out.println("Arquivo criado com sucesso.");

            } catch (IOException erro) {

                System.out.println("Erro ao criar arquivo.");
            }
        }

        teclado.close();
    }
}