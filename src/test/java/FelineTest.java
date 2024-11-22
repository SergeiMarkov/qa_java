import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    private Feline feline;

    @Before
    public void beforeAll() {
        feline = new Feline();
    }

    @Test
    public void eatMeatFelineTest() throws Exception {
        List<String> expectedFoodFeline = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodFeline = feline.eatMeat();
        Assert.assertEquals("Некорректный результат, Кошачьи не Хищники?", expectedFoodFeline, actualFoodFeline);
    }

    @Test
    public void getKittensWithOutKittensCountFelineTest() {
        int expectedKittensFeline = 1;
        int actualKittensFeline = feline.getKittens();
        Assert.assertEquals("Некорректный результат, без ввода количества котят, должен вернуть 1", expectedKittensFeline, actualKittensFeline);
    }

    @Test
    public void getKittensWithKittensCountFelineTest() {
        int expectedKittensFeline = 5;
        int actualKittensFeline = feline.getKittens(5);
        Assert.assertEquals("Некорректный результат, количество котят, должен вернуть 5", expectedKittensFeline, actualKittensFeline);
    }

    @Test
    public void getFamilyFelineTest() {
        String expectedFamilyFeline = "Кошачьи";
        String actualFamilyFeline = feline.getFamily();
        Assert.assertEquals("Некорректный результат, должен вернуть Кошачьи", expectedFamilyFeline, actualFamilyFeline);
    }
}

