# Word-Counter

## What is Word Counter ?

Word Counter is a command-line application that takes a path to a file as an argument and prints a word count of its contents.

## How to run it ?

1. Download the content of this repository 
2. Open a terminal in the proyect folder (cmd, powershell, bash, ...)
3. Run the .jar found in the jar folder of this repository with the path to a file as the first argument:   
   java -jar ./jar/WordCounter.jar [FILE PATH]
   
## How to build it ?

Important: This application has been developed using IntelliJ IDEA, so the following steps to generate the .jar only work using this IDE.

1. Download the content of this repository 
2. Open this proyect in IntelliJ IDEA
3. Click Build
4. Click Build Artifacts
5. A pop up will open with the WordCounter:jar Artifact, click Build.  
   This artifact is design to build the new .jar in the jar folder, so no further actions are required.
   
## Test files

This repository includes four txt files that can be used to test the program located in the testFiles folder.

### Correct output of test1.txt:  

foo : 14   
bar : 12   
y : 1   

### Correct output of test2.txt:  

foo : 14   
bar : 12   
y : 1     

### Correct output of test3.txt:  

foo : 22  
bar : 18  
y : 2  
foo_bar : 2  
bar_foo : 2  

### Correct output of test4.txt:  

foo : 22  
bar : 18  
y : 2  
foo_bar : 2  
bar_foo : 2   

  
test1.txt and test2.txt have the same output because these files have the same text lines but in diferent order, test3.txt and test4.txt also have the same output for the same reason.
