package netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    // другие ваши тесты
//    @Test
//    public void AddPlayerIfPlayOnlyOneHour(){
//        GameStore store = new GameStore();
//        store.addPlayTime("Кузя", 3);
//        String expected = "Кузя";
//        String actual =store.getMostPlayer();
//        Assertions.assertEquals(expected,actual);
    }
////    @Test
//    public void SumPlayTime(){
//        GameStore store = new GameStore();
//        store.addPlayTime("Кузя", 5);
//        store.addPlayTime("Вася", 10);
//
//        int expected = 15;
//        int actual = store.getSumPlayedTime();
//        Assertions.assertEquals(expected,actual);
//
//    }
