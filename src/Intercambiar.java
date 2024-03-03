public class Intercambiar {

    public static <T> void Intercambiar(T[] array, int i, int j) {
        if (i != j) {
            if (i <= array.length && j <= array.length) {
                CuandoCondicionesCumplidas(array, i, j);
            } else {
                System.out.println("Índices fuera de rango");
                ImprimirArray(array);//nueva rama 32
            }
        } else{
            System.out.println("Los índices corresponde al mismo valor.");
            ImprimirArray(array);
        }
    }

    private static <T> void CuandoCondicionesCumplidas(T[] array, int i, int j) {
        System.out.println("Valor del array actual:");
        ImprimirArray(array);
        for (int v = 0; v < array.length; v++) {
            IntercambiarValores(array, i, j, v);
        }
        System.out.println("Nuevo orden del array:");
        ImprimirArray(array);
    }

    private static <T> void IntercambiarValores(T[] array, int i, int j, int v) {
        if (array[i] == array[v]) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static <T> void ImprimirArray(T[] array) {
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }


}
