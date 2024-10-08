package variabler;

public class Chartest {
    public static void main(String[] args) {

        char tecken='d';
        char tecken2='a';
        String tecken3=""+tecken+tecken2;
        System.out.println(tecken3);

        int i =(int)tecken;
        System.out.println(i);

             char någonting =(char) i;
        System.out.println(någonting);

        String namn = "daniel";

        char c= namn.charAt(2);
        System.out.println(c);

        char hex= '\u2F39';
        System.out.println(hex);



    }

}
