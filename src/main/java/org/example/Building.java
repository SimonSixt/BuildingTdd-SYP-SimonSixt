package org.example;

public class Building {
    private Integer mId;
    private String[] mInitialResidents;

    public Building(Integer id, String initialResident){
        String[] s = {initialResident};
        mInitialResidents = s;
    }

    public Building(Integer id, String[] initialResidents){
        mInitialResidents = initialResidents;
    }

    public String[] getInitialResidents(){
        return mInitialResidents;
    }

    public void addResident(String name){

    }

    public void removeResident(String name){

    }
}
