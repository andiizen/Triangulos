package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Ingresar los lados del triangulo:");

        Triangulo triangulo = new Triangulo();// ====> constructor creado en la clase.
        // triangulo.lado1 = 5;
        // triangulo.lado2 = 5;
        // triangulo.lado3 = 5;

        // Triangulo triangulo2 = new Triangulo(2, 3, 1);
        // o sino solo variable : triangulo = new Triangulo. se reutiliza la variable.

        triangulo.setLado1(Teclado.nextInt());
        triangulo.setLado2(Teclado.nextInt());
        triangulo.setLado3(Teclado.nextInt());

        System.out.println("El triangulo es " + triangulo.resolverTipo() + ".");
    }

}
