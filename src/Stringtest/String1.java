package Stringtest;

public class String1 {

    public static void main(String[] args) {

        String s1= "jorden är oval";
        String s2= "jorden är oval";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();




       if(s1.length()>s2.length()){

            System.out.println("s1 är längre");
        }else{

            System.out.println("s2 är längre");
        }


        String c1=""+s1.charAt(2);

       String s3=s1.substring(3,6);
        System.out.println(s3);


        if(0==s1.compareTo(s2)){

            System.out.println("lika");
        }else {
                if (0 > s1.compareTo(s2)) {

                    System.out.println("s1 är först");
                } else {
                    System.out.println("s2 är först");
                }
            }

    }




}
