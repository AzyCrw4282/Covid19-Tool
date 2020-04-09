Greetings Adrian!!!

**Background** - Simply a tool to query the status of COVID19

I wanted to make something interesting, and so the only idea came to me was to make something related to the ongoing pandemic.
So I've gone ahead and built a COVID19 tool that shows the infected/casualties/recovered around the world in real-time using the public API by John Hopkins University.

In addition,
I have also included a section where data is displayed for the given state, including least and most affected region. The API in use only supports USA for the time being.

A risk predictor tool that predicts your chance of catching the virus given your age, health conditons, symptoms, latest travels.

**Instructions to play with(change values in .art file)**

Change your age
Change the state
Add/remove your health conditons 
Add/remove remove your symptoms 
Add/remove your latest travels 

--For the  last 3 points above make sure that they are defined in the grammer file ( HelpMeWithCovid19.art )

**Requirements**

--Java 11 ( I used jdk-11.0.2)

Relevant Files

HelpMeWithCovid19.art 

HelpMeWithCovid19.str

HelpMeWithCovid19.bat -> The main executable file.

Java files: CovidMain is the main class. All other classes in the src dir are also used such as enum and chart files.

All libraries are in the lib folder and I have correctly set their classpath in the bat script

1