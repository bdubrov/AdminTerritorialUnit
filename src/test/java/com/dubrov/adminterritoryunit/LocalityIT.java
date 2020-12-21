package com.dubrov.adminterritoryunit;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LocalityIT {

    @Test
    public void IsLeaderInfoCorrectMock() {
        String name = "Kiev";
        double numberOfPeople = 55;
        Person leader = Mockito.mock(Person.class);
        when(leader.getPersonInfo()).thenReturn("\tname: LeaderName \n\tsurname: LeaderSurname \n\tage: 35 \n\tposition: Leader");
        ArrayList<Person> deputies = new ArrayList<>();

        Locality locality = new Locality(name, numberOfPeople, leader, deputies);

        assertEquals("Leader of " + name + "\n" + "\tname: LeaderName \n\tsurname: LeaderSurname \n\tage: 35 \n\tposition: Leader", locality.getLeaderInfo());
        verify(leader).getPersonInfo();
    }


    @Test
    public void IsLeaderInfoCorrectSpy() {
        String name = "Kiev";
        double numberOfPeople = 55;

        Person leader = Mockito.spy(new Person("LeaderName", "LeaderSurname", 35, "Leader"));

        ArrayList<Person> deputies = new ArrayList<>();

        Locality locality = new Locality(name, numberOfPeople, leader, deputies);

        assertEquals("Leader of " + name + "\n" + "\tname: LeaderName\n\tsurname: LeaderSurname\n\tage: 35\n\tposition: Leader", locality.getLeaderInfo());
        verify(leader).getPersonInfo();
    }

}
