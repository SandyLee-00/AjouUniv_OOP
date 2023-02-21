

import java.util.ArrayList;

public class HeavyDotCom extends DotCom {

    private ArrayList<String> armourCells;
    public void setLocationCells(ArrayList<String> loc) {
        super.setLocationCells(loc);
        armourCells = (ArrayList<String>)loc.clone();
    }

    public String checkYourself(String userInput) {
        int index = armourCells.indexOf(userInput);
        if (index >= 0) {
            armourCells.remove(index);
            return "hit";
        } else {
            return super.checkYourself(userInput);
        }
    }

}
