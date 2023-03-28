public class Main {
    public static void main(String[] args) {
        boolean P= true;
        boolean Q= true;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
        System.out.println(P+"\t"+Q+"\t"+(P&&Q)+"\t"+(P||Q)+"\t"+(P^Q)+"\t"+(!P));
        P= true;
        Q= false;
        System.out.println(P+"\t"+Q+"\t"+(P&&Q)+"\t"+(P||Q)+"\t"+(P^Q)+"\t"+(!P));
        P= false;
        Q= true;
        System.out.println(P+"\t"+Q+"\t"+(P&&Q)+"\t"+(P||Q)+"\t"+(P^Q)+"\t"+(!P));
        P= false;
        Q= false;
        System.out.println(P+"\t"+Q+"\t"+(P&&Q)+"\t"+(P||Q)+"\t"+(P^Q)+"\t"+(!P));



    }
}