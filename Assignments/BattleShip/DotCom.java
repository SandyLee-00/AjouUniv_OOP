
import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private ArrayList<Observer> observers;
    private String name;

    public int size() {
        return 3;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = (ArrayList<String>)loc.clone();
    }

    public ArrayList<String> getLocationCells(){
        return locationCells;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                update();
                System.out.println("You sunk " + name + " : ( ");
            } else {
                result = "hit";
                update();
            }
        }
        return result;
    }

    public registerObserver(Observer o){



    }

    public void unregisterObserver(Observer o){

        observers = null;
    }
}
