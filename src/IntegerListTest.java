import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListTest {

    @Test
    public void testing(){
        IntegerList testList = new IntegerList(null);
        assertEquals(testList.isEmpty(), true);
        testList.prepend(5);
        assertEquals(testList.isEmpty(), false);
        assertEquals(testList.indexOf(5),0);

    }

}