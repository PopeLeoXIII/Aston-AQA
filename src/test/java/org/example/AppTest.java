package org.example;

import org.testng.TestNG;

class AppTest {

    public static void main(String[] strings) {
        final TestNG testNG = new TestNG(true);
        testNG.setTestClasses(new Class[] {FactorialTests.class});
        testNG.setExcludedGroups("optional");
        testNG.run();

//        try {
//            final TestNG testNG = new TestNG(true);
//            final Parser parser = new Parser("testng.xml");
//            final List<XmlSuite> suites = parser.parseToList();
//            testNG.setXmlSuites(suites);
//            testNG.run();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
