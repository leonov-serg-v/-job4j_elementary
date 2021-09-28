package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenDay1ThenPonedelnic() {
        String result = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay2ThenVnornic() {
        String result = SwitchWeek.nameOfDay(2);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay3ThenSreda() {
        String result = SwitchWeek.nameOfDay(3);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay4ThenChetverg() {
        String result = SwitchWeek.nameOfDay(4);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay5ThenPiatnica() {
        String result = SwitchWeek.nameOfDay(5);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay6ThenSubbota() {
        String result = SwitchWeek.nameOfDay(6);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay7ThenVoskresen() {
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDay10ThenError() {
        String result = SwitchWeek.nameOfDay(10);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

}