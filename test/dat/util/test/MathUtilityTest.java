/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util.test;

import static dat.util.MathUtility.*;
//chi co tu  JDK 5 , chi danh cho static
//tuc la khi choi tro import static, thi moi ham static trong class nay
//khi goi la ko can ten class cham, goi nhu C, vi hieu ngam da cham roi
import dat.util.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbook
 */
public class MathUtilityTest {
    //class nay la class xai bo thu vien JUNIT dung de test code
    //theo dang xanh - do, thay vi nhin - mat nhu ben main() sout)
    //2 file. jar da duoc add vao project nay va ta thoai mai xai 
    //cac ham cua no 
    //trong cac ham cua thu vien nay co n ham dac biet deu co
    //ten xuat phat la assertX(exoected va actual dua vao)
    //neu no thay expected hok co bang actual, no thay mau do 
    //                          co bang         no thay mau xanh
    //qui tat xanh do: neu tau ca xanh -> ket luan xanh
    //                  neu co it nhat 1 do eo quan tam con lai -> ket luan do
    //dam bao: ham chay dung moi case, truong hop
    //@test //bien ham ngay sau day thanh public static void main()
    //muon chay nhan shift f6

    @Test
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(1, getFactorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFactiorial_ThrowsException_IfInvalidArgument() {
        //nogia le ko phai la value de assert()
        //chi co the chup no lai
        getFactorial(-5);
    }
}
