public class Manufacturer{
    private String companyName;
    private int yearOfFoundation;
    private String country;

    public Manufacturer(String companyName, int yearOfFoundation, String country) {
        this.companyName = companyName;
        this.yearOfFoundation = yearOfFoundation;
        this.country = country;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
