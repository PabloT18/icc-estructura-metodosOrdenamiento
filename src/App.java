public class App {
    public static void main(String[] args) throws Exception {
        // Crear la instancia de la (clase u objeto) MetodosOrdenamiento
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();
        // Creo el arreglo de enteros int[]
        int[] numeros = { 30, 7, 12, 5 };

        // Mandar a imprimir mi arreglo
        metodosOrdenamiento.imprime(numeros);

        // Llamo al metodo sortByBubble y su respuesta guardo en
        // la variable arregloOrdenadoBuble
        int[] arregloOrdenadoBuble = metodosOrdenamiento.sortByBubble(numeros, true);
        // Mando a imprimir mi nuevo arreglo que ya fue ordenado arregloOrdenadoBuble
        metodosOrdenamiento.imprime(arregloOrdenadoBuble);

        /// TODO: Hacer un menu que elija el metodo
    }
}
