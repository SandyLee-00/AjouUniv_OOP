
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;


public class SerializationTest {

    public static void testWritingList(AjLinkedList list, String fname) {
        try {
            FileOutputStream filein = new FileOutputStream(fname);
            ObjectOutputStream os = new ObjectOutputStream(filein);
            os.writeObject(list);
            os.close();

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public static AjLinkedList testReadingList(String fname) {
        AjLinkedList list;
        try {
            FileInputStream fileout = new FileInputStream(fname);
            ObjectInputStream os = new ObjectInputStream(fileout);
            list = (AjLinkedList) os.readObject();
            os.close();
            return list;

        } catch (Exception ex){
            ex.printStackTrace();
        }return null;
    }

    public static void main(String[] args) {
        AjLinkedList	ajlist = new AjLinkedList();
        Random generator = new Random(10);

        int		val0, val3, val7;
        val0 = val3 = val7 = 0;
        for (int k = 0; k < 10; k++) {
            int	value = (int)(generator.nextDouble()*100);
            ajlist.add(new Integer(value));
            if (k == 0) val0 = value;
            if (k == 3) val3 = value;
            if (k == 7) val7 = value;
        }

        System.out.println("list to file");
        int count = 0;
        for (Iterator it = ajlist.iterator(); it.hasNext(); count++) {
            int value = (Integer)it.next();
            System.out.println(""+count+":" + value);
        }
        System.out.println("");

        testWritingList(ajlist, "testlist.dat");

        AjLinkedList list2 = testReadingList("testlist.dat");

        System.out.println("list from file");
        count = 0;
        for (Iterator it = list2.iterator(); it.hasNext(); count++) {
            int value = (Integer)it.next();
            System.out.println(""+count+":" + value);
        }

    }

}



