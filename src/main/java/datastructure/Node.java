package datastructure;

/**
 * @业务描述： 链表节点类
 * @package_name： datastructure
 * @project_name： algorithm
 * @author： ratelfu@qq.com
 * @create_time： 2019-07-17 15:58
 * @copyright (c) ratelfu 版权所有
 */
public class Node {

    /**
     * 节点中存储的数据
     */
    int data;

    /**
     * 节点下一个的位置
     */
    Node next;

    Node(int data){
        this.data=data;
    }
}
