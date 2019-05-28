/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossLine;

import crossLines.Point;
import crossLines.IntersectionLines;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class IntersectionLinesTest {

    @Test
    public void testInteresctionLines() {
        Point p1 = new Point(1.0, 5.0);
        Point p2 = new Point(2.0, 4.0);
        Point p3 = new Point(1.0, 3.0);
        Point p4 = new Point(2.0, 7.0);
        IntersectionLines il1 = new IntersectionLines();

        assertEquals(false, IntersectionLines.intersection(p1, p2, p3, p4));

    }
}
