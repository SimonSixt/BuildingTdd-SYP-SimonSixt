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


}