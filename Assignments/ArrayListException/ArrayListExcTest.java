public class ArrayListExcTest {
    public static void main(String[] args) {
        ArrayListExc arrlist = new ArrayListExc();

        arrlist.add("Sunday");
        arrlist.add("Monday");
        arrlist.add("Tuesday");
        arrlist.add("Wednesday");
        arrlist.add("Thursday");
        arrlist.add("Friday");
        arrlist.add("Saturday");
        try {
            System.out.println("test 1");
            arrlist.getExc(-1);
            System.out.println("passed.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("test 2");
            arrlist.getExc(7);
            System.out.println("passed.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("test 3");
            arrlist.setExc(1, "월요일");
            System.out.println("passed.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("test 4");
            arrlist.setExc(7, "일요일");
            System.out.println("passed.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("test 5");
            int idx = arrlist.indexOfExc("화요일");
            System.out.println("passed.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("test 6");
            arrlist.removeExc(7);
            System.out.println("passed.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("test 7");
            arrlist.removeExc("Monday");
            System.out.println("passed.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
