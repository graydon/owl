program = stmt*
stmt =
  expr [ '(' expr ')' ] : call
expr =
  identifier : ident
 .operators postfix
  [ '(' expr ')' ] : call
 .operators prefix
  '-' : negate
 .operators infix flat
  '-' : minus
