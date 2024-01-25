   Static Parameterization in cucumber
   ===================================
   1. In the feature file pass a data in single qoute('') in the test steps

   2. In the step definition package, where the test step is already mapped with test script. Here replace {string} with input data

   3. Add input arguments to the method test script.

   4. Remove the hardcored data/value with variable.


   Background keyword in cucumber
   ==============================
    - It is used to reduce the test steps which is written in the same feture file 
    - What are pre common steps available in the all different scenario , can able to use by Background

    syntax
    ------
      After the Feature and before all the scenario 

      Background:
      here write the common test steps

   Hooks Implementation
   ====================
   1. In projectSpecificMethod declare a two methods preCondition and postCondition 

   2. Use TestNG annotation @BeforeMethod for preCondition() and @AfterMethod annotation for postCondition()

   3. All the stepDefinition class extends with ProjectSpecificMethod

   4. All the runner class should extends with projectSpecificMethod

   5. ProjectSpecificMethod Should extends with AbstractTestNGCucumberTests


Dynamic Parameterization in Cucumber
====================================

1. In the feature file use Scenario Outline instead od Scenario 

2. Add Examples after/under the Scenario Outline

3. Add <> add in the test step for dynamic parameter.

4. In the Examples design a pipeline (|| ) inside the pipeline provide a header which is written/defined in the test step<>

5. In the Step Definition instead of <> provide/replace object --> (.*)$

6. Add a input arguments for the method 

7. Remove the hard cored data and use variable.


tags in cucumber
================

   - cucumber tags are user defined tags , will create our own custom tags in cucumber.
   - able to add multiple tags for single Scenario/ Scenario Outline.
