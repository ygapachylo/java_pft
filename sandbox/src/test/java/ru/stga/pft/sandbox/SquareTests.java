
package ru.stga.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.stga.pft.sandbox.Square;

//@Test

public class SquareTests {
@Test

    public void testArea(){
        Square s=new Square();
        Assert.assertEquals(s.Area(5),25);
    }
}
