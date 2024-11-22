import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class ParametrizPozitiveMaleFemaleHasManeLionTest {

    private final boolean hasMane;
    private final String sex;

    @Mock
    private Feline feline;

    private Lion lion;

    public ParametrizPozitiveMaleFemaleHasManeLionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Тест  ParametrizLionTest - {0}")
    public static Object[] getParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeLionTest() throws Exception {
            lion = new Lion(sex, feline);
            Boolean expectedHasMane = hasMane;
            Boolean actualHasMane = lion.doesHaveMane();
            Assert.assertEquals(expectedHasMane, actualHasMane);
        }
    }



