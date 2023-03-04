package abstractExpression;

import context.Context;

// інтерфейс інтерпретатора
public interface Expression {
    int Interpret(Context context);
}