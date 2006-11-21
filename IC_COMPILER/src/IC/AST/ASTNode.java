package AST;

/** The base class of all abstract syntax tree nodes.
 */
public abstract class ASTNode {
    public Object accept(Visitor v) {
        return v.visit(this);
    }
}
