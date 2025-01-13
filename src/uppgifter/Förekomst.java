package uppgifter;

import java.util.Arrays;

public class Förekomst {
    public static void main(String[] args) {

        String [] ord={"hund","katt","hund","elefant","elefant"};
        String[] sökt=new String[5];
        int [] antal=new int[5];

        for (int i=0;i<5;i++){

            for(int j=0;j<5;j++) {
                if (ord[i].equals(sökt[j])) {
                    System.out.println("stop");
                    break;
                }else{
                        sökt[j]=ord[i];

                        int summa=1;
                    for (int k = i; k <5 ; k++) {

                        if(ord[i].equals(ord[k])) {
                            summa++;
                            System.out.println(ord[k]);
                        }

                    }
                    antal[i]=summa;
                }
            }


        }

        System.out.println(Arrays.toString(antal));

    }



}
