import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class ParametrizLionTest {

    private final boolean hasMane;
    private final String sex;

    @Mock
    private Feline feline;

    private Lion lion;

    public ParametrizLionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Тест  ParametrizLionTest - {0}")
    public static Object[] getParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Лев", false},
                {"Львица", false},
        };
    }

    @Test
    public void doesHaveManeLionTest() {
        try {
            lion = new Lion(sex, feline);
            Boolean expectedHasMane = hasMane;
            Boolean actualHasMane = lion.doesHaveMane();
            Assert.assertEquals(expectedHasMane, actualHasMane);
        } catch (Exception e) {
            System.out.println("Неизвестный пол");
        }
    }

}

