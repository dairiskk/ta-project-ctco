## To install all dependencies, run ##

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```
Or

```console
mvn clean test -Dcucumber.options="src/test/resources/Features --tags @TA_SKILL_COUNT"
```

## Note ##

You need to have chrome version locally installed that is comparable with chromedriver (85.0.4183.87)