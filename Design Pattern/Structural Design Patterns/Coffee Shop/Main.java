public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}
