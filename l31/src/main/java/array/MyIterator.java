package array;

import java.util.Iterator;

/**
 * Created by artur on 3/05/17.
 */
public class MyIterator<T> implements Iterator<T> {
    public boolean hasNext() {

        return myarray.length-1 >= index && myarray[index] != null;
    }

    public T next() {
        if (!this.hasNext()) {
            return null;
        }
        T value = myarray[index];
        index += 1;
        return value;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
    private T[] myarray;
    private int index = 0;
    public MyIterator(T[] array){
        myarray = array;
    }
}
