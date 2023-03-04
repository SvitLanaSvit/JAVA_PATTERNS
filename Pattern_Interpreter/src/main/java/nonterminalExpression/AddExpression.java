package nonterminalExpression;

import abstractExpression.Expression;
import context.Context;

// Нетермінальний вираз для додавання
public class AddExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AddExpression(Expression left, Expression right){
        leftExpression = left;
        rightExpression = right;
    }

    @Override
    public int Interpret(Context context) {
        return leftExpression.Interpret(context) + rightExpression.Interpret(context);
    }
}