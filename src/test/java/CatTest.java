import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock   // Мок для класса Feline
    private Feline feline;
    private Cat cat;

    @Before
    public void beforeAll() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundCatTest() {
        String expectedSoundCat = "Мяу";
        String actualSoundCat = cat.getSound();
        Assert.assertEquals("Некорректный результат, Кошка говорит Мяу", expectedSoundCat, actualSoundCat);
    }

    @Test
    public void getFoodCatTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Мыши", "Кузнечики"));
        List<String> expectedFoodCat = List.of("Мыши", "Кузнечики");
        List<String> actualFoodCat = cat.getFood();
        Assert.assertEquals("Некорректный результат,Кошка - Кошачьи - Хищники", expectedFoodCat, actualFoodCat);
    }

}
