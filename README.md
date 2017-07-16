# Fragment-ViewPager-ToolBar-Demo
大家请看博客：http://blog.csdn.net/shaoduo/article/details/75193852
一、概要

1.Fragment

相信大家对Fragment不陌生，使用Fragment，一方面Fragment依赖于Activity，需要再Activity 中安放一个Fragment的位置，另一方面，需要管理打点好Fragment的生命周期。Activity中有个FragmentManager，通过FragmentManager其内部维护fragment队列，以及fragment事务的回退栈。

2.ViewPager

ViewPager 的使用需要用到ViewPager以及它的适配器。 
 1.ViewPager的简介和作用 
 ViewPager是Android扩展包v4包中的类，这个类可以让用户左右切换当前的view 
 1）ViewPager类直接继承了ViewGroup类，所有它是一个容器类，可以在其中添加其他的view类。 
 2）ViewPager类需要一个PagerAdapter适配器类给它提供数据。 
 3）ViewPager经常和Fragment一起使用，并且提供了专门的FragmentPagerAdapter和FragmentStatePagerAdapter类供Fragment中的ViewPager使用。

2.ViewPager的适配器 
 简介中提到了PagerAdapter，和ListView等控件使用一样,需要ViewPager设置PagerAdapter来完成页面和数据的绑定，这个PagerAdapter是一个基类适配器，我们经常用它来实现app引导图，它的子类有FragmentPagerAdapter和FragmentStatePagerAdapter,这两个子类适配器用于和Fragment一起使用，在安卓应用中它们就像listview一样出现的频繁。

二、效果

app的主体样式分很多种， 比如说QQ是侧滑菜单+碎片，微信是可以滑动的碎片形式等等，接下来，我们就用 Fragment+ViewPager 来做一下微信的效果。 
这里写图片描述
