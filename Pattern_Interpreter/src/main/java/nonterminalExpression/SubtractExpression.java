package nonterminalExpression;

import abstractExpression.Expression;
import context.Context;

// нетермінальний вираз для віднімання
public class SubtractExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public SubtractExpression(Expression left, Expression right){
        leftExpression = left;
        rightExpression = right;
    }
    @Override
    public int Interpret(Context context) {
        return leftExpression.Interpret(context) - rightExpression.Interpret(context);
    }
}