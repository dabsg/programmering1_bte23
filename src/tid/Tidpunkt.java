package tid;

public class Tidpunkt {

    private int h,m,s;



    public void setTime(int hh, int mm, int ss) {

        if(hh<24 && hh>=0) {
            h = hh;
        }
        if(mm<60 && mm>=0) {
            m = mm;
        }
        if(ss<60 && ss>=0) {
            s = ss;
        }

    }

    public String getTime(){

        String time= h+":"+m+":"+s;
        return time;
    }

    public void addSec(){

        s++;
        if(s==60){

            s=0;
            m++;
        }if(m==60){
            m=0;
            h++;
        }if(h==24){
            h=0;
        }


    }




    public static void main(String[] args) {
        Tidpunkt t=new Tidpunkt();
        t.setTime(23,59,59);
        t.addSec();
        String time=t.getTime();
        System.out.println(time);

        Tidpunkt t2=new Tidpunkt();
        t2.setTime(22,78,22);
        t2.addSec();
        String time2=t2.getTime();
        System.out.println(time2);
    }



}
