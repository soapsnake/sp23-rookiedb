/* Generated By:JJTree: Do not edit this line. ASTReleaseStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTReleaseStatement extends SimpleNode {
  public ASTReleaseStatement(int id) {
    super(id);
  }

  public ASTReleaseStatement(RookieParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {

    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bfd2cc661eebece9eb56bde6b6d9e41f (do not edit this line) */
