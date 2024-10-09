package uppgifter;

public class Cesar {

    public static void main(String[] args) {

     String ord="angelica";

     int längd=ord.length();

     String encrypted="";

    for(int i =0;i<längd;i++) {
        char bokstav = ord.charAt(i);
        int unicodeValue = (int) bokstav + 100000;

        encrypted =encrypted+(char)unicodeValue;
    }
        System.out.println(encrypted);

    }
}
