package this_is_java.ch13.generic_class;

public class Product <K, M>{
    private K kind;
    private M Model;


    public K getKind() { return kind; }
    public M getModel() { return Model; }

    public void setKind(K kind) { this.kind = kind; }
    public void setModel(M model) { Model = model; }
}
