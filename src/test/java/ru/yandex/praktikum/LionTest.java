package ru.yandex.praktikum;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class LionTest {

    @Test
    public void testLionHasManeWhenMale() throws Exception {
        Predator predator = mock(Predator.class);
        Lion lion = new Lion("Самец", predator);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testLionHasNoManeWhenFemale() throws Exception {
        Predator predator = mock(Predator.class);
        Lion lion = new Lion("Самка", predator);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testLionGetFoodReturnsPredatorFood() throws Exception {
        Predator predator = mock(Predator.class);
        List<String> expected = Arrays.asList("Мясо", "Рыба");
        when(predator.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion("Самец", predator);
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void testLionGetKittensReturnsPredatorValue() throws Exception {
        Predator predator = mock(Predator.class);
        when(predator.getKittens()).thenReturn(2);

        Lion lion = new Lion("Самец", predator);
        assertEquals(2, lion.getKittens());
    }
}
