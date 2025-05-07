package Campos;

public class CampoEntrada {
    private final String nome;
    private final String valorBruto;
    private final TipoCampo tipo;

    public CampoEntrada(String nome, String valorBruto, TipoCampo tipo) {
        this.nome = nome;
        this.valorBruto = valorBruto;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public Object getValorConvertido() {
        return switch (tipo) {
            case INTEIRO -> Integer.parseInt(valorBruto);
            case DECIMAL -> Double.parseDouble(valorBruto);
            case BOOLEANO -> Boolean.parseBoolean(valorBruto);
            case DATA, DATA_HORA -> valorBruto;
            case ARRAY, OBJETO -> valorBruto;
            default -> valorBruto;
        };
    }

    public TipoCampo getTipo() {
        return tipo;
    }
}
