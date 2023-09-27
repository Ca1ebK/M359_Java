package U3_BooleanAndIfStatements.Labs;

public class RestaurantOrder {

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
    public RestaurantOrder(String customer, double tax) {
        customerName = customer;
        taxPercentRate = tax * 100;
        isDiscount = false;
    }

    public RestaurantOrder(String customer, double tax, double discount) {
        customerName = customer;
        taxPercentRate = tax * 100;
        isDiscount = true;
        discountPercent = discount / 100;
    }

    public void addItem(String food, int quantity) {

        String foodItem = food.toLowerCase();
        String burger = "burger".toLowerCase();
        String pizza = "pizza".toLowerCase();
        String pasta = "pasta".toLowerCase();
        String salad = "pasta".toLowerCase();

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
                order += "Sorry, " + food + " is not on the menu.";
            }
        }
        else {
            System.out.println("Sorry, " + foodItem + " quantity must be greater than 0.");
        }
    }

    public String toString() {
        String str = "";

        str += "------ " + customerName + " ------";
        str += "\n";

        str += order;

        str += "Subtotal:      $" + subtotal;

        if (isDiscount == true) {
            double amountSaved = (subtotal * (discountPercent / 100));
            str += "\tDiscount:    " + discountPercent + "%";
            str += "\tYou saved:   " + amountSaved;
        }

        str += "Tax  (";


        return str;
    }

}
