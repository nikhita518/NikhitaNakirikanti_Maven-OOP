# Epam Week-2 Project

Project done in Maven by implementing the OOP principles
Maven Project Creation Process:
**Step 1:** *Checking the installation of Maven in the system*
```s
mvn --version
```
**Step 2:** *Creating Maven project through command line*
```s
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
**Step 3:** *Build the Maven Project*
```s
mvn package
```
**Step 4:** *Testing the Maven Project*
```s
mvn test
```

# Project Idea

>The sweets and choclates and taken as individual gifts.
>Weight of these are collected and sent to gift class through constructor and total weight of gifts is calculated.
>Each choclate and sweet are having their properties such as id,weight and price.
>The sorted order of choclates are printed(sorted by weight).
>Total weight of the gifts collected is printed.
>Throgh a range of weight number of choclates present in the range are printed.
