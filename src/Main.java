import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).

        Scanner entrada = new Scanner(System.in);
        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("Apple", "Manzana");
        diccionario.put("Car", "Coche");
        diccionario.put("House", "Casa");
        diccionario.put("Dog", "Perro");
        diccionario.put("Cat", "Gato");
        diccionario.put("Book", "Libro");
        diccionario.put("Table", "Mesa");
        diccionario.put("Chair", "Silla");
        diccionario.put("Sun", "Sol");
        diccionario.put("Moon", "Luna");
        diccionario.put("Water", "Agua");
        diccionario.put("Tree", "Árbol");
        diccionario.put("Friend", "Amigo");
        diccionario.put("Love", "Amor");
        diccionario.put("Time", "Tiempo");
        diccionario.put("Money", "Dinero");
        diccionario.put("Sky", "Cielo");
        diccionario.put("Earth", "Tierra");
        diccionario.put("Music", "Música");
        diccionario.put("Food", "Comida");

        List<String> list = diccionario.keySet().stream().toList();

        Random random = new Random();

        System.out.println("5 palabras en español al azar: ");
        for(int i = 0; i<5; i++){
            String s = list.get(random.nextInt(20));
            System.out.println((i+1)+". "+diccionario.get(s));
        }

        // Pedir al usuario que teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas.
        String traduccion = "";
        int correctas = 0, incorrectas = 0;
        for(int i = 0; i<5; i++){
            System.out.println((i+1)+". Ingrese la traduccion de la palabra");
            traduccion = entrada.next();
            if(diccionario.get(traduccion) != null){
                correctas++;
            } else {
                incorrectas ++;
            }
        }
        System.out.println("Incorrectas: "+incorrectas+"\nCorrectas: "+correctas);
    }
}