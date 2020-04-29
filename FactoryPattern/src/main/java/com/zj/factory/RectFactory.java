package com.zj.factory;

import com.zj.shape.Shape;
import com.zj.shape.Rect;

/**
 * @author Pitttttt
 * @Classname RectFactory
 * @Description TODO
 * @Date 2020/4/30 0:03
 */
public class RectFactory implements Factory {
    public Shape create() {
        return new Rect();
    }
}
