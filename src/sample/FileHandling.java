package sample;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public void save(GameData gameData) throws IOException {
        File file = new File("gameData.txt");
        PrintWriter output = new PrintWriter(file);


        output.println(gameData.TextFieldDayCounter);
        output.println(gameData.TextFieldName);
        output.println(gameData.TextFieldAge);
        output.println(gameData.TextFieldCurrentAmountMoney);
        output.println(gameData.TextFieldCurrentAmountDebt);

        output.write(gameData.ImageviewInvesterOfficeAvatar);
        output.write(gameData.TableListOfOwnedProperties);

        output.close();

    }

    public GameData load () throws FileNotFoundException {

        File file = new File("gameData.txt");
        Scanner input = new Scanner(file);
        GameData gameData = new GameData();

        gameData.TextFieldDayCounter = input.nextLine();
        gameData.TextFieldName = input.nextLine();
        gameData.TextFieldAge = input.nextLine();
        gameData.TextFieldCurrentAmountMoney = input.nextLine();
        gameData.TextFieldCurrentAmountDebt = input.nextLine();

        //gameData.ImageviewInvesterOfficeAvatar = input.nextLine();
        //  gameData.TableListOfOwnedProperties = input.nextLine();

        return gameData;
    }
}