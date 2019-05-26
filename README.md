# design-pattern-hz
Simple Desc :  Learn design patterns .....

#### Design Patterns Principle

* SRP  `单一职责原则`  
**每个类都只负责单一的功能，切不可多，并且一个类尽量把功能做到极致**
* LSP  `里氏替换原则`  
**一个子类应该可以替换掉父类并且可以正常工作**
* ISP  `接口隔离原则`  
**也叫接口最小化原则，强调一个接口拥有的行为尽可能的小**
* DIP  `依赖倒置原则`  
**高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象(说白了，就是依赖接口)**
* LoD  `迪米特法则`   
**也叫最小知道原则，即一个类应该尽量不要知道其他类太多的东西**
* OCP  `开-闭原则`    
**对修改关闭，对扩展开放**

> 以上统称为 *SOLID*

#### Gradle Dependencies

```xml
compile 'org.slf4j:slf4j-log4j12:1.7.25'
compile 'org.slf4j:slf4j-api:1.7.25'
compile 'ch.qos.logback:logback-classic:1.1.7'
compile 'ch.qos.logback:logback-core:1.1.7'
annotationProcessor 'org.projectlombok:lombok:1.18.2'
compile 'org.projectlombok:lombok:1.18.2'
compile 'com.google.guava:guava:23.0'
testAnnotationProcessor 'org.projectlombok:lombok:1.18.2'
testCompile 'org.projectlombok:lombok:1.18.2'
testCompile 'junit:junit:4.4'
testCompile 'org.junit.jupiter:junit-jupiter-api:5.0.2'
testCompile 'org.junit.jupiter:junit-jupiter-engine:5.0.2'
testCompile 'org.mockito:mockito-core:1.10.19'
```
