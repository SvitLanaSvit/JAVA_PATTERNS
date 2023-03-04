package terminalExpression;

import abstractExpression.Expression;
import context.Context;

// термінальний вираз
public class NumberExpression implements Expression {
    String name;

    public NumberExpression(String variableName){
        name = variableName;
    }
    @Override
    public int Interpret(Context context) {
        return context.getVariable(name);
    }
}