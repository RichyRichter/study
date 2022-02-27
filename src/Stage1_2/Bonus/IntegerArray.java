package Stage1_2.Bonus;

public class IntegerArray {
    private int endPointer = 0;
    private int[] array = new int[endPointer];

    public IntegerArray() {
    }

    public int size() {
        return endPointer;
    }

    public int[] toArray() {return this.array;}

    public void add(int num) {
        if (endPointer == array.length) {
            int[] modifiedArray = new int[array.length + 1];
            System.arraycopy(array, 0, modifiedArray, 0, endPointer);
            array = modifiedArray;
        }
        array[endPointer] = num;
        endPointer++;
    }

    public void add(int index, int num) {
        endPointer++;
        int[] modifiedArray = new int[endPointer];
        for (int i = 0; i < index; i++) {
            modifiedArray[i] = array[i];
        }
        modifiedArray[index] = num;
        for (int i = index + 1; i < endPointer; i++) {
            modifiedArray[i] = array[i - 1];
        }
        array = modifiedArray;
    }

    public void addByIndex(int index, int num) {
        array[index] = num;
    }

    public void remove(int index) {
        int[] modifiedArray = new int[endPointer - 1];
        for (int i = 0; i < index; i++) {
            modifiedArray[i] = array[i];
        }
        for (int i = index; i < endPointer - 1; i++) {
            modifiedArray[i] = array[i + 1];
        }
        array = modifiedArray;
        endPointer--;
    }

    public void clear(){
        this.endPointer = 0;
        this.array = new int[endPointer];
    }

    public boolean equals(int[] comparableArray) {
        if (array == comparableArray) //сравниваем ссылки
            return true;

        if (array.length != comparableArray.length) //сравниваем длины
            return false;

        for (int i = 0; i < array.length; i++) //сравниваем элемнты
            if (array[i] != comparableArray[i])
                return false;

        return true;
    }

    public void sort() {
        boolean sorted = false;
        int value;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    value = array[i];
                    array[i] = array[i+1];
                    array[i+1] = value;
                    sorted = false;
                }
            }
        }
    }

    public void printArray() {
        StringBuilder res = new StringBuilder("[");
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) res.append(array[i]);
            else res.append(array[i] + ", ");
        }
        System.out.println(res + "]");
    }
    
}
