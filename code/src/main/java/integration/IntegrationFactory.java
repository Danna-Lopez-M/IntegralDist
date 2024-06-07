package integration;

public class IntegrationFactory {

    public static IntegrationStrategy getStrategy(int method) {
        switch (method) {
            case 1:
                return new Trapezoidal();
            case 2:
                return new Simpson();
            default:
                return null;
        }
    }
}