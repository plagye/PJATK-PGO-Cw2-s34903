public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, String numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    void wypiszDane() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer karty: " + numerKarty);
        System.out.println("Liczba wypożyczeń tego czytelnika: " + liczbaWypozyczen);
    }

    void zwiekszLiczbeWypozyczen() {
        this.liczbaWypozyczen++;
    }

    void zmniejszLiczbeWypozyczen() {
        this.liczbaWypozyczen--;
    }
}