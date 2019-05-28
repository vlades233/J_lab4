/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossLines;

/**
 *
 * @author Administrator
 */
public class IntersectionLines {

    static public boolean intersection(Point p1, Point p2, Point p3, Point p4) {

        if (p2.x < p1.x) {

            Point tmp = p1;

            p1 = p2;

            p2 = tmp;

        }

        if (p4.x < p3.x) {

            Point tmp = p3;

            p3 = p4;

            p4 = tmp;

        }

        if (p2.x < p3.x) {

            return false;

        }

        if ((p1.x - p2.x == 0) && (p3.x - p4.x == 0)) {

            if (p1.x == p3.x) {

                if (!((Math.max(p1.y, p2.y) < Math.min(p3.y, p4.y))
                        || (Math.min(p1.y, p2.y) > Math.max(p3.y, p4.y)))) {

                    return true;

                }

            }

            return false;

        }

        if (p1.x - p2.x == 0) {

            double Xa = p1.x;

            double A2 = (p3.y - p4.y) / (p3.x - p4.x);

            double b2 = p3.y - A2 * p3.x;

            double Ya = A2 * Xa + b2;

            return p3.x <= Xa && p4.x >= Xa && Math.min(p1.y, p2.y) <= Ya
                    && Math.max(p1.y, p2.y) >= Ya;

        }

        if (p3.x - p4.x == 0) {

            double Xa = p3.x;

            double A1 = (p1.y - p2.y) / (p1.x - p2.x);

            double B1 = p1.y - A1 * p1.x;

            double Ya = A1 * Xa + B1;

            if (p1.x <= Xa && p2.x >= Xa && Math.min(p3.y, p4.y) <= Ya
                    && Math.max(p3.y, p4.y) >= Ya) {
                return true;
            } else {
            }

            return false;

        }

        double A1 = (p1.y - p2.y) / (p1.x - p2.x);

        double A2 = (p3.y - p4.y) / (p3.x - p4.x);

        double B1 = p1.y - A1 * p1.x;

        double B2 = p3.y - A2 * p3.x;

        if (A1 == A2) {

            return false;

        }

        double Xa = (B2 - B1) / (A1 - A2);

        return !((Xa < Math.max(p1.x, p3.x)) || (Xa > Math.min(p2.x, p4.x)));

    }

}
