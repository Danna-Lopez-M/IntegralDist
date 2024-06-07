package expression;

import net.objecthunter.exp4j.ExpressionBuilder;

public class ExpressionParser {

    public Expression parse(String expressionStr) {
        return x -> new ExpressionBuilder(expressionStr)
                    .variable("x")
                    .build()
                    .setVariable("x", x)
                    .evaluate();
    }
}