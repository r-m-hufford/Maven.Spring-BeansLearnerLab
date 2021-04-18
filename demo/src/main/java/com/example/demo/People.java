package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList;

    public People(List<PersonType> personList) {this.personList = personList;}

    @SafeVarargs
    public People (PersonType... people) {
        personList = new ArrayList<>();
        personList.addAll(Arrays.asList(people));
        }

    @Override
    public Iterator<PersonType> iterator() {
        return null;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size(){
        return personList.size();
    }

    public void clear(List<PersonType> list){
        list.clear();
    }

    public void addAll(PersonType ...people) {
        personList.addAll(Arrays.asList(people));
    }

    public PersonType findById(long id) {
        for (PersonType p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
