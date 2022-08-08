https://java-programming.mooc.fi/part-11/2-packages

In this exercise, you will implement the application that was described above. You are free to design the structure as you wish, or you can follow the structure sketched out above. The appearance of the user interface and the required commands are predefined. This exercise is worth two normal exercise points.

NB: for the tests to work, you can only create one Scanner object in your program to read user input.

In this exercise, you will implement a flight control application. It is used to control the airplanes and their flight routes. The system always knows the identifier and the capacity of an airplane. The flight information consists of the used airplane, the departure airport id (e.g. HEL), and the destination airport ID (e.g. BAL).

There can be multiple airplanes and flights. The same airplane can be used to make several flights.

The application should operate in two parts: first, the user enters information about airplanes and flights in the airport asset control, after which the program offers the flight information service for the user. There are three operations in this latter flight control — printing the airplanes, printing the flights, and printing the information of a single airplane. In addition, the user may exit the program by choosing the option x. If the user enters an invalid command, the program asks for a command again.

The program should start when the main method of the Main class inside the package FlightControl is executed

Example output of the program is presented below:

Sample output </br>
Airport Asset Control </br>
Choose an action: </br>
[1] Add an airplane </br>
[2] Add a flight </br>
[x] Exit Airport Asset Control </br>
> 1 </br>
Give the airplane id: HA-LOL </br>
Give the airplane capacity: 42 </br>
Choose an action: </br>
[1] Add an airplane </br>
[2] Add a flight </br>
[x] Exit Airport Asset Control </br>
> 1 </br>
Give the airplane id: G-OWAC </br>
Give the airplane capacity: 101 </br>
Choose an action: </br>
[1] Add an airplane </br>
[2] Add a flight </br>
[x] Exit Airport Asset Control </br>
> 2 </br>
Give the airplane id: HA-LOL </br>
Give the departure airport id: HEL </br>
Give the target airport id: BAL </br>
Choose an action: </br>
[1] Add an airplane </br>
[2] Add a flight </br>
[x] Exit Airport Asset Control </br>
> 2 </br>
Give the airplane id: G-OWAC </br>
Give the departure airport id: JFK </br>
Give the target airport id: BAL </br>
Choose an action: </br>
[1] Add an airplane </br>
[2] Add a flight </br>
[x] Exit Airport Asset Control </br>
> 2 </br>
Give the airplane id: HA-LOL </br>
Give the departure airport id: BAL </br>
Give the target airport id: HEL </br>
Choose an action: </br>
[1] Add an airplane </br>
[2] Add a flight </br>
[x] Exit Airport Asset Control </br> 
> x </br>

Flight Control </br>
Choose an action: </br>
[1] Print airplanes </br>
[2] Print flights </br>
[3] Print airplane details </br>
[x] Quit </br>
> 1 </br>
G-OWAC (101 capacity) </br>
HA-LOL (42 capacity) </br>
Choose an action: </br>
[1] Print airplanes </br>
[2] Print flights </br>
[3] Print airplane details </br>
[x] Quit </br>
> 2 </br>
HA-LOL (42 capacity) (HEL-BAL) </br>
HA-LOL (42 capacity) (BAL-HEL) </br>
G-OWAC (101 capacity) (JFK-BAL) </br>

Choose an action: </br>
[1] Print airplanes </br>
[2] Print flights </br>
[3] Print airplane details </br>
[x] Quit </br>
> 3 </br>
Give the airplane id: G-OWAC </br>
G-OWAC (101 capacity) </br>

Choose an action: </br>
[1] Print airplanes </br>
[2] Print flights </br>
[3] Print airplane details </br>
[x] Quit </br>
> x </br>

NB For the purposes of the test it is essential that the user interface work exactly as described above. You should probably copy the options printed by the program from here to your code. The tests won't assume that your program is prepared to handle improper input.
