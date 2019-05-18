#### abstract-factory pattern
---

##### 定义

抽象工厂模式一般来是是工厂相关模式的终极形态。它与工厂方法唯一的区别就是:
**工厂的接口里是一系列创造抽象产品的方法，而不再是一个，而相应的，抽象产品也不再是一个了，而是一系列相关的产品**

抽象工厂模式的定义：
> Provide an interface for creating families of related or dependent objects without specifying their concrete classess.

翻译成中文:
>为创建一组相关或者相互依赖的对象提供一个接口，而且无须指定它们的具体类

##### 类图

![](etc/abstract-factory.png)

##### 其他

其实`抽象工厂模式`就是`工厂方法`多了一个抽象的产品演化而来。

