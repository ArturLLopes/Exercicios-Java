package Campos;

import java.util.*;
import java.util.regex.Pattern;

public class Entrada {
    public static List<CampoEntrada> lerEntradas(Scanner scanner, String separador) {
        List<CampoEntrada> campos = new ArrayList<>();

        while (true) {
            System.out.println("Informe no formato: NOME" + separador + "VALOR" + separador + "TIPO" + separador + " (ou digite 'fim')");
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("fim")) break;

            String[] partes = linha.split(Pattern.quote(separador));
            if (partes.length < 3) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            try {
                String nome = partes[0].trim();
                String valor = partes[1].trim();
                TipoCampo tipo = TipoCampo.fromString(partes[2].trim());
                campos.add(new CampoEntrada(nome, valor, tipo));
            } catch (Exception e) {
                System.out.println("Erro ao processar entrada: " + e.getMessage());
            }
        }

        return campos;
    }
}
