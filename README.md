# native-spring-echo-java

a minimal echo server (invoke http://localhost:8080/echo/any_msg )

Following this article https://spring.io/blog/2022/09/26/native-support-in-spring-boot-3-0-0-m5

## How to compile to native

Make sure GraalVm is installed (`sdk install java 22.2.r17-nik`) by checking that `native-image` is available as a command.

Compile to native by executing:
```
./gradlew nativeCompile
```

You should now be able to execute the native binary:
```
./build/native/nativeCompile/native-spring-echo-java
```

