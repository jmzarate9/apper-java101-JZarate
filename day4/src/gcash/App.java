package gcash;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("09175861661", "Orvyl");
        users.put("09175861662", "Maria");
        users.put("09175861665", "Jobo");

        System.out.println(users.get("09175861661")); // Orvyl
        System.out.println(users.get("09175861662")); // Maria
        System.out.println(users.get("09175821661")); // null (key doesn't exists)

        for (Map.Entry<String, String> entry : users.entrySet()) {
            if(entry.getValue().equals("Orvyl")) {
                System.out.println(entry.getKey());

                break;
            }
        }
    }
}
