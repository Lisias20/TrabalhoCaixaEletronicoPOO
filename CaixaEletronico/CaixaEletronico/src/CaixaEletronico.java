import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CaixaEletronico {
    private static double saldo = 0; //fazendo o sistema receber o saldo
    private static ArrayList<Transacao> extrato = new ArrayList<>(); //fazendo o sistema receber as listas de extrato
    static Scanner scanner = new Scanner(System.in); //fazendo com que o sistema receba entradas do usuario

     //implementando a classe transacao
    static class Transacao {
        private Date data;
        private String tipoDP;
        private double valorDaTransacao;

        //construtor
        public Transacao(Date data, String tipoDP, double valor) {
            this.data = data;
            this.tipoDP = tipoDP;
            this.valorDaTransacao = valor;
        }
        //implementando a configuração de texto do extrato
        public String toString() {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return formato.format(data) + " - " + tipoDP + ": R$ " + String.format("%.2f", valorDaTransacao);
        }
    }

    public static void main(String[] args) {
        int menu;
        //fazendo o sistema do menu
        do {
            System.out.println("\n--- Caixa Eletrônico ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Ver Extrato");
            System.out.println("5. Sair");
            System.out.println("\n-----------------------------");
            System.out.print("Escolha uma opção: ");


            //implementando o laço de repetição
            menu = scanner.nextInt();

            if (menu == 1) {
                deposito();
            } else if (menu == 2) {
                saque();
            } else if (menu == 3) {
                consultaDeSaldo();
            } else if (menu == 4) {
                verExtrato();
            } else if (menu == 5) {
                System.out.println("\n-----------------------------");
                System.out.println("Sessão Finalizada!");
                System.out.println("\n-----------------------------");
            } else {
                System.out.println("\n-----------------------------");
                System.out.println("Opção Inválida! tente novamente.");
                System.out.println("\n-----------------------------");
            }
        } while (menu != 5);

        scanner.close();
    }



    //Depositar


    private static void deposito() {
        System.out.println("\n-----------------------------");
        System.out.print("Digite o valor para depósito: R$ ");
        System.out.println("\n-----------------------------");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("\n-----------------------------");
            System.out.println("Valor Inválido para depósito.");
            System.out.println("\n-----------------------------");
        } else {
            saldo += valor;
            extrato.add(new Transacao(new Date(), "Depósito", valor));
            System.out.println("\n-----------------------------");
            System.out.println("Depósito realizado com sucesso");
            System.out.println("\n-----------------------------");
        }
    }

    // Sacar

    private static void saque() {
        System.out.println("\n-----------------------------");
        System.out.print("Digite o valor para saque: R$ ");
        System.out.println("\n-----------------------------");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("\n-----------------------------");
            System.out.println("Valor inválido para saque.");
            System.out.println("\n-----------------------------");
        } else if (valor > saldo) {
            System.out.println("\n-----------------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("\n-----------------------------");
        } else {
            saldo -= valor;
            extrato.add(new Transacao(new Date(), "Saque", valor));
            System.out.println("\n-----------------------------");
            System.out.println("Saque realizado com sucesso");
            System.out.println("\n-----------------------------");
        }
    }

    // Consulta de Saldo

    private static void consultaDeSaldo() {
        System.out.println("\n-----------------------------");
        System.out.printf("\n Seu saldo atual é: R$ %.2f%n", saldo);
        System.out.println("\n-----------------------------");
    }

    // Ver Extrato

    private static void verExtrato() {

        System.out.println("\n---- Extrato Bancário ----");
        System.out.println("\n-----------------------------");
        if (extrato.isEmpty()) {
            System.out.println("\n-----------------------------");
            System.out.println("Nenhuma Transação Realizada.");
            System.out.println("\n-----------------------------");
        } else {
            for (Transacao transacao : extrato) {
                System.out.println(transacao);
            }
        }
        System.out.println("\n-----------------------------");
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("\n-----------------------------");
    }
}