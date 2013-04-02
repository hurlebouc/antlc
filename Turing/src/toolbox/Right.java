/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

/**
 *
 * @author hubert
 */
public class Right<S, T> extends Either<S,T> {
    
    public Right(T t){
        super(null, t);
    }

    @Override
    public boolean isLeft() {
        return false;
    }
    
    public T unwrap(){
        return t;
    }
}
