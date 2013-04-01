/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

/**
 *
 * @author hubert
 */
public class List <T> {
    private T head;
    private List <T> tail;
    
    public final static List empty = null;
    
    private List(T head, List<T> tail){
        this.head = head;
        this.tail = tail;
    }
    
    public static <T> List<T> cons(T data, List<T> list){
        return new List<T>(data, list);
    }
    
    public T head(){
        return head;
    }
    
    public List<T> tail(){
        return tail;
    }
    
    public T search(Fun<T, Boolean> p) throws NotFoundException{
        if(p.apply(head)){
            return head;
        }
        if (tail == empty) {
            throw new NotFoundException();
        }
        return tail.search(p);
    }
}
