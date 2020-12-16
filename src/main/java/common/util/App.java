package common.util;

/**
 * テストのためクラス
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 問題１
        String str = "tôi tên là Hoa hồNG hoa";
        System.out.println( "変換前 ： " + str);
        System.out.println( "変換後 ： " + TextUtil.capitalize(str));
    }
}
