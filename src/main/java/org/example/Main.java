package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Exercise 1 ---");
        {
            ArrayList<String> missionTasks = new ArrayList<>();

            System.out.println("Is the list empty initially? " + missionTasks.isEmpty());

            missionTasks.add("Secure the perimeter");
            missionTasks.add("Establish communication");
            missionTasks.add("Report status");

            System.out.println("Current tasks: " + missionTasks);
            System.out.println("Number of tasks: " + missionTasks.size());
        }

        System.out.println("\n--- Exercise 2 ---");
        {
            ArrayList<String> equipment = new ArrayList<>();
            equipment.add("Compass");
            equipment.add("Map");
            equipment.add("Radio");

            String secondItem = equipment.get(1);
            System.out.println("Item at index 1: " + secondItem);

            System.out.println("List before modification: " + equipment);

            equipment.set(0, "GPS");

            System.out.println("List after modification: " + equipment);
        }

        System.out.println("\n--- Exercise 3 ---");
        {
            ArrayList<String> objectives = new ArrayList<>();
            objectives.add("Primary Objective");
            objectives.add("Tertiary Objective");

            objectives.add(1, "Secondary Objective");
            System.out.println("List after insertion: " + objectives);

            String removedObjective = objectives.remove(2);
            System.out.println("Removed objective: " + removedObjective);
            System.out.println("List after removing by index: " + objectives);

            objectives.remove("Primary Objective");
            System.out.println("List after removing by object: " + objectives);
        }

        System.out.println("\n--- Exercise 4 ---");
        {
            ArrayList<String> waypoints = new ArrayList<>();
            waypoints.add("Alpha");
            waypoints.add("Bravo");
            waypoints.add("Charlie");

            boolean hasBravo = waypoints.contains("Bravo");
            System.out.println("Does the list contain 'Bravo'? " + hasBravo);

            int indexOfCharlie = waypoints.indexOf("Charlie");
            System.out.println("Index of 'Charlie': " + indexOfCharlie);

            int indexOfDelta = waypoints.indexOf("Delta");
            System.out.println("Index of 'Delta': " + indexOfDelta);
        }

        System.out.println("\n--- Exercise 5 ---");
        {
            ArrayList<String> squad = new ArrayList<>();
            squad.add("Leader");
            squad.add("Medic");
            squad.add("Engineer");
            squad.add("Scout");

            System.out.println("--- Using an Enhanced For-Loop ---");
            for (String role : squad) {
                System.out.println("Role: " + role);
            }

            System.out.println("\n--- Using a Standard For-Loop with index ---");
            for (int i = 0; i < squad.size(); i++) {
                System.out.println("Role at index " + i + ": " + squad.get(i));
            }
        }

        System.out.println("\n--- Exercise 6 ---");
        {
            ArrayList<String> intel = new ArrayList<>();
            intel.add("Enemy position: Sector 4");
            intel.add("Weakness: Power generator");

            System.out.println("Intel count before mission: " + intel.size());
            System.out.println("Intel list: " + intel);

            intel.clear();

            System.out.println("\nIntel count after mission: " + intel.size());
            System.out.println("Is the intel list empty now? " + intel.isEmpty());
            System.out.println("Intel list: " + intel);
        }
    }
}