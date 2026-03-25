package Decorator;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeSimple();
        cafe = new Leche(cafe);
        cafe = new Leche(cafe);

        System.out.println(cafe.descripcion());
        System.out.println(cafe.costo());
    }
}
