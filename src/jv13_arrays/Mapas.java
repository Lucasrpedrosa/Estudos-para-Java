package jv13_arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        /*
        Ao utilizar mapas faz-se o uso das chaves e valores respectivos, separando as chaves com seus valores, podendo identificar um valor por sua chave


         */
        Map <String, String> estados = new HashMap(); // Informamos das Strings para indicar que as chaves e valores iram deveram ser Strings
        estados.put("PI", "PIAUI");
        estados.put("PE", "PERNAMBUCO");
        estados.put("SP", "SÃO PAULO");
        System.out.printf(" A chave PE é do estado %s", estados.get("PE"));

        // Agora Interando o mapa
        Iterator <String> keys = estados.keySet().iterator();

        while(keys.hasNext()){

            String chave = keys.next();
            String valor = estados.get(chave);
        }
    }
}
