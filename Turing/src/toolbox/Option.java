/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

/**
 *
 * @author hubert
 */
public class Option<T> {

    private T t;

    private Option(T t) {
        this.t = t;
    }
    public static Option none = null;

    public static <T> Option<T> some(T t) {
        return new Option<T>(t);
    }

    public T unwrap() {
        return t;
    }
}
