public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Ostatnie życzenie", "Andrzej Sapkowski", 332, true);
        Ksiazka k2 = new Ksiazka("1984", "George Orwell", 448, true);
        Ksiazka k3 = new Ksiazka("Koran", "Autor nieznany", 972, true);

        System.out.println("---");

        k1.wypiszInfo();
        k1.wypozycz();
        k1.wypozycz();
        k1.zwroc();

        System.out.println("---");

        k2.wypiszInfo();
        k3.wypiszInfo();
        k3.wypozycz();

        System.out.println("---");
    }
}