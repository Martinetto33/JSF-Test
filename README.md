# JSF Test program
<p align="right" style="font-size: large"><em>by Alin Bordeianu</em></p>

___

## This program is part of my onboarding period at Onit SpA 

If you're watching this, you're probably as confused as I was on my first days. Don't worry: I should assure you that it gets better, but it doesn't, your confusion just scales up to match the newer tasks you're assigned.

Get used to it.

## What to do with this repo
1. Open IntelliJ IDEA and create a new project, then select "Clone repository".
2. In the URL field, copy and paste this: https://github.com/Martinetto33/JSF-Test.git.
3. Trust the project to allow execution.
4. Once the project is open, you'll need to set up a running configuration. On the left side of the top bar, you'll find something next to the running button that says "Current file" or similar. Expand the dropdown menu, and select "Edit Configurations...".
5. I suggest you use WildFly as an application server, you can download the latest version from https://www.wildfly.org/downloads/.
6. Once you have it, look for a WildFly configuration of a Local server and select it.
7. You may have to solve a warning in the configuration regarding the WAR file to be used. Click on the hint provided by the IDE and select the *Build 'JSFTest:war exploded' artifact* option.
8. Run and you should see this messy project in action!

### Other stuff you might find useful

Here are the versions of the frameworks and programs I used:

- IntelliJ IDEA Ultimate: 2025.2.3
- WildFly: 38.0.0.Final

The rest of the dependencies and their versions are located in the [pom.xml](pom.xml) file.