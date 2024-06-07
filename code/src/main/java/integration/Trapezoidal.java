package integration;

import expression.Expression;

public class Trapezoidal implements IntegrationStrategy {

    @Override
    public double integrate(Expression expression, double lowerLimit, double upperLimit) {
        int n = 1000;  // Número de subintervalos
        double h = (upperLimit - lowerLimit) / n;
        double sum = 0.5 * (expression.evaluate(lowerLimit) + expression.evaluate(upperLimit));

        for (int i = 1; i < n; i++) {
            double x = lowerLimit + i * h;
            sum += expression.evaluate(x);
        }

        return sum * h;
    }
}