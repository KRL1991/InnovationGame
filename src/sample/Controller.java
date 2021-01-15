package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class Controller {

   @FXML
   TabPane tabPane;

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
   void BankLoan(ActionEvent event) {

   }

   @FXML
   void BuyProperties(ActionEvent event) {

   }

   @FXML
   void ConvertBuilding(ActionEvent event) {

   }

   @FXML
   void CreateInvestorChooseGender(ActionEvent event) {

   }

   @FXML
   void GoToBank(ActionEvent event) {
      tabPane.getSelectionModel().select(TabBank);

   }

   @FXML
   void GoToCreateInvestorEasy(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);
      //TODO tilføj 100.000 til currentAmount

   }

   @FXML
   void GoToCreateInvestorHard(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);
      //TODO tilføj 50.000 til currentAmount
   }

   @FXML
   void GoToCreateInvestorMedium(ActionEvent event) {
      tabPane.getSelectionModel().select(TabCreateInvestor);
      //TODO tilføj 75.000 til currentAmount
   }

   @FXML
   void GoToDifficultyScreen(ActionEvent event) {
      tabPane.getSelectionModel().select(TabDifficultyScreen);

   }

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

}
