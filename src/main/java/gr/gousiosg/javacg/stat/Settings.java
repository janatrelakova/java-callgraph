package gr.gousiosg.javacg.stat;

import java.util.ArrayList;
import java.util.List;

public class Settings {
    public static List<String> includePackages = new ArrayList<>();

    public static boolean isExcluded(String packageName) {
        if (includePackages.isEmpty()) {
            return false;
        }
        for (String p : includePackages) {
            if (packageName.startsWith(p)) {
                return false;
            }
        }
        return true;
    }
}
