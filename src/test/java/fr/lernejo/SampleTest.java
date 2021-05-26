package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void test_op_null() {
        Sample t = new Sample();
        int a = 0;
        int b = 5;
        int add = t.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(add).as("addition of 0 + 5")
            .isEqualTo(5);
    }
    @Test
    void test_op_big() {
        Sample t = new Sample();
        int a = 4512;
        int b = 6589;
        int add = t.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(add).as("addition of 4512 + 6589")
            .isEqualTo(11101);
    }
    @Test
    void test_op_neg() {
        Sample t = new Sample();
        int a = -10;
        int b = -12;
        int add = t.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(add).as("addition of -10 + -12")
            .isEqualTo(-22);
    }
    @Test
    void test_op_neg_pos() {
        Sample t = new Sample();
        int a = -10;
        int b = 12;
        int add = t.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(add).as("addition of -10 + 12")
            .isEqualTo(2);
    }
    @Test
    void test_op_neg_mul() {
        Sample t = new Sample();
        int a = -10;
        int b = 12;
        int mul = t.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(mul).as("multiplication of -10 * 12")
            .isEqualTo(-120);
    }
    @Test
    void test_op_big_mul() {
        Sample t = new Sample();
        int a = 254698;
        int b = 2563;
        int mul = t.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(mul).as("multiplication of 254698 * 2563")
            .isEqualTo(652790974);
    }
    @Test
    void test_op_null_mul() {
        Sample t = new Sample();
        int a = 0;
        int b = 12;
        int mul = t.op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(mul).as("multiplication of 0 * 12")
            .isEqualTo(0);
    }

    @Test
    void fact_null() {
        Sample t = new Sample();
        int a = 0;
        int result = t.fact(a);
        Assertions.assertThat(result).as("factorial of 0")
            .isEqualTo(1);
    }
    @Test
    void fact_one() {
        Sample t = new Sample();
        int a = 1;
        int result = t.fact(a);
        Assertions.assertThat(result).as("factorial of 1")
            .isEqualTo(1);
    }
    @Test
    void fact_five() {
        Sample t = new Sample();
        int a = 5;
        int result = t.fact(a);
        Assertions.assertThat(result).as("factorial of 5")
            .isEqualTo(120);
    }
    @Test
    void fact_neg() {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-10));
    }
}
