import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)

public class AnimalTest {

    private Animal animal;

    @Before
    public void beforeAll() {
        animal = new Animal();
    }

    @Test
    public void getFamilyWithOutNameFamilyAnimalTest() {
        String expectedFamilyName = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamilyName = animal.getFamily();
        assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void getFoodWithUnknownAnimalKindAnimalTest() {
        Throwable exception = assertThrows(Exception.class, () -> {
                    animal.getFood("Неизвестный");
                }
        );
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

}