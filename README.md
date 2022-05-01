# Zircon

A bleeding-edge fork of [Purpur](https://github.com/pl3xgaming/Purpur) containing patches pending contribution to Purpur and some other misc stuff I might be working on.

I give no guarantee of stability of this patch-set, use at your own discretion.

# Download

Compiled builds are available on [Actions](https://github.com/12emin34/Zircon/actions).

# License

All patches are licensed under the MIT license, unless otherwise noted in the patch headers.

See [PurpurMC/Purpur](https://github.com/PurpurMC/Purpur), and [PaperMC/paperweight](https://github.com/PaperMC/paperweight) for the license of material used by this project.

# API

NOTE: If you want to use the API you need to build the project!

Maven
```xml
<dependency>
    <groupId>me._12emin34.zircon</groupId>
    <artifactId>zircon-api</artifactId>
    <version>1.17.1-R0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

Gradle
```kotlin
dependencies {
    compileOnly("me._12emin34.zircon", "zircon-api", "1.17.1-R0.1-SNAPSHOT")
}
```

This also includes all API provided by upstream projects.

# Building

Clone the repo (CLONE, not download), and run these commands in the root directory to build a paperclip jar that you can distribute:
```
./gradlew applyPatches
./gradlew paperclipJar
```