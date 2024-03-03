public class Main {
    public static void main(String[] args) throws Exception {
        Pila<Integer> pilaDeEnteros = new Pila<>();
        pilaDeEnteros.push(1);
        pilaDeEnteros.push(2);
        pilaDeEnteros.push(3);

        System.out.println("Elemento en la cima: " + pilaDeEnteros.peek());
        System.out.println("Quitando de la cima: " + pilaDeEnteros.pop());
        System.out.println("Elemento en la cima después de quitar: " + pilaDeEnteros.peek());
        System.out.println("¿La pila está vacía? " + pilaDeEnteros.estaVacia());

        // Ejemplo de uso con cadenas de texto
        Pila<String> pilaDeCadenas = new Pila<>();
        pilaDeCadenas.push("Hola");
        pilaDeCadenas.push("Mundo");
        pilaDeCadenas.push("!");

        System.out.println("Elemento en la cima: " + pilaDeCadenas.peek());
        System.out.println("Quitando de la cima: " + pilaDeCadenas.pop());
        System.out.println("Elemento en la cima después de quitar: " + pilaDeCadenas.peek());
        System.out.println("¿La pila está vacía? " + pilaDeCadenas.estaVacia());
    }
}