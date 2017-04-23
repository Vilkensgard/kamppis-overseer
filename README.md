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

## Tips

### Useful links

* [jEnv](http://www.jenv.be/) or [jabba](https://github.com/shyiko/jabba)
  * Java version management
* [jcenter](https://bintray.com/bintray/jcenter) package repository
  * Superset of Maven Central. Great place to look for dependencies.