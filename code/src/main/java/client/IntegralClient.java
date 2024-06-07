package client;

import integration.*;
import expression.*;

import java.util.Scanner;

public class IntegralClient {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la función a integrar (en términos de x): ");
        String function = scanner.nextLine();

        System.out.println("Ingrese el límite inferior de integración: ");
        double lowerLimit = scanner.nextDouble();

        System.out.println("Ingrese el límite superior de integración: ");
        double upperLimit = scanner.nextDouble();

        System.out.println("Seleccione el método de integración (1: Trapezoidal, 2: Simpson): ");
        int method = scanner.nextInt();

        ExpressionParser parser = new ExpressionParser();
        Expression expression = parser.parse(function);

        IntegrationStrategy strategy = IntegrationFactory.getStrategy(method);

        if (strategy != null) {
            double result = strategy.integrate(expression, lowerLimit, upperLimit);
            System.out.println("El resultado de la integral es: " + result);
        } else {
            System.out.println("Método de integración no válido.");
        }

        scanner.close();
    }
}