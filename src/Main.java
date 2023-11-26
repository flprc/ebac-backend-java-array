import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomesMasculino = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();

        int numPessoas;

        System.out.println("Quantas pessoas deseja cadastrar? ");
        numPessoas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Qual o seu nome? ");
            String nome = sc.nextLine();

            System.out.println("Qual o seu sexo? (M/F) ");
            String sexo = sc.nextLine().toUpperCase();

            if (sexo.equals("M")) {
                nomesMasculino.add(nome);
            } else if (sexo.equals("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido! Use M ou F");
                i--;
            }
        }

        System.out.println("\nNomes no grupo masculino: ");
        for (String nome : nomesMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nNomes no grupo feminino: ");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        sc.close();
    }
}