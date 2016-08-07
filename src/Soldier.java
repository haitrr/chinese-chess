/**
 * Created by vroyibg on 8/2/16.
 */
import java.awt.*;
public class Soldier extends Piece{
    public Soldier(boolean red){
        super(red);
        name="Solider";
        if(red) image=Constants.redSoldier;
        else image=Constants.blackSoldier;
    }
}
