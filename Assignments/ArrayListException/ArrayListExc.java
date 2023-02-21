import java.util.ArrayList;

public class ArrayListExc extends ArrayList<String> {

    public String setExc(int index, String element)throws Exception {
        if (index < 0 || index >= this.size()) {
            throw new Exception("The index is out of bound.");
        }
            return super.set(index, element);
    }


    public String getExc(int index) throws Exception{
        if(index < 0 || index >= this.size()){
            throw new Exception("The index is out of bound.");
        }
            return super.get(index);
    }

    public String removeExc(int index)throws Exception{
        if(index < 0 || index >= this.size()){
            throw new Exception("The index is out of bound.");
        }
         return super.remove(index);
    }

    public int indexOfExc(String str)throws Exception{
        if(super.indexOf(str) < 0){
            throw new Exception("The \"" +str +"\" is out of bound.");
        }
        return super.indexOf(str);
    }

    public boolean removeExc(String str) throws Exception {
        if (super.remove(str) == false) {
            throw new Exception("The \"" +str +"\" is out of bound.");
        }
        return super.remove(str);
    }
}
