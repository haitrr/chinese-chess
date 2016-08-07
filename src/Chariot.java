/**
 * Created by vroyibg on 8/2/16.
 */
import java.awt.*;
public class Chariot extends Piece {
    public Chariot(boolean red)
    {
        super(red);
        name="Chariot";
        if(red) image=Constants.redChariot;
        else image=Constants.blackChariot;
    }
}
