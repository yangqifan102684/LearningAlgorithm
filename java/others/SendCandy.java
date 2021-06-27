package others;

import java.util.Arrays;

/**
 * 分糖果
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 *
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 *
 * 每个孩子至少分配到 1 个糖果。
 * 评分更高的孩子必须比他两侧的邻位孩子获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 */
public class SendCandy {

    /**
     * 示例 1：
     *
     * 输入：[1,0,2]
     * 输出：5
     * 解释：你可以分别给这三个孩子分发 2、1、2 颗糖果。
     * 示例 2：
     *
     * 输入：[1,2,2]
     * 输出：4
     * 解释：你可以分别给这三个孩子分发 1、2、1 颗糖果。
     *      第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
     */

    public static void main(String[] args) {

        int[] scoreArr = {1,3,4,5,2};
        int countCandy = countCandy(scoreArr);
        System.out.println(countCandy);

}

    public static int countCandy(int [] scoreArr){
        int[] countArr = new int[scoreArr.length];
        //第一次遍历，从头遍历，比左边大，则比左边多一个
        for (int i = 0; i < scoreArr.length; i++) {
            countArr[i] = 1;
            if (i > 0){
                if (scoreArr[i] > scoreArr[i-1] && countArr[i] <= countArr[i-1]){
                    countArr[i] = countArr[i-1] + 1;
                }
            }
        }

        //第二次遍历，从尾部遍历，比右边大，则比右边多一个
        for (int i = scoreArr.length -1 ; i >= 0 ; i--) {
            if (i < scoreArr.length -1){
                if (scoreArr[i] > scoreArr[i+1] && countArr[i] <= countArr[i+1]){
                    countArr[i] = countArr[i+1] + 1;
                }
            }
        }
        return Arrays.stream(countArr).sum();
    }
}
