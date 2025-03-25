package constructorsphanso;

public class Phanso2 {
    private int tu;
    private  int mau;

   public Phanso2(){
            tu = 0 ;
            mau = 1 ;
    }
    public  Phanso2(int tu){
       this . tu = tu;
       mau  = 1 ;
    }
    public Phanso2(int tu , int mau){
       this.tu = tu;
       this.mau =mau;
       rutGon();
    }
     private void rutGon(){
        int ucln = uocchungLonNhat(tu,mau);
        tu /= ucln;
        mau /= ucln;
        if(mau < 0 ){
            tu = -tu;
            mau = -mau;
        }
    }
    private int uocchungLonNhat(int a , int b ){
        if( a == 0 || b == 0){
            return 1;
        }
        a =  Math.abs(a);

        for (int i  = a; i >=1 ; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    void outPut(){
        rutGon();
        if(mau == 1){
            System.out.println(tu);
        }else {
            System.out.println(tu + "/" + mau);
        }
    }
    public  Phanso2 copy(){
       return new Phanso2(tu,mau);
    }
    public void Cong(int value){
       tu += value * mau;
       rutGon();
    }
}
