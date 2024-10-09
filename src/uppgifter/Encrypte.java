package uppgifter;

public class Encrypte {


  public static String encrypte(String w,int key){

      int längd=w.length();

      String encrypted="";

      for(int i =0;i<längd;i++) {
          char bokstav = w.charAt(i);
          int unicodeValue = (int) bokstav + key;
          encrypted =encrypted+(char)unicodeValue;
      }
      //System.out.println(encrypted);
      return encrypted;
   }


    public static void main(String[] args) {

        String svar=Encrypte.encrypte("angelica",20000);

        System.out.println(svar);
    }


}
