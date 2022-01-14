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
}