package ru.yandex.praktikum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CatTest {

    @Test
    @DisplayName("getSound должен возвращать 'Мяу'")
    public void getSoundReturnsMeow() {
        Predator predatorMock = mock(Predator.class);
        Cat cat = new Cat(predatorMock);

        String sound = cat.getSound();

        assertEquals("Мяу", sound);
    }

    @Test
    @DisplayName("getFood должен возвращать список еды, полученный от Predator.eatMeat()")
    public void getFoodReturnsFoodFromPredator() throws Exception {
        Predator predatorMock = mock(Predator.class);
        List<String> expectedFood = Arrays.asList("мясо", "рыба");

        when(predatorMock.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(predatorMock);

        List<String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
        verify(predatorMock, times(1)).eatMeat();
    }
}
