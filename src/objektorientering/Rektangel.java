package objektorientering;

public class Rektangel {

    private double höjd;
    private double bredd;


    public Rektangel(double h , double b ) {

        höjd=h;
        bredd=b;
    }
   public void setHöjd(double h){
        höjd=h;

    }
    public double getHöjd(){

        return höjd;
    }

    public double area(){

        double area=höjd*bredd;

        return area;
    }






    public static void main(String[] args) {

        Rektangel r1=new Rektangel(2,2.0);
        Rektangel r2=new Rektangel(4,4);

        System.out.println(r1.area());
        r1.setHöjd(5);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}