package sort;

/**
 * @业务描述： 选择排序
 * @package_name： PACKAGE_NAME
 * @project_name： algorithm
 * @author： ratelfu@qq.com
 * @create_time： 2019-07-12 16:28
 * @copyright (c) ratelfu 版权所有
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 6, 5, 4};
        int length = arrays.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1 ; j < length; j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[min];
            arrays[min] = temp;
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }

}
