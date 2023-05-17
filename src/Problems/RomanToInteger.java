package Problems;

import java.util.HashMap;
import java.util.Map;
/*
    * CREA UN METODO QUE RECIBA NUMEROS ROMANOS Y DEVUELVA SU VALOR EN NUMEROS NATURALES.
    *
    * Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
    * */
public class RomanToInteger {
    public int romanToIn(String input) {
        // 1. CREAMOS UN MAP QUE CONTENGA LOS VALORES POR CHAR.
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // CREAMOS LAS VARIABLES DE LONGITUD DE LA ENTRADA Y LA VARIABLE QUE ALMACENA EL RESULTADO.
        int inputLength = input.length();
        int result = 0;

        // UN CICLO QUE EN CADA VUELTA RECORRE UN CHAR DE LA ENTRADA DADA.
        for (int i = 0; i < inputLength; i++) {
            // MIENTRAS NO SE RECORRA COMPLETA OBTIENE EL VALOR DEL CHAR(I)
            // SI ESTE ES MAYOR AL SIGUIENTE SE RESTARAN Y SE ALMACENAN EN RESULT.
            if (i < inputLength - 1 && romanMap.get(input.charAt(i)) < romanMap.get(input.charAt(i + 1))) {
                result += romanMap.get(input.charAt(i + 1)) - romanMap.get(input.charAt(i));
                i++;
            }
            // DE LO CONTRARIO SOLO SE ALMACENARAN DENTRO DE LA VARIABLE RESULT
            else {
                result += romanMap.get(input.charAt(i));
            }
        }
        // RETORNAMOS EL RESULTADO TOTAL.
        return result;
    }
}
