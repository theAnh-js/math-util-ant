/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.theanhjs.mathutil.main;

import com.theanhjs.mathutil.core.MathUtil;

/**
 *
 * @author meiou
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        System.out.println("This jar file is built based ANT co-Operating with JUnit");
        tryTDDFirst();
//       testFactorialGivenWrongArgumentThrowException();

    }
    
    public static void testFactorialGivenWrongArgumentThrowException(){
        // Test case #3: đưa data cà chớn, n âm, a quá lớn
        //               hàm được thiết kế ném về ngoại lệ 
        // Thấy ngoại lệ xuất hiện như kỳ vọng -> passed - màu xanh.
        // Ví dụ input = -5  --> bắn ra ngoại lệ
//        System.out.println("Hope to see the Exception | Illegal Argument Exception ");
//        MathUtil.getFactorial(-5);
    }
    
    
    
    // hàm này được viết ra để dùng thử kĩ thuật viết code kiểu TDD
    // gọi thử/dùng thử hàm chính bên core/bên MathUtil
    // xem nó sai đúng ra sao, ở ngay mức khởi đầu viết hàm.
    public static void tryTDDFirst(){
       
        // Test case #1 (tình huống kiểm thử hàm số 1)
        // - Input: n = 1;
        // - Gọi hàm getFactorial(1)
        // - Hy vọng hàm trả về 1 vì 1! = 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        // so sánh expected với actual coi chúng ta có giống nhau ko?
        // giống -> hàm đúng vs case đang test
        // sai -> bug vs case đang test
        System.out.println("Test 1! status: " +
                 "Expected: " + expected +
                 " | Actual: " + actual
                );
        
        // Test case #2 (tình huống kiểm thử hàm số 1)
        // - Input: n = 2;
        // - Gọi hàm getFactorial(2)
        // - Hy vọng hàm trả về 2 vì 2! = 2;
        System.out.println("Test 2! status: " +
                 "Expected: 2" +
                 " | Actual: " + MathUtil.getFactorial(2)
                );
       
    }
    // Test case là gì?
    // Là 1 tình huống xài app/kiểm thử app/tính năng/chức năng của app
    // là tình huống mà khi đó ta phải:
    // - đưa data giả/mẫu
    // - đưa giá trị kì vọng ta mong chờ app trả ra
    // - chờ hàm/chức năng xử lí xong trả về kết quả
    // - nhìn kết quả và so sánh với kì vọng 
}
