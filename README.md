# JavaFX-Gradle-Template

A simple Java + JavaFX + Gradle Template to get you going with minimum effort. Instructions below.


## Requirements

* OpenJDK 15+ [with the PATH and JAVA_HOME env-vars set up]
* Gradle 6.8+ [with the PATH env-var set up]
* Optional: Eclipse JDT 2020.03+ [You can build, run and package with Gradle or a Gradle-Aware IDE]


## Usage Guide

1. Make sure you have the required OpenJDK and Gradle correctly installed.

2. Clone/Download this repository to your local drive.

3. Open a command promp inside the project folder.

4. Execute "gradle eclipse" to generate eclipse .project files.

5. Execute "gradle run" to directly start the demo application with gradle.

6. Execute "gradle jpackage" to build a standalone program inside "build/jpackage/".

Highly recommended: customize the generic package, module and binary names to your liking. You need to edit "gradle.build", the src folders, App.java and "module-info.java". Editing the package and module names is easier inside an IDE. The only thing that needs to be edited outside of the IDE is the gradle.build file.


## Generating Eclipse Project Files with Gradle

Execute this in the project-directory to generate Elipse .project files if necessary:
```Shell
gradle eclipse
```
Then simply import the project into your workspace as an existing project.

You can also edit the files using any other editor/IDE of your choice and build using Gradle.


## Running from Source with Gradle

Run the main-class App.java with Eclipse or use Gradle:

To use Gradle, run this in the project directory:
```Shell
gradle run
```


## Building a Standalone Binary with Gradle

Execute this in the project-directory:
```Shell
gradle jpackage
```
The folder containing the packaged program will be placed in the /build/jpackage directory.


## License

See the [LICENSE](LICENSE.md) file for license rights and limitations.
