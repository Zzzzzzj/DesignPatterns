package com.zj;

import com.zj.shape.Shape;

/**
 * @author Pitttttt
 * @Classname App
 * @Description TODO
 * @Date 2020/4/30 0:17
 */
public class App {
    public static void main(String[] args) {
        Shape rect = SimpleFactory.create("rect");
        rect.draw();
    }
}
