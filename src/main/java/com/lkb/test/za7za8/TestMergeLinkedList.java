package com.lkb.test.za7za8;

import com.lkb.test.za7za8.SingleLinkedList.Node;

public class TestMergeLinkedList {
    public static void main(String[] args){
        SingleLinkedList<Integer> ll1=new SingleLinkedList<>();
        ll1.add(3);
        ll1.add(8);
        ll1.add(19);
        SingleLinkedList<Integer> ll2=new SingleLinkedList<>();
        ll1.add(3);
        ll1.add(10);
        ll1.add(17);

        mergeeSingleLinkedList(ll1, ll2).print();
        System.out.println("  ");
        testSingleLinkedListOk();
    }

    /**
     * 合并两个有序列表
     * @param ll1 s
     * @param ll2 s
     * @return s
     */
    private static SingleLinkedList<Integer> mergeeSingleLinkedList(SingleLinkedList<Integer> ll1, SingleLinkedList<Integer> ll2) {
        if (isEmpty(ll1)||isEmpty(ll2)){
            return isEmpty(ll1)?ll2:ll1;
        }
        SingleLinkedList<Integer> ll=new SingleLinkedList<>();
        Node<Integer> ll1Node =ll1.first;
        Node<Integer> ll2Node =ll2.first;
        Node<Integer> small=ll1Node.get()<=ll2Node.get()?ll1Node:ll2Node;
        Node<Integer> large=ll1Node.get()>ll2Node.get()?ll1Node:ll2Node;
        do {
            ll.add(small.get());
            Node<Integer> smallNext =small.next;
            if (smallNext == null){
                small= large;
                large=null;
            }else {
                assert large != null;
                small=smallNext.get()<=large.get()?smallNext:large;
                large=smallNext.get()>large.get()?smallNext:large;
            }
        }while (small!=null);
        return ll;
    }

    /**
     * 测试链表存储是否OK
     */
    public static  void testSingleLinkedListOk(){
        SingleLinkedList<Integer> ll=new SingleLinkedList<>();
        ll.add(3);
        ll.add(8);
        ll.add(9);
        ll.print();
    }

    private static boolean isEmpty(SingleLinkedList<Integer> ll){
        return ll == null || ll.size == 0;
    }
}
