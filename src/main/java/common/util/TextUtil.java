package common.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * TEXT用ユーティリティ
 * 
 * @author dieu
 *
 */
public class TextUtil {

    /**
     * 各文字先頭を大文字に変換
     * 
     * @param str
     *            インプット
     * @return
     *         変換した文字
     */
    public static String capitalize(String str) {

        if (str.length() == 0)
            return str;

        String[] splited = str.trim().split("\\s+");
        List<String> list = Arrays.asList(splited);
        list = list.stream().map(x -> StringUtils.capitalize(x)).collect(Collectors.toList());
        return StringUtils.join(list, " ");

    }

    /**
     * 始めに繰り返し文字を戻る
     * 
     * @param str
     *            インプット
     * @return
     *         始めに繰り返し文字
     */
    public static String repeat(String str) {

        if (str.length() == 0)
            return str;

        return "";
    }

    /**
     * 最大サイズの文字を戻る
     * 
     * @param str
     *            インプット
     * @return
     *         最大サイズの文字
     */
    public static String findMaxString(String str) {

        if (str.length() == 0)
            return str;

        return "";
    }

}
