package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;
import java.util.LinkedList;

public class StepDefinitions {
    private Shop shop;
    private Product product;
    private String addToCartResult;
    private LinkedList<Product> existingProductsInCart;

    @Given("the shop exists")
    public void the_shop_exists() {
        shop = new Shop();
    }

    @Given("the cart is empty")
    public void the_cart_is_empty() {
        shop.getShoppingcart().clear();
    }

    @Given("the cart is not empty")
    public void the_cart_is_not_empty() {
        existingProductsInCart = new LinkedList<>();
        existingProductsInCart.add(new Product("Existing Product", 10, 5.99)); // Example existing product
        shop.getShoppingcart().addAll(existingProductsInCart);
        assertFalse(shop.getShoppingcart().isEmpty());
    }

    @Given("the product is available")
    public void the_product_is_available() {
        product = new Product("Cucumber", 10, 1.99);
        assertTrue(product.getStock() > 0);
    }

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {
        addToCartResult = shop.addToCart(product.getName());
    }

    @Then("the product should appear in the cart")
    public void the_product_should_appear_in_the_cart() {
        assertEquals("OK", addToCartResult);
        assertEquals("OK", shop.isProductInCart(product.getName()));
    }

    @Then("the product should appear with already existing products")
    public void the_product_should_appear_with_already_existing_products() {
        assertTrue(shop.getShoppingcart().containsAll(existingProductsInCart));
        assertEquals("OK", shop.isProductInCart(product.getName()));
    }

    @Given("the product is out-of-stock")
    public void the_product_is_out_of_stock() {
        product = new Product("Out-of-Stock Product", 0, 0.00);
    }

    @Then("the addition should fail")
    public void the_addition_should_fail() {
        assertEquals("FAIL", addToCartResult);
    }

    @Then("an error should appear")
    public void an_error_should_appear() {
        assertEquals("FAIL", addToCartResult);
        assertEquals("FAIL", shop.isProductInCart(product.getName()));
    }

    @Given("there are {int} of the product in stock")
    public void there_are_of_the_product_in_stock(Integer int1) {
        product = new Product("Cucumber", int1, 1.99);
    }

    @When("I add {int} of the product to cart")
    public void i_add_of_the_product_to_cart(Integer int1) {
        addToCartResult = shop.addToCart(product.getName(), int1);
    }

    @Then("The product should appear in the cart with a quantity of {int}")
    public void the_product_should_appear_in_the_cart_with_a_quantity_of_int(int arg0) {
        assertEquals("OK", addToCartResult);
        assertEquals((int) shop.howManyInCart(product.getName()), arg0);
    }

    @Given("the shopping cart is non-empty")
    public void the_shopping_cart_is_non_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I query for the listing")
    public void i_query_for_the_listing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("each item in the cart should be listed")
    public void each_item_in_the_cart_should_be_listed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("quantities should be displayed respectively")
    public void quantities_should_be_displayed_respectively() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be told that the shopping cart is empty")
    public void i_should_be_told_that_the_shopping_cart_is_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("there are {int} or over items of the product in stock")
    public void there_are_or_over_items_of_the_product_in_stock(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have the product in my shopping cart with quantity {int}")
    public void i_have_the_product_in_my_shopping_cart_with_quantity(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I change the quantity of the product to {int}")
    public void i_change_the_quantity_of_the_product_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the quantity of the product in my cart should update to {int}")
    public void the_quantity_of_the_product_in_my_cart_should_update_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have the product in my cart")
    public void i_have_the_product_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the product should remain in my cart with original quantity")
    public void the_product_should_remain_in_my_cart_with_original_quantity() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("there are less than {int} items of the product in stock")
    public void there_are_less_than_items_of_the_product_in_stock(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be told the stock of the product")
    public void i_should_be_told_the_stock_of_the_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("asked if I want to add available items to cart")
    public void asked_if_i_want_to_add_available_items_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have the product in my shopping cart")
    public void i_have_the_product_in_my_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I remove the product")
    public void i_remove_the_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the product should be removed from the shopping cart")
    public void the_product_should_be_removed_from_the_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I select quantity as {int} and add them to cart")
    public void i_select_quantity_as_int_and_add_them_to_cart(int arg0) {
    }
}


