package com.zj.factory;

import com.zj.shape.Circle;
import com.zj.shape.Shape;

/**
 * @author Pitttttt
 * @Classname CircleFactory
 * @Description TODO
 * @Date 2020/4/30 0:04
 */
public class CircleFactory implements Factory {
    public Shape create() {
        return new Circle();
    }
}
