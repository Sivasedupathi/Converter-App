
# Pre-requisites
* Java 1.8/1.11/1.15
* Gradle 6

# How to run the code

Please use the below commands to build and execute the code. 

gradle build

gradle bootrun

# Endpoints to use the service

Digit to RomanNumeral

http://localhost:8081/convert?value=4000 ---> Response : MMMM

RomanNumeral to Digit

http://localhost:8081/convert?value=MMMM ---> Response : 4000

Exception: 0 and negative values will throw error message 'Value should be between 1 and 4000' or 'Value should be between I and MMMM'.

# How to execute the unit tests

 `gradle clean test --no-daemon` will execute the unit test cases.

# Technology used

Java 8

Junit 5

Mockito

Spring-boot

Gradle

