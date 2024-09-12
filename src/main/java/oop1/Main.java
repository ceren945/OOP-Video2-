package oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";
        Product product1 = new Product();

        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setDiscount(2);
        product1.setImageUrl("bilmemnne1.jpg");

        //get
        /* System.out.println(product1.name);*/

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(500);
        product2.setDiscount(8);
        product2.setUnitsInStock(3);
        product2.setImageUrl("bilmemnne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Kahve Makinesi");
        product3.setUnitPrice(3600);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("bilmemnne3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "<li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer1 = new IndividualCustomer();
        individualCustomer1.setId(1);
        individualCustomer1.setCustomerNumber("35454");
        individualCustomer1.setPhone("6546546");
        individualCustomer1.setFirstName("Ceren");
        individualCustomer1.setLastName("Durmus");

        CorporateCustomer corporateCustomer1 = new CorporateCustomer();
        corporateCustomer1.setId(2);
        corporateCustomer1.setCompanyName("etiya");
        corporateCustomer1.setCustomerNumber("3547");
        corporateCustomer1.setPhone("6546546");
        corporateCustomer1.setTaxNumber("132");



        Customer[] customers= {individualCustomer1, corporateCustomer1};
    }
}