package util;

public class Tuple<T,L>{
    private T type;
    private L list;

    public Tuple(T type, L list) {
        this.type = type;
        this.list = list;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public L getList() {
        return list;
    }

    public void setList(L list) {
        this.list = list;
    }
}
