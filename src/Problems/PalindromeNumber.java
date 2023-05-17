package Problems;

public class PalindromeNumber {

    public boolean palindromeNumber(int n) {
        // CONVIERTE EL ENTERO INGRESADO A UNA CADENA DE STRINGS
        String numberToString = String.valueOf(n);
        String palindrome = "";
        // RECORREMOS LA CADENA DE STRING DE EL ULTIMO VALOR AL PRIMERO
        for (int i = numberToString.length() - 1; i >= 0; i--) {
            // AÑADIMOS A LA VARIABLE PALINDROMO LOS VALORES DE ARREGLO QUE VAMOS RECORRIENDO
            palindrome += numberToString.charAt(i);
        }
        // RETORNAMOS UN METODO EQUALS QUE EVALUA SI LA VARIABLE PALINDROME ES IGUAL A numberToString
        // SE USA EQUALS PORQUE EVALUA EL VALOR REAL DE LA VARIABLE, NO EL ESPACIO EN MEMORIA COMO EL '=='
        return palindrome.equals(numberToString);
    }
}
