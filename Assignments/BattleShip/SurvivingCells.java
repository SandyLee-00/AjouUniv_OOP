import java.util.Observable;
import java.util.Observer;

public class SurvivingCells implements Observer {
    private DotCom dotCom = new DotCom();

    public void setDotCom(DotCom com) {
        this.dotCom = com;
    }

    public void update() {
        System.out.println("Surviving Cells in" + dotCom.getName() + dotCom.getLocationCells());
    }
}
