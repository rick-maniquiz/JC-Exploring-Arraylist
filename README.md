# Exploring Java ArrayList
### Cadet Name: Rafael Nico T. Maniquiz

-----

### Exercise 1: Creating an `ArrayList` and Adding Elements (`add`)

The `add(E element)` method appends an element to the end of the list.

**Code Snippet:**

```java
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        // Creating an ArrayList to hold String objects
        ArrayList<String> missionTasks = new ArrayList<>();

        System.out.println("Is the list empty initially? " + missionTasks.isEmpty());

        missionTasks.add("Secure the perimeter");
        missionTasks.add("Establish communication");
        missionTasks.add("Report status");

        System.out.println("Current tasks: " + missionTasks);
        System.out.println("Number of tasks: " + missionTasks.size());
    }
}
```

**1. Prediction:**

```
Is the list empty initially? true
Current tasks: ["Secure the perimeter", "Establish communication", "Report status"]
Number of tasks: 3
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-Arraylist/blob/80658bc7c1cc769103e61af8fe0eeab77e3fe3af/screenshots/1.png"/>

-----

### Exercise 2: Accessing and Modifying Elements (`get` and `set`)

The `get(int index)` method retrieves an element, and `set(int index, E element)` replaces one.

**Code Snippet:**

```java
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> equipment = new ArrayList<>();
        equipment.add("Compass");
        equipment.add("Map");
        equipment.add("Radio");

        String secondItem = equipment.get(1);
        System.out.println("Item at index 1: " + secondItem);

        System.out.println("List before modification: " + equipment);

        // The compass is upgraded to a GPS
        equipment.set(0, "GPS");

        System.out.println("List after modification: " + equipment);
    }
}
```

**1. Prediction:**

```
Item at index 1: Map
List before modification: [Compass, Map, Radio]
List after modification: [GPS, Compass, Map, Radio]

```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-Arraylist/blob/80658bc7c1cc769103e61af8fe0eeab77e3fe3af/screenshots/2.png"/>

-----

### Exercise 3: Inserting and Removing Elements (`add` at index and `remove`)

You can also `add` an element at a specific index, and `remove` elements by index or by object.

**Code Snippet:**

```java
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> objectives = new ArrayList<>();
        objectives.add("Primary Objective");
        objectives.add("Tertiary Objective");

        // Insert a new objective at index 1
        objectives.add(1, "Secondary Objective");
        System.out.println("List after insertion: " + objectives);

        // Remove the objective at index 2
        String removedObjective = objectives.remove(2);
        System.out.println("Removed objective: " + removedObjective);
        System.out.println("List after removing by index: " + objectives);

        // Remove a specific objective by its value
        objectives.remove("Primary Objective");
        System.out.println("List after removing by object: " + objectives);
    }
}
```

**1. Prediction:**


```
List after insertion: [Primary Objective, Secondary Objective, Tertiary Objective]
Removed objective: Tertiary Objective
List after removing by index: [Primary Objective, Secondary Objective]
List after removing by object: [Secondary Objective]
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-Arraylist/blob/80658bc7c1cc769103e61af8fe0eeab77e3fe3af/screenshots/3.png"/>

-----

### Exercise 4: Searching the List (`contains` and `indexOf`)

You can easily check for the presence of an item or find its location.

**Code Snippet:**

```java
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
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
}
```

**1. Prediction:**


```
Does the list contain 'Bravo'? true
Index of 'Charlie': 2
Index of 'Delta': -1
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-Arraylist/blob/80658bc7c1cc769103e61af8fe0eeab77e3fe3af/screenshots/4.png"/>

-----

### Exercise 5: Iterating Through the List

Looping through the elements of an `ArrayList` is a common and essential task.

**Code Snippet:**

```java
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
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
}
```

**1. Prediction:**


```
Role: Leader
Role: Medic
Role: Engineer
Role: Scout

--- Using a Standard For-Loop with index ---
Role at index 0: Leader
Role at index 1: Medic
Role at index 2: Engineer
Role at index 3: Scout
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-Arraylist/blob/80658bc7c1cc769103e61af8fe0eeab77e3fe3af/screenshots/5.png"/>

-----

### Exercise 6: Clearing the List (`clear`)

The `clear()` method removes all elements from the list, leaving it empty.

**Code Snippet:**

```java
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> intel = new ArrayList<>();
        intel.add("Enemy position: Sector 4");
        intel.add("Weakness: Power generator");

        System.out.println("Intel count before mission: " + intel.size());
        System.out.println("Intel list: " + intel);

        // After the mission, the intel is no longer needed
        intel.clear();

        System.out.println("\nIntel count after mission: " + intel.size());
        System.out.println("Is the intel list empty now? " + intel.isEmpty());
        System.out.println("Intel list: " + intel);
    }
}
```

**1. Prediction:**

```
Intel count before mission: 2
Intel list: [Enemy position: Sector 4, Weakness: Power generator]

Intel count after mission: 0
Is the intel list empty now? true
Intel list: []
```

**2. Observation:**

<img src="https://github.com/rick-maniquiz/JC-Exploring-Arraylist/blob/80658bc7c1cc769103e61af8fe0eeab77e3fe3af/screenshots/6.png"/>
