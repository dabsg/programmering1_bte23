package loopar;

public class Backwards {

    public static void main(String[] args) {

        String ord ="portugal";

       int längd= ord.length();

        for(int i =7; i>-1;i--) {

            char bokstav = ord.charAt(i);

            System.out.print(bokstav);
        }
    }


}
