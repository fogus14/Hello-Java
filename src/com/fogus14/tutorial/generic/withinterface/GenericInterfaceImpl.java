package com.fogus14.tutorial.generic.withinterface;

public class GenericInterfaceImpl<T> implements GenericInterface<T> {

    private T data;

    public GenericInterfaceImpl(T data) {
        this.data = data;
    }

    @Override
    public T getT() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
