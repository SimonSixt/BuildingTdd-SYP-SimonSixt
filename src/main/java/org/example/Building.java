package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Building {
    private Integer mId;
    private LinkedList<String> mInitialResidents;

    public Building(Integer id, String initialResident){
        mInitialResidents = (LinkedList<String>) Arrays.asList(initialResident);
    }

    public Building(Integer id, String[] initialResidents){
        mInitialResidents = (LinkedList<String>) Arrays.asList(initialResidents);
    }

    public String[] getInitialResidents(){
        return (String[]) mInitialResidents.toArray();
    }

    public void addResident(String name){
        mInitialResidents.add(name);
    }

    public void removeResident(String name){

    }
}
