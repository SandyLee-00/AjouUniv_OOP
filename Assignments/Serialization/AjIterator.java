import java.io.Serializable;

public class AjIterator implements Iterator, Serializable {
    private Node    mPrev, mCurr;

    public void initialize(Node prev, Node curr) {
        mPrev = prev; mCurr = curr;
    }
    public Object next() {
        if (mCurr == null) return null;
        mPrev = mCurr;
        mCurr = mPrev.getNext();
        return mPrev.getObject();
    }

    public boolean hasNext() {
        return (mCurr != null);
    }

    public Node getCurrNode() {
        return mCurr;
    }

    public Node removeCurrNode() {
        if (mCurr == null) return null;
        mCurr = mCurr.getNext();
        if (mPrev != null)
            mPrev.setNext(mCurr);
        return mCurr;
    }

    public void insertNewNode(Node n) {
        n.setNext(mCurr);
        mCurr = n;
        if (mPrev != null)
            mPrev.setNext(n);
    }
}

