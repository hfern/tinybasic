package com.hfernandes.tinybasic.runtime.utils;


import org.antlr.v4.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TreeFilter {
    // returns a list of the parent's children matching a criteria
    public static <T> ArrayList<T> filter(Tree parent, Predicate<Tree> pred) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < parent.getChildCount(); i++) {
            Tree child = parent.getChild(i);
            if (pred.test(child)) {
                list.add((T) child);
            }
        }

        return list;
    }
}
