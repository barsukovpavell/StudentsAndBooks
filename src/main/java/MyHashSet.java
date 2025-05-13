import java.util.LinkedList;

public class MyHashSet<E> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<E>[] buckets;
    private int size;

    public MyHashSet() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    public boolean add(E element) {
        int index = getBucketIndex(element);
        LinkedList<E> bucket = buckets[index];

        if (!bucket.contains(element)) {
            bucket.add(element);
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(E element) {
        int index = getBucketIndex(element);
        LinkedList<E> bucket = buckets[index];

        if (bucket.remove(element)) {
            size--;
            return true;
        }
        return false;
    }

    private int getBucketIndex(E element) {
        return Math.abs(element.hashCode()) % buckets.length;
    }

    public int size() {
        return size;
    }
}
