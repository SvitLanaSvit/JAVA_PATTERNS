package client;

import abstractExpression.Expression;
import context.Context;
import nonterminalExpression.AddExpression;
import nonterminalExpression.SubtractExpression;
import terminalExpression.NumberExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        // Визначаємо набір змінних
        int x = 5;
        int y = 8;
        int z = 2;

        // додаємо змінні в контекст
        context.setVariable("x", x);
        context.setVariable("y", y);
        context.setVariable("z", z);

        // Створюємо об'єкт для обчислення виразу x + y - z
        Expression expression = new SubtractExpression(
                new AddExpression(new NumberExpression("x"), new NumberExpression("y")),
                new NumberExpression("z")
        );

        int result = expression.Interpret(context);
        System.out.println(result);
    }
}