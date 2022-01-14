package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BuildingTest {

    @Test
    public void itShouldCreateResident() {
        Building building = new Building(0, "name");

        Assert.assertNotNull(building.getInitialResidents());
    }

    @Test
    public void itShouldCreateResidents() {
        String[] residents = {"name1", "name2"};

        Building building = new Building(0, residents);

        Assert.assertNotNull(building.getInitialResidents());
    }

    @Test
    public void itShouldGetResident() {
        Building building = new Building(0, "Name");

        String[] resident = building.getInitialResidents();

        Assert.assertEquals("Name", resident[0]);
    }

    @Test
    public void itShouldAddResident() {
        Building building = new Building(0, "Name1");

        building.addResident("Name2");
        String[] residents = {"Name1", "Name2"};

        Assert.assertEquals(residents, building.getInitialResidents());
    }
}