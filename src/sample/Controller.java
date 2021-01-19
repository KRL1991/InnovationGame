package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.imageio.stream.ImageInputStream;
import javax.management.monitor.CounterMonitor;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Controller {
    int currentAmountMoneyInt;
    String currentAmount;

    int counter;


    ArrayList<Image> arrayName = new ArrayList<Image>();


    //ArrayList propertyPrices = new ArrayList();



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


    // TextArea -------------------------------------------------------------
    @FXML
    private TextArea TextAreaEventLog;

   // Misc -------------------------------------------------------------

    @FXML
    private ListView<?> ListViewOwnedProperties;

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
    void BuyPropertiesLeft(ActionEvent event) {

    }

    @FXML
    void BuyPropertiesMiddle(ActionEvent event) {

    }

    @FXML
    void BuyPropertiesRight(ActionEvent event) {

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
       //TextFieldCurrentAmountMoney.appendText("$");
       TextFieldCurrentAmountDebt.clear();
       TextFieldCurrentAmountDebt.setText("0");
   }

   @FXML
   void GoToCreateInvestorHard(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);

       TextFieldCurrentAmountMoney.clear();
       TextFieldCurrentAmountMoney.setText("50000");
      // TextFieldCurrentAmountMoney.appendText("$");
       TextFieldCurrentAmountDebt.clear();
       TextFieldCurrentAmountDebt.setText("0");
   }

   @FXML
   void GoToCreateInvestorMedium(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);

       TextFieldCurrentAmountMoney.clear();
       TextFieldCurrentAmountMoney.setText("75000");
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
   void GoToInvestInNewProperty(ActionEvent event) {
      tabPane.getSelectionModel().select(TabNewProperties);
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


       // Updates Property Market
       double randomHomeMarket = Math.random()* 20- 10;
       randomHomeMarket = Math.round(randomHomeMarket);
       TextFieldHomePropertiesMarket.setText(String.valueOf(randomHomeMarket));

       double randomOfficeMarket = Math.random()* 20-10;
       randomOfficeMarket = Math.round(randomOfficeMarket);
       TextFieldOfficePropertiesMarket.setText(String.valueOf(randomOfficeMarket));


   }

   void houses (){

       Image imageName = new Image("/housePictures/low end house 1.jpg");
       arrayName.add(imageName);
       arrayName.add(imageName);
   }


        }




