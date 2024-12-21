public class Address {

    private String street;
    private String city;
    private String postalCode;
    private String country;


    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }


    public String get_Street_name() {
        return street;
    }

    public String get_City_name() {
        return city;
    }

    public String get_PostCode() {
        return postalCode;
    }

    public String get_Country_name() {
        return country;
    }


    public String display_Address() {
        return street + ", " + city + ", " + postalCode + ", " + country;
    }





}
