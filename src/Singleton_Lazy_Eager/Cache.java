package Singleton_Lazy_Eager;

public interface Cache <F,S>{

    public void put(F key, S value);
    public S get(F key);
}

