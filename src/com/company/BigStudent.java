package com.company;

import java.util.Random;
import java.lang.StringBuilder;

public class BigStudent implements Student {
    String transportation;
    String schedule;

    public void Student(String transportation, String schedule) {
        this.transportation = transportation;
        this.schedule = schedule;
    }
    public String GenerateID() {
        Random r1 = new Random();
        StringBuilder bob = new StringBuilder();

        for(int i =0; i<8; i++) {
            bob.append(r1.nextInt(10));
        }

        return bob.toString();
    }

    public String Schedule() {
        return schedule;
    }

    public void GoToNextClass() throws Exception {
        this.PickUpBackpack();
        System.err.println("Your legs are broken, and you cannot walk.");
        throw new Exception("Cannot walk without legs.");
    }
    public void DoHomework() {
        for(int i = 0; i> -1; i++) {
            System.out.println("This will be done later.");
        }
    }
    public void dieInside() throws Exception {
        throw new Exception("Cannot do what has already been done");
    }
    public void EatLunch() throws Exception {
        System.err.println("You do not have a mouth, and cannot eat.");
        throw new Exception("Cannot eat without mouth.");
    }
    public void GetGrades() {
        System.out.println("0%");
    }
    public void GoHome() throws Exception {
        this.PickUpBackpack();
        System.err.println("Your legs are broken, and you cannot walk.");
        throw new Exception("Cannot walk without legs.");
    }
    public void ModeOfTransportation() {
        System.out.println(transportation);
    }
    public void GoToSchool() {
        try{
            dieInside();
        } catch (Exception f) {
            f.printStackTrace();
        } finally {
            this.GoToSchool();
        }
    }

    public void PickUpBackpack() throws Exception {
        this.PickUpBackpack();
        System.err.println("Your arms are broken, and you cannot walk.");
        throw new Exception("Cannot lift without arms.");
    }
}

