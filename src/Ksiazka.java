public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    void wypiszInfo() {
        System.out.println("tytul: " + tytul);
        System.out.println("autor: " + autor);
    }

    void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Książka \"" + tytul + "\" jest już wypożyczona.");
        }
    }

    void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Zwrócono: " + tytul);
        } else {
            System.out.println("Książka \"" + tytul + "\" nie była wypożyczona.");
        }
    }

    boolean isDostepna() {
        return dostepna;
    }

    String getTytul() {
        return tytul;
    }
}