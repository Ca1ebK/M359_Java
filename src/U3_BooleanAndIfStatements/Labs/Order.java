package U3_BooleanAndIfStatements.Labs;

public class Order {

    private String order;
    private String customerName;
    private boolean isDiscount;
    private double discountPercent;
    private double taxPercentRate;
    private double subtotal;

    private final double BURGER_COST = 10.99;
    private final double PIZZA_COST = 12.99;
    private final double PASTA_COST = 8.99;
    private final double SALAD_COST = 6.99;

    // no discount
    public Order(String customer, double tax) {
        customerName = customer;
        taxPercentRate = tax;
        discountPercent = 0;
        isDiscount = false;
        order = "";
    }

    public Order(String customer, double tax, double discount) {
        customerName = customer;
        taxPercentRate = tax;
        isDiscount = true;
        discountPercent = discount;
        order = "";
    }

    public void addItem(String food, int quantity) {

        String foodItem = food.toLowerCase();
        String burger = "burger".toLowerCase();
        String pizza = "pizza".toLowerCase();
        String pasta = "pasta".toLowerCase();
        String salad = "salad".toLowerCase();

        if (quantity > 0) {
            if (foodItem.equals(burger)) {
                String output = "Ordered " + quantity + " Burger(s)";
                order += output + "\n";
                subtotal += quantity * BURGER_COST;
            }
            else if (foodItem.equals(pasta)) {
                String output = "Ordered " + quantity + " Pasta(s)";
                order += output + "\n";
                subtotal += quantity * PASTA_COST;
            }
            else if (foodItem.equals(salad)) {
                String output = "Ordered " + quantity + " Salad(s)";
                order += output + "\n";
                subtotal += quantity * SALAD_COST;
            }
            else if (foodItem.equals(pizza)) {
                String output = "Ordered " + quantity + " Pizza(s)";
                order += output + "\n";
                subtotal += quantity * PIZZA_COST;
            }
            else {
                order += "Sorry, " + food + " is not on the menu.\n";
            }
        }
        else {
            order += "Sorry, " + foodItem + " quantity must be greater than 0.\n";
        }
    }

    public String toString() {
        String str = "";
        double amountSaved = subtotal * discountPercent;

        str += "------ " + customerName + " ------";
        str += "\n";

        str += order;

        str += "Subtotal:\t\t$" + subtotal + "\n";

        if (isDiscount == true) {
            str += "\tDiscount:    " + (discountPercent * 100) + "%\n";
            str += "\tYou saved:   $" + amountSaved + "\n";
        }

        str += "Tax  (" + taxPercentRate + "%):    " + ((subtotal - amountSaved) * (taxPercentRate)) + "\n";
        str += "Total:\t\t$" + ((subtotal - amountSaved) + ((subtotal - amountSaved) * (taxPercentRate)));


        return str;
    }

}