package longlist.record;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RecordList implements Iterable<Object[]>, List<Object[]> {
    protected RecordGroup head;
    public RecordList() {
        head = null;
    }
    public RecordList(RecordGroup head) {this.head = head;}
    public RecordList(RecordList list) {
        head = list.head;
    }

    public void removeRange(int start, int end){}

    public void balance(){}

    @Override
    public boolean add(Object[] record) {
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Object[]> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Object[]> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] get(int index) {
        return new Object[0];
    }

    @Override
    public Object[] set(int index, Object[] element) {
        return new Object[0];
    }

    @Override
    public void add(int index, Object[] element) {

    }

    @Override
    public Object[] remove(int index) {
        return new Object[0];
    }

    public Object[] removeById(int recordId){
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Object[]> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Object[]> listIterator(int index) {
        return null;
    }

    @Override
    public RecordList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Object[]> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}


class RecordIterator implements Iterator<Object[]> {
    protected RecordList list;
    public RecordIterator(RecordList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object[] next() {
        return new Object[0];
    }
}