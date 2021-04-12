# JavaFX-Gradle-Template

A simple Java + JavaFX + Gradle Template to get you going with minimal effort. Instructions below.


## Requirements

* OpenJDK 15+ [with the PATH and JAVA_HOME env-vars set up]
* Gradle 6.8+ [with the PATH env-var set up]
* Optional: Eclipse JDT 2020.03+ [You can build, run and package with Gradle or a Gradle-Aware IDE]


## Usage Guide

1. Make sure you have the required JDK and Gradle installed and set up.

2. Clone/Download this repository to your local drive.

3. Open a command promp inside the project folder.

4. Execute "gradle eclipse" to generate eclipse .project files.

5. Execute "gradle run" to directly start the demo application.

6. Execute "gradle jpackage" to build a standalone binary inside "build/jpackage/BinaryName".

7. Customize the generic package, module and binary names to your liking. You need to edit "gradle.build", the src folders, App.java and "module-info.java"



## Generating Eclipse Project Files with Gradle

Execute this in the project-directory to generate elipse .project files if necessary:
```Shell
gradle eclipse
```
Then simply import the Project into your Eclipse-Workspace as an eclipse project.

You can also edit the files using any other editor of your choice and build using gradle.


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
