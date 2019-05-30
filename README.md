# learn kotlin

Convert in kotlin [JavaSAMT](https://github.com/giuliobosco/JavaSAMT), the Java couse of the school SAMT.

## Kotlin

**File**

_hello.kt_

```kotlin
fun main(args: Array<String>) {
	println("Hello, World!")
}
```

**Compile**

On shell:
```bash
kotlinc hello.kt -include-runtime -d hello.jar
```

**Run**

On shell:

```bash
java -jar hello.jar
```
