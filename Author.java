package Day4;

public class Author {
    public static void main(String[] args) {


            Author author1 = new Author( "Norah", "Norah@gmail.com");
            System.out.println(author1.toString());


    }
    private String name;
    private String email;

    public Author (String name,String email){
        this.name=name;
        this.email=email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString() {
        return "Your name is "+name+" " + "Your Email is" +" " + email  ;
    }
}
