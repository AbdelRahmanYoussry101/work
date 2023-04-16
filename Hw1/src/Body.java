public class Body extends Colour implements Power {
    private  int y;
    public Body(int x,int y,int z){
        super(x,y);
    }
    public String GetColour(){
        return ("Red");
    }

    public  String toString(){
        return ("Overweitten");
    }
    public void HowToPunch(){
        System.out.println("punched");
    }

}
