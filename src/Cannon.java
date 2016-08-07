public class Cannon extends Piece {
    public Cannon(boolean red){
        super(red);
        name="Cannon";
        if(red) image=Constants.redCannon;
        else image=Constants.blackCannon;
    }
}
