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

#### Running tests
Execute task **`cucumber`** from the module **`functional-testing`**

#### Reporting
* Yandex Allure engine is used
* After all tests run execute task **`allureReport`** from the module **`functional-testing`**:
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