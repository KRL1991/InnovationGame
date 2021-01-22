package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.String.valueOf;

public class Controller {
    int currentAmountMoneyInt;
    String currentAmount;
    int counter;
    int randomIndexLeft = 0;
    int randomIndexRight = 0;
    int randomIndexMiddle = 0;


    static ArrayList<Properties> houses = new ArrayList<>();

    static ArrayList<Properties> ownedProperties = new ArrayList<>();

    ObservableList<Properties> observableListOwnedProperties = FXCollections.observableList(ownedProperties);
    ObservableList<Properties> observableListHouses;

    @FXML
    public TableView<Properties> TableListOfOwnedProperties;

    @FXML
    public TableColumn<Properties, String> tableName;

    @FXML
    public TableColumn<Properties, Integer> tablePrice;

    public void initialize() throws FileNotFoundException {

        tableName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tablePrice.setCellValueFactory(new PropertyValueFactory<>("Price"));

        Image lowEndHouse1 = new Image(new FileInputStream("src/housePictures/low end house 1.jpg"));
        Image lowEndHouse2 = new Image(new FileInputStream("src/housePictures/low end house 2.jpeg"));
        Image lowEndHouse3 = new Image(new FileInputStream("src/housePictures/low end house 3.jpeg"));
        Image lowEndHouse4 = new Image(new FileInputStream("src/housePictures/low end house 4.jpeg"));
        Image lowEndHouse5 = new Image(new FileInputStream("src/housePictures/low end house 5.jpg"));
        Image lowEndHouse7 = new Image(new FileInputStream("src/housePictures/low end house 7.jpg"));

        Image midTierHouse1 = new Image(new FileInputStream("src/housePictures/mid tier house 1.jpg"));
        Image midTierHouse2 = new Image(new FileInputStream("src/housePictures/mid tier house 2.jpg"));
        Image midTierHouse3 = new Image(new FileInputStream("src/housePictures/mid tier house 3.jpg"));
        Image midTierHouse4 = new Image(new FileInputStream("src/housePictures/mid tier house 4.jpg"));
        Image midTierHouse5 = new Image(new FileInputStream("src/housePictures/mid tier house 5.jpg"));
        Image midTierHouse6 = new Image(new FileInputStream("src/housePictures/mid tier house 6.jpg"));
        Image midTierHouse7 = new Image(new FileInputStream("src/housePictures/mid tier house 7.jpg"));
        Image midTierHouse8 = new Image(new FileInputStream("src/housePictures/mid tier house 8.jpg"));
        Image midTierHouse9 = new Image(new FileInputStream("src/housePictures/mid tier house 9.jpg"));
        Image midTierHouse10 = new Image(new FileInputStream("src/housePictures/mid tier house 10.jpg"));

        Image luxeryProperty1 = new Image(new FileInputStream("src/housePictures/Luxery property 1.jpg"));
        Image luxeryProperty2 = new Image(new FileInputStream("src/housePictures/Luxery property 2.jpg"));
        Image luxeryProperty3 = new Image(new FileInputStream("src/housePictures/Luxery property 3.jpg"));
        Image luxeryProperty4 = new Image(new FileInputStream("src/housePictures/Luxery property 4.jpg"));
        Image luxeryProperty5 = new Image(new FileInputStream("src/housePictures/Luxery property 5.jpg"));
        Image luxeryProperty6 = new Image(new FileInputStream("src/housePictures/Luxery property 6.jpg"));
        Image luxeryProperty7 = new Image(new FileInputStream("src/housePictures/Luxery property 7.jpg"));
        Image luxeryProperty8 = new Image(new FileInputStream("src/housePictures/Luxery property 8.jpg"));
        Image luxeryProperty9 = new Image(new FileInputStream("src/housePictures/Luxery property 9.jpg"));


        houses.add(new Properties("Low end house 1", 15000, lowEndHouse1));
        houses.add(new Properties("Low end house 2", 20000, lowEndHouse2));
        houses.add(new Properties("Low end house 3", 17250, lowEndHouse3));
        houses.add(new Properties("Low end house 4", 23000, lowEndHouse4));
        houses.add(new Properties("Low end house 5", 25200, lowEndHouse5));
        houses.add(new Properties("Low end house 7", 23500, lowEndHouse7));

        houses.add(new Properties("Medium tier house 1", 50000, midTierHouse1));
        houses.add(new Properties("Medium tier house 2", 55500, midTierHouse2));
        houses.add(new Properties("Medium tier house 3", 60250, midTierHouse3));
        houses.add(new Properties("Medium tier house 4", 58000, midTierHouse4));
        houses.add(new Properties("Medium tier house 5", 65000, midTierHouse5));
        houses.add(new Properties("Medium tier house 6", 62000, midTierHouse6));
        houses.add(new Properties("Medium tier house 7", 52000, midTierHouse7));
        houses.add(new Properties("Medium tier house 8", 60000, midTierHouse8));
        houses.add(new Properties("Medium tier house 9", 56500, midTierHouse9));
        houses.add(new Properties("Medium tier house 10", 64000, midTierHouse10));

        houses.add(new Properties("Luxery house 1", 110000, luxeryProperty1));
        houses.add(new Properties("Luxery house 2", 125000, luxeryProperty2));
        houses.add(new Properties("Luxery house 3", 140000, luxeryProperty3));
        houses.add(new Properties("Luxery house 4", 145000, luxeryProperty4));
        houses.add(new Properties("Luxery house 5", 161000, luxeryProperty5));
        houses.add(new Properties("Luxery house 6", 115000, luxeryProperty6));
        houses.add(new Properties("Luxery house 7", 181000, luxeryProperty7));
        houses.add(new Properties("Luxery house 8", 128000, luxeryProperty8));
        houses.add(new Properties("Luxery house 9", 200000, luxeryProperty9));

        observableListHouses = FXCollections.observableList(houses);
    }

    @FXML
    private TabPane tabPane;

    // Buttons -------------------------------------------------------------
    @FXML
    private Button welcomeScreenStartButton;

    @FXML
    private Button welcomeScreenLoadButton;

    @FXML
    private Button DifficultyScreenEasyButton;

    @FXML
    private Button DifficultyScreenMediumButton;

    @FXML
    private Button DifficultyScreenHardButton;

    @FXML
    private Button ButtonMale;

    @FXML
    private Button ButtonFemale;

    @FXML
    private Button ButtonStartInvesting;
    @FXML
    private Button ButtonEndDay;

    @FXML
    private Button ButtonInvestInNewProperty;

    @FXML
    private Button ButtonViewOwnedProperties;

    @FXML
    private Button ButtonBank;

    @FXML
    private Button ButtonLeaderboard;

    @FXML
    private Button ButtonPropertyMarket;

    @FXML
    private Button ButtonBuyLeft;

    @FXML
    private Button ButtonBuyMiddle;

    @FXML
    private Button ButtonBuyRight;

    @FXML
    private Button ButtonSell;

    @FXML
    private Button ButtonRenovate;

    @FXML
    private Button ButtonOwnedPropertiesBack;

    @FXML
    private Button ButtonConvert;

    @FXML
    private Button ButtonPayDebt;

    @FXML
    private Button ButtonNewProperties;

    @FXML
    private Button ButtonLoan1;

    @FXML
    private Button ButtonLoan2;

    @FXML
    private Button ButtonLoan3;

    @FXML
    private Button ButtonBankBack;

    @FXML
    private Button ButtonPropertyMarketBack;

    @FXML
    private Button ButtonLeaderboadBack;

    @FXML
    private Button ButtonOwnedPropertiesRepair;


    // Imageviews -------------------------------------------------------------
    @FXML
    private ImageView ImageViewWelcomeScreenLogo;

    @FXML
    private ImageView ImageViewNewPropertiesLeft;

    @FXML
    private ImageView ImageViewNewPropertiesMiddle;

    @FXML
    private ImageView ImageViewNewPropertiesRight;

    @FXML
    public ImageView ImageviewInvesterOfficeAvatar;

    // Textfields -------------------------------------------------------------

    @FXML
    private TextField TextFieldCreateName;

    @FXML
    private TextField TextFieldEnterAge;

    @FXML
    public TextField TextFieldName;

    @FXML
    public TextField TextFieldCurrentAmountMoney;

    @FXML
    public TextField TextFieldDayCounter;

    @FXML
    private TextField TextFieldHomePropertiesMarket;

    @FXML
    private TextField TextFieldOfficePropertiesMarket;

    @FXML
    public TextField TextFieldCurrentAmountDebt;

    @FXML
    private TextField TextFieldLoan1;

    @FXML
    private TextField TextFieldLoan2;

    @FXML
    private TextField TextFieldLoan3;

    @FXML
    public TextField TextFieldAge;

    @FXML
    private TextField NewPropertyLeftPrice;

    @FXML
    private TextField NewPropertyMiddlePrice;

    @FXML
    private TextField NewPropertyRightPrice;

    @FXML
    private TextField TextFieldNewPropertiesNameLeft;

    @FXML
    private TextField TextFieldNewPropertiesNameMiddle;

    @FXML
    private TextField TextFieldNewPropertiesNameRight;
    @FXML
    private TextField TextfieldNewPropertiesNotEnoughMoney;


    // TextArea -------------------------------------------------------------
    @FXML
    private TextArea TextAreaEventLog;

    // Misc -------------------------------------------------------------

    @FXML
    private ListView<String> ListViewOwnedProperties;

    @FXML
    private LineChart<?, ?> LineChartHome;

    @FXML
    private LineChart<?, ?> LineChartOffice;

    @FXML
    private ListView<?> ListViewLeaderboard;


    // Tabs -------------------------------------------------------------

    @FXML
    private Tab TabWelcomeScreen;

    @FXML
    private Tab TabDifficultyScreen;

    @FXML
    private Tab TabCreateInvestor;

    @FXML
    private Tab TabMainScreen;

    @FXML
    private Tab TabOwnedProperties;

    @FXML
    private Tab TabBank;

    @FXML
    private Tab TabPropertyMarket;

    @FXML
    private Tab TabLeaderboard;

    @FXML
    private Tab TabNewProperties;


// Methods

    @FXML
    void payDebt(ActionEvent event) {

        int currentDebt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        int currentMoneyNew = currentAmountMoneyInt - currentDebt;

        if (currentDebt==0){

        }else{
            TextFieldCurrentAmountMoney.setText(String.valueOf(currentMoneyNew));

            TextFieldCurrentAmountDebt.setText("0");
        }

    }


    @FXML
    void BuyPropertiesLeft(ActionEvent event) {

        int housePrice = Integer.parseInt(NewPropertyLeftPrice.getText());

        int updatedAmountOfMoney = currentAmountMoneyInt - housePrice;

        if (currentAmountMoneyInt < housePrice) {
            TextfieldNewPropertiesNotEnoughMoney.setText("You dont have enough money");

        } else {

            TextFieldCurrentAmountMoney.setText(valueOf(updatedAmountOfMoney));

            currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

            ownedProperties.add(houses.get(randomIndexLeft));


            TableListOfOwnedProperties.setItems(observableListOwnedProperties);
            TableListOfOwnedProperties.refresh();

            TextfieldNewPropertiesNotEnoughMoney.clear();

            tabPane.getSelectionModel().select(TabMainScreen);

        }
    }

    @FXML
    void BuyPropertiesMiddle(ActionEvent event) {

        int housePrice = Integer.parseInt(NewPropertyMiddlePrice.getText());

        int updatedAmountOfMoney = currentAmountMoneyInt - housePrice;

        if (currentAmountMoneyInt < housePrice) {
            TextfieldNewPropertiesNotEnoughMoney.setText("You dont have enough money");

        } else {

            TextFieldCurrentAmountMoney.setText(valueOf(updatedAmountOfMoney));

            currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

            ownedProperties.add(houses.get(randomIndexMiddle));


            TableListOfOwnedProperties.setItems(observableListOwnedProperties);
            TableListOfOwnedProperties.refresh();

            TextfieldNewPropertiesNotEnoughMoney.clear();

            tabPane.getSelectionModel().select(TabMainScreen);

        }
    }



    @FXML
    void BuyPropertiesRight(ActionEvent event) {

        int housePrice = Integer.parseInt(NewPropertyRightPrice.getText());

        int updatedAmountOfMoney = currentAmountMoneyInt - housePrice;

        if (currentAmountMoneyInt < housePrice) {
            TextfieldNewPropertiesNotEnoughMoney.setText("You dont have enough money");

        } else {

            TextFieldCurrentAmountMoney.setText(valueOf(updatedAmountOfMoney));

            currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

            ownedProperties.add(houses.get(randomIndexRight));


            TableListOfOwnedProperties.setItems(observableListOwnedProperties);
            TableListOfOwnedProperties.refresh();

            TextfieldNewPropertiesNotEnoughMoney.clear();

            tabPane.getSelectionModel().select(TabMainScreen);

        }
    }


    @FXML
    void ConvertBuilding(ActionEvent event) {

    }

    @FXML
    void CreateInvestorChooseGender(ActionEvent event) {

        String name = TextFieldCreateName.getText();

        TextFieldName.clear();
        TextFieldName.setText(name);

    }

    @FXML
    void GoToBank(ActionEvent event) {
        tabPane.getSelectionModel().select(TabBank);

        int loanOne = 10000;

        TextFieldLoan1.setText("10.000 $");

        double loanTwo = 40000;

        TextFieldLoan2.setText("40.000 $");

        double loanThree = 100000;

        TextFieldLoan3.setText("100.000 $");
    }

    @FXML
    void BankLoanOne(ActionEvent event) {
        TextFieldCurrentAmountMoney.getText();
        int loan1 = 10000;
        int sum;
        int sumDebt;

        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        sum = currentAmountMoneyInt + loan1;

        currentAmountMoneyInt = sum;

        currentAmount = valueOf(currentAmountMoneyInt);

        TextFieldCurrentAmountMoney.setText(currentAmount);

        int debt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        sumDebt = debt + 10000;

        TextFieldCurrentAmountDebt.setText(valueOf(sumDebt));

        tabPane.getSelectionModel().select(TabMainScreen);
    }

    @FXML
    void BankLoanThree(ActionEvent event) {
        TextFieldCurrentAmountMoney.getText();
        int loan3 = 100000;
        int sum3;
        int sumDebt3;

        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        sum3 = currentAmountMoneyInt + loan3;

        currentAmountMoneyInt = sum3;

        currentAmount = valueOf(currentAmountMoneyInt);

        TextFieldCurrentAmountMoney.setText(currentAmount);

        int debt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        sumDebt3 = debt + 100000;

        TextFieldCurrentAmountDebt.setText(valueOf(sumDebt3));

        tabPane.getSelectionModel().select(TabMainScreen);
    }

    @FXML
    void BankLoanTwo(ActionEvent event) {
        TextFieldCurrentAmountMoney.getText();
        int loan2 = 40000;
        int sum2;
        int sumDebt2;
        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        sum2 = currentAmountMoneyInt + loan2;

        currentAmountMoneyInt = sum2;

        currentAmount = valueOf(currentAmountMoneyInt);

        TextFieldCurrentAmountMoney.setText(currentAmount);

        int debt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        sumDebt2 = debt + 40000;

        TextFieldCurrentAmountDebt.setText(valueOf(sumDebt2));

        tabPane.getSelectionModel().select(TabMainScreen);
    }

// Difficulty Screen ----------------------------------------------------------

    @FXML
    void GoToCreateInvestorEasy(ActionEvent event) {
        tabPane.getSelectionModel().select(TabCreateInvestor);

        TextFieldCurrentAmountMoney.clear();
        TextFieldCurrentAmountMoney.setText("100000");
        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        TextFieldCurrentAmountDebt.clear();
        TextFieldCurrentAmountDebt.setText("0");
    }

    @FXML
    void GoToCreateInvestorHard(ActionEvent event) {
        tabPane.getSelectionModel().select(TabCreateInvestor);

        TextFieldCurrentAmountMoney.clear();
        TextFieldCurrentAmountMoney.setText("50000");
        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        TextFieldCurrentAmountDebt.clear();
        TextFieldCurrentAmountDebt.setText("0");
    }

    @FXML
    void GoToCreateInvestorMedium(ActionEvent event) {
        tabPane.getSelectionModel().select(TabCreateInvestor);

        TextFieldCurrentAmountMoney.clear();
        TextFieldCurrentAmountMoney.setText("75000");
        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        TextFieldCurrentAmountDebt.clear();
        TextFieldCurrentAmountDebt.setText("0");


    }

    @FXML
    void GoToDifficultyScreen(ActionEvent event) {
        tabPane.getSelectionModel().select(TabDifficultyScreen);

    }
// .....

    @FXML
    void GoToInvestInNewProperty(ActionEvent event) {
        tabPane.getSelectionModel().select(TabNewProperties);


        randomIndexLeft = (int) (Math.random() * 25);
        ImageViewNewPropertiesLeft.setImage(houses.get(randomIndexLeft).getHouseImage());
        NewPropertyLeftPrice.setText(valueOf(houses.get(randomIndexLeft).getPrice()));
        TextFieldNewPropertiesNameLeft.setText(houses.get(randomIndexLeft).getName());

        randomIndexMiddle = (int) (Math.random() * 25);
        ImageViewNewPropertiesMiddle.setImage(houses.get(randomIndexMiddle).getHouseImage());
        NewPropertyMiddlePrice.setText(valueOf(houses.get(randomIndexMiddle).getPrice()));
        TextFieldNewPropertiesNameMiddle.setText(valueOf(houses.get(randomIndexMiddle).getName()));

        randomIndexRight = (int) (Math.random() * 25);
        ImageViewNewPropertiesRight.setImage(houses.get(randomIndexRight).getHouseImage());
        NewPropertyRightPrice.setText(valueOf(houses.get(randomIndexRight).getPrice()));
        TextFieldNewPropertiesNameRight.setText(valueOf(houses.get(randomIndexRight).getName()));


    }

    @FXML
    void GoToLeaderboard(ActionEvent event) {
        tabPane.getSelectionModel().select(TabLeaderboard);

    }

    @FXML
    void GoToMainScreen(ActionEvent event) {
        tabPane.getSelectionModel().select(TabMainScreen);

        String name = TextFieldCreateName.getText();
        String age = TextFieldEnterAge.getText();

        TextFieldName.clear();
        TextFieldName.setText(name);

        TextFieldAge.clear();
        TextFieldAge.setText(age);

    }

    @FXML
    void GoToPropertyMarket(ActionEvent event) {
        tabPane.getSelectionModel().select(TabPropertyMarket);

    }

    @FXML
    void GoToViewOwnedProperties(ActionEvent event) {
        tabPane.getSelectionModel().select(TabOwnedProperties);


    }

    @FXML
    void LoadExistingData(ActionEvent event) throws FileNotFoundException {

        FileHandling fileHandling = new FileHandling();
        GameData gameData;
        gameData = fileHandling.load();

        TextFieldDayCounter.setText(gameData.TextFieldDayCounter);
        TextFieldName.setText(gameData.TextFieldName);
        TextFieldAge.setText(gameData.TextFieldAge);
        TextFieldCurrentAmountMoney.setText(gameData.TextFieldCurrentAmountMoney);
        TextFieldCurrentAmountDebt.setText(gameData.TextFieldCurrentAmountDebt);

       // ImageviewInvesterOfficeAvatar.setImage(Image.fromPlatformImage(gameData.ImageviewInvesterOfficeAvatar));
       // TableListOfOwnedProperties.set

        tabPane.getSelectionModel().select(TabMainScreen);

    }

    @FXML
    void RenovateBuilding(ActionEvent event) {

    }

    @FXML
    void SellProperty(ActionEvent event) {

    }

    @FXML
    void ButtonMainScreenEndDay(ActionEvent event) throws IOException {

        // Updates which day it is
        TextFieldDayCounter.clear();
        counter++;
        TextFieldDayCounter.setText("Day: " + counter);

        TextFieldHomePropertiesMarket.clear();
        TextFieldOfficePropertiesMarket.clear();
        TextAreaEventLog.clear();


        // Updates Property Market
        double randomHomeMarket = Math.random() * 20 - 10;
        randomHomeMarket = Math.round(randomHomeMarket);
        TextFieldHomePropertiesMarket.setText(valueOf(randomHomeMarket));

        double randomOfficeMarket = Math.random() * 20 - 10;
        randomOfficeMarket = Math.round(randomOfficeMarket);
        TextFieldOfficePropertiesMarket.setText(valueOf(randomOfficeMarket));

        //TODO multiply the values with the property prices to increase or decrease its value


        //Eventlog on End Day

        ArrayList<String> events = new ArrayList<>();

        events.add("The property market is going well\n+to Home and Office market");
        events.add("You’ve received positive reviews on yelp\nx amount of money gained");
        events.add("One of your building is in a upcoming neighborhood\n+ 5 to home properties");
        events.add("A fond has donated some money to your company\nx amount of money gained");
        events.add("A small fire has damaged one of your properties\nits income will be suspended until repaired");
        events.add("A rainfall gave one of your buildings flood damage\nits income will be suspended until repaired");
        events.add("A tenant have caused some minor damage to one of your properties\nits income will be suspended until repaired");
        events.add("A storm broke some windows in one of your properties\nits income will be suspended until repaired");
        events.add("A earthquake hit the area\nand one of your properties has sustained minor damage to its foundation\nits income will be suspended until repaired");
        events.add("A big football match took place near one of your buildings\nand hooligans destroyed the facade of one of your properties\nits income will be suspended until repaired");
        events.add("A heavy rainfall gave one of your buildings flood damage\nits income will be suspended until repaired");
        events.add("A tenant caused damage to one of your properties\nits income will be suspended until repaired");
        events.add("A fire has damaged one of your properties\nits income will be suspended until repaired");
        events.add("A tenant caused a lot of damage to one of your properties\nits income will be suspended until repaired");
        events.add("A very heavy rainfall gave one of your buildings very bad flood damage\nits income will be suspended until repaired");
        events.add("A big fire has destroyed most of the interior in one of your properties\nits income will be suspended until repaired");

        Collections.shuffle(events);
        if (counter > 5) {
            TextAreaEventLog.appendText(events.get(5));

        } else TextAreaEventLog.appendText("Nothing interesting happened");


        boolean ans = events.contains("The property market is going well\n+to Home and Office market");
        if (ans == true) {
            double randomUpdate = Math.random() * 5;
            int updatedMarket = (int) ((int) randomUpdate + randomHomeMarket);
            int updatedOfficeMarket = (int) ((int) randomUpdate + randomOfficeMarket);
            TextFieldHomePropertiesMarket.setText(valueOf(updatedMarket));
            TextFieldOfficePropertiesMarket.setText((valueOf(updatedOfficeMarket)));

        } else TextAreaEventLog.appendText("hello");

        GameData gameData = new GameData();

        gameData.TextFieldDayCounter = TextFieldDayCounter.getText();
        gameData.TextFieldName = TextFieldName.getText();
        gameData.TextFieldAge = TextFieldAge.getText();
        gameData.TextFieldCurrentAmountMoney = TextFieldCurrentAmountMoney.getText();
        gameData.TextFieldCurrentAmountDebt = TextFieldCurrentAmountDebt.getText();
        gameData.ImageviewInvesterOfficeAvatar = valueOf(ImageviewInvesterOfficeAvatar.getImage());
        gameData.TableListOfOwnedProperties = valueOf(TableListOfOwnedProperties.getItems());

        FileHandling fileHandling = new FileHandling();
        fileHandling.save(gameData);







    }


    @FXML
    void repairProperty(ActionEvent event) {


    }


}




