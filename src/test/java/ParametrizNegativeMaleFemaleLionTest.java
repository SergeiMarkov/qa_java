import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class ParametrizNegativeMaleFemaleLionTest {

    private Lion lion;
    private  Feline feline;
    private final String Sex;


    public ParametrizNegativeMaleFemaleLionTest(String Sex) {
        this.Sex = Sex;
    }

    @Parameterized.Parameters(name = "ParametrizLionTest - {0}")
    public static Object[] getNegativeParameters() {
        return new Object[]{
                null,
                "Лев",
                "Львица",
                "Male",
                "Female",
        };
    }

    @Test
    public void negativeMaleFemaleLionTest() {
        Throwable exception = assertThrows(Exception.class, () -> {
            new Lion(this.Sex, feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
