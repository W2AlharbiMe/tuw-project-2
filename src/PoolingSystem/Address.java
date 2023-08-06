package PoolingSystem;

public class Address {
    private String streetName;
    private String city;
    private String country;
    private String zipCode;

    public Address(String streetName, String city, String country, String zipCode) {
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String toString() {
        String output = "";

        output += "Street Name: "+ streetName + "\n";
        output += "City: "+ city + "\n";
        output += "Country: "+ country + "\n";
        output += "zip code: "+ zipCode;

        return output;
    }

}
