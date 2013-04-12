/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox.base;

/**
 *
 * @author hubert
 */
public class List<T> {

    private T head;
    private List<T> tail;
    /**
     * \forral alpha. alpha list
     */
    public static <T> List<T> empty(){ return null;}

    protected List(T head, List<T> tail) {
        this.head = head;
        this.tail = tail;
    }

//    public static <T, S extends T, U extends List<T>> U cons(S data, U list){
//        return (U) new List<T>(data, list);
//    }
    public static <T> List<T> cons(T data, List<T> list) {
        return new List<T>(data, list);
    }

    public T head() {
        return head;
    }

    public List<T> tail() {
        return tail;
    }

    /**
     * Cette fonction cherche le premier élément de la liste validant le prédicat p.
     * @param p : T -> boolean
     * @return
     * @throws NotFoundException 
     */
    public static <T> T search(Fun<T, Boolean> p, List<T> list) throws NotFoundException {
        if (list == empty()) {
            throw new NotFoundException();
        }
        if (p.apply(list.head)) {
            return list.head;
        }
//        if (list.tail == empty()) {
//            throw new NotFoundException();
//        }
        return List.search(p, list.tail);
    }

    public static <T> boolean isEmpty(List<T> list) {
        return list == List.empty();
    }
    
    public static <T> int length(List<T> list){
        if (List.isEmpty(list)) {
            return 0;
        } else {
            return 1 + length(list.tail);
        }
    }
    
    /*
     * -------------------------------------------------------------------------
     */

    Integer truc(List<Integer> t) {
        return t.head;
    }

    void bidule() {
        List<String> truc = List.empty();
        List machin = new List<String>("", truc);
        /*
         * Je ne comprends pas pourquoi Java accepte de typer ça...
         */
        truc(machin);
    }
}
