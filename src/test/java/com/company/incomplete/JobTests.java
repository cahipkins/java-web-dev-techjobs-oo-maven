package com.company.incomplete;


import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly


    @Test
    public void testSettingJobId() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Assertions.assertEquals(1, job1.getId(), .001);
        Assertions.assertTrue(job2.getId() != job1.getId());
        Assertions.assertFalse(job2.getId() < job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Assertions.assertTrue(job1.getName().equals("Product tester"));
        Assertions.assertTrue(job1.getEmployer().getValue().equals("ACME"));
        Assertions.assertTrue(job1.getLocation().getValue().equals("Desert"));
        Assertions.assertTrue(job1.getPositionType().getValue().equals("Quality control"));
        Assertions.assertTrue(job1.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality() {
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assertions.assertFalse(job1.equals(2));
        Assertions.assertFalse(job2.equals(1));

    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedToStringOutput =
                        "\n" +
                        "ID: 1\n"+
                        "Name: Product tester\n" +
                        "Employer: ACME\n" +
                        "Location: Desert\n" +
                        "Position Type: Quality control\n" +
                        "Core Competency: Persistence\n";
        Assertions.assertEquals(expectedToStringOutput, testJob.toString());
    }

    @Test
    public void testToStringIsFormattedProperly() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedToStringOutput =
                        "\n" +
                        "ID: 1\n"+
                        "Name: Product tester\n" +
                        "Employer: ACME\n" +
                        "Location: Desert\n" +
                        "Position Type: Quality control\n" +
                        "Core Competency: Persistence\n";
        Assertions.assertEquals(expectedToStringOutput, testJob.toString());
    }

    @Test
    public void testToStringDataNotAvailable() {
    Job testJob = new Job ("Software Eng. 1", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            String expectedToBeStringOutput =
                            "\n" +
                            "ID: 1\n"+
                            "Name: Software Eng. 1\n" +
                            "Employer: Data Not Available\n" +
                            "Location: Data Not Available\n" +
                            "Position Type: Data Not Available\n" +
                            "Core Competency: Data Not Available\n";
            Assertions.assertEquals(testJob.toString(), expectedToBeStringOutput);
    }
}
