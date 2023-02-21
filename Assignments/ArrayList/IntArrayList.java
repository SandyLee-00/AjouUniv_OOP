public class IntArrayList {
    private int[] data;
    private int size;
    private int index;

    public IntArrayList(){
        this.size = 1;
        this.data = new int[this.size];
        this.index = 0;
    }

    public void add(int val){
      if(this.index == this.size - 1){
          doubling();
      }
      else {
          data[this.index] = val;
          this.index++;
      }
    }

    public void doubling(){
        this.size = this.size*2;
        int[] newdata = new int[this.size];
        for(int i = 0; i < data.length; i++){
            newdata[i] = data[i];
        }
        this.data = newdata;
    }

    public int get(int index) {
        return this.data[index];
    }

    public void insert(int index, int val) {
        int spotBucket = 0;
        int[] newdata = new int[data.length + 1];
        for (int i = 0; i < data.length ; i++) {
            if(i == index){
                newdata[spotBucket] = val;
                spotBucket ++;
            }
            newdata[spotBucket] = data[i];
            spotBucket ++;
        }
        data = newdata;
    }

    public boolean remove(int index){
        if (index >= data.length) return false;

        int[] newdata = new int[data.length - 1];

        for(int i = 0; i < data.length - 1; i++) {
            if(i >= index) {
                newdata[i] = data[i + 1];
            }
            else newdata[i] = data[i];
        }
        data = newdata;
        return true;
    }


    public boolean set(int index, int val){
        for(int i = 0; i < data.length; i++){
            data[index] = val;
        }return false;
    }

    public boolean contains(int val){
        for(int i = 0; i < data.length; i++){
            if(data[i] == val){
                return true;
            }
        }return false;
    }

    public int indexOf(int val){
        for(int i = 0; i < data.length; i++){
            if(data[i] == val){
                return i;
            }
        }return -1;
    }

    public int size(){
        return data.length;
    }

    public IntArrayList clone(){
        IntArrayList newObject = new IntArrayList();
        //복제
        newObject.data = this.data;
        return newObject;
    }

    public int[] toArray(){
        int[] newdata = new int[data.length];
        for(int i = 0; i < data.length; i++){
            newdata[i] = data[i];
        }return newdata;
    }



    public void println(){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

}
