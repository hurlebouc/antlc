/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

/**
 *
 * @author hubert
 */
public abstract class Either<S, T> {

    protected S s;
    protected T t;

    protected Either(S s, T t) {
        this.s = s;
        this.t = t;
    }

    abstract public boolean isLeft();

    public boolean isRight() {
        return !isLeft();
    }
}
