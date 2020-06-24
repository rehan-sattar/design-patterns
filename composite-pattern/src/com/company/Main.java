package com.company;

import com.company.exercise.HumanResource;
import com.company.exercise.Team;
import com.company.exercise.Truck;

public class Main {

    public static void main(String[] args) {
	    Group group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        Group group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        Group group3 = new Group();

        group3.add(group2);
        group3.render();
        group3.move();

        Team subTeam1 = new Team();
        subTeam1.add(new Truck());
        subTeam1.add(new HumanResource());
        subTeam1.add(new HumanResource());

        Team subTeam2 = new Team();
        subTeam2.add(new Truck());
        subTeam2.add(new HumanResource());
        subTeam2.add(new HumanResource());

        Team team = new Team();
        team.add(subTeam1);
        team.add(subTeam2);

        team.deploy();
    }
}
