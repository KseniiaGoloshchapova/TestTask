package framework.settings;

import java.util.HashMap;
import java.util.Map;

public enum BrowserType {
    CHROME,
    FIREFOX,
    IE;

    private static Map<String, BrowserType> browsersMap = new HashMap<String, BrowserType>();

    static {
        browsersMap.put("chrome", BrowserType.CHROME);
        browsersMap.put("firefox", BrowserType.FIREFOX);
        browsersMap.put("ie", BrowserType.IE);
    }

    public static BrowserType Browser(String name) {
        return browsersMap.get(name.toLowerCase().trim());
    }
}
