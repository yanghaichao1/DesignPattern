package visitor;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
