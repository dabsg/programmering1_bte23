package schema;

public class Lektion {

    private int startM=30;
    private int startH=13;
    private int slutM=05;
    private int slutH=15;
    private String ämne="svenska";

    public String getLektion(){
        // fixa så att medtoden returnerar lämplig info om lektionen ämne start och slut
        return  ""+ämne+"n börjar "+startH+":"+startM+" och slutar "+slutH+":"+slutM;
    }

    public String getLängd(){

        int hL=slutH-startH;
       int mL=slutM-startM;
        return "lektion är "+hL+"timmar "+mL+"minuter";
    }


    public static void main(String[] args) {
        Lektion lektion = new Lektion();
       String text= lektion.getLektion();
       System.out.println(text);
       text=lektion.getLängd();
       System.out.println(text);

    }


}
