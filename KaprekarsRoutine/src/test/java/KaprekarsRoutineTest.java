import org.junit.Test;

import javax.security.auth.kerberos.KerberosPrincipal;
import javax.swing.*;

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

    @Test
    public void one_should_return_one_as_the_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(1), is(1));
    }

    @Test
    public void the_number_zero_zero_zero_zero_should_return_zero_as_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(0000), is(0));
    }

    @Test
    public void the_number_zero_zero_zero_one_should_return_one_as_the_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(0001), is(1));
    }

    @Test
    public void the_number_one_zero_zero_zero_should_return_one_as_the_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(1000), is(1));
    }

    @Test
    public void the_number_one_zero_zero_should_return_one_as_the_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(100), is(1));
    }

    @Test
    public void the_number_one_two_three_should_return_three_as_the_largest_number()
    {
        assertThat(KaprekarsRoutine.computeLargestNumber(123), is(3));
    }

    @Test
    public void the_descending_order_of_0000_is_0000()
    {
        assertThat(KaprekarsRoutine.descendingDigitsOf(0000), is("0000"));
    }

    @Test
    public void the_descending_order_of_1000_is_0001()
    {
        assertThat(KaprekarsRoutine.descendingDigitsOf(1000), is("0001"));
    }

    @Test
    public void the_descending_order_of_2000_is_0002()
    {
        assertThat(KaprekarsRoutine.descendingDigitsOf(2000), is("0002"));
    }

    @Test
    public void the_descending_order_of_1234_is_4321()
    {
        assertThat(KaprekarsRoutine.descendingDigitsOf(1234), is("4321"));
    }

    @Test
    public void the_descending_order_of_21_is_1200()
    {
        assertThat(KaprekarsRoutine.descendingDigitsOf(21), is("1200"));
    }
}