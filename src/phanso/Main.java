package phanso;

public class Main {
    public static void main(String[] args) {
        Phanso phanso1 = new Phanso();
        phanso1.input();
        phanso1.outPut();
        Phanso phanso2 = new Phanso();
        phanso2.input();
        phanso1.Tong(phanso2);
        phanso1.Hieu(phanso2);
        phanso1.Tich(phanso2);
        phanso1.Thuong(phanso2);
    }

}
