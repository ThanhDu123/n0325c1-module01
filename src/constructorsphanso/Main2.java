package constructorsphanso;

public class Main2 {
    public static void main(String[] args) {
        Phanso2 a = new Phanso2();
        a.outPut();
        Phanso2 b =  new Phanso2(1,2);
        b.outPut();
        Phanso2 c = b.copy();
        c.outPut();

    }
}
