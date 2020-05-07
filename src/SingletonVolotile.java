
public class SingletonVolotile {
    private volatile static SingletonVolotile uniqueInstance;
    
    private SingletonVolotile() {}
    
    public static SingletonVolotile getInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonVolotile.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonVolotile();
                }
            }
        }
        return uniqueInstance;
    }
}
