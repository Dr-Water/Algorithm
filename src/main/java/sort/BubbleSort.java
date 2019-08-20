package sort;

/**
 * @业务描述： 冒泡排序
 * @package_name： PACKAGE_NAME
 * @project_name： algorithm
 * @author： ratelfu@qq.com
 * @create_time： 2019-07-12 12:23
 * @copyright (c) ratelfu 版权所有
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arrays = {1, 6, 5, 4, 2};
       // bubbleSort1(arrays);
        bubbleSort2(arrays);
        for (int array : arrays) {
            System.out.println(array);
        }
    }

    /**
     * 普通版冒泡排序
     *
     * @param arrays
     */
    public static void bubbleSort1(int[] arrays) {
        int length = arrays.length;
        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < length - 1 - i; j++) {
                int temp = 0;
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 优化版冒泡排序
     *
     * @param arrays
     */
    public static void bubbleSort2(int[] arrays) {
        int length = arrays.length;
        for (int i = 0; i < length - 1; i++) {
            boolean isSort = true;
            for (int j = 0; j < length - 1 - i; j++) {
                int temp = 0;
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    isSort=false;
                }
            }
            if(isSort){
                System.out.println("break"+i);
                break;
            }
        }
    }

}
