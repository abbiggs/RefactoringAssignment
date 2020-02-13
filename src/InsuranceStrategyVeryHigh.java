public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    double calculateInsuranceVeryHigh(double income, int i, double v, int i2) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    int getConstant() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }

    int getAdjustment() {
        return 60000;
    }
}