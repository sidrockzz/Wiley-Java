import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;

public class OS_SId {
    public static void main(String [] args){
        System.out.println("OS name: "+System.getProperty("os.name").toLowerCase(Locale.ROOT) );
        System.out.println("version: "+System.getProperty("java.runtime.version" ));
        System.out.println("name: "+System.getProperty("user.name" ));
        System.out.println("user.dir: "+System.getProperty("user.dir"));
        System.out.println("Java path: "+System.getProperty("java.home"));
        System.out.println("Java Version: "+System.getProperty("java.vm.version"));
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
    }
}
