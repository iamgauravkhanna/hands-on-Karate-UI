import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestRunner {

    @Test
    public void RunnerMethod() {

        Results results = Runner.path("classpath:examples").tags("~@ignore").parallel(1);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

}