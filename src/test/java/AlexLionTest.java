import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class AlexLionTest {

    @Mock
    Feline feline;
    AlexLion alexLion;

    @Before
    public void beforeAll() throws Exception {
        alexLion = new AlexLion (feline);
    }

    @Test
    public void getFriendsReturnFriendListAlexLionTest() throws Exception {
        List<String> expectedResultFriendListAlexLion = List.of("Марти", "Глория", "Мелман");
        List<String> actualResultFriendListAlexLion = alexLion.getFriends();
        assertEquals("Некорректный результат вызова метода", expectedResultFriendListAlexLion, actualResultFriendListAlexLion);
    }

    @Test
    public void getPlaceOfLivingReturnZooNYAlexLionTest() throws Exception {
        String expectedResultZooNYAlexLion = "Зоопарк Нью-Йорка";
        String actualResultZooNYAlexLion = alexLion.getPlaceOfLiving();
        assertEquals("Некорректный результат вызова метода", expectedResultZooNYAlexLion, actualResultZooNYAlexLion);
    }

    @Test
    public void getKittensReturnZeroAlexLionTest() throws Exception {
        int actualResultGetKittensAlexLion = alexLion.getKittens();
        assertEquals("Некорректный результат вызова метода", 0, actualResultGetKittensAlexLion);
    }
}
