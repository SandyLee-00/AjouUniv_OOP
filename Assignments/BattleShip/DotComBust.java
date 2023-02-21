
import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        DotCom one = new ShortDotCom();     one.setName("Pets.com");
        DotCom two = new LongDotCom();     two.setName("eToys.com");
        DotCom three = new HeavyDotCom();   three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(dotComToSet.size());
            System.out.println(""+newLocation);
            dotComToSet.setLocationCells(newLocation);
            SurvivingCells scells = new SurvivingCells();
            scells.setDotCom(dotComToSet);
            dotComToSet.registerObserver(scells);
            DamageRate drate = new DamageRate();
            drate.setDotCom(dotComToSet);
            dotComToSet.registerObserver(drate);
        }
    }

    public void startPlaying() {
        while(!dotComsList.isEmpty()) {
//            String userGuess = helper.getUserInput("Enter a guess");
            String userGuess = helper.getUserInputRandom("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "";
        for (int x = 0; x < dotComsList.size(); x++) {
            result = dotComsList.get(x).checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            } else if (result.equals("kill")) {
                dotComsList.remove(x);
                break;
            }
        }
//        if (result.equals("hit") || result.equals("kill"))
//        System.out.println(result + " at " + userGuess);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are dead!");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
        } else {
            System.out.println(
                    "Took you long enough. " + numOfGuesses + " guesses.");
        }
    }

}
