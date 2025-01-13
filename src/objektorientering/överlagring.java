package objektorientering;

public class överlagring {

   private int tal=0;

    public void add(){

        tal++;

    }
    public void add(int ökning){

        tal=tal+ökning;
    }

    public static void main(String[] args) {

        överlagring j=new överlagring();

        j.add();
        j.add(10);
        System.out.println(j.tal);
    }

}
