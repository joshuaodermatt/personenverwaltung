package org.pw;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    public void testSetEintrittsjahr() throws Exception {
        int tooLow = 1974;
        int tooHigh = java.time.LocalDate.now().getYear() + 1;
        int correct = 2000;
        boolean errorTooHighOccured = false;
        boolean errorTooLowOccured = false;

        Person p = new Person();

        try {
            p.setEintrittsjahr(tooLow);
        } catch (Exception e) {
            errorTooLowOccured = true;
        }
        try {
            p.setEintrittsjahr(tooHigh);
        } catch (Exception e) {
            errorTooHighOccured = true;
        }
        p.setEintrittsjahr(correct);

        assertTrue(errorTooHighOccured);
        assertTrue(errorTooLowOccured);
        assertEquals(correct, p.getEintrittsjahr());
    }

    public void testSetSalaer() throws Exception {
        double tooLow = -0.01;
        double tooHigh = 99999.96;
        double correct = 2000;
        boolean errorTooHighOccured = false;
        boolean errorTooLowOccured = false;

        Person p = new Person();

        try {
            p.setSalaer(tooLow);
        } catch (Exception e) {
            errorTooLowOccured = true;
        }
        try {
            p.setSalaer(tooHigh);
        } catch (Exception e) {
            errorTooHighOccured = true;
        }
        p.setSalaer(correct);

        assertTrue(errorTooHighOccured);
        assertTrue(errorTooLowOccured);
        assertEquals(correct, p.getSalaer() );
    }
}
