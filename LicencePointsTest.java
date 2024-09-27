import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LicencePointSystemTest {

    @Test
    void LicencePointsTest_Normal() {
        int points = LicencePointSystem.LicencePoints(10, 5, false);
        assertEquals(0, points);
    }

    @Test
    void LicencePointsTest_NegativeActual() {
        int points = LicencePointSystem.LicencePoints(-1, 1, false);
        assertEquals(-1, points);
    }

    @Test
    void LicencePointsTest_NegativeMax() {
        int points = LicencePointSystem.LicencePoints(1, -1, false);
        assertEquals(-1, points);
    }
 
    @Test
    void LicencePointsTest_NegativeDiff() {
        int points = LicencePointSystem.LicencePoints(10, 20, false);
        assertEquals(-1, points);
    }

    @Test
    void LicencePointsTest_Equal() {
        int points = LicencePointSystem.LicencePoints(1, 1, false);
        assertEquals(0, points);
    }

    @Test
    void LicencePointsTest_SpeedGreater() {
        int points = LicencePointSystem.LicencePoints(50, 40, false);
        assertEquals(0, points);
    }

    @Test
    void LicencePointsTest_GreaterWithStuntDriving() {
        int points = LicencePointSystem.LicencePoints(50, 40, true);
        assertEquals(6, points);
    }

    @Test
    void LicencePointsTest_Between30And49() {
        int points = LicencePointSystem.LicencePoints(60, 20, false);
        assertEquals(4, points);
    }
 
    @Test
    void LicencePointsTest_Between16And29() {
        int points = LicencePointSystem.LicencePoints(60, 40, false);
        assertEquals(3, points);
    }

    @Test
    void LicencePointsTest_Over50() {
        int points = LicencePointSystem.LicencePoints(110, 50, false);
        assertEquals(6, points);
    }
  
    
    @Test
    void LicencePointsTest_Diff30() {
        int points = LicencePointSystem.LicencePoints(80, 50, false);
        assertEquals(4, points);
    }

    @Test
    void LicencePointsTest_Diff49() {
        int points = LicencePointSystem.LicencePoints(80, 31, false);
        assertEquals(4, points);
    }

    @Test
    void LicencePointsTest_Diff16() {
        int points = LicencePointSystem.LicencePoints(60, 44, false);
        assertEquals(3, points);
    }

    @Test
    void LicencePointsTest_Diff29() {
        int points = LicencePointSystem.LicencePoints(60, 31, false);
        assertEquals(3, points);
    }

    @Test
    void LicencePointsTest_Diff50() {
        int points = LicencePointSystem.LicencePoints(80, 30, false);
        assertEquals(6, points);
    }
    @Test
    void LicencePointsTest_NegativeMaxWithStuntDriving() {
        int points = LicencePointSystem.LicencePoints(1, -1, true);
        assertEquals(-1, points);
    }

    @Test
    void LicencePointsTest_NormalWithStuntDriving() {
        int points = LicencePointSystem.LicencePoints(10, 5, true);
        assertEquals(6, points);
    }
    @Test
    void LicencePointsTest_Between16And29WithStuntDriving() {
        int points = LicencePointSystem.LicencePoints(60, 40, true);
        assertEquals(6, points);
    }
    
    @Test
    void LicencePointsTest_Between30And49WithStuntDriving() {
        int points = LicencePointSystem.LicencePoints(60, 20, true);
        assertEquals(6, points);
    }
}
