/**
 * Created by vroyibg on 8/2/16.
 */
import java.awt.*;
public class Cannon extends Piece {
    public Cannon(boolean red){
        super(red);
        name="Cannon";
        if(red) image=Constants.redCannon;
        else image=Constants.blackCannon;
    }
}
