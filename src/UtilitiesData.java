import java.util.HashMap;

public class UtilitiesData {
    public String govAdvice = "https://www.gov.uk/guidance/coronavirus-covid-19-information-for-the-public";
    public String worstAffectedRegion;
    public String leastAffectedRegion;
    private HashMap<String,Integer> countrycases = new HashMap<String,Integer>();

    public HashMap<String, Integer> getCountrycases() {
        return countrycases;
    }

    public void setCountrycases(HashMap<String, Integer> countrycases) {
        this.countrycases = countrycases;
    }

    public void calculateRegion(String region){

    }
}
