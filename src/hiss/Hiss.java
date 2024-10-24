package hiss;

public class Hiss {

    private int riktning=0;
    private int våning=0;

   public Hiss() {

   }

   public Hiss(int v){

       våning= v;

    }
    public Hiss(int v , int r){
       riktning=r;
       våning=v;

    }




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
