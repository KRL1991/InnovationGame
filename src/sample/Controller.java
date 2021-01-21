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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    int currentAmountMoneyInt;
    String currentAmount;

    int counter;


ArrayList<String> ownedProperties = new ArrayList<>();
ArrayList<String> ownedPropertiesPrice = new ArrayList<>();

    ObservableList<String> observableListOwnedProperties = FXCollections.observableList(ownedProperties);
    ObservableList<String> observableListOwnedPropertiesPrice = FXCollections.observableList(ownedPropertiesPrice);



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
    private ImageView ImageviewInvesterOfficeAvatar;

    // Textfields -------------------------------------------------------------

    @FXML
    private TextField TextFieldCreateName;

    @FXML
    private TextField TextFieldEnterAge;

    @FXML
    private TextField TextFieldName;

    @FXML
    private TextField TextFieldCurrentAmountMoney;

    @FXML
    private TextField TextFieldDayCounter;

    @FXML
    private TextField TextFieldHomePropertiesMarket;

    @FXML
    private TextField TextFieldOfficePropertiesMarket;

    @FXML
    private TextField TextFieldCurrentAmountDebt;

    @FXML
    private TextField TextFieldLoan1;

    @FXML
    private TextField TextFieldLoan2;

    @FXML
    private TextField TextFieldLoan3;

    @FXML
    private TextField TextFieldAge;

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

    @FXML
    private TableView<String> TableListOfOwnedProperties;


    @FXML
    private TableColumn<?, ?> ListViewOwnedPropertiesProperty;

    @FXML
    private TableColumn<?, ?> ListViewOwnedPropertiesPrice;


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
    void BuyPropertiesLeft(ActionEvent event) {

    int housePrice = Integer.parseInt(NewPropertyLeftPrice.getText());

    int updatedAmountOfMoney = currentAmountMoneyInt - housePrice;

    TextFieldCurrentAmountMoney.setText(String.valueOf(updatedAmountOfMoney));

    currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

    String name = TextFieldNewPropertiesNameLeft.getText();
    String propertyPrice = String.valueOf(NewPropertyLeftPrice.getText());




    ownedProperties.add(name);
    ownedPropertiesPrice.add(String.valueOf(Integer.valueOf(propertyPrice)));

    /* ListViewOwnedProperties.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    ListViewOwnedProperties.setItems(observableListOwnedProperties);
    ListViewOwnedProperties.setItems(observableListOwnedPropertiesPrice);
   */
        System.out.println(observableListOwnedProperties);
        System.out.println(observableListOwnedPropertiesPrice);




        tabPane.getSelectionModel().select(TabMainScreen);
        //TODO If player doesn't have enough money they can't buy the property
    }

    @FXML
    void BuyPropertiesMiddle(ActionEvent event) {

        int housePrice = Integer.parseInt(NewPropertyMiddlePrice.getText());

        int updatedAmountOfMoney = currentAmountMoneyInt - housePrice;

        TextFieldCurrentAmountMoney.setText(String.valueOf(updatedAmountOfMoney));

        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        String name = TextFieldNewPropertiesNameMiddle.getText();
        int propertyPrice = Integer.parseInt(NewPropertyMiddlePrice.getText());

        ownedProperties.add(name);
        ownedPropertiesPrice.add(String.valueOf(propertyPrice));

        tabPane.getSelectionModel().select(TabMainScreen);

    }

    @FXML
    void BuyPropertiesRight(ActionEvent event) {

        int housePrice = Integer.parseInt(NewPropertyRightPrice.getText());

        int updatedAmountOfMoney = currentAmountMoneyInt - housePrice;

        TextFieldCurrentAmountMoney.setText(String.valueOf(updatedAmountOfMoney));

        currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());

        String name = TextFieldNewPropertiesNameRight.getText();
        int propertyPrice = Integer.parseInt(NewPropertyLeftPrice.getText());

        ownedProperties.add(name);
        ownedPropertiesPrice.add(String.valueOf(propertyPrice));

        tabPane.getSelectionModel().select(TabMainScreen);
    }

   @FXML
   void ConvertBuilding(ActionEvent event) {

   }

   @FXML
   void CreateInvestorChooseGender(ActionEvent event) {

       String name = TextFieldCreateName.getText();

       TextFieldName.clear();
       TextFieldName.setText(name);

       /*InputStream inputStream = getClass().getResourceAsStream("Logo/businessMan.png");
       Image male = new Image(inputStream);
       ImageView image = new ImageView(male);

       ImageviewInvesterOfficeAvatar.setImage(male);
       */

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

        currentAmount = String.valueOf(currentAmountMoneyInt);

        TextFieldCurrentAmountMoney.setText(currentAmount);

        int debt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        sumDebt = debt + 10000;

        TextFieldCurrentAmountDebt.setText(String.valueOf(sumDebt));

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

        currentAmount = String.valueOf(currentAmountMoneyInt);

        TextFieldCurrentAmountMoney.setText(currentAmount);

        int debt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        sumDebt3 = debt + 100000;

        TextFieldCurrentAmountDebt.setText(String.valueOf(sumDebt3));

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

        currentAmount = String.valueOf(currentAmountMoneyInt);

        TextFieldCurrentAmountMoney.setText(currentAmount);

        int debt = Integer.parseInt(TextFieldCurrentAmountDebt.getText());

        sumDebt2 = debt + 40000;

        TextFieldCurrentAmountDebt.setText(String.valueOf(sumDebt2));

        tabPane.getSelectionModel().select(TabMainScreen);
    }

// Difficulty Screen ----------------------------------------------------------

   @FXML
   void GoToCreateInvestorEasy(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);

       TextFieldCurrentAmountMoney.clear();
       TextFieldCurrentAmountMoney.setText("100000");
       currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());
       //TextFieldCurrentAmountMoney.appendText("$");
       TextFieldCurrentAmountDebt.clear();
       TextFieldCurrentAmountDebt.setText("0");
   }

   @FXML
   void GoToCreateInvestorHard(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);

       TextFieldCurrentAmountMoney.clear();
       TextFieldCurrentAmountMoney.setText("50000");
       currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());
      // TextFieldCurrentAmountMoney.appendText("$");
       TextFieldCurrentAmountDebt.clear();
       TextFieldCurrentAmountDebt.setText("0");
   }

   @FXML
   void GoToCreateInvestorMedium(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);

       TextFieldCurrentAmountMoney.clear();
       TextFieldCurrentAmountMoney.setText("75000");
       currentAmountMoneyInt = Integer.parseInt(TextFieldCurrentAmountMoney.getText());
       //TextFieldCurrentAmountMoney.appendText("$");
       TextFieldCurrentAmountDebt.clear();
       TextFieldCurrentAmountDebt.setText("0");


   }

   @FXML
   void GoToDifficultyScreen(ActionEvent event) {
      tabPane.getSelectionModel().select(TabDifficultyScreen);

   }
// .....

   @FXML
   void GoToInvestInNewProperty(ActionEvent event) throws FileNotFoundException {
      tabPane.getSelectionModel().select(TabNewProperties);

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


       ArrayList<Image> housePicture = new ArrayList<>();

       housePicture.add(lowEndHouse1);
       housePicture.add(lowEndHouse2);
       housePicture.add(lowEndHouse3);
       housePicture.add(lowEndHouse4);
       housePicture.add(lowEndHouse5);
       housePicture.add(lowEndHouse7);
       housePicture.add(midTierHouse1);
       housePicture.add(midTierHouse2);
       housePicture.add(midTierHouse3);
       housePicture.add(midTierHouse4);
       housePicture.add(midTierHouse5);
       housePicture.add(midTierHouse6);
       housePicture.add(midTierHouse7);
       housePicture.add(midTierHouse8);
       housePicture.add(midTierHouse9);
       housePicture.add(midTierHouse10);
       housePicture.add(luxeryProperty1);
       housePicture.add(luxeryProperty2);
       housePicture.add(luxeryProperty3);
       housePicture.add(luxeryProperty4);
       housePicture.add(luxeryProperty5);
       housePicture.add(luxeryProperty6);
       housePicture.add(luxeryProperty7);
       housePicture.add(luxeryProperty8);
       housePicture.add(luxeryProperty9);




       ArrayList<Integer> housePrices = new ArrayList<>();

       housePrices.add(15000);
       housePrices.add(20000);
       housePrices.add(17250);
       housePrices.add(23000);
       housePrices.add(25200);
       housePrices.add(23500);

       housePrices.add(50000);
       housePrices.add(55500);
       housePrices.add(60250);
       housePrices.add(58000);
       housePrices.add(65000);
       housePrices.add(62000);
       housePrices.add(52000);
       housePrices.add(60000);
       housePrices.add(56500);
       housePrices.add(64000);

       housePrices.add(110000);
       housePrices.add(125000);
       housePrices.add(140000);
       housePrices.add(145000);
       housePrices.add(161000);
       housePrices.add(115000);
       housePrices.add(181000);
       housePrices.add(128000);
       housePrices.add(200000);




ArrayList<String> propertyNames = new ArrayList<>();

       propertyNames.add("Low end house 1");
       propertyNames.add("Low end house 2");
       propertyNames.add("Low end house 3");
       propertyNames.add("Low end house 4");
       propertyNames.add("Low end house 5");
       propertyNames.add("Low end house 7");

       propertyNames.add("Medium tier house 1");
       propertyNames.add("Medium tier house 2");
       propertyNames.add("Medium tier house 3");
       propertyNames.add("Medium tier house 4");
       propertyNames.add("Medium tier house 5");
       propertyNames.add("Medium tier house 6");
       propertyNames.add("Medium tier house 7");
       propertyNames.add("Medium tier house 8");
       propertyNames.add("Medium tier house 9");
       propertyNames.add("Medium tier house 10");

       propertyNames.add("Luxery property house 1");
       propertyNames.add("Luxery property house 2");
       propertyNames.add("Luxery property house 3");
       propertyNames.add("Luxery property house 4");
       propertyNames.add("Luxery property house 5");
       propertyNames.add("Luxery property house 6");
       propertyNames.add("Luxery property house 7");
       propertyNames.add("Luxery property house 8");
       propertyNames.add("Luxery property house 9");


       double randomIndexLeft = Math.random()*25;
       ImageViewNewPropertiesLeft.setImage(housePicture.get((int)randomIndexLeft));
       NewPropertyLeftPrice.setText(String.valueOf(housePrices.get((int) randomIndexLeft)));
       TextFieldNewPropertiesNameLeft.setText(propertyNames.get((int) randomIndexLeft));

       double randomIndexMiddle = Math.random()*25;
       ImageViewNewPropertiesMiddle.setImage(housePicture.get((int)randomIndexMiddle));
       NewPropertyMiddlePrice.setText(String.valueOf(housePrices.get((int) randomIndexMiddle)));
       TextFieldNewPropertiesNameMiddle.setText(String.valueOf(propertyNames.get((int) randomIndexMiddle)));

       double randomIndexRight = Math.random()*25;
       ImageViewNewPropertiesRight.setImage(housePicture.get((int)randomIndexRight));
       NewPropertyRightPrice.setText(String.valueOf(housePrices.get((int) randomIndexRight)));
       TextFieldNewPropertiesNameRight.setText(String.valueOf(propertyNames.get((int) randomIndexRight)));



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
   void LoadExistingData(ActionEvent event) {

   }

   @FXML
   void RenovateBuilding(ActionEvent event) {

   }

   @FXML
   void SellProperty(ActionEvent event) {

   }

    @FXML
    void ButtonMainScreenEndDay(ActionEvent event) {

       // Updates which day it is
       TextFieldDayCounter.clear();
       counter++;
       TextFieldDayCounter.setText("Day: " + counter);

       TextFieldHomePropertiesMarket.clear();
       TextFieldOfficePropertiesMarket.clear();
       TextAreaEventLog.clear();


       // Updates Property Market
       double randomHomeMarket = Math.random()* 20- 10;
       randomHomeMarket = Math.round(randomHomeMarket);
       TextFieldHomePropertiesMarket.setText(String.valueOf(randomHomeMarket));

       double randomOfficeMarket = Math.random()* 20-10;
       randomOfficeMarket = Math.round(randomOfficeMarket);
       TextFieldOfficePropertiesMarket.setText(String.valueOf(randomOfficeMarket));

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
        if (ans==true) {
            double randomUpdate =  Math.random()*5;
            int updatedMarket = (int) ((int)randomUpdate + randomHomeMarket);
            int updatedOfficeMarket = (int) ((int)randomUpdate + randomOfficeMarket);
        TextFieldHomePropertiesMarket.setText(String.valueOf(updatedMarket));
        TextFieldOfficePropertiesMarket.setText((String.valueOf(updatedOfficeMarket)));

        } else TextAreaEventLog.appendText("hello");
}


    @FXML
    void repairProperty(ActionEvent event) {



    }


        }




