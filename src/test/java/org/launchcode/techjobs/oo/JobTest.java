package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(testJob3.getName() instanceof String);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(testJob3.getName(), "Product tester");
        assertEquals(testJob3.getEmployer().toString(), "ACME");
        assertEquals(testJob3.getLocation().toString(), "Desert");
        assertEquals(testJob3.getPositionType().toString(), "Quality control");
        assertEquals(testJob3.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith(System.lineSeparator()));
        assertTrue(testJob.toString().endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals(testJob.toString(), System.lineSeparator() +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" +
                System.lineSeparator());
    }

    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("", new Employer(""),
                new Location(""), new PositionType(""),
                new CoreCompetency(""));
        assertEquals(testJob.toString(), System.lineSeparator() +
                "ID: 3\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available" +
                System.lineSeparator());
    }
}
