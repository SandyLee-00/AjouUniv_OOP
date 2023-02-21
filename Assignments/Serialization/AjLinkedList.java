import java.io.Serializable;

public class AjLinkedList implements Serializable {
    private	Node mData;
    private int	mSize;

    public boolean add(Object obj) {
        Node	newNode = new Node();
        newNode.setObject(obj);
        if (mData == null)
            mData = newNode;
        else {
            AjIterator	ajit = (AjIterator)iterator();
            for (; ajit.hasNext(); ajit.next());
            ajit.insertNewNode(newNode);
        }
        mSize++;
        return true;
    }

    public boolean remove(Object obj) {
        if (mData == null) return false;

        AjIterator ajit = (AjIterator)find(obj);
        if (ajit == null) return false;
        if (ajit.getCurrNode() == mData)
            mData = ajit.removeCurrNode();
        else
            ajit.removeCurrNode();
        mSize--;
        return true;
    }

    public Iterator iterator() {
        AjIterator	ajit = new AjIterator();
        ajit.initialize(null, mData);
        return ajit;
    }

    public Iterator find(Object obj) {
        for (AjIterator ajit = (AjIterator)iterator(); ajit.hasNext(); ajit.next()) {
            if (ajit.getCurrNode().getObject().equals(obj)) {
                return ajit;
            }
        }
        return null;
    }
}
