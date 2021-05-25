# Zircon

A fork of [Purpur](https://github.com/pl3xgaming/Purpur) made for testing patches

# Download

Compiled builds are available on [Actions](https://github.com/12emin34/Zircon/actions).

# License

All patches are licensed under the MIT license, unless otherwise noted in the patch headers.

See [pl3xgaming/Purpur](https://github.com/pl3xgaming/Purpur), and [jpenilla/Toothpick](https://github.com/jpenilla/Toothpick) for the license of material used by this project.

# API

NOTE: If you want to use the API you need to build the project!

Maven
```xml
<dependency>
    <groupId>me._12emin34.zircon</groupId>
    <artifactId>zircon-api</artifactId>
    <version>1.16.5-R0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

Gradle
```kotlin
dependencies {
    compileOnly("me._12emin34.zircon", "zircon-api", "1.16.5-R0.1-SNAPSHOT")
}
```

This also includes all API provided by upstream projects.

# Building

Clone the repo (CLONE, not download), and run these commands in the root directory to build:
```
./gradlew applyPatches
./gradlew build
```
Artifacts will be in build/libs

If you want to build a zirconclip jar (that you can distribute) run:
```
./gradlew paperclip
```