package com.example.demo;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int counter = 0;

        while(learners.iterator().hasNext()) {
            counter++;
        }
        double numberOfHoursPerLearner = numberOfHours / counter;
        learners.forEach(learner -> learner.learn(numberOfHoursPerLearner));
    }

}
