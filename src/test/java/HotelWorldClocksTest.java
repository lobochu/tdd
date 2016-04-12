import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lobochu on 4/11/16.
 */
public class HotelWorldClocksTest {

    test

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beiging_time() throws Exception {
        //Arrange

        //Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);
        
        //Assert
        assertEquals(1, londonClock.getTime());


    }
}
