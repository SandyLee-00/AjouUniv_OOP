
public class main {

        public static void main(String[] args) {
            IntArrayList list = new IntArrayList();

            for (int k = 0; k < 1000000; k++)
                list.add(k);
            for (int k = 0; k < 1000000; k += 10000)
                System.out.println(""+k+":"+list.get(k));

        }
    }

