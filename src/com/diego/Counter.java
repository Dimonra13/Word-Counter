package com.diego;

/**
 * Interface from which classes dedicated to counting elements of an input inherit.
 * Using this interface instead of the concrete classes allows to create more types of counter in the future
 * in a simpler way, thus facilitating the maintenance and evolution of the system.
 */
public interface Counter {
    public void count(String source);
}
