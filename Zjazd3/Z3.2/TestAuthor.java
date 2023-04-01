public class TestAuthor {
    public static void main(String[] args) {
        Author a1=new Author("Bolesław","Prus",55);

        Author a3=new Author("Eliza", "Orzeszkowa", 34);

        System.out.println("Author name = "+a1.getName()+" surname = "+a1.getSurname()+" age = "+a1.getAge());
        a1.setSurname("Leśmian");
        System.out.println(a1);
        System.out.println(a3.toString());
        System.out.println("name = "+a3.getName()+" age = "+a3.getAge());



    }

}