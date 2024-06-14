public class IntArrayList implements IIntList {
    private int[] array;
    private int size;

    public IntArrayList(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {

            int newCapacity = array.length + (array.length / 2);
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        }
        return 0;
    }
}