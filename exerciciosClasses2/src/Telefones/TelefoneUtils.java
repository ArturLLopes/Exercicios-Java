package Telefones;

public class TelefoneUtils {

    public static String limparEntrada(String entrada) {
        return entrada.replaceAll("[^0-9]", "");
    }

    public static String verificarOuFormatar(String entradaOriginal) {
        String somenteNumeros = limparEntrada(entradaOriginal);

        TipoTelefone tipo = TipoTelefone.detectarTipo(somenteNumeros);

        if (tipo != null) {
            String formatado = tipo.formatar(somenteNumeros);
            return "Número formatado: " + formatado + "\nTipo: " + tipo.getDescricao();
        }

        // Verifica se já está formatado corretamente
        if (entradaOriginal.matches("^\\(\\d{2}\\)\\d{4}-\\d{4}$"))
            return "Número já formatado: " + entradaOriginal + "\nTipo: Fixo com DDD";
        if (entradaOriginal.matches("^\\d{4}-\\d{4}$"))
            return "Número já formatado: " + entradaOriginal + "\nTipo: Fixo sem DDD";
        if (entradaOriginal.matches("^\\(\\d{2}\\)\\d{5}-\\d{4}$"))
            return "Número já formatado: " + entradaOriginal + "\nTipo: Celular com DDD";
        if (entradaOriginal.matches("^\\d{5}-\\d{4}$"))
            return "Número já formatado: " + entradaOriginal + "\nTipo: Celular sem DDD";

        if (somenteNumeros.length() < 8 || somenteNumeros.length() > 11) {
            return "Número inválido: quantidade de dígitos não corresponde a nenhum tipo válido.";
        }

        return "Entrada inválida: não foi possível identificar como número de telefone válido.";
    }
}
