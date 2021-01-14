package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private Button welcomeScreenStartButton;

    @FXML
    private Button welcomeScreenLoadButton;

    @FXML
    private ImageView ImageViewWelcomeScreenLogo;

    @FXML
    private Button DifficultyScreenEasyButton;

    @FXML
    private Button DifficultyScreenMediumButton;

    @FXML
    private Button DifficultyScreenHardButton;

    @FXML
    private TextField TextFieldCreateName;

    @FXML
    private TextField TextFieldEnterAge;

    @FXML
    private Button ButtonMale;

    @FXML
    private Button ButtonFemale;

    @FXML
    private Button ButtonStartInvesting;

    @FXML
    private TextField TextFieldName;

    @FXML
    private TextField TextFieldCurrentAmountMoney;

    @FXML
    private TextField TextFieldDayCounter;

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
    private TextField TextFieldHomePropertiesMarket;

    @FXML
    private TextField TextFieldOfficePropertiesMarket;

    @FXML
    private TextField TextFieldCurrentAmountDebt;

    @FXML
    private TextArea TextAreaEventLog;

    @FXML
    private Button ButtonNewProperties;

    @FXML
    private ImageView ImageViewNewPropertiesLeft;

    @FXML
    private ImageView ImageViewNewPropertiesMiddle;

    @FXML
    private ImageView ImageViewNewPropertiesRight;

    @FXML
    private Button ButtonBuyLeft;

    @FXML
    private Button ButtonBuyMiddle;

    @FXML
    private Button ButtonBuyRight;

    @FXML
    private ListView<?> ListViewOwnedProperties;

    @FXML
    private Button ButtonSell;

    @FXML
    private Button ButtonRenovate;

    @FXML
    private Button ButtonOwnedPropertiesBack;

    @FXML
    private Button ButtonConvert;

    @FXML
    private TextField TextFieldLoan1;

    @FXML
    private TextField TextFieldLoan2;

    @FXML
    private TextField TextFieldLoan3;

    @FXML
    private Button ButtonLoan1;

    @FXML
    private Button ButtonLoan2;

    @FXML
    private Button ButtonLoan3;

    @FXML
    private Button ButtonBankBack;

    @FXML
    private LineChart<?, ?> LineChartHome;

    @FXML
    private LineChart<?, ?> LineChartOffice;

    @FXML
    private Button ButtonPropertyMarketBack;

    @FXML
    private ListView<?> ListViewLeaderboard;

    @FXML
    private Button ButtonLeaderboadBack;

    @FXML
    void GoToCreateInvestor(ActionEvent event) {

    }

    @FXML
    void GoToDifficultyScreen(ActionEvent event) {

    }

    @FXML
    void LoadExistingData(ActionEvent event) {

    }

}
