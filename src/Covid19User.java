import java.util.HashMap;

/**
 * try use lombok when possible. consider adrians position
 */

public class Covid19User {

    private int userAge;
    private AlertZones userAlertZone;
    private String country;
    private String state = "New York";
    private GenderEnums gender;
    private int userInfectionProb;
    private String userSymptoms;
    //TBd definiitons for graph creation

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public AlertZones getUserAlertZone() {
        return userAlertZone;
    }

    public void setUserAlertZone(AlertZones userAlertZone) {
        this.userAlertZone = userAlertZone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public GenderEnums getGender() {
        return gender;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public int getUserInfectionProb() {
        return userInfectionProb;
    }

    public void setUserInfectionProb(int userInfectionProb) {
        this.userInfectionProb = userInfectionProb;
    }

    public String getUserSymptoms() {
        return userSymptoms;
    }

    public void setUserSymptoms(String userSymptoms) {
        this.userSymptoms = userSymptoms;
    }


    public void setAlertZones(AlertZones zones) {
        switch (zones){
            case LOW:
                this.userAlertZone = AlertZones.LOW;
                break;
            case MEDIUM:
                this.userAlertZone = AlertZones.MEDIUM;
                break;
            case HIGH:
                this.userAlertZone = AlertZones.HIGH;
                break;
            case SEVERE:
                this.userAlertZone = AlertZones.SEVERE;
                break;
            case PANDEMIC:
                this.userAlertZone = AlertZones.PANDEMIC;
                break;
        }
    }


}
