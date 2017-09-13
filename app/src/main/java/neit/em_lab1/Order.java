/**
 * Created by Ernesto Murillo on 7/19/2017.
 */
package neit.em_lab1;

public class Order {
    String firstName;
    String lastName;
    String typeOfChocolate;
    int bars;
    Boolean shippintType;

    public Order(String firstName, String lastName, String typeOfChocolate, int bars, Boolean shippintType ){
        setFirstName(firstName);
        setLastName(lastName);
        setTypeOfChocolate(typeOfChocolate);
        setBars(bars);
        setShippintType(shippintType);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTypeOfChocolate() {
        return typeOfChocolate;
    }

    public void setTypeOfChocolate(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    public int getBars() {
        return bars;
    }

    public void setBars(int bars) {
        this.bars = bars;
    }

    public Boolean getShippintType() {
        return shippintType;
    }

    public void setShippintType(Boolean shippintType) {
        this.shippintType = shippintType;
    }








}
