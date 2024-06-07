package integration;

import expression.Expression;

public class Simpson implements IntegrationStrategy {

    @Override
    public double integrate(Expression expression, double lowerLimit, double upperLimit) {
        int n = 1000;  // Número de subintervalos (debe ser par)
        if (n % 2 != 0) {
            n++;
        }
        double h = (upperLimit - lowerLimit) / n;
        double sum = expression.evaluate(lowerLimit) + expression.evaluate(upperLimit);

        for (int i = 1; i < n; i++) {
            double x = lowerLimit + i * h;
            if (i % 2 == 0) {
                sum += 2 * expression.evaluate(x);
            } else {
                sum += 4 * expression.evaluate(x);
            }
        }

        return sum * h / 3;
    }
}