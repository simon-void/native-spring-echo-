# native-spring-echo-kotlin

a minimal echo server (invoke http://localhost:8080/echo/any_msg )

Following this article https://spring.io/blog/2022/09/26/native-support-in-spring-boot-3-0-0-m5

## How to compile to native

### Preconditions

- make sure GraalVm is installed (`sdk install java 23.r20-nik`) by checking that `native-image` is available as a command. (of course this assumes that [sdk is installed](https://sdkman.io/install))
- make sure gcc is installed (`sudo apt-get install gcc`)
- on Ubuntu install libz-dev (`sudo apt-get install libz-dev`), if not on Ubuntu check the link in the troubleshooting section

### Compile Source
Compile to native by executing:
```
./gradlew nativeCompile
```

You should now be able to execute the native binary:
```
./build/native/nativeCompile/native-spring-echo-kotlin
```

## Troubleshooting

- if you get a BUILD FAILED with
```
/usr/bin/ld: cannot find -lz: No such file or directory
collect2: error: ld returned 1 exit status
```
check out this [StackOverflow](https://stackoverflow.com/questions/3373995/usr-bin-ld-cannot-find-lz)

**TLDR**: on Ubuntu do `sudo apt-get install libz-dev`