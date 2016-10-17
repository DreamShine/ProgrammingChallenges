import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by DreamShine on 17/10/2016.
 */
public class KaprekarsRoutineTest
{
    @Test
    public void zero_should_return_zero_as_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(0), is(0));
    }
}