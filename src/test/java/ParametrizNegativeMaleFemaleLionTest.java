import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizNegativeMaleFemaleLionTest {

    Feline feline;

    private Lion lion;

    private final String SEX;

    public ParametrizNegativeMaleFemaleLionTest(String Sex) {
        this.SEX = Sex;
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

    @Test(expected = java.lang.Exception.class)
    public void negativeMaleFemaleLionTest() throws Exception {
        try {
            lion = new Lion(SEX, feline);
        } catch (Exception e) {
            throw new Exception("Некорректный пол, только самец или самка!");
        }
    }
}
