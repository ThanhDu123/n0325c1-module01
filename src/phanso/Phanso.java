package phanso;

import java.util.Scanner;

public class Phanso {
    int tu;
    int mau;
    void input  () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu:");
        tu = sc.nextInt();

        do {
            System.out.print("Nhap mau: ");
            mau = sc.nextInt();
            if (mau == 0) {
                System.out.println("xin nhap lai mau !!!");
            }
        } while (mau == 0);
    }
        void rutGon(){
            int ucln = uocchungLonNhat(tu,mau);
            tu /= ucln;
            mau /= ucln;
            if(mau < 0 ){
                tu = -tu;
                mau = -mau;
            }
        }
        int uocchungLonNhat(int a , int b ){
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
    void Tong(Phanso phansokhac){
        int tusokhac = phansokhac.tu;
        int mausokhac = phansokhac.mau;
        int tongTuso = tu * mausokhac + tusokhac * mau;
        int tongMauso = mausokhac * mau;
        int uocLonNhat = uocchungLonNhat(tongMauso, tongTuso);
        tongTuso /= uocLonNhat;
        tongMauso /= uocLonNhat;
        System.out.println(" tong 2 phan so la: " + tongTuso + "/" + tongMauso);
    }
    void  Hieu(Phanso phansokhac){
        int tusokhac = phansokhac.tu;
        int mausokhac = phansokhac.mau;
        int tongTuso = tu * mausokhac - tusokhac * mau;
        int tongMauso = mausokhac * mau;
        int uocLonNhat = uocchungLonNhat(tongMauso, tongTuso);
        tongTuso /= uocLonNhat;
        tongMauso /= uocLonNhat;
        System.out.println(" tong 2 phan so la: " + tongTuso + "/" + tongMauso);
    }
    void Tich(Phanso phansokhac){
        int tusokhac = phansokhac.tu;
        int mausokhac = phansokhac.mau;
        int tongTuso = tu * tusokhac;
        int tongMauso = mausokhac * mau;
        int uocLonNhat = uocchungLonNhat(tongMauso, tongTuso);
        tongTuso /= uocLonNhat;
        tongMauso /= uocLonNhat;
        System.out.println(" tong 2 phan so la: " + tongTuso + "/" + tongMauso);
    }
    void Thuong(Phanso phansokhac){
        int tusokhac = phansokhac.tu;
        int mausokhac = phansokhac.mau;
        int tongTuso = tu * mausokhac;
        int tongMauso = mausokhac * tu;
        int uocLonNhat = uocchungLonNhat(tongMauso, tongTuso);
        tongTuso /= uocLonNhat;
        tongMauso /= uocLonNhat;
        System.out.println(" tong 2 phan so la: " + tongTuso + "/" + tongMauso);
    }
}
