/* Generated By:JJTree: Do not edit this line. ASTNotExpression.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTNotExpression extends SimpleNode {
  public ASTNotExpression(int id) {
    super(id);
  }

  public ASTNotExpression(RookieParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {

    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=955f8d7d2593d267b154fc37e352dd35 (do not edit this line) */
