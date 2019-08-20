package datastructure;

/**
 * @业务描述： 测试链表
 * @package_name： datastructure
 * @project_name： algorithm
 * @author： ratelfu@qq.com
 * @create_time： 2019-07-17 16:56
 * @copyright (c) ratelfu 版权所有
 */
public class TestMyLinkedList {

    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(3,0);
        myLinkedList.insert(7,1);
        myLinkedList.insert(9,2);
        myLinkedList.insert(5,3);
        myLinkedList.insert(6,1);
        myLinkedList.remove(0);
        myLinkedList.outPut();

    }
}
