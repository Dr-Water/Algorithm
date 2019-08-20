package datastructure;

/**
 * @业务描述：
 * @package_name： datastructure
 * @project_name： algorithm
 * @author： ratelfu@qq.com
 * @create_time： 2019-07-17 15:57
 * @copyright (c) ratelfu 版权所有
 */
public class MyLinkedList {
    //头结点指针
    private Node head;
    //尾结点指针
    private Node last;
    //链表的实际长度
    private int size;

    /**
     * 链表插入元素
     *
     * @param data 插入元素
     * @param index 插入位置
     * @throws Exception
     */
    public void insert(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表结点范围");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            //插入头部
            head = insertNode;
            last = insertNode;
        } else if (size == index) {
            //插入尾部
            last.next = insertNode;
            last = insertNode;

        } else {
            //插入中间值
            Node prevNode = get(index - 1);

            Node nextNode = prevNode.next;
            prevNode.next = insertNode;
            insertNode.next = nextNode;
        }
        size++;


    }

    /**
     * 链表删除元素
     *
     * @param index 需要删除元素的位置
     * @return
     * @throws Exception
     */
    public Node remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node removeNode = null;
        if(index==0){
            //删除头节点
            removeNode=head;
             head =head.next;
        }else if (index==size-1){
            //删除尾结点
            Node prevNode =get(index -1);
            removeNode =prevNode.next;
            prevNode.next=null;
            last=prevNode;
        }else{
          //删除中间结点
          Node prevNode =get(index-1);
          Node nextNode =prevNode.next.next;
          prevNode.next=nextNode;

        }

        size--;
        return removeNode;
    }


    /**
     * 链表查找元素
     *
     * @param index 下标（查找位置）
     * @return
     * @throws Exception
     */
    public Node get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        size--;
        return temp;
    }

    /**
     * 输出链表
     */
   public void  outPut(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



}
