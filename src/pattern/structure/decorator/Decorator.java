package pattern.structure.decorator;

/**
 * 🔹 Advantages:
 * Flexible: Add or remove responsibilities at runtime.
 * Avoids subclass explosion.
 * Follows Single Responsibility Principle.
 */
public class Decorator {
    interface Coffee {
        double getCost();
        String getDescription();
    }
    static class SimpleCoffee implements Coffee {
        @Override
        public double getCost() {
            return 5.0;
        }

        @Override
        public String getDescription() {
            return "Simple Coffee";
        }
    }
    static abstract class CoffeeDecorator implements Coffee {
        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public double getCost() {
            return coffee.getCost();
        }

        @Override
        public String getDescription() {
            return coffee.getDescription();
        }
    }
    static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double getCost() {
            return super.getCost() + 1.5;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", Milk";
        }
    }

    static class SugarDecorator extends CoffeeDecorator {
        public SugarDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double getCost() {
            return super.getCost() + 0.5;
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", Sugar";
        }
    }
    public class CoffeeShop {
        public static void main(String[] args) {
            Coffee coffee = new SimpleCoffee();
            System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

            coffee = new MilkDecorator(coffee);
            System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

            coffee = new SugarDecorator(coffee);
            System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());
        }
        /**
         * output:
         * Simple Coffee | Cost: $5.0
         * Simple Coffee, Milk | Cost: $6.5
         * Simple Coffee, Milk, Sugar | Cost: $7.0
         */
    }

}
