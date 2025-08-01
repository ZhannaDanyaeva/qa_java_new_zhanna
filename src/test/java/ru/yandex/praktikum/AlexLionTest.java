package ru.yandex.praktikum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlexLionTest {

    @Test
    @DisplayName("Алекс всегда самец и имеет гриву")
    void alexHasMane() throws Exception {
        Feline felineMock = mock(Feline.class);
        AlexLion alex = new AlexLion(felineMock);

        assertTrue(alex.doesHaveMane(), "Алекс должен иметь гриву");
    }

    @Test
    @DisplayName("Алекс не имеет львят")
    void alexHasNoKittens() throws Exception {
        Feline felineMock = mock(Feline.class);
        AlexLion alex = new AlexLion(felineMock);

        assertEquals(0, alex.getKittens(), "У Алекса не должно быть львят");
        verify(felineMock, never()).getKittens();
    }

    @Test
    @DisplayName("Алекс дружит с Марти, Глорией и Мелманом")
    void alexHasCorrectFriends() throws Exception {
        Feline felineMock = mock(Feline.class);
        AlexLion alex = new AlexLion(felineMock);

        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    @DisplayName("Алекс живёт в Нью-Йоркском зоопарке")
    void alexLivesInZoo() throws Exception {
        Feline felineMock = mock(Feline.class);
        AlexLion alex = new AlexLion(felineMock);

        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    @DisplayName("Алекс умеет танцевать (метод вызывается без ошибок)")
    void alexCanDance() throws Exception {
        Feline felineMock = mock(Feline.class);
        AlexLion alex = new AlexLion(felineMock);

        assertDoesNotThrow(alex::dance);
    }
}
