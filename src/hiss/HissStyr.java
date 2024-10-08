package hiss;

public class HissStyr {

    public static void main(String[] args) {


        Hiss h1=new Hiss(); // skapar referensvariabeln h1 av typen hiss lägger in ett hiss objekt

        int v=h1.getVåning();
        System.out.println(v);

        h1.ändravåning(3);
        v= h1.getVåning();
        System.out.println(v);

        h1.ändravåning(1);
        v= h1.getVåning();
        System.out.println(v);




    }

}
