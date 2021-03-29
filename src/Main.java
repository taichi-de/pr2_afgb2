import java.util.Random;
import java.util.Scanner;

public class Main {
  public int currentTurn = 1;
  public int winPlayer = 0;
  public String playerMove;
  int skipCheck = 0;
  int currentLine;
  int currentColumn;

  public String[][] gameField = {
  };

  public String[][] getField(){
    return gameField;
  }
}
