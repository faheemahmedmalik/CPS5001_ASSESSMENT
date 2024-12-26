package CPS5001_Assessment;


public class Address {
    private String street;     // Street address
    private String city;       // City name
    private String postalCode; // Postal code
    private String country;    // Country name

    // Constructor to initialize the address
    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    // Getters for address components
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    // Example: Validating UK post using Regex

    public boolean isValidPostalCode() {
        // Regex for UK postcodes
        String ukPostcodeRegex = "^[A-Z]{1,2}\\d[A-Z\\d]? \\d[A-Z]{2}$";
        return postalCode.matches(ukPostcodeRegex);
    }


    // String representation of the address
    @Override
    public String toString() {
        return street + ", " + city + ", " + postalCode + ", " + country;
    }
}
