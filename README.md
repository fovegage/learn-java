## Java学习笔记

### Java基础

```
# 面向对象设计之魂的六大原则
https://shusheng007.top/2020/02/15/%e9%9d%a2%e5%90%91%e5%af%b9%e8%b1%a1%e8%ae%be%e8%ae%a1%e4%b9%8b%e9%ad%82%e7%9a%84%e5%85%ad%e5%a4%a7%e5%8e%9f%e5%88%99/

# 开闭原则(Open-Closed Principle, OCP)
一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展。

# 里氏代换原则(Liskov Substitution Principle, LSP)
所有引用基类（父类）的地方必须能透明地使用其子类的对象（即面向抽象/接口编程）

# 单一职责（Single Responsibility Principle, SRP）
一个类应该只负责一个职责

# 依赖倒置原则（Dependence Inversion Principle, DIP）
抽象不应该依赖于细节，细节应当依赖于抽象
调用类不应依赖具体的实现类，而是依赖具体的抽象（就是使用接口或者抽象类进行一步抽离）
高层模块和低层模块都应该依赖于抽象，抽象不应该依赖于具体的实现。
抽象：java中的抽象类或者接口
细节：java中的具体实现类
高层模块：java中的调用类
低层模块：java中的实现类

# 迪米特原则（Least Knowledge Principle, LKP）
门面模式

# 接口隔离原则（Interface Segregation Principle, ISP）
接口最小化，可以实现多个小的接口，而不是一个大的汇总接口
```

![](imgs/img_1.png)
![](imgs/img.png)

### 设计模式

```
# 参考1
https://mp.weixin.qq.com/s/rcGwD306aZaXThVMm53t_A

# 参考2
https://shusheng007.top/2021/09/07/design-pattern/
```

### LeetCode

### spring boot

```
# 依赖注入（Dependency Injection，DI）
# 构造函数注入（Constructor Injection）：
通过对象的构造函数将依赖对象作为参数传入，容器在创建对象时自动解析依赖并提供所需的依赖对象。
# Setter 方法注入（Setter Injection）
通过对象的 setter 方法设置依赖对象，容器在创建对象后调用相应的 setter 方法来注入依赖对象。
# 接口注入（Interface Injection）
通过对象实现一个接口，在接口中定义注入方法，容器在创建对象后调用接口的注入方法来注入依赖对象。

# 控制反转（Inversion of Control，IoC）
容器负责对象的创建和生命周期的管理，而不是由代码自己创建和管理对象
```