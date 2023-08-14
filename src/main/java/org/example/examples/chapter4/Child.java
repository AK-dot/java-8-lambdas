package org.example.examples.chapter4;

public interface Child extends Parent {

    @Override
    public default void welcome() { message("Child: Hi!"); }

}
