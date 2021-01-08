#### Skeleton for your cucumber tests
* Module buildSrc <br>
https://docs.gradle.org/current/samples/sample_jvm_multi_project_with_additional_test_types.html

* Module functional-testing
    * This module is for your tests
    * Tests are stored in **`test`** directory
    * **No `main` directory**
    * Working:
        * Rename as required e.g.:
            * service-a-tests
        * Add other modules, e.g.:
            * service-b-tests
            * service-a-perf-tests
            * service-a-nfr-tests
            * etc...

* Module library4test
    * Some common code for testing is here in **main** directory
    * Unit tests for this library are in **test** directory
    * Working:
        * Rename as required e.g.:
            * service-a-client
            * db-scheme-a-common
        * Add other modules: 
            * service-b-client
            * db-scheme-b-common

* Module library4test
    * All the testing configs are here

#### Running tests
Execute the task **`cucumber`** from the module **`functional-testing`** <br>
* Default test environment is **`dev`**
* To set different environment please specify **`-Ptest_env=$your_env`**
    * **Notice** that file should exist in this case: **`testing-config/src/main/resources/env-config/service-a-$your_env.properties`**

#### Reporting
* Yandex Allure engine is used
* After all tests execute task **`allureReport`** from the module **`functional-testing`**:
    * Report will be generated in the folder **`functional-testing/build/reports/allure-report`**
* A server like **`jetty`** is required for standalone report display
    * Possible to see a report with IntelliJ IDEA build-in server:
        * Open **`functional-testing/build/reports/allure-report/index.html`**
        * Open with your browser (right top corner of the editor)
        
#### Notes
* Stepdefs are in Java as there is no accurate Cucumber for Kotlin plugin for IntelliJ IDEA right now (02-jan-2021)
* Please use appropriate directories for your Java, Kotlin, etc code
* Rename **`myproject.library-conventions.gradle`** as you need, probably just **`library-conventions.gradle`** is acceptable accordingly to Gradle documentation
* Rename **`myproject.test-conventions.gradle`** as you need, probably just **`test-conventions.gradle`** is acceptable accordingly to Gradle documentation
* Order of renaming:
    1. Rename root project <br>
        1.1 Rename the directory before opening the project <br>
        1.2 Rename **`rootProject.name`** in settings.gradle <br>
        1.3 Give correct names to modules in settings.gradle <br>
    2. Rename modules directories accordingly (with Ctrl + F6 for IntelliJ IDEA) 
* Kotlin:
    * Version **`1.3.72`** is used as the most stable for 08-Jan-2021
    * Don't ignore Gradle output with warnings about incompatible versions
        * E.g. **`jackson-module-kotlin:2.12.x`** uses Kotlin **`1.4.x`** - so for Kotlin 1.3.72 **`jackson-module-kotlin:2.11.x`** has to be used