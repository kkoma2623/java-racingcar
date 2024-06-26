package core.user;

import java.util.List;

public interface UserInterface {

  List<String> getCarNames();

  Boolean isUserCarNameCmdValidate(String userCarNamesCmd);

  Boolean checkCarNameLength(List<String> carNames);

  Boolean checkComma(String userCarNamesCmd);

  List<String> parseCarNames(String userCarNamesCmd);

  Integer getGameTimes();
}
