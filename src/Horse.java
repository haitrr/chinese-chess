public class Horse extends Piece {
    public Horse(boolean red){
        super(red);
        name="Horse";
        if(red) image=Constants.redHorse;
        else image=Constants.blackHorse;
    }
}
