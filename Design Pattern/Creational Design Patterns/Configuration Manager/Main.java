public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();

        manager1.setConfig("New Configuration");
        System.out.println(manager2.getConfig());
    }
}
