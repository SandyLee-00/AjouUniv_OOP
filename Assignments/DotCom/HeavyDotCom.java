import java.util.ArrayList;

public class HeavyDotCom extends DotCom{

    private ArrayList<String> armourCells;

    public  int size(){
        return super.size();
    }

    public void setLocationCells(ArrayList<String> loc) {
        armourCells = (ArrayList<String>)loc.clone();
        super.setLocationCells(armourCells);
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = armourCells.indexOf(userInput);
        int armour = 1;
        if (index >= 0) {
            armour--;
            System.out.println("armour broken");
            if(armour == 0) {
                armourCells.remove(index);
                if (armourCells.isEmpty()) {
                    result = "kill";
                    System.out.println("You sunk " + getName() + " : ( ");
                } else {
                    result = "hit";
                }
            }
        }
        return result;
    }
}
