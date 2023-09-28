// Caleb Kang
// Mrs. Denna
// Period 8

package U3_BooleanAndIfStatements.Labs;

public class Order {

    private String order;
    private String customerName;
    private boolean isDiscount;
    private double discount;
    private double tax;
    private double subtotal;

    private final double BURGER_COST = 10.99;
    private final double PIZZA_COST = 12.99;
    private final double PASTA_COST = 8.99;
    private final double SALAD_COST = 6.99;


    // no discount
    public Order(String customer, double tax) {
        this.customerName = customer;
        this.tax = tax;
        this.isDiscount = false;
        this.discount = 0.0;
        this.order = "";
    }

    public Order(String customer, double tax, double discount) {
        this.customerName = customer;
        this.tax = tax;
        this.isDiscount = true;
        this.discount = discount;
        this.order = "";
    }

    public void addItem(String food, int quantity) {

        String foodItem = food.toLowerCase();

        if (quantity > 0) {
            if (foodItem.equals("burger")) {
                order +=  "Ordered " + quantity + " Burger(s)\n";
                subtotal += quantity * BURGER_COST;
            }
            else if (foodItem.equals("pasta")) {
                order += "Ordered " + quantity + " Pasta(s)\n";
                subtotal += quantity * PASTA_COST;
            }
            else if (foodItem.equals("salad")) {
                order += "Ordered " + quantity + " Salad(s)\n";
                subtotal += quantity * SALAD_COST;
            }
            else if (foodItem.equals("pizza")) {
                order += "Ordered " + quantity + " Pizza(s)\n";
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

        double amountSaved = subtotal * discount;
        double amountAfterDiscount = subtotal - amountSaved;
        double taxAmount = amountAfterDiscount * tax;
        double totalAmount = amountAfterDiscount + taxAmount;

        String str = "";

        str += "------ Order for: " + customerName + " ------\n\n";
        str += order + "\n";
        str += "Subtotal:\t\t$" + subtotal + "\n";
        if (isDiscount) {
            str += "\tDiscount:\t" + (discount * 100) + "%\n";
            str += "\tYou saved:\t$" + amountSaved + "\n\n";
        }
        str += "Tax  (" + (tax * 100) + "%):\t$" + taxAmount + "\n";
        str += "Total:\t\t\t$" + totalAmount;
        str += "\n-----------------------------\n\n";

        return str;
    }

}