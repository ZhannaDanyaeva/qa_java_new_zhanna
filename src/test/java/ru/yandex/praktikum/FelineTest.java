package ru.yandex.praktikum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FelineTest {
    @Test
    public void eatMeatReturnsCorrectFood() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("мясо", "рыба");
        assertEquals(expected, feline.getFood("Хищник"));
    }

    @Test
    public void getKittensReturnsDefaultOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamReturnsValue() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void getFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

}