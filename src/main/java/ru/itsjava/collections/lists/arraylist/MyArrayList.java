package ru.itsjava.collections.lists.arraylist;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize > 0) {
            return false;
        }
        return true;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            //вставка нашего элемента
        }
        array[realSize++] = o;
        return true;
    }


    public boolean remove(Object o) {//разобрал
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }

        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        array[index] = element;
        return element;
    }

    public void add(int index, Object element) {  //разобрал
        checkIndex(index);
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, index);
            System.arraycopy(array, index, resArray, index + 1, realSize - index);
            array = resArray;
            //вставка нашего элемента
        } else {
            System.arraycopy(array, index, array, index + 1, realSize - index);
        }
        array[index] = element;
        realSize++;
    }

    public Object remove(int index) { //разобрал
        checkIndex(index);

        Object resElement = array[index];
        System.arraycopy(array, index + 1, array, index, realSize - index);
//        array[realSize - 1] = null;
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o)
                return i;
        }
        return 0;
    }

    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == o)
                return i;
        }
        return 0;
    }

    @Override
    public String toString() {
        //return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(' ');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

}
