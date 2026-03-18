public class Książka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Książka(String tytul, String autor, int liczbaStron, boolean dostepna){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;

    }

        public void wyiszinfo() {
            System.out.println("Tytul: " + this.tytul);
            System.out.println("Autor: " + this.autor);
            System.out.println("Liczba stron: " + this.liczbaStron);
            System.out.println("Dostępność: " + this.dostepna);


        }
        public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Książka dostępna: " + tytul);
        }else {
            System.out.println("Niedostępna: " + tytul);
        }
    }

    public void zwroc() {
        if(dostepna){
            dostepna = true;
            System.out.println("Ksiązka zwrócona: " + tytul);
        }else
        System.out.println("Książka nie zwrócona: " +tytul);
}
}