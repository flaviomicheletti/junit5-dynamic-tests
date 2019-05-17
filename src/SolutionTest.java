import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

//
// test
//
public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @TestFactory
    public Collection<DynamicTest> testSum() {

        int expected = 10;
        int actual   = solution.sum(8, 2);

        // test
        Executable _test = () -> assertEquals(expected, actual);

        // create a test display name
        String _case = "foo";

        // create dynamic test
        Collection<DynamicTest> colecctionDynamicTests = new ArrayList<>();
        DynamicTest dynamic_test = DynamicTest.dynamicTest(_case, _test);

        // add the dynamic test to collection
        colecctionDynamicTests.add(dynamic_test);

        return colecctionDynamicTests;
    }
}
