# soyosoyo

```soyosoyo``` is a test project that hopes to be a Numpy/SciPy for the JVM (Scala, Java, Kotlin), in 3-5 years (2025 timeframe).

It is inspired by the Scala/JVM project ```scalanlp/breeze``` ("soyosoyo" is the onomatopoeia for a light breeze, in Japanese). However, it tries to eliminate Scala fanciness from the core code, to (1) ensure Java/Kotlin compatibility, (2) maximize primitive use to prevent Autoboxing, (3) to make full use of JVM optimizations and speed benefits, and (4) to be fully accessible from commercial scientific programming packages such as Mathematica and Matlab. There are, of course, language benefits that are only realizable in a backward-breaking language like Scala. Soyosoyo aims to capture these benefits by providing idiomatic Scala wrapper functions.


In order to avoid Scala version issues, packages are divided relatively finely and hierarchically, and use different JVM languages and mechanisms:

1. ```soyosoyo-base``` (Kotlin and Java): core data types, and functionality:
    + Immutable (and mutable) array types as light wrappers around Kotlin ArrayShort, ArrayInt, ArrayLong, ArrayFloat, ArrayDouble, ArrayBoolean. 
    + In order to prevent autoboxing ((2)2 above) this module must be Kotlin, given that Scala 3/Dotty will seemingly deprecate @specialized annotations, and given that Java cannot control autoboxing unless you compile against JVM5 (pre boxing).
    + Provides wrapper for (Apache commons-math)[http://commons.apache.org/proper/commons-math/developers.html] (and (netlib-java update)[https://github.com/fommil/netlib-java], if necessary) 

    1. ```soyosoyo-sugar``` (Kotlin/Scala 2 on SBT): slicing and other array indexing/delayed computation constructs, with DSL capability for .

        1. ```soyosoyo-+ Primitive collections classes (adapted from xxxx) 
    `soyosoyo-core` will provide basic POJ 
