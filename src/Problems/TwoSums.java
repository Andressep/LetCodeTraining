package Problems;

/*
* DADO UN ARREGLO DE NUMEROS 'nums' Y UN ENTERO 'target' DEVUELVE LOS INDICES DE DOS NUMEROS
* QUE AL SUMARLOS RETORNEN EL VALOR DE 'target'.
* DEBES ASUMIR QUE CADA INGRESO TIENE SOLO UNA SOLUCION Y NO SE PUEDE USAR DOS VECES
* UN MISMO INDICE.
* */
public class TwoSums {

    public int[] twoSums(int[] nums, int target) {
        // RECORRE EL ARREGLO POR ELEMENTOS 1 X 1
        for (int i = 0; i < nums.length; i++) {
            // RECORRE EL ARREGLO NUEVAMENTE PERO QUEDANDOSE PARADO EN I
            for (int j = i + 1; j < nums.length; j++) {
                // SI EL VALOR DE J + I ES IGUAL A TARGET DEVUELVELOS
                if (nums[j] + nums[i] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
