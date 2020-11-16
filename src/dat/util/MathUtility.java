/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util;

/**
 *
 * @author macbook
 */
public class MathUtility {

    //fake class Math giong nhu that
    //Math.sqrt() .abs() .pow() .sin() .PI
    public static final double PI = 3.1415;

    //tinh n!= 1.2.3.4....n
    //21! tran long roi, 0 giai thua ko tinh dc, vo nghia
    //-! = 1! = 1;
    //bai nay minh chi tinh tu 0 den 20!
    //neu dua n ca tron chui ko can tinh, ko return alue luon
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 .. 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
   //kieu gi cung phai la minh tinh tuoc ket qua ham tra ve EXPECTED VALUE 
    //                              minh goi ham coi no chay ra may, ACTUAL VALUE
    //so sanh coi EXPECTED VALUE = ACTUAL VALUE hay ko
    ///                         co bang, ham chay dung cho tinh huong X
    //                          ko bang, ham chay sai cho tinh huong X
    //vi du
    //5! = 120(expected)
    //gio goi ham getFactorial(5 dua vao, coi ra ket qua may actual))
    //neu actual gia su la 120 luon, may qua ham dung cho 6! vi khop ki vong
    //case(tinh huong) n = 5 ham dung
    //case             n = 6 ham tra ve 720 thi la ham dung
    //case             n = 0 ham tra ve 1 thi ham dung
    //..
    //lam tat ca cac case ma minh nghi la nguoi dung se xai ham nhu the
    //ta goi la cac test cases
    // mot ham co nhieu test case ung voi nhieu tinh huong xai han
    //dam bao ham dung cho cac cases thi moi realease
    
    
}
