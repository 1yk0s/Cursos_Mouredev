package strings;

public class Contains {
    public static void main(String[] args) {

        //Se comprueba si contiene el texto "ava"
        System.out.println("Hola, Java".contains("ava")); //Devuelve true
        //Se comprueba si tiene el texto "AVA"
        System.out.println("Hola, Java".contains("AVA")); //Devuelve false
        //Se transforma el texto a mayúsculas y se comprueba si contiene "JAVA
        System.out.println("Hola, Java".toUpperCase().contains("JAVA")); //Devuelve true

    }
}
