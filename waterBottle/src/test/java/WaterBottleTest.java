import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    waterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new waterBottle();
    }

    @Test
    public void bottleHasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void bottleHas10LessAfterDrink(){
        assertEquals(90, waterBottle.haveADrink());
    }

    @Test
    public void bottleIsEmpty(){
        assertEquals( 0 , waterBottle.emptyBottle());
    }

    @Test
    public void bottleIsRefilled(){
        assertEquals(100, waterBottle.bottleIsFull());
    }



}
