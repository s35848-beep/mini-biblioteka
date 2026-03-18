public class Main { 
    public static void main(String[] args){
        Książka harrypoter = new Książka("harrypoter","J.K Rowling", 300, true);
        harrypoter.wyiszinfo();
        harrypoter.wypozycz();
        harrypoter.zwroc();

        Książka k1 = new Książka("Latarnik", "jakis ziomek", 100, true);
        Książka k2 = new Książka("bajki dla dzieci","Julian Tuwim", 30, false);
        Książka k3 = new Książka("dziady","Adam Mickiewicz",300, true);

        k1.wyiszinfo();
        k1.wypozycz();
        k1.zwroc();
        k2.wyiszinfo();
        k2.wypozycz();
        k2.zwroc();
        k3.wyiszinfo();
        k3.wypozycz();
        k3.zwroc();
    }
}