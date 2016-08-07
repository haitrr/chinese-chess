/**
 * Created by vroyibg on 8/2/16.
 */
import java.awt.*;
public class General extends Piece {
    public General(boolean red){
        super(red);
        name="General";
        if(red) image=Constants.redGeneral;
        else image=Constants.blackGeneral;
    }
}
