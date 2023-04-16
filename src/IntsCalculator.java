package src;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    Calculator calc = new Calculator();

    private int calculate(Calculator.Operation operation, int arg0, int arg1) {
        double result = calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(operation)
                .result();
        return (int) result;
    }

    @Override
    public int sum(int arg0, int arg1) {
        return this.calculate(Calculator.Operation.SUM, arg0, arg1);//считаем через target
    }

    @Override
    public int mult(int arg0, int arg1) {
        return this.calculate(Calculator.Operation.MULT, arg0, arg1);//считаем через target
    }

    @Override
    public int pow(int a, int b) {
        return this.calculate(Calculator.Operation.POW, a, b);//считаем через target
    }
}
