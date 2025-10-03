import java.util.Scanner; // Importa a classe Scanner

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CONFIGURAÇÃO DA SIMULAÇÃO ---");

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        System.out.print("Digite o número de portas: ");
        int numPortas = scanner.nextInt();

        System.out.print("Digite o tamanho do ambiente (Ex: 20 para um ambiente 20x20): ");
        int tamAmbiente = scanner.nextInt();

        System.out.print("Digite o tempo limite em segundos para o movimento aleatório: ");
        int tempoLimite = scanner.nextInt();

        scanner.close();

        System.out.println("\n--- INICIANDO A SIMULAÇÃO ---");

        var ambiente = new Ambiente(numPessoas, numPortas, tamAmbiente, tempoLimite);

        try {
            ambiente.criarAmbiente();
        } catch (InterruptedException e) {
            System.err.println("A simulação foi interrompida.");
            e.printStackTrace();
        }
    }
}