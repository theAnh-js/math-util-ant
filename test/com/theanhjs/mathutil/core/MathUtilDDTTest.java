/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.theanhjs.mathutil.core;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author meiou
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
       
    // chuẩn bị data, mảng 2 chiều
    // mảng 2 chiều [5][2]
    
    @Parameterized.Parameters
    public static Object[][] initData(){

        int c[][] = {{0, 1},
                     {1, 1}, 
                     {2, 2}, 
                     {3, 6}, 
                     {4, 24}};
        
        return new Integer[][]{{0, 1},
                               {1, 1}, 
                               {2, 2}, 
                               {3, 6}, 
                               {4, 24}};
    }// xài Wrapper class nếu chơi với số, ví dụ Integer(in), Long(long)
    
    // sau khi có bộ data qua mảng 2 chiều, JUnit sẽ tự loop for 
    // để lôi ra từng cặp data ví dụ (1, 1), (3, 6)
    // ta sẽ nhồi các cặp này vào trong hàm so sánh.
    // Nhồi bằng cách gán value này vào biến nào đó
    // gán vào biến gọi là: Tham sô hóa Parameterized
    // TA sẽ map/ánh xạ 2 cột ứng với 2 biến: cột 0 - Expected
    //                                        cột 1 - N đưa vào hàm getFactorial()
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Parameterized.Parameter(value = 0)
    public int n;
    
    // test thoiii
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}

// Class này sẽ chứa code dùng để test code chính bên class MathUtil
// Chứa code test hàm getFactorial() xem hàm chạy đúng ko
// Code viết ra dùng để test các code/hàm/class khác
// Thì đoạn code này gọi là Test Script
// Trong test script sẽ có những tình huống xài app, đưa data cụ thể
// vào chờ xem hàm có xử lí kq như kỳ vọng ko
// Test Script sẽ chứa nhiều test case
//                     mỗi test case ứng với 1 tình huống xài hàm.

// Trong test script cũ xuất hiện BAD SMELL - sự trùng lặp về câu lệnh.
// Ví dụ như lệnh  Assert.assertEquals(120, MathUtil.getFactorial(5));
// Câu lệnh này bị lặp đi lặp lại với mỗi bộ test
// Cũng là hàm này, câu lệnh này nhưng nó phải viết lại cho các bộ 
// data sau:

// Excepted           n
// 1                  0
// 1                  1
// 2                  2
// 6                  3
// 24                 4     

//[5][2]

// Có cách nào kiểu thay 2 con số trong lệnh so sánh = 2 ?? nào đó
// Assert.assertEquals(?, MathUtil.getFactorial(?));

// Nếu ta tách được toàn bộ data trong các câu lệnh so sánh ở trên
// ra 1 chỗ riêng biệt như hàng, cột ở trên.
// sau đó ta chỉ việc lấy data này nạp dần vào cái lệnh gọi hàm
//--> code gọn gàng hơn, nhìn tổng quan có bao nhiều test case, xem nó đủ hay chưa

// Kĩ thuật viết test script (câu lệnh test) mà tách biệt data ra khỏi
// lệnh so sánh được gọi bằng những tên sau:
// - Parameterized - tham số hóa, biến data ra 1 chỗ, đặt cho chúng cái
// tên biến, lát nhồi chúng trở lại lệnh so sánh.
// - DDT - DATA DRIVEN TESTING: viết code kiểm thử theo style tách data
// Junit FW hỗ trợ sẵn ta vụ tách data, duyệt vòng for trên data
// nhồi vào hàm tương ứng.

// Để chơi với DDT, ta cần:
// - Tách data ra 1 chỗ - MẢNG
// - Map cái data này vào các biến tương ứng
// - Nhồi các biến tương ứng này vào các câu lệnh so sánh/gọi hàm

