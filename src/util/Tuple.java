package util;

public class Tuple<T,L>{
    private T first;
    private L second;

    public Tuple(T type, L list) {
        this.first = type;
        this.second = list;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public L getSecond() {
        return second;
    }

    public void setSecond(L second) {
        this.second = second;
    }

}
