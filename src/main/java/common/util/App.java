package common.util;

import java.util.Arrays;

/**
 * テストのためクラス
 *
 */
public class App {
    public static void main(String[] args) {
        // 問題1
        System.out.println("問題1");
        String str = "tôi tên là Hoa hồNG hoa";
        System.out.println("変換前 ： " + str);
        System.out.println("変換後 ： " + TextUtil.capitalize(str));

        // 問題2
        System.out.println("===========================");
        System.out.println("問題2");
        String str2 = "Abcda";
        System.out.println("変換前 ： " + str2);
        System.out.println("変換後 ： " + TextUtil.repeat(str2));

        // 問題3
        System.out.println("===========================");
        System.out.println("問題3");
        String str3 = "she is beautiful";
        System.out.println("変換前 ： " + str3);
        System.out.println("変換後 ： " + TextUtil.findMaxString(str3));

        // 問題4
        System.out.println("===========================");
        System.out.println("問題4");
        Integer[] intArr = { 1, 3, 4, 9, 7, 6, 10 };
        System.out.println("変換前 ： " + Arrays.toString(intArr));
        System.out.println("変換後 ： " + Arrays.toString(ArrayUtil.findValue(intArr)));

        // 問題5
        System.out.println("===========================");
        System.out.println("問題5");
        Integer[] intArr2 = { 1, 7, 8, 3, 5, 18, 18, 19 };
        System.out.println("変換前 ： " + Arrays.toString(intArr2));
        System.out.println("変換後 ： " + Arrays.toString(ArrayUtil.findTwoMax(intArr2)));
    }
}
