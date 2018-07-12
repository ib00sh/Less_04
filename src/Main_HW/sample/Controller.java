package Main_HW.sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;


    public void sendMsg() {
        if (textField.getText().isEmpty()){
            //textArea.appendText("Ошибка. Вы ничего не ввели");
            showDialog();
        }
        else {
            textArea.appendText("Вы: " + textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }

    }

    private void showDialog() {
        Alert dialog = new Alert(Alert.AlertType.INFORMATION);
        dialog.initStyle(StageStyle.UTILITY);
        dialog.setTitle("Ошибка!");
        dialog.setHeaderText("Вы ничего не ввели");
        dialog.showAndWait();
    }

}
