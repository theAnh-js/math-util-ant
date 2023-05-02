/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.theanhjs.mathutil.core;

/**
 *
 * @author meiou
 */

// đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi
// class khác, mô phỏng lại class tiện ích java.Math của JDK
// Phàm cái gì dùng chung, thường được thiết kế là static.
public class MathUtil {
    
    public static final double PI = 3.1415;
    
    // hàm tiện ích tính n! = 1.2.3.4...n
    // Lưu ý/quy ước:
    // - Không tính giai thừa số âm
    // - 0! = 1! = 1
    // - Vì giai thừa tăng cực nhanh nên 21! đã vượt 18 số 0
    // tràn kiểu long.
    // -> ta ko tính 21! trở lên.
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        if(n == 0 || n == 1)
            return 1;
        // Cấm không xài Else nữa khi hàm đã có return phía trước.
        
        long product = 1; // biến cộng dồn, nhân dồn, biến con heo đất
                          // acc/accumulation - gửi góp.
        for (int i = 2; i <= n; i++)
            product *= i;
        
       return product;
    }
}
// CODING CONVENTION: Quy tắc viết code công ty ép phải theo.


// TDD - TEST DRIVEN DEVELOPMENT
// Là kỹ thuật lập trình/áp dụng cho dân dev để gia tăng
// chất lượng code/giảm thiểu công sức tìm bug/phát hiện bug từ sớm
// TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn
// các bộ kiểm thử/viết luôn các test case/viết luôn các đoạn
// code dùng thử hàm để kiểm tra tính đúng đắn của hàm/class.
// -> viết code, kèm luôn với viết test case.
// -> viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//  development    driven                   test            

// Sau khi có được tên hàm (chỉ tên hàm mà thoi)
// ta viết luôn các tình huống xxài hàm
// chấp nhận khi chạy hàm chạy sai - do code chưa xong
// sau đó tối ưu/chỉnh sửa code để đảm bảo code chạy đúng
// quá trình sai - đúng - sai - đúng diễn ra liên tục (cycle)

// 
        