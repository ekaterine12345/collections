package Task;

public class MyClass implements Comparable<MyClass>{
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value+" ";
    }

    @Override
    public int compareTo(MyClass o) {
        return  o.value - this.value;
    }
}
