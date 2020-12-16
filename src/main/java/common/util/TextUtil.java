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

        if (str.length() == 0) {
            return str;
        }

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

        int length = str.length();
        if (length == 0) {
            return StringUtils.EMPTY;
        }
        String result = StringUtils.EMPTY;
        boolean isDone = false;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (StringUtils.equalsIgnoreCase(String.valueOf(str.charAt(i)), String.valueOf(str.charAt(j)))) {
                    result = String.valueOf(str.charAt(j));
                    isDone = true;
                    break;
                }
            }
            if (isDone) {
                break;
            }
        }

        return result;
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

        if (str.length() == 0) {
            return StringUtils.EMPTY;
        }

        String[] splited = str.trim().split("\\s+");
        List<String> list = Arrays.asList(splited);

        String result = list.get(0);
        int count = 0;
        for (int i = 1, length = list.size(); i < length; i++) {
            if (list.get(i).length() > result.length()) {
                result = list.get(i);
            } else if (list.get(i).length() == result.length()) {
                count++;
            }
        }
        if (count == list.size() - 1) {
            result = StringUtils.EMPTY;
        }

        return result;
    }

}
