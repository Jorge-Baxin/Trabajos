package cadenaadn;

public class adnDoubleStrand {
//ADN=A,T,C,G        T<->A, G<->C
//Lista doble->3`->5`
//leer una cadena de ADN ->TAACGGCCTACCA
    //Atributes
 public adnNode head;
  public adnNode tail;
  private int lengthdl;

  //CReate a new empty list
  public adnDoubleStrand(){
       
    head= new adnNode('\0',null,null);
    tail= new adnNode('\0',head,null);
    head.setNext(tail);
    lengthdl=0;
  }
   
  //Add a new value to the front of the list
  public void insertAtFront(char newData){
    adnNode newNodo= new adnNode(newData,null,head.getNext());
    newNodo.getNext().setPrev(newNodo);
    head=newNodo;
    lengthdl++;
  }

  //Add a new datas to the list at a given position.
  public void insetAtPos(char data, int position){
    //Validate the position
    if(position<0) position=0;

    else if (position>lengthdl) position=lengthdl;
    //if the list is empty, make it be the only element
    if(head==null){
      head= new adnNode(data);
      tail=head;
    }else if (position==0){
      adnNode newNodoD=new adnNode(data);
      newNodoD.setNext(head);//newNodoD.next=head
      head=newNodoD;
    }else{
      adnNode temp=head;
      for(int i=1;i<position;i++){
        temp=temp.getNext();
      }
      adnNode newNodoD=new adnNode(data);
      newNodoD.setNext(temp.getNext());//newNodoD.next=temp.next
      newNodoD.setPrev(temp);
      newNodoD.getNext().setPrev(newNodoD);
      temp.setNext(newNodoD);
    }
    lengthdl++;
  }

  //Add a new value to hre rear of the list
  public void inserAtTail(char newVal){
    adnNode newNodeD=new adnNode (newVal,tail.getPrev(),tail);
    newNodeD.getPrev().setNext(newNodeD);
    tail.setPrev(newNodeD);
    lengthdl++;
  }

  // Return a string representation of this collection, in the form: ["str1","str2",...].
  public String toString() {
    String result = "[]";
    if (lengthdl == 0)
      return result;
    result = "[" + head.getNucleotide();
    adnNode temp = head.getNext();
    while (temp != tail) {
      result += "," + temp.getNucleotide();
      temp =  temp.getNext();
    }
    return result + "]";
  }	
   
  // Remove everything from the DLL.
  public void clearList(){
    head = null;
    tail = null;
    lengthdl = 0;
  }

  public int getSizeL(){
    return lengthdl;
  }
  
}
