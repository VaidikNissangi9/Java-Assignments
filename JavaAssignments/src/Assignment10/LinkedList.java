package Assignment10;

class Node<E> {
    E data;
    Node<E> next;
    Node(E data){
        this.data=data;
        this.next=null;
    }
    public String toString(){
        if(data!=null)
            return ""+data;
        return null;
    }
}

class SList<E>{
    Node<E> start= new Node<>(null);
    SListIterator<E> iterator(){
        return new SListIterator<E>(start);}
        public String toString(){
        if(start.next==null)
            return "List is empty";
        SListIterator<E> iterate=iterator();
        String list="";
        while(iterate.temp.next!=null)
            list=list+iterate.temp.next+"->";
        return list;
        }




}
class SListIterator<E>{
    Node<E> start,temp;
    SListIterator(Node<E> start){
        this.start=start;
        temp=start;


    }
    //method is used for insertion into linked list
    public void insert(E data){
        temp.next=new Node<>(data);
        temp=temp.next;
        System.out.println("inserting "+data);
    }
    //method is used to remove from end of linked list
    public void remove(){
        Node<E> current=start;
        if(start.next==null){System.out.println("List is empty");
            return;}
        while(current.next.next!=null){
            current=current.next;

        }
        temp=current;
        System.out.println("removing "+current.next);
        current.next=null;
    }


}
public class LinkedList {
    public static void main(String args[]){
    SList<Integer> sList=new SList<Integer>();
    SListIterator iter=sList.iterator();
    iter.insert(100);
    iter.insert(200);
    iter.insert(500);
    iter.remove();

    }



}
