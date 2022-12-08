import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfFoundation == that.yearOfFoundation && companyName.equals(that.companyName) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, yearOfFoundation, country);
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
