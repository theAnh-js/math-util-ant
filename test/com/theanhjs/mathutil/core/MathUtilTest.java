/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.theanhjs.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author meiou
 */
public class MathUtilTest {
    
    // Ta đi test ngoại lệ, tức là so sánh/đo lường xem ngoại lệ
    // có xuất hiện hay ko khi ta đưa data cà chớn: n < 0 || n > 20
    // thay vì so sánh expected valua vs actual value
    // thì lúc này ta so sánh xem ngoại lệ có xuất hiện như kỳ vọng 
    // hay ko, nếu có ngoại lệ xuất hiện như kì vọng -> màu xanh
    
    @Test(expected = IllegalArgumentException.class) // .class để đo lường 1 object nó thuộc nhóm nào.Ví dụ này là nhóm Illegal
    public void testFactorialGivenWrongArgumentThrowException(){
        // Test case #3: đưa data cà chớn, n âm, a quá lớn
        //               hàm được thiết kế ném về ngoại lệ 
        // Thấy ngoại lệ xuất hiện như kỳ vọng -> passed - màu xanh.
        // Ví dụ input = -5  --> bắn ra ngoại lệ
        System.out.println("Hope to see the Exception | Illegal Argument Exception ");
        MathUtil.getFactorial(-5);
    }
    
    @Test(expected = Exception.class) // .class để đo lường 1 object nó thuộc nhóm nào.
    public void testFactorialGivenWrongArgumentThrowException2(){
        // Test case #3: đưa data cà chớn, n âm, a quá lớn
        //               hàm được thiết kế ném về ngoại lệ 
        // Thấy ngoại lệ xuất hiện như kỳ vọng -> passed - màu xanh.
        // Ví dụ input = -5  --> bắn ra ngoại lệ
        System.out.println("Hope to see the Exception | Illegal Argument Exception ");
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
        
        //Test case #4: n = 3, hy vọng trả về 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n = 4, hy vọng trả về 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6: n = 5, hy vọng trả về 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
 
    }
    
    
    // coding convention - quy tắc viết code
    // tên hàm kiểm thử/tên hàm của test script
    // phải nói lên ý nghĩa của việc kiểm thử
    // tình huống này, ta muốn test hàm getF() tham số tử tế
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        
        // Test case số #1: check n = 0, hy họng hàm trả về 1
        //                               thực tế hàm trả về mấy -> đoán xem!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);// hàm chạy thì mới biết
        // so sánh giữa expected vs actual, máy tự so, ko cần
        // sout() khổ cực
        Assert.assertEquals(expected, actual);
        
        //Test case #2: n = 1, hy vọng trả về 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3: n = 2, hy vọng trả về 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));
                
         
    }
    //@Test ra lệnh cho thư viện JUnit mình đã add/import
    // tự động generate ra cái hàm public static void main()
    // biến hàm tryUnitComparison() thành hàm main()
    // và gửi main() này cho JVM chạy - Java Virtual Machine
    // @Test  tương đương với main()
    // ko có @Test -> class ko có main(), lấy gì mà chạy - no runable mathod
    
    @Test
    public void tryJUnitComparison(){
        // hàm này thử nghiệm việc so sánh expected vs actual
        // coi sai đúng ra màu ntn
        // ta đang xài thư viện JUnit nhưng ko xài bừa bãi
        // mà phải viết theo quy tắc định trước
        // quy tắc định trước nằm ở @ - annotation
        
        Assert.assertEquals(100, 100);
     
    }
    
      
}
// Class này DEV sẽ viết những câu lệnh dùng để TEST hàm
// của code chính, test các hàm của class mathutil
// Trong class này sẽ có những lời gọi hàm getFactorial()
// có những lệnh so sánh giữa Expected và Actual
// giống giống mình đã làm test ở bên Main()
// những khác ở chỗ, Sai -> màu Đỏ, Dúng -> màu Xanh
// mắt ko cần nhìn các dòng output từ System.out cho mất sức
// mắt giờ chỉ nhìn 2 màu Xanh - Đỏ
// Muốn có được điều này, ta sẽ dùng thêm các Unit Testing Framework.
// Ví dụ: JUnit, TestNG(Java)
//        xUnit, MSTest, NUnit(C#)
//        PHPUnit(PHP)
//          ....

// Việc viết code để test code gọi là UNIT TESTING
// Đoạn code trong class này dùng JUnit/Unit Testing Framework
// Để kiểm thử hàm của code chính.
// Đoạn code kiểm thử này được gọi là: Test Script
// Code dùng để test code(code chính: DAO, DTO, Controller, API,...) gọi là test script
// Muốn test thì cần phải phác thảo các TEST CASE
// Test Script sẽ sử dụng các Test Case

// Quy tắc Xanh - Đỏ:
// - Màu xanh khi tất cả các test case phải cùng là màu xanh, 
// tức là expected == actual cho tất cả các tình huống test
// - Màu đỏ: chỉ cần 1 test case bị sai -> cái expected != actual 
// kết luận hàm sai 

// Ý nghĩa của quy tắc: nếu đã test, nếu đã liệt kê các test case,
// thì chúng phải đúng hết, còn chỉ cần 1 thằng sai -> hàm ko ổn định về
// việc return -> hàm sai.
// Có thể sai do: expected sai hoặc code chính sai.


