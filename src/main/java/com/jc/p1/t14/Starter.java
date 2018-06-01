package com.jc.p1.t14;

public class Starter {
    public static void main(String[] args) {

        Starter starter = new Starter();
        Person person = new Person();

        starter.processHospital(person, 4, (grate, days) -> 0.8 * 8 * days * grate);
        starter.processAddition(person, 8.5, (grate, hours) -> 2.0 * hours * grate);

        starter.processHospital2(person, 4, (grate, days) -> 0.8 * 8 * days * grate);
        starter.processAddition2(person, 8.5, (grate, hours) -> 2.0 * hours * grate);


    }

    public void processHospital(Person person, Integer days, ProcessHospital ph) {
        Double sum = ph.process(person.getGrade(), days);
    }

    public void processHospital2(Person person, Integer days, Process<Double, Integer, Double> ph) {
        Double sum = ph.process(person.getGrade(), days);
    }

    public void processAddition(Person person, Double hours, ProcessAddition pa) {
        Double sum = pa.process(person.getGrade(), hours);
    }

    public void processAddition2(Person person, Double hours, Process<Double, Double, Double> pa) {
        Double sum = pa.process(person.getGrade(), hours);
    }
}

interface Process<P1, P2, R> {
    R process(P1 p1, P2 p2);
}

interface ProcessHospital {
    Double process(Double grate, Integer days);
}

interface ProcessAddition {
    Double process(Double grate, Double hours);
}
