package integration;

import expression.Expression;

public interface IntegrationStrategy {
    double integrate(Expression expression, double lowerLimit, double upperLimit);
}