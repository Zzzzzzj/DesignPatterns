package com.zj;

import com.zj.shape.Circle;
import com.zj.shape.Rect;
import com.zj.shape.Shape;

/**
 * @author Pitttttt
 * @Classname SimpleFactory
 * @Description TODO
 * @Date 2020/4/30 0:12
 */
public class SimpleFactory {

    public static Shape create(String classname){
        if ("rect".equals(classname)) {
            return new Rect();
        }
        if ("circle".equals(classname)){
            return new Circle();
        }
        return null;
    }
}
