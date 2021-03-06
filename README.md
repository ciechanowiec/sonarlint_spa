# SonarLint - Static Program Analysis

### Overview
The purpose of this project is to practice static program analysis with the usage of _SonarLint_ IntelliJ IDEA plugin.

### Project structure
There is one class in this project called `SonarLint.java`, which has 4 methods:
1. One `main` method.
2. Three methods to be changed during the task (the _"Additional Methods"_).

### Deactivate IntelliJ IDEA Inspector
Prior to completing the task deactivate IntelliJ IDEA _Inspect Code..._ tool:<br>
_Tools Bar ➔ Settings ➔ Editor ➔ Inspections ➔ Uncheck 'Java' ➔ OK_.

### Install SonarLint
Prior to completing the task make sure you have installed _SonarLint_ IntelliJ IDEA plugin.

### Task description
1. Prior to completing the task run `main` method and study `SonarLint.java` mechanism. You will see that the code works, but it has some non-critical mistakes. Your task is to correct them.
2. Every Additional Method:
    - has a mistake that can be caught by SonarLint,
    - has clues on the id of the mistake which should be corrected.
3. Correct every mistake in the Additional Methods that can be caught by SonarLint and is mentioned in the clues referring to the given method.
4. Prior to the correction of every mistake in the Additional Methods, run SonarLint and identify the mistake to be corrected in SonarLint's suggestions. Run SonarLint the following way:<br>
   _Bottom Tools Bar ➔ SonarLint ➔ Analyze with SonarLing (green arrow-button)_
5. Do not change anything in the `main` method.
6. After the correction of all the mistakes, run SonarLint and make sure that it shows no mistakes which are required to be corrected.
