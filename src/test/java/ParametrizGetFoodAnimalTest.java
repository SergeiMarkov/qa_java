import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ParametrizGetFoodAnimalTest {

    private Animal animal;

    private final String animalKind;
    private final List<String> expectedFoodList;

    private static final List<String> FOOD_FOR_HERBIVORE = Arrays.asList("Трава", "Различные растения");
    private static final List<String> FOOD_FOR_PREDATOR = Arrays.asList("Животные", "Птицы", "Рыба");

    public ParametrizGetFoodAnimalTest(String animalKind, List<String> expectedFoodList) {
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodParamAnimalKind() {
        return new Object[][]{
                {"Хищник", FOOD_FOR_PREDATOR},
                {"Травоядное", FOOD_FOR_HERBIVORE},

        };
    }

    @Test
    public void getFoodAnimalKindFeeding() throws Exception {
        animal = new Animal();
        List<String> actualFoodList = animal.getFood(animalKind);
        assertEquals(expectedFoodList, actualFoodList);
    }
}
