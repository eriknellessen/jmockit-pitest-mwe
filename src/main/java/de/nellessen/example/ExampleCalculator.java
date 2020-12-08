package de.nellessen.example;

public class ExampleCalculator {

    public int calculate(boolean input) {
        MockableCalculator mockableCalculator = new MockableCalculator();
        mockableCalculator.calculate();
        if (input) {
            return 7;
        } else {
            return 9;
        }
    }
}
