package uppgifter;

public class Sida90upp1 {


    int tal;
    int max;
    int min;


    public Sida90upp1(int tal, int max, int min) {
        this.tal = tal;
        this.max = max;
        this.min = min;
    }

    public void addOne(){

        //tal++;
        // tal=tal+1;
       if(tal < max) {
           tal += 1;
       }
    }

    public void subtractOne(){

    if(tal > min ) {
        tal -= 1;
    }
    }
    public int getTal(){
    return tal;
    }

    public static void main(String[] args) {
        Sida90upp1 s = new Sida90upp1(4, 20, 0);

        s.subtractOne();
        System.out.println(s.getTal());
        s.subtractOne();
        System.out.println(s.getTal());
        s.subtractOne();
        System.out.println(s.getTal());
        s.subtractOne();
        System.out.println(s.getTal());
        s.subtractOne();
        System.out.println(s.getTal());
        s.subtractOne();
        System.out.println(s.getTal());
        s.addOne();
        System.out.println(s.getTal());

    }

    }