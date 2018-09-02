Whitaker's Words for Android
============================

[![Build Status](https://travis-ci.org/ids1024/whitakers-words-android.svg?branch=master)](https://travis-ci.org/ids1024/whitakers-words-android)

[`words`](http://archives.nd.edu/whitaker/words.htm) is a dictionary and morphological analysis tool by Colonel William Whitaker for Latin that accepts words of any form and gives the case/tense/etc. along with a short definition. This app provides a native Android interface that wraps the original command line program.

License
-------

Whitaker's Ada code is under the license in the [`words.LICENSE`](words.LICENSE) file, while all the code here is under the [MIT license](LICENSE).

Compiling
---------

### Building the words executable and data files

Building the Ada code is problematic, since Android's NDK only supports C and C++. The `words` directory has scripts for building a copy of GCC with Ada support, targeting Android. Moreover, it has data files that need to be build, and potentially differ by architecture. So the build script here uses `qemu` to generate those.

To provide such I toolchain, I've built a [docker image](https://hub.docker.com/r/ids1024/ada-android/), which you can download and use, or [build yourself](https://github.com/ids1024/ada-android-docker) (given enough CPU time and disk space).

A compiled version of words 1.97FC is included in assets/words. Or you can run `./build-words-docker.sh` to download the docker image and build words.

### Compiling the app

This uses the standard gradle build system for Android, so any documentation on that will apply, or you can use Android Studio.

For instance, `./gradlew installDebug` will build the app and install it on your device.
