package edu.wctc.customer.entity;

import edu.wctc.customer.EventCode;

import javax.validation.constraints.*;

public class Customer {
    @NotNull(message="can''t be null")
    @Size(min=1, message="min length 1")
    private String firstName;
    @NotNull(message="can''t be null")
    @Size(min=1, message="min length 1")
    private String lastName;
    @Pattern(regexp="[A-Z][0-9][A-Z] [0-9][A-Z][0-9]", message = "invalid Postal Code")
    private String postalCode;
    @EventCode(value="PAX", message = "potato")
    private String eventCode;
    @NotNull()
    @Min(value = 0, message = "minimum value is 0")
    @Max(value = 10, message = "maximum value is 10")
    private Integer freePasses;

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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
