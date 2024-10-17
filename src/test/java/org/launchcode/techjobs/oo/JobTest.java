package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here

//    @BeforeEach
//    Employer companyA = new Employer("Company A");
//    Employer companyB = new Employer("Company B");
//    Location philadelphia = new Location("Philadelphia");
//    PositionType fullStackDev = new PositionType("Full Stack Web Dev");
//    CoreCompetency java = new CoreCompetency("Java");
//
//    Job test_job3 = new Job("Apprentice", companyA, philadelphia, fullStackDev, java);
//    Job test_job4 = new Job("Junior Developer", companyB, philadelphia, fullStackDev, java);


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

    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(testJob1.equals(testJob2));
    }
}
