## 桥接模式

### 说明

```
Bank: 这个抽象类可以理解为 银联
Acount: 可以理解为 银联规定发放的账户类型，它是一个标准

如何让 Bank 和 Account 产生联系呢?

组合实现 contains-a 关系
account 指向 bank
```