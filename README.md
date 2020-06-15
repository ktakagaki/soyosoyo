# soyosoyo

```soyosoyo``` is a test project that hopes to be a Numpy/SciPy for the JVM (Scala, Java, Kotlin), in 3-5 years (2025 timeframe). It seeks to fill the need for a performant (static-type, primitive backed) JVM framework, either for standalone use or as an optimizing supplement to commercial scientific packages such as Mathematica and Matlab.

It is inspired by the Scala/JVM project ```scalanlp/breeze``` ("soyosoyo" is the onomatopoeia for a light breeze, in Japanese). However, it tries to eliminate Scala fanciness from the core code and core syntax, and thereby:
  + ensure Java/Kotlin compatibility and interoperability
  + maximize primitive use to prevent Autoboxing
  + to make full use of JVM optimizations and speed benefits
  + to be fully accessible from commercial scientific programming packages such as Mathematica and Matlab. 
  
There are, of course, syntactic and algorithmic benefits that are only realizable in a backwards-compatibility-breaking language like Scala. Soyosoyo aims to capture these benefits by providing idiomatic Scala wrapper functions for each function, at the appropriate level. However, 

In order to avoid Scala version issues, packages are divided relatively finely and hierarchically, and use different JVM languages and mechanisms:

1. ```soyosoyo-base``` [Kotlin and Java, built on Gradle]: core data types, and functionality:
    + Immutable (and mutable) array types as light wrappers around Kotlin ArrayShort, ArrayInt, ArrayLong, ArrayFloat, ArrayDouble, ArrayBoolean. 
    + In order to prevent autoboxing ((2)2 above) this module must be Kotlin, given that Scala 3/Dotty will seemingly deprecate @specialized annotations, and given that Java cannot control autoboxing unless you compile against JVM5 (pre boxing).
    + Provides wrapper for [Apache commons-math](http://commons.apache.org/proper/commons-math/developers.html) (and [netlib-java update](https://github.com/fommil/netlib-java), if necessary)
    + Provides light wrapper for Java primitive collections (?[]())
1. ```soyosoyo-base-kotlin``` [Kotlin, built on Gradle]:: Provides Kotlin-specific syntactic sugar and slicing functions. Inherit from this instead of ```soyosoyo-base``` if downstream package is Kotlin-based.
1. ```soyosoyo-base-scala```: Provides Scala-specific syntactic sugar and slicing functions. Inherit from this instead of ```soyosoyo-base``` if downstream package is Scala-based


     1. ```soyosoyo-core``` []
