# Kamppis Overseer
An application for managing everything related to living in a shared apartment

## Requirements

[JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

## Development

#### Starting a development server
Everything below assumes that your current working directory is the project root directory.

To start a development server
```
./gradlew bootRun
```

To test that the server responds, either `curl` or open the following address in your browser.
It should display a "Hello World" message.
```
http://localhost:8080/
```

To run tests
```
./gradlew test
```

If there are problems with the build, e.g. it complains about ghost classes that shouldn't event exist anymore, do a clean
```
./gradlew clean
```

## Libraries used

* [Spring Boot](https://docs.spring.io/spring-boot/docs/1.5.3.RELEASE/reference/html/) for building a RESTful web application
* [JUnit 4](http://junit.org/junit4/) for testing
* [Mockito](http://site.mockito.org/) for mocking objects to help with testing

## Tips

Check [Javadoc reference guide](http://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html#referenceguide)
to see how to comment and use tags properly.

### Useful links

* [jEnv](http://www.jenv.be/) or [jabba](https://github.com/shyiko/jabba)
  * Java version management
* [jcenter](https://bintray.com/bintray/jcenter) package repository
  * Superset of Maven Central. Great place to look for dependencies.