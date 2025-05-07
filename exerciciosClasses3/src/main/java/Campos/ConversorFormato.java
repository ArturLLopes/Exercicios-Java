package Campos;

import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ConversorFormato {

    public static Map<String, Object> gerarMapaCampos(List<CampoEntrada> campos) {
        Map<String, Object> dados = new LinkedHashMap<>();
        for (CampoEntrada campo : campos) {
            dados.put(campo.getNome(), campo.getValorConvertido());
        }
        return dados;
    }

    public static String paraJson(Map<String, Object> mapa) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapa);
    }

    public static String paraXml(Map<String, Object> mapa) throws Exception {
        XmlMapper mapper = new XmlMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapa);
    }

    public static String paraYaml(Map<String, Object> mapa) throws Exception {
        YAMLMapper mapper = new YAMLMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapa);
    }
}
