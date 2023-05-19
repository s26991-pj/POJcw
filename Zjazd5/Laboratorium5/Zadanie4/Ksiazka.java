package Zadanie4;



class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String toString() {
        return "Ksiazka [tytul=" + tytul + ", autor=" + autor + ", liczbaStron=" + liczbaStron + "]";
    }
}
