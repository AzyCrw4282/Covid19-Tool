//improts to be added

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
//import org.json.simple.JSONObject;

public class CovidMain extends JFrame implements ActionListener  {
    /** GUI frame.*/
    private static JFrame frame;
    private static JTextArea entryBox;
    private static JTextArea rhythm1;
    private static JTextArea rhythm2;
    private static JTextArea tempo;
    private static JButton help;
    private static JButton userData;
    public static final int NUM_KEYS = 7;
    public static final int NUM_OCTAVES = 3;
    /** Holds which instrument is currently selected.*/
    private static String instrumentType = "I[Piano]";
    /** Custom color for GUI entry fields*/
    private static Color customColor = new Color(255,255,255);
    /** Border for entry fields*/
    private static Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    private static JSONObject globalJsonObj;
    private static JSONObject countryJsonObj;
    private static Covid19User userObject;
    private static UtilitiesData utilsObject;
    private String strTravels;
    private String strSymptoms;
    private String strHealth;

    private static String userMinState;
    private static String userMaxState;
    private static int totalConfirmedCases;
    private static boolean runSecondTime = false;

    //user data objects
    private int userAge = 50;
    private AlertZones userAlertZone;
    private String userState = "";
    private String country;
    private GenderEnums gender;
    private SymptomsEnums userSymptoms;
    private TravelsEnums userTravels;
    private HealthEnums userHealth;

    public CovidMain(){
        //Not being used for the time being
//        userObject = new Covid19User();
//        utilsObject = new UtilitiesData();

        try {
//            calculateStateAndCases(userState);
//            showGui();
//            System.out.println("In the try statement");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("in the catch");
        }

//        System.out.println(globalJsonObj + "--------");
//        System.out.println(countryJsonObj);
    }

    public void showGui() throws JSONException {
        // ------------ Create GUI -----------
        frame = new JFrame("COVID19 GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the mainPanel
        Container mainPanel = frame.getContentPane();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setForeground(Color.WHITE);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.add(Box.createRigidArea(new Dimension(0,1)));

        // ---- Instrument and tempo panel ----
        JPanel iTpanel = new JPanel();
        iTpanel.setLayout(new BoxLayout(iTpanel,BoxLayout.X_AXIS));
        iTpanel.setForeground(Color.WHITE);
        iTpanel.setBackground(Color.BLACK);
        iTpanel.add(Box.createRigidArea(new Dimension(11,0)));

        // Title label
        JLabel titleLabel = new JLabel("COVID19 HELPER");
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBackground(Color.BLACK);
        iTpanel.add(titleLabel);
        iTpanel.add(Box.createRigidArea(new Dimension(150,0)));

        // Tempo label
        JLabel tempoLabel = new JLabel("Alert:");
        tempoLabel.setForeground(Color.WHITE);
        tempoLabel.setBackground(Color.BLACK);
        iTpanel.add(tempoLabel);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        // Tempo text area
        tempo = new JTextArea();
        tempo.setName("tempo");
        tempo.setText("Pandemic");
        tempo.setFont(new Font("Ariel", Font.BOLD, 14));
        tempo.setBorder(border);
        tempo.setForeground(Color.BLACK);
        tempo.setBackground(customColor);
        iTpanel.add(tempo);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        //2nd one
        // Tempo label
        JLabel tempoLabe2 = new JLabel("Last Updated At:");
        tempoLabe2.setForeground(Color.WHITE);
        tempoLabe2.setBackground(Color.BLACK);
        iTpanel.add(tempoLabe2);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        // Tempo text area
        JTextArea tempo2 = new JTextArea();
        tempo2.setName("tempo2");
        tempo2.setText(globalJsonObj.getString("statistic_taken_at"));
        tempo2.setFont(new Font("Ariel", Font.BOLD, 14));
        tempo2.setBorder(border);
        tempo2.setForeground(Color.BLACK);
        tempo2.setBackground(customColor);
        iTpanel.add(tempo2);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        JLabel tempoLabe22 = new JLabel("Your Age & Gender:");
        tempoLabe22.setForeground(Color.WHITE);
        tempoLabe22.setBackground(Color.BLACK);
        iTpanel.add(tempoLabe22);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        // Tempo text area
        JTextArea tempo22 = new JTextArea();
        tempo22.setName("tempo2");
        tempo22.setText(userAge +" ( " +gender +" )");//get user's age and gender via the enum props
        tempo22.setFont(new Font("Ariel", Font.BOLD, 14));
        tempo22.setBorder(border);
        tempo22.setForeground(Color.BLACK);
        tempo22.setBackground(customColor);
        iTpanel.add(tempo22);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        // Help button
        help = new JButton("Help");
        help.setForeground(Color.WHITE);
        help.setBackground(Color.BLACK);
        help.addActionListener(this);
        help.setName("help");
        iTpanel.add(help);
        iTpanel.add(Box.createRigidArea(new Dimension(20,0)));

        // Add iTpanel to mainPanel
        mainPanel.add(iTpanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0,1)));

//pie chart

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new java.awt.BorderLayout());
        PieChartUtility chart = new PieChartUtility("Global Cases (Live data)",globalJsonObj);
        jPanel1.add(chart.getChartPanel(),BorderLayout.CENTER);
        jPanel1.validate();

        // Add iTpanel to mainPanels
        mainPanel.add(jPanel1);
        mainPanel.add(Box.createRigidArea(new Dimension(0,1)));

        // ---------- Notes Panel -----------

        // Create the notes panel
        JPanel notesPanel = new JPanel();
        notesPanel.setLayout(new BoxLayout(notesPanel,BoxLayout.X_AXIS));
        notesPanel.setForeground(Color.WHITE);
        notesPanel.setBackground(Color.BLACK);
        notesPanel.add(Box.createRigidArea(new Dimension(11, 0)));

        // Make notes label
        JLabel notesLabel = new JLabel("Your State:");
        notesLabel.setForeground(Color.WHITE);
        notesLabel.setBackground(Color.BLACK);
        notesPanel.add(notesLabel);
        notesPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        // Create entry box
        entryBox = new JTextArea();
        entryBox.setBorder(border);
//        calculateStateAndCases(userState);
        entryBox.setText(capitalize(userState));//New York (24233) --do this for all
        entryBox.setFont(new Font("Ariel", Font.BOLD, 14));
        entryBox.setForeground(Color.BLACK);
        entryBox.setBackground(customColor);
        notesPanel.add(entryBox);
        notesPanel.add(Box.createRigidArea(new Dimension(100, 0)));

        // Add the top panel to the main panel
        mainPanel.add(Box.createRigidArea(new Dimension(0,50)));
        mainPanel.add(notesPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        //@@@@@@@@@@@@@@@@@seond notes on same panel@@@@@@@@@@@@@@@@@@

        // Create the notes panel
        notesPanel.setLayout(new BoxLayout(notesPanel,BoxLayout.X_AXIS));
        notesPanel.setForeground(Color.WHITE);
        notesPanel.setBackground(Color.BLACK);
        notesPanel.add(Box.createRigidArea(new Dimension(11, 0)));

        // Make notes label
        JLabel notesLabel2 = new JLabel("Least Affected Region:");
        notesLabel2.setForeground(Color.WHITE);
        notesLabel2.setBackground(Color.BLACK);
        notesPanel.add(notesLabel2);
        notesPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        // Create entry box
        entryBox = new JTextArea();
        entryBox.setBorder(border);
        entryBox.setFont(new Font("Ariel", Font.BOLD, 14));
        entryBox.setText(userMinState);
        entryBox.setForeground(Color.BLACK);
        entryBox.setBackground(customColor);
        notesPanel.add(entryBox);
        notesPanel.add(Box.createRigidArea(new Dimension(100, 0)));

        // Add the top panel to the main panel
        mainPanel.add(Box.createRigidArea(new Dimension(0,50)));
        mainPanel.add(notesPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        //third one, should be used for the State affected

        // Create the notes panel
        notesPanel.setLayout(new BoxLayout(notesPanel,BoxLayout.X_AXIS));
        notesPanel.setForeground(Color.WHITE);
        notesPanel.setBackground(Color.BLACK);
        notesPanel.add(Box.createRigidArea(new Dimension(11, 0)));

        // Make notes label
        JLabel notesLabel3 = new JLabel("Most Affected State:");
        notesLabel3.setForeground(Color.WHITE);
        notesLabel3.setBackground(Color.BLACK);
        notesPanel.add(notesLabel3);
        notesPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        // Create entry box
        entryBox = new JTextArea();
        entryBox.setBorder(border);
        entryBox.setText(userMaxState);
        entryBox.setFont(new Font("Ariel", Font.BOLD, 14));
        entryBox.setForeground(Color.BLACK);
        entryBox.setBackground(customColor);
        notesPanel.add(entryBox);
        notesPanel.add(Box.createRigidArea(new Dimension(100, 0)));

        // Add the top panel to the main panel
        mainPanel.add(Box.createRigidArea(new Dimension(0,50)));
        mainPanel.add(notesPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 25)));

        // ------- Rhythm panel 1 -------

        // Create panel1
        JPanel rhythmPanel1 = new JPanel();
        rhythmPanel1.setLayout(new BoxLayout(rhythmPanel1,BoxLayout.X_AXIS));
        rhythmPanel1.setForeground(Color.WHITE);
        rhythmPanel1.setBackground(Color.BLACK);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(150,0)));

        // Rhythm 1 label
        JLabel r1 = new JLabel("Confirmed Cases In THE STATE: ");
        r1.setForeground(Color.WHITE);
        r1.setBackground(Color.BLACK);
        rhythmPanel1.add(r1);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(10,0)));

        // Text area
        rhythm1 = new JTextArea();
        rhythm1.setBorder(border);
        rhythm1.setText("" +totalConfirmedCases);
        rhythm1.setFont(new Font("Ariel", Font.BOLD, 14));
        rhythm1.setForeground(Color.BLACK);
        rhythm1.setBackground(customColor);
        rhythmPanel1.add(rhythm1);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(150,0)));

        // Add to main panel
        mainPanel.add(rhythmPanel1);
        mainPanel.add(Box.createRigidArea(new Dimension(20,20)));

        // ------- Rhythm panel 2 -------

        // Create panel 2
//        JPanel rhythmPanel1 = new JPanel();
        rhythmPanel1.setLayout(new BoxLayout(rhythmPanel1,BoxLayout.X_AXIS));
        rhythmPanel1.setForeground(Color.WHITE);
        rhythmPanel1.setBackground(Color.BLACK);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(150,0)));

        // Rhythm 2 label
        JLabel r2 = new JLabel("Risk Of Infection?: ");
        r2.setForeground(Color.WHITE);
        r2.setBackground(Color.BLACK);
        rhythmPanel1.add(r2);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(10,0)));

        // Text area
        rhythm2 = new JTextArea();
//        rhythm2.setText("75%");
        rhythm2.setText(""+userInfectionPred(strSymptoms.toLowerCase(),userAge,strTravels.toLowerCase()) +"%");//one apram is missing from here
        rhythm2.setBorder(border);
        rhythm2.setFont(new Font("Ariel", Font.BOLD, 14));
        rhythm2.setForeground(Color.BLACK);
        rhythm2.setBackground(customColor);
        rhythmPanel1.add(rhythm2);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(150,0)));

        // Add to main panel
        mainPanel.add(rhythmPanel1);
        mainPanel.add(Box.createRigidArea(new Dimension(20,20)));

        // Help button
        userData = new JButton("Your Data");
        userData.setForeground(Color.WHITE);
        userData.setBackground(Color.GREEN);
        userData.addActionListener(this);
        userData.setName("userData");
        rhythmPanel1.add(userData);
        rhythmPanel1.add(Box.createRigidArea(new Dimension(150,0)));

        // Add to main panel
        mainPanel.add(rhythmPanel1);
        mainPanel.add(Box.createRigidArea(new Dimension(20,20)));

        // Show the window
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(1200,850);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Initialize
        JButton jb = null;
        String name = "";

        // Get which object was clicked
        Object obj = e.getSource();

        // Cast the object to a JButton
        jb = (JButton)obj;
        // Get the name of the JButton
        name = jb.getName();

        if (name.equals("help")){
            // Call the helpWindow method to open the help window
            helpWindow();
        }
        else if (name.equals("userData")){
            // Call the helpWindow method to open the help window
            helpWindow2();
        }
    }

    /** Opens a new help window.*/
    private void helpWindow(){

        // Open a new window
        JFrame frame2 = new JFrame("Help");

        // Create mainPanel2
        Container mainPanel2 = frame2.getContentPane();
        mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.Y_AXIS));
        mainPanel2.setForeground(Color.WHITE);
        mainPanel2.setBackground(Color.BLACK);

        // Add a jeditorpane
        JEditorPane instructions= new JEditorPane();
        instructions.setText(
                "GUI THAT TRACKS NUMBER OF GLOBAL CASES AS WELL AS YOUR LIKELIHOOD OF GETTING THE DISEASE. \n " +
                "1. THE PIE CHART SHOWS THE GLOBAL DATA \n " +
                "2. ALERT SHOWS THE CURRENT WORLD HEALTH ORG.. STATUS OF THE DISEASE \n " +
                "3. LAST UPDATED AT SHOWS THE API TRACKING STATUS \n " +
                "4. YOUR AGE AND GENDER DISPLAYS YOUR AGE AND YOUR GENDER \n " +
                "5. STATE CASES SHOW THE CURRENT NUMBER OF CASES IN YOUR STATE\n " +
                "6. Least affected state- SAME AS ABOVE BUT LEASE AFFFECTED STATE\n " +
                "7. Most affected state- SAME AS ABOVE BUT MOST AFFECTED STATE\n " +
                "8. CONFIRMED CASES IN THE COUNTRY AS OF THE 'LAST UPDATED TIME'\n " +
                "9. RISK OF BEING INFECTED GIVEN YOUR SYMPTOMS, HEALTH CONDITONS, AGE, LATEST TRAVEL.\n "+
                "****PLEASE NOTE****** \n YOUR RISK PREDICTION IS SIMPLY BASED ON THE ABOVE PARAMS AND IN NO WAY ANY ACCURATE. I DO INTEND TO INCOROPORATE WITH SOME MACHINE LEARNING MODELS SOON.\n");
        instructions.setForeground(Color.BLACK);
        instructions.setBackground(Color.WHITE);
        instructions.setFont(new Font("Ariel", Font.PLAIN, 16));

        // Add instructions to the mainPanel
        mainPanel2.add(instructions);

        // Set the frame size and visible
        frame2.setSize(500,550);
        frame2.setVisible(true);
    }

    /** Opens a new data panel.*/
    private void helpWindow2(){

        // Open a new window
        JFrame frame2 = new JFrame("Help");

        // Create mainPanel2
        Container mainPanel2 = frame2.getContentPane();
        mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.Y_AXIS));
        mainPanel2.setForeground(Color.WHITE);
        mainPanel2.setBackground(Color.BLACK);

        // Add a jeditorpane
        JEditorPane instructions= new JEditorPane();
        instructions.setText("User Data PANEL:\n" + "Symptoms:\n" + strSymptoms.replace("null","") + "\nHealth:\n" + strHealth.replace("null","") + "\nTravels:\n" + strTravels.replace("null","") + " \n " +
                "****PLEASE NOTE****** \n YOUR RISK PREDICTION IS SIMPLY BASED ON THE ABOVE PARAMS AND IN NO WAY ANY ACCURATE. I DO INTEND TO INCORPORATE WITH SOME MACHINE LEARNING MODELS SOON.\n");
        instructions.setForeground(Color.BLACK);
        instructions.setBackground(Color.WHITE);
        instructions.setFont(new Font("Ariel", Font.PLAIN, 16));

        // Add instructions to the mainPanel
        mainPanel2.add(instructions);

        // Set the frame size and visible
        frame2.setSize(500,550);
        frame2.setVisible(true);
    }


    public void setGender(GenderEnums gender) {
//        System.out.println("402");
        switch (gender){
            case MALE:
                this.gender = GenderEnums.MALE;
//                System.out.println("405");
                break;
            case FEMALE:
                this.gender = GenderEnums.FEMALE;
                break;

            case TRANSGENDER:
                this.gender = GenderEnums.TRANSGENDER;
                break;

            case NONE:
                this.gender = GenderEnums.NONE;
                break;
        }
        try {
//            globalJsonObj = executeGetRequest( "https://coronavirus-monitor.p.rapidapi.com/coronavirus/worldstat.php","coronavirus-monitor.p.rapidapi.com");
//            countryJsonObj = executeGetRequest("https://coronavirus-monitor.p.rapidapi.com/coronavirus/johns_hopkins_united_states_latest.php?state="+userState.replace(" ","%20%"),"coronavirus-monitor.p.rapidapi.com");//metnioend the hex space %20, else fails
//            calculateStateAndCases(userState);
//            showGui();
//            System.out.println("In second try ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setHealth(String healthStr) {
//        System.out.println("440 "  + healthStr );
        HealthEnums health = HealthEnums.valueOf(healthStr.toUpperCase());
//        System.out.println("Enum value: " +health);
        switch (health){
            case DIABETIC:
                this.userHealth = HealthEnums.DIABETIC;
//                System.out.println("405");
                break;
            case HIGH_BLOOD_PRESSURE:
                this.userHealth = HealthEnums.HIGH_BLOOD_PRESSURE;
                break;
            case ASTHMA:
                this.userHealth = HealthEnums.ASTHMA;
                break;
            case NONE:
                this.userHealth = HealthEnums.NONE;
                break;
        }
        if (userHealth != null) strHealth +=  userHealth.toString() + ",";
    }

    public void setTravels(String countries_str) {
        TravelsEnums countries = TravelsEnums.valueOf(countries_str.toUpperCase());
//        System.out.println("Enum value: " +countries);
        switch (countries){
            case USA:
                this.userTravels = TravelsEnums.USA;
//                System.out.println("405");
                break;
            case CHINA:
                this.userTravels = TravelsEnums.CHINA;
                break;
            case ITALY:
                this.userTravels = TravelsEnums.ITALY;
                break;
            case NONE:
                this.userTravels = TravelsEnums.NONE;
                break;
        }
        if (userTravels != null) strTravels +=  userTravels.toString()+ ",";
    }

    public void setSymptoms(String sympStr) {
//        System.out.println(sympStr +"530");
        SymptomsEnums symp = SymptomsEnums.valueOf(sympStr.toUpperCase());
        // System.out.println("Enum value: " +symp );
        switch (symp){
            case COUGH:
                this.userSymptoms = SymptomsEnums.COUGH;
//                System.out.println("405");
                break;
            case FEVER:
                this.userSymptoms = SymptomsEnums.FEVER;
                break;
            case SHORTNESS_OF_BREATH:
                this.userSymptoms = SymptomsEnums.SHORTNESS_OF_BREATH;
                break;
            case NONE:
                this.userSymptoms = SymptomsEnums.NONE;
                break;
        }
        if (userSymptoms != null) strSymptoms +=userSymptoms.toString()+ ",";
        try {
            if (runSecondTime) {
                //all worked on last testing, any issues will need to eb applied here
                globalJsonObj = executeGetRequest("https://coronavirus-monitor.p.rapidapi.com/coronavirus/worldstat.php", "coronavirus-monitor.p.rapidapi.com");
                countryJsonObj = executeGetRequest("https://coronavirus-monitor.p.rapidapi.com/coronavirus/johns_hopkins_latest_usa_statistic_by_state.php?state=" + userState.replace(" ", "%20%"), "coronavirus-monitor.p.rapidapi.com");
                calculateStateAndCases(userState);
                showGui();
                System.out.println("In second try ");
                runSecondTime = false;
            }
            else{
             runSecondTime = true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //hardcoded prediction and in no way any reliable. Should ideally use some ml model
    public double userInfectionPred(String userSymptoms, int age, String userTravels){
        int probability =  10;

        if (userSymptoms.contains("cough") || userSymptoms.contains("high temperature") || userSymptoms.contains("breath")) probability+=40;
        if (age > 40) probability+= 10;
        if (userTravels.contains("usa")) probability+= 5;
        if (userTravels.contains("italy")) probability+= 5;
        if (userTravels.contains("china")) probability+= 5;

        return probability;
    }

    public static JSONObject executeGetRequest(String urlParam,String header ) {
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(urlParam);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("x-rapidapi-host", header);
            connection.setRequestProperty("x-rapidapi-key", "ec1aecfb7dmsh4b95f9760c61219p13a88fjsn3bc922b9efb3");
            connection.setUseCaches(false);
            connection.setDoOutput(true);

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;

            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
//            System.out.println(response);
            JSONObject jsonObj = new JSONObject(response.toString());

            return jsonObj;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return null;
    }

    //calculates the values to be dispalyed on the fields
    public  void calculateStateAndCases(String userStateParam) throws JSONException {
        JSONArray jsonArray = countryJsonObj.getJSONArray("usa_cases_by_state");
        int max = -1;
        int min = 100000;

        for(int i = 0; i < jsonArray.length(); i++) {
            JSONObject temp = jsonArray.getJSONObject(i);
            totalConfirmedCases += Integer.parseInt(temp.getString("cases_number"));
            if(Integer.parseInt(temp.getString("cases_number")) > max) {
                userMaxState = temp.getString("state_name");
                max = temp.getInt("cases_number");
            }

            if(Integer.parseInt(temp.getString("cases_number")) < min) {
                userMinState = temp.getString("state_name");
                min = temp.getInt("cases_number");
            }
//            System.out.println("111 "+ userStateParam +"  " + temp.getString("state_name") );
            if(temp.getString("state_name").equals(userStateParam)) {

                userState = userStateParam +" ( "+ temp.getString("cases_number")  + " )";
            }
        }
        userMinState = userMinState + " ( " + min + " )";
        userMaxState = userMaxState + " ( " + max + " )";
    }

    //I would normally use lombok to avioid getters and seters. But not using this time to avoid any dependencies.
    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserCountry() {
        return country;
    }

    public void setUserCountry(String country) {
        this.country = country;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String state) {
        this.userState = state;
    }

    private String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    //enums get/set properties

    public HealthEnums getUserHealth() {
        return userHealth;
    }

    public void setUserHealth(HealthEnums userHealth) {
        this.userHealth = userHealth;
    }

    public SymptomsEnums getUserSymptoms() {
        return userSymptoms;
    }

    public void setUserSymptoms(SymptomsEnums userSymptoms) {
        this.userSymptoms = userSymptoms;
    }

    public TravelsEnums getUserTravels() {
        return userTravels;
    }

    public void setUserTravels(TravelsEnums userTravels) {
        this.userTravels = userTravels;
    }


    public static void main(String[] args) throws JSONException {
//        CovidMain obj = new CovidMain();
//        globalJsonObj = executeGetRequest( "https://coronavirus-monitor.p.rapidapi.com/coronavirus/worldstat.php","coronavirus-monitor.p.rapidapi.com");
//        countryJsonObj = executeGetRequest("https://coronavirus-monitor.p.rapidapi.com/coronavirus/johns_hopkins_united_states_latest.php?state=New%20%York","coronavirus-monitor.p.rapidapi.com");//metnioend the hex space %20, else fails
//        System.out.println(globalJsonObj + "--------");
//        System.out.println(countryJsonObj);
//        calculateStateAndCases("New York");
//        showGui();

    }
}
