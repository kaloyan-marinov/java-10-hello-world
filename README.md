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



Since `pom.xml` uses the `spring-boot-starter-parent`,
we have a useful `run` goal that we can use to start the application:
```shell
$ mvn spring-boot:run
# ...

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.1.0)

2026-07-16T22:05:18.889+02:00  INFO 75450 --- [           main] com.github.MyApplication                 : Starting MyApplication using Java 25.0.3 with PID 75450 (<path-to>/tutorial-about-java-10/target/classes started by kaloyan in <path-to>/tutorial-about-java-10)
2026-07-16T22:05:18.891+02:00  INFO 75450 --- [           main] com.github.MyApplication                 : No active profile set, falling back to 1 default profile: "default"
2026-07-16T22:05:19.118+02:00  INFO 75450 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-07-16T22:05:19.123+02:00  INFO 75450 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-16T22:05:19.123+02:00  INFO 75450 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.22]
2026-07-16T22:05:19.138+02:00  INFO 75450 --- [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 229 ms
2026-07-16T22:05:19.242+02:00  INFO 75450 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2026-07-16T22:05:19.243+02:00  INFO 75450 --- [           main] com.github.MyApplication                 : Started MyApplication in 0.479 seconds (process running for 0.607)
# ...
```

(Either visit `localhost:8080` in your web browser
or) Use another terminal window to issue the following HTTP request:
```shell
$ curl localhost:8080
Hello World!
```
