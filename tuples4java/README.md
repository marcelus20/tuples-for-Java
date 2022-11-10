## To Install
```shell
git clone https://github.com/marcelus20/tuples-for-Java
```
Cd into ```tuples-for-Java/tuples4java``` module:
```shell
cd tuples-for-Java/tuples4java
```

Issue the *maven clean install* command:
```shell
mvn clean install
```
**PS: Make sure you cd into the module tuples4java, and not to the parent folder!**
Building from parent will build both modules (collectible-tuples4java and tuples4java), and since collectible-tuples4java
requires extra steps, the build will fail. 

After doing the above steps, you will be able to import this lib into your project:
```xml
    <dependency>
        <groupId>com.marcelus.tuples4java.tuples</groupId>
        <artifactId>tuples4java</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
```

---