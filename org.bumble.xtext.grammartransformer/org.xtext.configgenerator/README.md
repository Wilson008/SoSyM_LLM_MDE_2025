# Foreword
This Eclipse project implements the ConfigGenerator. We developed it based on the Xtext grammar optimization tool GrammarOptimizer.
GrammarOptimizer is introduced by the authors Zhang et al. in paper http://dx.doi.org/10.2139/ssrn.4379232 .

# How to use ConfigGenerator?
ConfigGenerator contains only one Eclipse project which is called ` org.xtext.configgenerator`. This project should be used together with the Eclipse projects of the GrammarOptimizer.

There is a folder in this project which is called `grammar`. Under folder `grammar`, there are three sub-folders, i.e., `config`, `generated`, `target`. The sub-folder `generated` should contain the text file of the generated grammar, while `target` is the one to store  the text file of the target grammar.

Grammar files for multiple languages can be stored in these folders, but please make sure to tell ConfigGenerator which language or languages it should use to extract optimization rule configurations. That is done by specifying the language name in the `main()` method in class `ConfigGenerator`.

When ConfigGenerator is started as a Java application, it will generate a config file in the sub-folder `config` if everything goes normally. If ConfigGenerator terminates without an error message but you don't see the config file, please refresh the Eclipse project. 
The generated config file is usually named `Config_{language name}.txt`.

# How to use the extracted optimization rule config?

Since the target grammar is already there, we want to see the optimized grammar as well as the comparison between it and the target grammar. The best way is to use the existing test project in GrammarOptimizer.
The method to use the test project of the GrammarOptimizer is as follows (take EAST-ADL-FULL as an example):

* Open the extracted config `Config_EAST-ADL-FULL` and copy all text to the clipboard.
* Open the class `AdaptingEastAdlFullTest` in the test project of GrammarOptimizer. Remove the lines netween `go.processGrammar(input);` and `String actualOutput = go.spliceGrammar();`. Instead paste the copied texts in this position. 
* Uncomment the line `//FileHelper.setFileText("Test_EastAdlFull11.txt", actualOutput);`
* Then right-click in the file, and press `Run As` -> `Junit Test`. You will see the test result of comparison. If the optimized grammar is identical to the target grammar, JUnit will show green to you, otherwise show red. 
* The optimized grammar is stored in the sub-folder `output` and is called `Test_EastAdlFull1.txt`. The sub-folder `output` is in the folder `testresources` in the test project.
