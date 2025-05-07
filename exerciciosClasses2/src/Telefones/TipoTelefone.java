package Telefones;

import java.util.function.Predicate;

public enum TipoTelefone {
    FIXO_SEM_DDD("Fixo sem DDD", "^\\d{8}$", n -> n.replaceFirst("(\\d{4})(\\d{4})", "$1-$2")),
    FIXO_COM_DDD("Fixo com DDD", "^\\d{10}$", n -> n.replaceFirst("(\\d{2})(\\d{4})(\\d{4})", "($1)$2-$3")),
    CELULAR_SEM_DDD("Celular sem DDD", "^\\d{9}$", n -> n.replaceFirst("(\\d{5})(\\d{4})", "$1-$2")),
    CELULAR_COM_DDD("Celular com DDD", "^\\d{11}$", n -> n.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1)$2-$3"));

    private final String descricao;
    private final String regex;
    private final Predicate<String> validator;
    private final Formato formato;

    @FunctionalInterface
    public interface Formato {
        String aplicar(String numero);
    }

    TipoTelefone(String descricao, String regex, Formato formato) {
        this.descricao = descricao;
        this.regex = regex;
        this.validator = numero -> numero.matches(regex);
        this.formato = formato;
    }

    public boolean validar(String numero) {
        return validator.test(numero);
    }

    public String formatar(String numero) {
        return formato.aplicar(numero);
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoTelefone detectarTipo(String numero) {
        for (TipoTelefone tipo : values()) {
            if (tipo.validar(numero)) {
                return tipo;
            }
        }
        return null;
    }
}
