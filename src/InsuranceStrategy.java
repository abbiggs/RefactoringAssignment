public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income, int i, double v, int i2) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();
}
