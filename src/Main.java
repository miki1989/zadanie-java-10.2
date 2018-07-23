public class Main {
    public static void main(String[] args) {

        String s1 = "kontrolowane";
        String s2 = "niekontrolowane";
        String s3 = "throw";
        String s4 = "throws";
        String s5 = "finally";

        System.out.println("Wyjątki dzielimy na " +s1.toUpperCase() + " które trzeba obsłużyć i "+ s2.toUpperCase() +
                " które można, ale nie trzeba obsłużyć.");
        System.out.println("Wyjątki " + s2.toUpperCase() + " dziedziczą po klasie RuntimeException");
        System.out.println("Wyjątki rzucamy korzystając z instrukcji " + s3.toUpperCase() + " jeśli rzucamy wyjątek" +
                " kontrolowany musimy dodatkowo w sygnaturze metody/konstruktora\nzadeklarować wyjątek używając słowa " + s4.toUpperCase());
        System.out.println("Do bloku try-catch możemy dodać dodatkowo blok " + s5.toUpperCase() + " który wykona się zawsze, niezależnie, czy w bloku try wyjątek wystąpił, czy nie");
    }
}
