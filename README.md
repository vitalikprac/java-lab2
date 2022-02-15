Прачов Віталій ТМ-82. Варіант - 16.

# Start
Using Maven you can provide execution arguments for running specific task
Available tasks: `task6`,`task11`,`task16`,`task21`,`task25`

For example running `task6`:
```bash
$ mvn package exec:java --quiet -DskipTests -Dexec.args=task6
```

Also, some task requires additional arguments.

For example to  run `task11`, you also need to passing aMin=`2`, aMax=`3`
and rest parameters as elements of input array `[1,2,3,4,5,6]`
```bash
$ mvn package exec:java --quiet -DskipTests "-Dexec.args=task11 2 3 1 2 3 4 5 6"
```

Also, for example to  run `task25`, you also need to passing day in year=`365` 
and boolean variable that indicates leap year = `true`
```bash
$ mvn package exec:java --quiet -DskipTests "-Dexec.args=task25 365 true"
```

# Tests
```bash
$ mvn test
```