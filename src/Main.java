public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka(5);
        biblioteka.dodajKsiazke(new Ksiazka("Ostatnie życzenie", "Andrzej Sapkowski", 332, true));
        biblioteka.dodajKsiazke(new Ksiazka("1984", "George Orwell", 448, true));
        biblioteka.dodajKsiazke(new Ksiazka("Koran", "Autor nieznany", 972, true));

        Czytelnik cz1 = new Czytelnik("Jan", "Kowalski", "2137", 0);
        Czytelnik cz2 = new Czytelnik("Mariusz", "Nowak", "1337", 0);

        System.out.println("=== Dostępne książki ===");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n=== Wypożyczenia ===");
        biblioteka.wypozyczKsiazke("1984", cz1);
        biblioteka.wypozyczKsiazke("Koran", cz2);
        biblioteka.wypozyczKsiazke("1984", cz2);

        System.out.println("\n=== Dostępne po wypożyczeniu ===");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Dostępnych: " + biblioteka.policzDostepneKsiazki());

        System.out.println("\n=== Czytelnicy ===");
        cz1.wypiszDane();
        cz2.wypiszDane();

        System.out.println("\n=== Zwrot ===");
        biblioteka.zwrocKsiazke("1984", cz1);

        System.out.println("\n=== Dostępne po zwrocie ===");
        biblioteka.wypiszDostepneKsiazki();
        cz1.wypiszDane();
    }
}