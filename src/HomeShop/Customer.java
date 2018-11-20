package HomeShop;

public class Customer {

    private String fullname;
    private String address ;



    public Customer(String fullname, String address){

        this.address = address;
        this.fullname = fullname;

    }


    public String getFullname() {

        return fullname;
    }

    public String getAddress() {

        return address;
    }



}
