package common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 配列用ユーティリティ
 * 
 * @author dieu
 *
 */
public class ArrayUtil {

    /**
     * １～１０数字から存在しない数字を検索
     * 
     * @param input
     *            インプット
     * @return
     *         検索した値
     */
    public static Integer[] findValue(Integer[] input) {

        if (input.length == 0) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            boolean isExists = false;
            for (int j : input) {
                if (j == i) {
                    isExists = true;
                    break;
                }
            }
            if (!isExists) {
                result.add(i);
            }
        }

        return result.stream().toArray(Integer[]::new);
    }

    /**
     * 配列の値の中に２最大値を検索
     * 
     * @param input
     *            インプット
     * @return
     *         検索した値
     */
    public static Integer[] findTwoMax(Integer[] input) {

        if (input.length == 0) {
            return null;
        }

        Integer[] result = new Integer[2];
        result[0] = null;
        result[1] = null;

        List<Integer> list = new ArrayList<Integer>(input.length);
        for (int i : input) {
            list.add(i);
        }
        list = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(list);
        if (list.size() == 1) {
            result[0] = list.get(0);
        } else if (list.size() == 2) {
            result[0] = list.get(0);
            result[1] = list.get(1);
        } else {
            result[0] = list.get(list.size() - 1);
            result[1] = list.get(list.size() - 2);
        }
        return result;
    }

}
