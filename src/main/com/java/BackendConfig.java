package com.java;

// TODO SETUP THIS CLASS
public class BackendConfig extends TestBase {
    //  * Also, there is a BackendConfig class that holds all the information and configurations for backend tests
//         *  - add a variable configurations with a value of "Backend Test Configurations"
//         *  - override method 'initializeTestConfigurations'
//         *      * add a print line current 'configurations'
//         *      * add a print line message "Here I would add some backend configurations for database and other connections"
//         *  - override method 'hashCode' that returns 'testId'
//         *  - override method 'toString' and return information details:
//         *      * new line for "app name: " and call getAppName()
//         *      * new line for "test id: " get from 'testId'
//         *      * new line for "config: " and get from 'configurations'
//         *
    public String configurations = "Backend Test Configurations";

    @Override
    public void initializeTestConfigurations() {
        System.out.println(configurations);
        System.out.println("Here I would add some backend configurations for database and other connections");
    }

    @Override
    public int hashCode() {
        return testId;
    }

    @Override
    public String toString() {
        return "\n" + "app name: " + getAppName()
                + "\n" + "test id: " + testId
                + "\n" + "config: " + configurations;
    }


    @Override
    public boolean equals(Object o) {
        //return this.toString().equals(o.toString());
        return this.hashCode()==o.hashCode();
    }


}