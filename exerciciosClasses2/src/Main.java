import Telefones.TelefoneUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        String entrada = scanner.nextLine();
        String resultado = TelefoneUtils.verificarOuFormatar(entrada);
        System.out.println(resultado);
    }
}
