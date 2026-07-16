```shell
$ java --version
openjdk 25.0.3 2026-04-21 LTS
OpenJDK Runtime Environment Temurin-25.0.3+9 (build 25.0.3+9-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.3+9 (build 25.0.3+9-LTS, mixed mode, sharing)

$ mvn -v
Apache Maven 3.9.16 (2bdd9fddda4b155ebf8000e807eb73fd829a51d5)
Maven home: ~/.sdkman/candidates/maven/current
Java version: 25.0.3, vendor: Eclipse Adoptium, runtime: ~/.sdkman/candidates/java/25.0.3-tem
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "15.7.4", arch: "aarch64", family: "mac"
```


```shell
$ mvn package
# ...
[INFO] No tests to run.
[INFO] 
[INFO] --- jar:3.5.0:jar (default-jar) @ tutorial-about-java-10 ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO] Building jar: <path-to>/tutorial-about-java-10/target/tutorial-about-java-10-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.373 s
[INFO] Finished at: 2026-07-16T21:45:51+02:00
[INFO] ------------------------------------------------------------------------
```
(for now, you can ignore the `[WARNING]`)
