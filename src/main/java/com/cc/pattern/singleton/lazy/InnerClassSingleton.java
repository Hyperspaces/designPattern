package com.cc.pattern.singleton.lazy;

public class InnerClassSingleton {

    private static InnerClassSingleton singleton;

    private InnerClassSingleton(){
        if(InnerClassSingletonHolder.singleton != null){
            throw new RuntimeException("单例已被创建..."+singleton);
        }
    }

    public static InnerClassSingleton getSingleton() {
        if(singleton == null){
            singleton = InnerClassSingletonHolder.singleton;
        }
        return singleton;
    }

    private Object readResolve(){
        return getSingleton();
    }

    private static class InnerClassSingletonHolder{
        private static final InnerClassSingleton singleton = new InnerClassSingleton();
    }
}
