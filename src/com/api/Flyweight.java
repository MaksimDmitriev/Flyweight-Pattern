package com.api;

// declares an interface through which flyweights can receive and act on extrinsic state
public interface Flyweight {

    void operation(ExtrinsicState extrinsicState);
}
