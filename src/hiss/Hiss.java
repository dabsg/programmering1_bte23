package hiss;

public class Hiss {

    private int riktning=0;
    private int våning=0;

    public void ändravåning(int vv){

      if(våning <vv) {
          while (våning < vv) {

              våning = våning + 1;
              System.out.println("våning: " + våning);
          }
      }else if ( våning >vv){
          while (våning > vv) {

              våning = våning - 1;
              System.out.println("våning: " + våning);
          }


      }


    }

    public int getVåning() {

        return våning;
    }



}
