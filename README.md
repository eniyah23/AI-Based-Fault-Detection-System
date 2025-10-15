AI-BASED FAULT DETECTION SYSTEM

This project is a simple Java-based application that detects machine faults using vibration, temperature, and pressure data.
It helps in identifying potential mechanical issues early to prevent equipment failure and reduce downtime.

PROJECT OVERVIEW

This project demonstrates how core Java can be used to analyze sensor input data and detect machine faults based on threshold values.
It includes both a graphical user interface (GUI) and a console-based backend.

---

FEATURES

* Graphical User Interface using Java Swing
* Console-based backend for testing and debugging
* Real-time fault detection based on user inputs
* Input validation and error handling
* Separate frontend and backend structure

---

TECHNOLOGIES USED

* Programming Language: Java
* Frontend: Java Swing
* Backend: Core Java
* IDE: Visual Studio Code
* Operating System: Windows / Linux

---

WORKING PRINCIPLE

1. The user enters vibration, temperature, and pressure readings.
2. The program checks if:

   * Vibration > 0.1
   * Temperature > 100°C
   * Pressure > 2.0
3. If any value exceeds the limit, it displays “Fault Detected”.
4. Otherwise, it displays “System Normal”.

---

HOW TO RUN

1. Download the two files:

   * FaultDetectionFrontend.java
   * FaultDetectionBackend.java
2. Open the folder in VS Code or any Java IDE.
3. Open the terminal and type:

   
   javac FaultDetectionFrontend.java
   java FaultDetectionFrontend
   

   or

   
   javac FaultDetectionBackend.java
   java FaultDetectionBackend
   

---

SAMPLE OUTPUT


=== AI-Based Fault Detection System ===
Enter Vibration: 0.25
Enter Temperature (°C): 120
Enter Pressure: 1.8

Result: Fault Detected! Please inspect the machine.


---

SOFTWARE REQUIREMENTS

* JDK 17 or later
* Visual Studio Code / IntelliJ IDEA

HARDWARE REQUIREMENTS

* Minimum 2 GB RAM
* Dual Core Processor or higher

---

DEVELOPED BY
Name: Eniyah.N
Register Number: RA241104710180
Department: CINTEL
College: SRM Institute of Science and Technology, Kattankulathur
Year: II
