package Campos;

public enum TipoCampo {
    TEXTO,
    INTEIRO,
    DECIMAL,
    DATA,
    DATA_HORA,
    BOOLEANO,
    ARRAY,
    OBJETO;

    public static TipoCampo fromString(String str) {
        return switch (str.trim().toLowerCase()) {
            case "texto" -> TEXTO;
            case "inteiros", "inteiro", "int" -> INTEIRO;
            case "ponto flutuante", "decimal", "float" -> DECIMAL;
            case "data" -> DATA;
            case "datahora", "data e hora" -> DATA_HORA;
            case "booleano" -> BOOLEANO;
            case "array" -> ARRAY;
            case "objeto" -> OBJETO;
            default -> throw new IllegalArgumentException("Tipo inválido: " + str);
        };
    }
}
