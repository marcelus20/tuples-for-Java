## To Install

### This Module is dependent on [marcelus20/jvalidators](https://github.com/marcelus20/jvalidators) lib! Please, follow the steps on this [jvalidators readme file](https://github.com/marcelus20/jvalidators#readme).

Once installed marcelus20/jvalidators, go ahead with the bellow steps: 
```shell
git clone https://github.com/marcelus20/tuples-for-Java
```
Cd into ```tuples-for-Java/tuples4java``` module:
```shell
cd tuples-for-Java/collectible-tuples4java
```

Issue the *maven clean install* command:
```shell
mvn clean install
```

After doing the above steps, you will be able to import this lib into your project:
```xml
    <dependency>
        <groupId>com.marcelus.tuples4java.collectibletuples</groupId>
        <artifactId>collectible-tuples4java</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
```

---