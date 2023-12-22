package com.fubukiss.rikky.common;

/**
 * @author 86152
 * @version 1.0
 * Create by 2023/12/23 1:51
 */
public class BaseContext {
    private static final ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static long getCurrentId() {
        return threadLocal.get();
    }
}