import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Ballo", 25, 95.0);

    }

    @Test
    public void hasName(){
        assertEquals("Ballo", bear.getName());
    };

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge() );
    };

    @Test
    public void hasWeight(){
        assertEquals(95.0, bear.getWeight(), 0.01);
    }

    @Test
    public void readyToHibernateIfWeightLessThan80(){
        bear = new Bear("Ballo", 25, 60.0);
        assertEquals(false, bear.isReadyToHibernate());
    }

    @Test
    public void readyToHibernateIfWeightGreaterThan80(){
        assertEquals(true, bear.isReadyToHibernate());
    }


}
