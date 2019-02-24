package pl.sda.library.confiuration;

public class Configuration {

    private static Configuration instance;

    private Configuration(){
    }

    public static  Configuration getInstance(){ //synchronized
        if(instance ==null){
            instance=new Configuration();
        }
        return null ;
    }
}
