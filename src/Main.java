import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Paiva";
        String tipoConta = "Corrente";
        float saldoInicial = 1400;

        String Mensagem = """
                Nome: %s,
                Tipo da conta: %s,
                Saldo Inicial: %.2f
                """.formatted(name, tipoConta, saldoInicial);

        System.out.println(Mensagem);

        String escolha = """
                1 - Mostrar seu saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        System.out.println(escolha);
        int opcao = scanner.nextInt();
        while (opcao != 4) {
            if (opcao == 1) {
                System.out.println(saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Quanto de valor a receber? ");
                float receberValor = scanner.nextFloat();
                saldoInicial += receberValor;
                System.out.println(saldoInicial);
            } else if (opcao == 3) {
                System.out.println("Quanto quer transferir? ");
                float n = scanner.nextFloat();
                saldoInicial = transferirValor(n, saldoInicial);
            } else {
                System.out.println("Oxi ta chapando?");
            }

            System.out.println("Digite 4 para sair ou outro número para continuar");
            opcao = scanner.nextInt();
        }
    }
    public static float transferirValor( float x, float y) {
        if (x <= y) {
            y -= x;
            System.out.println("Transferencia Concluida!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return y;
    }
}