package arrayer;

public class Biggest {

    public static void main(String[] args) {

        int [] tal={23,45,67,23,45};

        int sökttal=23;

        boolean taletfinns=false;

        for (int i=0;i<tal.length;i++){

            if(sökttal == tal[i]){
                taletfinns = true;
                System.out.println("talet finns på pos :"+i);
            }

        }
        if(!taletfinns){
            System.out.println("talet finns inte");
        }



    }
}
