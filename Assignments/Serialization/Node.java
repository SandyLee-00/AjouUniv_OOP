import java.io.Serializable;

public class Node implements Serializable {
    private	Node mNext;
    private Object mObject;

    void setNext(Node node) {
        mNext = node;
    }
    void setObject(Object obj) {
        mObject = obj;
    }

    Node getNext() { return mNext; }
    Object getObject() { return mObject; }

}

