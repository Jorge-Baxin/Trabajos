
package cadenaadn;

public class adnNode {
    private char data;
    private adnNode prev;
    private adnNode next;

    public adnNode(){}

   /**
    * @param pdata Contiene un dato numerio
    */
    public adnNode(char data){
        this.data=data;
        prev=null;
        next=null;
    }
    public adnNode(char data, adnNode prev, adnNode next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public char getNucleotide(){
        return data;
    }
    public void setNucleotide(char valor){
        data=valor;
    }

    public adnNode getPrev(){
        return prev;
    }
    public adnNode getNext(){
        return next;
    }
    public void setPrev(adnNode node){
        prev=node;
    }
    public void setNext(adnNode node){
        next=node;
    }
    public adnNode clone(){
        return new adnNode(data,prev,next);
    }
    
}
