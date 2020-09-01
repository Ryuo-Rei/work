package com.company;

// 2020/09/01/ 16:15 ~
public class NumberOfPalindromes {

    // 2,8,10進数で共に回文数になる値を探すメソッド
    public void FindNOP () {
        int number = 11;

        while(true) {
            String binaryNumber = Integer.toBinaryString(number);
            String octalNumber = Integer.toOctalString(number);
            String decimalNumber = String.valueOf(number);

            StringBuffer sb = new StringBuffer(binaryNumber);
            StringBuffer sb2 = new StringBuffer(octalNumber);
            StringBuffer sb3 = new StringBuffer(decimalNumber);

            if(binaryNumber.equals(sb.reverse().toString())
                && octalNumber.equals(sb2.reverse().toString())
                && decimalNumber.equals(sb3.reverse().toString())) {
                System.out.println("2進数：" + binaryNumber + " 8進数：" + octalNumber + " 10進数：" + decimalNumber);
            }

            number ++;
        }
    }
}
