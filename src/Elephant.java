/**
 * Created by vroyibg on 8/2/16.
 */
import java.awt.*;
public class Elephant extends Piece {
    public Elephant(boolean red)
    {
        super(red);
        name="Elephant";
        if(red) image=Constants.redElephant;
        else image=Constants.blackElephant;
    }
}
