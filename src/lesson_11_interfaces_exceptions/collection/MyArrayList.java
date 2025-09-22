package lesson_11_interfaces_exceptions.collection;

public class MyArrayList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[10]; // массив на 10 элементов по умолчанию
    }

    public MyArrayList(int capacity) {
        this.data = new Object[capacity];
    }

    public void add(T element) {
        if (size == data.length) {
            // увеличиваем массив в 2 раза
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Нет элемента по индексу " + index);
        }
        return (T) data[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                // сдвигаем все элементы влево
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}