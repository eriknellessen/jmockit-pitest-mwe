package de.nellessen.example;

import mockit.Expectations;
import mockit.Mocked;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ExampleCalculatorTest {

    @Mocked
    private MockableCalculator mockedMockableCalculator;

    @Test
    void calculateExpectedValue() {
        new Expectations() {{
            mockedMockableCalculator.calculate();
            result = 0;
        }};

        ExampleCalculator exampleCalculator = new ExampleCalculator();
        int result = exampleCalculator.calculate(true);

        assertThat("Did not calculate the expected result!",
                   result,
                   is(equalTo(7)));
    }

}