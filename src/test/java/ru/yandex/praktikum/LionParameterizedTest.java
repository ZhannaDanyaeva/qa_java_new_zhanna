package ru.yandex.praktikum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LionParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })


    @DisplayName("Проверка наличия гривы в зависимости от пола")
    void lionManeDependsOnSex(String sex, boolean expectedHasMane) throws Exception {
        Predator predator = mock(Predator.class);
        Lion lion = new Lion(sex, predator);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Робот", "", "самец", "lion", "123"})
    @DisplayName("Конструктор выбрасывает исключение при неправильном поле")
    void lionConstructorThrowsExceptionOnInvalidSex(String invalidSex) {
        Predator predator = mock(Predator.class);
        Exception exception = assertThrows(Exception.class, () -> new Lion(invalidSex, predator));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}