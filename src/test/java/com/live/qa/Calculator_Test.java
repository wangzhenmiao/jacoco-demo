package com.live.qa;
import org.junit.Assert;
import org.junit.Test;
/**
 * @ClassName Calculator_Test
 * @Description
 * @Author momo
 * @Date 2018/12/12 上午11:39
 **/

public class Calculator_Test {

    private Calculator instance = new Calculator();

    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        int expected = 30;
        Assert.assertEquals(expected, instance.add(a, b));
    }

    @Test
    public void testSub() {
        int a = 10;
        int b = 20;
        int expected = -10;
        Assert.assertEquals(expected, instance.sub(a, b));
    }

}
