/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox;

/**
 *
 * @author hubert
 */
public class Left<S, T> extends Either<S, T> {

    public Left(S s) {
        super(s, null);
    }

    @Override
    public boolean isLeft() {
        return true;
    }
    
    public S unwrap(){
        return s;
    }
}
