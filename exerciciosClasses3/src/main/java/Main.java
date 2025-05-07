import Campos.CampoEntrada;
import Campos.ConversorFormato;
import Campos.Entrada;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual separador deseja usar? Ex: ; , |");
        String separador = scanner.nextLine();

        List<CampoEntrada> campos = Entrada.lerEntradas(scanner, separador);
        Map<String, Object> dados = ConversorFormato.gerarMapaCampos(campos);

        System.out.println("\n=== JSON ===");
        System.out.println(ConversorFormato.paraJson(dados));

        System.out.println("\n=== XML ===");
        System.out.println(ConversorFormato.paraXml(dados));

        System.out.println("\n=== YAML ===");
        System.out.println(ConversorFormato.paraYaml(dados));
    }
}
