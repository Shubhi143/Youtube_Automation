# YouTube Automation

# Description
The Application Under Test is YouTube.

The Aim of this project is to search for Videos and Explore Sections such as Movies, Music, News etc...

This YouTube Automation project consists of 6 Testcases in Total.

# TestCase 01 Description
Go to www.youtube.com.  Check the Current URL using Assert Statements

# TestCase 02 Description
Go to YouTube.com and Assert you are on the correct URL. Click on “About” at the bottom of the sidebar, and print the message on the screen.

# TestCase 03 Description
Go to the “Films” tab and in the “Top Selling” section, scroll to the extreme right. Apply a Soft Assert on whether the movie is marked “A” for Mature or not. Apply a Soft assert on whether the movie is either “Comedy” or “Animation”.

# TestCase 04 Description
Go to the “Music” tab and in the 1st section, scroll to the extreme right. Print the name of the playlist. Soft Assert on whether the number of tracks listed is less than or equal to 50.


# Note on This YouTube Automation Project
1. Added Selenium Wrapper Methods
2. Added TestNG
3. Implemented Soft Assert
4. Implemented Apache POI

## Required Software to Install:
```
# java version 17
java --version
```
```
# git version 2.43.0
git --version
```
```
# gradle version 8.6
gradle --version
```

```
# vscode 1.88.1
git --version
```
## Required Dependency to run:
```
# WebDriverManager
# Selenium
# TestNG
# poi-ooxml
# log4j-core
# poi
```
## Instructions to Run the Code:
```
# to build the project
gradle build
```

```
# to run the project
gradle run
```

```
# to test the project
gradle test
```