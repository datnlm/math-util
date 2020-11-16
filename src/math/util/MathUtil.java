/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import dat.util.MathUtility;

/**
 *
 * @author macbook
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ki thuat test can bang nhin bang mat cac test case de ket luan ham dung sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //ki vong 100 2 m chay thuc te ra cai thi t luu o actual
        //so sanh bang mat
        System.out.println("5!:  expected: " + expected + "; actual: " + actual);
        System.out.println("6!:  expected: 720;  actual: " + MathUtility.getFactorial(6));
        System.out.println("0!:  expected: 1;  actual: " + MathUtility.getFactorial(0));
        
        //t ki vong may nem vao ngoai le neu t dua am giai thua
        MathUtility.getFactorial(-5);
        //nhuoc diem cua test can bang la can phai dung mat de so sanh tung truong hop xai ham
        //so expected va actual
        //neu test nhieu tinh huong, mat du met moi vi phai do tung output
        //cach nang cao
        //gom ca dam test case nay lai, cung chay 1 luot nhu o tren
        //may so dum t luon expected va actual
        //sau do    
        //NEU TAT CA CAC CASES MA DEU DUNG, THAY RA 1 MAU XANH - DEN XANH - CODE ON
        //NEW TAT CA CAC CASES DUNG, NGOAI TRU CO 1, 2 VAI THANG NAO DO
        //EXPECTED KHAC ACTUAL, THAY RA 1 MAU DO, HAM Y HAM SAI ROI
        //                      HAM DUNG GAN HET, MA SAI 1 VAI, KO TIN CAY XAI HAM
        //DO: CHI CO IT NHAT 1 CAP EXPECTED ACTUAL KO BANG NHAU, KET LUAN NHAY HAM SAI
        //THAY VI NHIN TUNG CASE, TA CHI NHIN MAU XANH HOAC DO LA DU ROI
        //TA CAN THEM BO THU VIEN DE GIUP TA VIEC NAY
        //BO THU VIEN NO LAM 2 VIEC: SO SANH DUM ACTUAL VS EXPECTED
        //            NEU KHOP THI NO RA MAU XANH
        //            KO KHOP -> THAY RA MAU DO
        //NO TU QUET HET CAC CASE MA MINH DA THIET KE DE NO KET LUAN, MAT NHIN DUY NHAT 1 MAU LA DU
        //BO THU VIEN NAY CHINH LA FILE .JAR .DLL DC ADD THEM VAO PROJECT
        //bo thu vien nay mang ten chung cho moi ngon ngu lap trinh - Unit test
        //rieng cho Java: JUnit, TestNG
        //          c#: NUnit
        //          ...
        //          ...
        //          ...
        
    }
    
}
