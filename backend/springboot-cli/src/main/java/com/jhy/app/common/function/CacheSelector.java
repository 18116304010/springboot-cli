package com.jhy.app.common.function;

@FunctionalInterface
public interface CacheSelector<T> {
    T select() throws Exception;
}
