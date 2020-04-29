package com.zj;

import com.zj.factory.Factory;
import com.zj.factory.RectFactory;
import com.zj.shape.Shape;

/**
 * @author Pitttttt
 * @Classname app
 * @Description TODO
 * @Date 2020/4/30 0:05
 */
public class App {
    public static void main(String[] args) {
        Factory factory = new RectFactory();
        Shape shape = factory.create();
        System.out.println(shape.draw());
    }
}
