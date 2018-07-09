# 《Java多线程编程核心技术》高洪岩著 机械工业出版社 2017年11月第一版

## 项目介绍
《Java多线程编程核心技术》示例代码

## 软件架构
全书共7章，这里章译为chapter，每个包的包名都对应的书中的“创建XX项目”，在Run或者Test类中会作相关的说明和解释

### 这里也给大家做一个导读，也是我自己读完本书写下那么多代码之后的总结：

我认为这本书是Java多线程的基础，但距离实际应用仍有距离，但这些Java基础知识也是不应该被忽略的！

#### 第一章 Java多线程技能:

介绍了Thread下所有方法的使用（如currentThread,sleep,interrupt等）。

#### 第二章 对象及变量的并发访问：

介绍了synchronized和volatile关键字的使用：用synchronized去同步对象、语句块、方法、类；用volatile关键字实现变量的线程外可见，达到和使用
synchronized同样但更高效的目的。

#### 第三章 线程间通信：

介绍了对象的wait()和notify()方法，Thread的join()方法，ThreadLocal类和InheritableThreadLocal类的使用，并通过他们让线程之间正确地通信。

#### 第四章 Lock的使用：

介绍了java.util.concurrent.locks包中ReentrantLock类，Condition类和ReentrantReadWriteLock类的使用，并用他们去更高效地完成synchronized和volatile关键字的工作。

#### 第五章 定时器Timer

介绍了java.util.Timer包中的Timer类的单线程环境下的使用（因为一些原因（阿里巴巴Java编码规范中提及），多线程环境下不应该去使用Timer类，
所以Timer类其实是不推荐使用的，它的替代者是ScheduledExecuteService）

#### 第六章 单例模式与多线程

介绍了在多线程环境下单例模式的正确实现

#### 第七章 拾遗增补

还没看完（2018年7月9日17:07:09）

## 使用说明

1. Java环境：JDK8 1.8.0_152
2. IDE:Intelij IDEA 2018.1.1    

## 参与贡献

1. 计划从从2018年7月2日开始，2018年7月13日完成全书的示例代码编写并掌握相关内容


## 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [http://git.mydoc.io/](http://git.mydoc.io/)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)