package edu.wctc.travel;

public class ExchangeStudent {

    private String HomeCountry;
    private String HostCountry;
    private int gradeLevel;
    private String sememter;
    private TravelMethod travelMethod;
    private String[] spokenLanguages;

    public TravelMethod getTravelMethod() {
        return travelMethod;
    }

    public void setTravelMethod(TravelMethod travelMethod) {
        this.travelMethod = travelMethod;
    }

    public String[] getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(String[] spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public ExchangeStudent(){}

    public String getHomeCountry() {
        return HomeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        HomeCountry = homeCountry;
    }

    public String getHostCountry() {
        return HostCountry;
    }

    public void setHostCountry(String hostCountry) {
        HostCountry = hostCountry;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getSememter() {
        return sememter;
    }

    public void setSememter(String sememter) {
        this.sememter = sememter;
    }
}
