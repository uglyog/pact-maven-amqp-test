# pact-maven-amqp-test
Test project for message pact using Maven

## Step 1 - Run the consumer build

```console
$ cd consumer/
✔ ~/Development/Projects/Pact/pact-maven-amqp-test/consumer [master|✚ 1] 
13:59 $ mvn verify
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building consumer 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ consumer ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/consumer/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ consumer ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/consumer/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ consumer ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/consumer/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ consumer ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/consumer/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ consumer ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.github.uglyog.mavenamqp.ConsumerTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.785 s - in com.github.uglyog.mavenamqp.ConsumerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ consumer ---
[INFO] Building jar: /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/consumer/target/consumer-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.341 s
[INFO] Finished at: 2019-05-12T14:00:00+10:00
[INFO] Final Memory: 27M/403M
[INFO] ------------------------------------------------------------------------
```

This will generate a pact file in `consumer/target/pacts`.

## Step 2 - run the provider build

```console
14:00 $ cd ../provider/
✔ ~/Development/Projects/Pact/pact-maven-amqp-test/provider [master|✚ 1] 
14:01 $ mvn verify
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building provider 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ provider ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/provider/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ provider ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/provider/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ provider ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ provider ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ provider ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.github.uglyog.mavenamqp.ProviderTest

Verifying a pact between maven_message_consumer and maven_message_provider
  a test message
14:01:38.991 [main] DEBUG a.c.d.p.p.junit.target.AmqpTarget - Classloader = sun.misc.Launcher$AppClassLoader@5c647e05
14:01:38.993 [main] DEBUG a.c.d.p.p.ProviderVerifierBase - projectClasspath = [file:/home/ronald/.m2/repository/org/apache/maven/surefire/surefire-booter/2.22.1/surefire-booter-2.22.1.jar, file:/home/ronald/.m2/repository/org/apache/maven/surefire/surefire-api/2.22.1/surefire-api-2.22.1.jar, file:/home/ronald/.m2/repository/org/apache/maven/surefire/surefire-logger-api/2.22.1/surefire-logger-api-2.22.1.jar, file:/home/ronald/Development/Projects/Pact/pact-maven-amqp-test/provider/target/test-classes/, file:/home/ronald/Development/Projects/Pact/pact-maven-amqp-test/provider/target/classes/, file:/home/ronald/.m2/repository/junit/junit/4.12/junit-4.12.jar, file:/home/ronald/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar, file:/home/ronald/.m2/repository/org/hamcrest/hamcrest-all/1.3/hamcrest-all-1.3.jar, file:/home/ronald/.m2/repository/au/com/dius/pact-jvm-provider-junit_2.12/3.6.6/pact-jvm-provider-junit_2.12-3.6.6.jar, file:/home/ronald/.m2/repository/au/com/dius/pact-jvm-support/3.6.6/pact-jvm-support-3.6.6.jar, file:/home/ronald/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-jdk8/1.3.30/kotlin-stdlib-jdk8-1.3.30.jar, file:/home/ronald/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib/1.3.30/kotlin-stdlib-1.3.30.jar, file:/home/ronald/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-common/1.3.30/kotlin-stdlib-common-1.3.30.jar, file:/home/ronald/.m2/repository/org/jetbrains/annotations/13.0/annotations-13.0.jar, file:/home/ronald/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-jdk7/1.3.30/kotlin-stdlib-jdk7-1.3.30.jar, file:/home/ronald/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar, file:/home/ronald/.m2/repository/au/com/dius/pact-jvm-provider_2.12/3.6.6/pact-jvm-provider_2.12-3.6.6.jar, file:/home/ronald/.m2/repository/au/com/dius/pact-jvm-model/3.6.6/pact-jvm-model-3.6.6.jar, file:/home/ronald/.m2/repository/com/github/zafarkhaja/java-semver/0.9.0/java-semver-0.9.0.jar, file:/home/ronald/.m2/repository/com/amazonaws/aws-java-sdk-s3/1.11.30/aws-java-sdk-s3-1.11.30.jar, file:/home/ronald/.m2/repository/com/amazonaws/aws-java-sdk-kms/1.11.30/aws-java-sdk-kms-1.11.30.jar, file:/home/ronald/.m2/repository/com/amazonaws/aws-java-sdk-core/1.11.30/aws-java-sdk-core-1.11.30.jar, file:/home/ronald/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.6.6/jackson-databind-2.6.6.jar, file:/home/ronald/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.6.0/jackson-annotations-2.6.0.jar, file:/home/ronald/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.6.6/jackson-core-2.6.6.jar, file:/home/ronald/.m2/repository/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.6.6/jackson-dataformat-cbor-2.6.6.jar, file:/home/ronald/.m2/repository/joda-time/joda-time/2.8.1/joda-time-2.8.1.jar, file:/home/ronald/.m2/repository/com/amazonaws/jmespath-java/1.0/jmespath-java-1.0.jar, file:/home/ronald/.m2/repository/org/apache/commons/commons-collections4/4.1/commons-collections4-4.1.jar, file:/home/ronald/.m2/repository/com/github/mifmif/generex/1.0.2/generex-1.0.2.jar, file:/home/ronald/.m2/repository/dk/brics/automaton/automaton/1.11-8/automaton-1.11-8.jar, file:/home/ronald/.m2/repository/org/jetbrains/kotlin/kotlin-reflect/1.3.30/kotlin-reflect-1.3.30.jar, file:/home/ronald/.m2/repository/au/com/dius/pact-jvm-pact-broker/3.6.6/pact-jvm-pact-broker-3.6.6.jar, file:/home/ronald/.m2/repository/org/codehaus/groovy/groovy/2.5.6/groovy-2.5.6.jar, file:/home/ronald/.m2/repository/org/codehaus/groovy/groovy-json/2.5.6/groovy-json-2.5.6.jar, file:/home/ronald/.m2/repository/com/github/salomonbrys/kotson/kotson/2.5.0/kotson-2.5.0.jar, file:/home/ronald/.m2/repository/org/dmfs/rfc3986-uri/0.8/rfc3986-uri-0.8.jar, file:/home/ronald/.m2/repository/org/dmfs/iterators/1.5/iterators-1.5.jar, file:/home/ronald/.m2/repository/org/dmfs/optional/0.3/optional-0.3.jar, file:/home/ronald/.m2/repository/io/github/microutils/kotlin-logging/1.4.4/kotlin-logging-1.4.4.jar, file:/home/ronald/.m2/repository/au/com/dius/pact-jvm-matchers_2.12/3.6.6/pact-jvm-matchers_2.12-3.6.6.jar, file:/home/ronald/.m2/repository/io/gatling/jsonpath_2.12/0.6.10/jsonpath_2.12-0.6.10.jar, file:/home/ronald/.m2/repository/org/scala-lang/modules/scala-parser-combinators_2.12/1.0.6/scala-parser-combinators_2.12-1.0.6.jar, file:/home/ronald/.m2/repository/com/googlecode/java-diff-utils/diffutils/1.3.0/diffutils-1.3.0.jar, file:/home/ronald/.m2/repository/org/scala-lang/modules/scala-xml_2.12/1.0.6/scala-xml_2.12-1.0.6.jar, file:/home/ronald/.m2/repository/org/scala-lang/scala-library/2.12.7/scala-library-2.12.7.jar, file:/home/ronald/.m2/repository/com/typesafe/scala-logging/scala-logging_2.12/3.7.2/scala-logging_2.12-3.7.2.jar, file:/home/ronald/.m2/repository/org/atteo/evo-inflector/1.2.2/evo-inflector-1.2.2.jar, file:/home/ronald/.m2/repository/commons-io/commons-io/2.5/commons-io-2.5.jar, file:/home/ronald/.m2/repository/org/fusesource/jansi/jansi/1.17.1/jansi-1.17.1.jar, file:/home/ronald/.m2/repository/org/reflections/reflections/0.9.11/reflections-0.9.11.jar, file:/home/ronald/.m2/repository/org/javassist/javassist/3.21.0-GA/javassist-3.21.0-GA.jar, file:/home/ronald/.m2/repository/org/scala-lang/modules/scala-java8-compat_2.12/0.9.0/scala-java8-compat_2.12-0.9.0.jar, file:/home/ronald/.m2/repository/org/apache/httpcomponents/fluent-hc/4.5.5/fluent-hc-4.5.5.jar, file:/home/ronald/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar, file:/home/ronald/.m2/repository/org/apache/httpcomponents/httpclient/4.5.5/httpclient-4.5.5.jar, file:/home/ronald/.m2/repository/org/apache/httpcomponents/httpcore/4.4.9/httpcore-4.4.9.jar, file:/home/ronald/.m2/repository/commons-codec/commons-codec/1.10/commons-codec-1.10.jar, file:/home/ronald/.m2/repository/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar, file:/home/ronald/.m2/repository/org/jooq/jool/0.9.14/jool-0.9.14.jar, file:/home/ronald/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar, file:/home/ronald/.m2/repository/com/github/rholder/guava-retrying/2.0.0/guava-retrying-2.0.0.jar, file:/home/ronald/.m2/repository/com/google/guava/guava/27.1-jre/guava-27.1-jre.jar, file:/home/ronald/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar, file:/home/ronald/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar, file:/home/ronald/.m2/repository/org/checkerframework/checker-qual/2.5.2/checker-qual-2.5.2.jar, file:/home/ronald/.m2/repository/com/google/errorprone/error_prone_annotations/2.2.0/error_prone_annotations-2.2.0.jar, file:/home/ronald/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar, file:/home/ronald/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.17/animal-sniffer-annotations-1.17.jar, file:/home/ronald/.m2/repository/javax/mail/mail/1.5.0-b01/mail-1.5.0-b01.jar, file:/home/ronald/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar, file:/home/ronald/.m2/repository/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar, file:/home/ronald/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar, file:/home/ronald/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar, file:/home/ronald/.m2/repository/org/apache/maven/surefire/surefire-junit4/2.22.1/surefire-junit4-2.22.1.jar]
14:01:40.382 [main] DEBUG a.c.d.p.p.ProviderVerifierBase - Found annotated method public java.lang.String com.github.uglyog.mavenamqp.ProviderTest.generateTestMessage()
14:01:40.382 [main] DEBUG a.c.d.p.p.ProviderVerifierBase - Found annotation @au.com.dius.pact.provider.PactVerifyProvider(value=a test message)
    generates a message which
14:01:40.780 [main] DEBUG a.c.d.pact.matchers.JsonBodyMatcher - compareValues: No matcher defined for path List($, type), using equality
14:01:40.782 [main] DEBUG a.c.d.pact.matchers.JsonBodyMatcher - compareValues: Matcher defined for path List($, value)
14:01:40.785 [main] DEBUG a.c.d.pact.matchers.MatcherExecutor - comparing type of 13412 to an integer at [$, value]
      has a matching body (OK)
      has matching metadata (OK)
14:01:40.791 [main] DEBUG a.c.d.p.p.DefaultTestResultAccumulator - Received test result 'au.com.dius.pact.pactbroker.TestResult$Ok@1cfa4ad9' for Pact maven_message_provider-maven_message_consumer and a test message
14:01:40.792 [main] DEBUG a.c.d.p.p.DefaultTestResultAccumulator - All interactions for Pact maven_message_provider-maven_message_consumer are verified
14:01:40.793 [main] WARN  a.c.d.p.p.DefaultTestResultAccumulator - Skipping publishing of verification results as it has been disabled (pact.verifier.publishResults is not 'true')
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.895 s - in com.github.uglyog.mavenamqp.ProviderTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ provider ---
[INFO] Building jar: /home/ronald/Development/Projects/Pact/pact-maven-amqp-test/provider/target/provider-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 5.389 s
[INFO] Finished at: 2019-05-12T14:01:41+10:00
[INFO] Final Memory: 27M/491M
[INFO] ------------------------------------------------------------------------
```
