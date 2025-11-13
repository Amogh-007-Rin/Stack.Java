// Student : Amogh Dath Kalasapura Arunkumar
// Student id : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

// JUnit 5 tests for the WEEK-07 phone project -->
// This file contains all the tests fully testing all the features and methods of this project

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneProjectTest {

    private Phone pSmall;
    private Phone pBiggerScreen;
    private Phone pBiggerBattery;
    private Phone pBest;

    @BeforeEach
    public void setUp() {
        // screen, battery
        pSmall = new Phone("Small One", 4.0, 1500);
        pBiggerScreen = new Phone("Bigger Screen", 5.5, 1500);
        pBiggerBattery = new Phone("Big Battery", 4.0, 3000);
        pBest = new Phone("Best Phone", 5.5, 3000);
    }

    @Test
    public void testPhoneValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Phone("Zero screen", 0.0, 1000));
        assertThrows(IllegalArgumentException.class, () -> new Phone("Neg battery", 4.0, -1));
    }

    @Test
    public void testDominanceRules() {
        // pBiggerScreen dominates pSmall (strictly larger screen, battery equal)
        assertTrue(pBiggerScreen.dominates(pSmall));
        // pBiggerBattery dominates pSmall (strictly larger battery, screen equal)
        assertTrue(pBiggerBattery.dominates(pSmall));
        // pBest dominates everyone
        assertTrue(pBest.dominates(pSmall));
        assertTrue(pBest.dominates(pBiggerScreen));
        assertTrue(pBest.dominates(pBiggerBattery));
        // equal phones do not dominate each other
        Phone copyBest = new Phone("Copy Best", 5.5, 3000);
        assertFalse(pBest.dominates(copyBest));
        assertFalse(copyBest.dominates(pBest));
    }

    @Test
    public void testPhoneParserValidAndInvalid() {
        Phone p = PhoneParser.parse("Samsung_Galaxy_S8 5.8 3000");
        assertEquals("Samsung Galaxy S8", p.getModel());
        assertEquals(5.8, p.getScreenSize(), 1e-9);
        assertEquals(3000, p.getBatteryCapacity());

        // malformed lines
        assertThrows(IllegalArgumentException.class, () -> PhoneParser.parse(null));
        assertThrows(IllegalArgumentException.class, () -> PhoneParser.parse("   "));
        assertThrows(IllegalArgumentException.class, () -> PhoneParser.parse("OnlyOneToken"));
        assertThrows(IllegalArgumentException.class, () -> PhoneParser.parse("Model X.Y notanumber"));
    }

    @Test
    public void testPhoneListAddAndBestPhonesBehavior() {
        PhoneList list = new PhoneList();
        list.addPhone(pSmall);
        list.addPhone(pBiggerScreen);
        list.addPhone(pBiggerBattery);
        // after adding these, both pBiggerScreen and pBiggerBattery should be undominated
        Collection<Phone> best = list.getBestPhones();
        assertTrue(best.contains(pBiggerScreen));
        assertTrue(best.contains(pBiggerBattery));
        assertFalse(best.contains(pSmall));

        // add the dominating phone and ensure it replaces the dominated ones
        list.addPhone(pBest);
        Collection<Phone> best2 = list.getBestPhones();
        assertTrue(best2.contains(pBest));
        assertEquals(1, best2.size());

        // allPhones should contain everything added
        List<Phone> all = list.getAllPhones();
        assertEquals(4, all.size());
    }

    @Test
    public void testUnmodifiableViews() {
        PhoneList list = new PhoneList();
        list.addPhone(pSmall);
        list.addPhone(pBiggerScreen);
        List<Phone> all = list.getAllPhones();
        Collection<Phone> best = list.getBestPhones();
        assertThrows(UnsupportedOperationException.class, () -> all.add(new Phone("X", 1.0, 1)));
        assertThrows(UnsupportedOperationException.class, () -> best.remove(pSmall));
    }

    @Test
    public void testParseFileReadsSampleData() throws IOException {
        // path relative to workspace as used in the project
        String shortFile = "WEEK-07\\src\\phone-data-short.txt";
        PhoneList shortList = PhoneParser.parseFile(shortFile);
        assertNotNull(shortList);
        assertTrue(shortList.getAllPhones().size() > 0);
        assertTrue(shortList.getBestPhones().size() > 0);

        // also test the full data file (may be large)
        String fullFile = "WEEK-07\\src\\phone-data.txt";
        PhoneList fullList = PhoneParser.parseFile(fullFile);
        assertNotNull(fullList);
        assertTrue(fullList.getAllPhones().size() > 0);
        assertTrue(fullList.getBestPhones().size() > 0);
    }
}