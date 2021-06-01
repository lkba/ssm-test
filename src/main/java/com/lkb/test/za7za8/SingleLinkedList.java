package com.lkb.test.za7za8;

/**
 * 单向链表
 * @author ConstXiong
 * @param <E>
 */
public class SingleLinkedList<E> {
    int size =0;

    Node<E> first;
    Node<E> last;

    public SingleLinkedList(){

    }

    public void add(E e){
        Node<E> l =last;
        Node<E> item =new Node<E>(e,null);
        last=item;
        if (l==null){
            this.first=item;

        }else {
            l.next=item;
        }
        size++;
    }

    /**
     * 打印链表
     */
    public void print(){
        for (Node<E> item =first;item!=null;item=item.next){
            System.out.println(item+ " ");
        }
    }

    /**
     * 单向链表中的节点
     * @author ConstXiong
     * @param <E>
     */
    public static class Node<E>{
        E item;
        Node <E> next ;
        Node(E item ,Node<E> next ){
            this.item =item;
            this.next =next;
        }

        public E get(){
            return item ;
        }

        public String toString (){
            return item.toString();
        }
    }
}
