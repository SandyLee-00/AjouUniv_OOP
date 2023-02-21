import java.util.ArrayList;

public class GarbageMaker {

    ArrayList<Integer> a = new ArrayList();

    public void minorGarbageMaker() {
        // Make code to incur several minor GCs
        for (int i = 0; i < 10000; i++) {
            ArrayList<Integer> a = new ArrayList(i);

        }


    }

    public void majorGarbageMaker() {
        // Make code to incur full GCs
        ArrayList<Object> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();

        for (int j = 0; j < 10000000; j++) {
            a.add(new Object());

        }

    }


    public static void main(String[] args) {
        GarbageMaker gmaker = new GarbageMaker();
        System.out.println("Incurring only minor garbage collections...");
        gmaker.minorGarbageMaker();
        System.out.println("Incurring full garbage collections...");
        gmaker.majorGarbageMaker();
    }

}
