# soyosoyo

```soyosoyo``` is a test project that hopes to be a Numpy/SciPy for the JVM (Scala, Java, Kotlin), in 3-5 years (2025 timeframe). It seeks to fill the need for a performant (static-type, primitive backed) JVM framework, either for standalone use or as an optimizing supplement to commercial scientific packages such as Mathematica and Matlab.

It is inspired by the Scala/JVM project ```scalanlp/breeze``` ("soyosoyo" is the onomatopoeia for a light breeze, in Japanese). However, it tries to eliminate Scala fanciness from the core code and core implementations, and thereby:
  + ensure Java/Kotlin compatibility and interoperability
  + maximize primitive use to prevent Autoboxing
  + to make full use of JVM optimizations and speed benefits
  + to be fully accessible from commercial scientific programming packages such as Mathematica and Matlab. 
  
There are, of course, syntactic and algorithmic benefits that are only realizable in a backwards-compatibility-breaking language like Scala. Soyosoyo aims to capture these benefits by providing idiomatic Scala wrapper functions for each function, at each hierarchical level. The functionality of every package should be extensible and usable, in an idomatic function, with all three target JVM languages (Java, Scala, Kotlin).

In order to encapsulate version and compilation target issues, packages are divided relatively finely and hierarchically, and use JVM features which are cross-accessible:

+ ```soyosoyo-base``` [Kotlin and Java, built on Gradle]: core data types, and functionality:
    + Immutable (and mutable) array types as light wrappers around Kotlin ```ArrayShort```, ```ArrayInt```, ```ArrayLong```, ```ArrayFloat```, ```ArrayDouble```, ```ArrayBoolean```. 
    + In order to prevent autoboxing ((2)2 above) this module must be Kotlin, given that Scala 3/Dotty will seemingly deprecate @specialized annotations, and given that Java cannot control autoboxing unless you compile against JVM5 (pre boxing).
    + Provides basic matrix functions (aim for BLAS equivalent)... basically provides wrapper for [Apache commons-math](http://commons.apache.org/proper/commons-math/developers.html) (and [netlib-java update](https://github.com/fommil/netlib-java), if necessary).
    + Provides complex number support based on [Apache commons-math](http://commons.apache.org/proper/commons-math/developers.html) 
    + Provides light wrapper for Java primitive collections (?based on [Eclipse collections](https://www.eclipse.org/collections/))
    
+ ```soyosoyo-base-kotlin``` [Kotlin, built on Gradle]:: Provides Kotlin-specific syntactic sugar and slicing functions. Inherit from this instead of ```soyosoyo-base``` if downstream package is Kotlin-based.

+ ```soyosoyo-base-scala```: Provides Scala-specific syntactic sugar and slicing functions. Inherit from this instead of ```soyosoyo-base``` if downstream package is Scala-based (e.g. ```soyosoyo-graphics-scala```).

     + ```soyosoyo-graphics-scala``` [Scala, Kotlin and Java, built on SBT]: provide visualization fuctions, aim to reproduce basic functionality of the Wolfram Mathematica 2D graphics libraries, including movies, with publication-quality and highly-specifiable vector and bitmap outputs. Provide syntactic sugar for Scala.
     + ```soyosoyo-graphics-java``` [Java, built on Gradle]: syntactic sugar for ```soyosoyo-graphics-scala``` for Java
     + ```soyosoyo-graphics-kotlin``` [Java, Kotlin, built on Gradle]: very light wrapper of ```soyosoyo-graphics-java```
     
     + ```soyosoyo-graphics3D-scala``` [Scala, Kotlin and Java, built on SBT]: provide 3D visualization fuctions, aim to reproduce basic functionality of the Wolfram Mathematica 3D graphics libraries and 3D printout libraries, with publication-quality and highly-specifiable vector and bitmap outputs. Provide syntactic sugar for Scala.
     + ```soyosoyo-graphics3D-java``` [Java, built on Gradle]: syntactic sugar for ```soyosoyo-graphics3D-scala``` for Java
     + ```soyosoyo-graphics3D-kotlin``` [Java, Kotlin, built on Gradle]: very light wrapper of ```soyosoyo-graphics3D-java```
     
     + ```soyosoyo-stats-scala``` [Scala, Kotlin and Java, built on SBT]: provide statistical fuctions, aim to reproduce basic functionality of the Wolfram Mathematica statistic libraries with fine-grained options framework, reasonable defaults, and informative output.
     + ```soyosoyo-stats-java``` [Java, built on Gradle]: syntactic sugar for ```soyosoyo-graphics-scala``` without scala fanciness
     + ```soyosoyo-stats-kotlin``` [Kotlin, built on Gradle]: syntactic sugar for ```soyosoyo-graphics-scala``` without scala fanciness

     + ```soyosoyo-ml-scala``` [Scala, Kotlin and Java, built on SBT]: provide machine learning functions. ?Based on [DL4J](https://deeplearning4j.org/). Aims to provide fine-grained options framework, reasonable defaults, and informative output as in Wolfram Mathematica.
     + ```soyosoyo-ml-java``` [Java, built on Gradle]: syntactic sugar for ```soyosoyo-graphics-scala``` without scala fanciness
     + ```soyosoyo-ml-kotlin``` [Kotlin, built on Gradle]: syntactic sugar for ```soyosoyo-graphics-scala``` without scala fanciness

     + ```soyosoyo-notebook```: tbd, stand-alone Jupyter replacement, inspired by original Mathematica notebooks
     
