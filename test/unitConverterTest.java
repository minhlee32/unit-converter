import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class unitConverterTest {

    @Test
    void footToMeter1() {
        double foot = 1.0;
        double expected = 0.305;

        double result = UnitConverter.footToMeter(foot);
        assertEquals(expected, result);
    }

    @Test
    void meterToFoot1() {
        double meter = 20.0;
        double expected = 65.574;

        double result = UnitConverter.meterToFoot(meter);
        assertEquals(expected, result);
    }

    @Test
    void footToMeter2() {
        double foot = 10.0;
        double expected = 3.050;
        double result = UnitConverter.footToMeter(foot);
        assertEquals(expected, result);
    }

    @Test
    void footToMeter3() {
        double foot = 2.0;
        double expected = 0.610;

        double result = UnitConverter.footToMeter(foot);
        assertEquals(expected, result);
    }

    @Test
    void footToMeter4() {
        double foot = 9.0;
        double expected = 2.745;

        double result = UnitConverter.footToMeter(foot);
        assertEquals(expected, result);
    }


    @Test
    void meterToFoot2() {
        double meter = 20.0;
        double expected = 65.574;

        double result = UnitConverter.meterToFoot(meter);
        assertEquals(expected, result);
    }


    @Test
    void meterToFoot3() {
        double meter = 60.0;
        double expected = 196.74;

        double result = UnitConverter.meterToFoot(meter);
        assertEquals(expected, result);
    }


    @Test
    void meterToFoot4() {
        double meter = 65.0;
        double expected = 213.135;

        double result = UnitConverter.meterToFoot(meter);
        assertEquals(expected, result);
    }
}