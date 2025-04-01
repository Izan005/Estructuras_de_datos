package org.example.stringbuilder;

public class Prueba {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Qué tal");
        sb.insert(7, " soy Izan");
        sb.replace(0, 7, "Hola Buenas");
        sb.delete(0, 7);

        System.out.println(sb.toString());
        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
    }
}
