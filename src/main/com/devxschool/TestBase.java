package com.devxschool;

// TODO SETUP THIS CLASS
public class TestBase {
    //There is a parent class - TestBase, that should hold
//         *  - 'appName' info as a String "DevXSchool Application Test Base"
//         *  - 'getAppName' method, so it can provide application name
//         *  - 'configurations' string reference that holds a value of "Base Test Configurations"
//         *  - 'initializeTestConfigurations' method, to initialize and print current 'configurations' of a class
//         *  - 'testId' integer variable with a value of a 100
//         *  - 'hashCode' method that will be overridden from a parent class with the 'testId'
    public String appName = "DevXSchool Application Test Base";
    public String configurations;
    public int testId = 100;

    public String getAppName() {
        return appName;
    }

    public int getTestId() {
        return testId;
    }

    public void initializeTestConfigurations() {
        configurations = "Base Test Configurations";
        System.out.println(this.configurations);
    }

    public int hashCode() {
        return testId;
    }


    /*@Override
    public String toString() {
        return "\n" + "app name: " + getAppName()
                + "\n" + "test id: " + testId
                + "\n" + "config: " + configurations;
    }*/

    /*@Override
    public boolean equals(Object o) {
        //return this.toString().equals(o.toString());
       return this.hashCode()==o.hashCode();
    }*/

}
