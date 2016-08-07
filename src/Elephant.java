public class Elephant extends Piece {
    public Elephant(boolean red)
    {
        super(red);
        name="Elephant";
        if(red) image=Constants.redElephant;
        else image=Constants.blackElephant;
    }
}
