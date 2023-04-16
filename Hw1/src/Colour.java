public abstract class Colour {
    private  int x;
    public Colour(int x,int y){
        this.x=x;
    }
    public int Area(){
        return x;
    }
    public abstract String  GetColour();

}
