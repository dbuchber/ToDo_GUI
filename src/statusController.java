import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Status;

public class statusController {

    public ListView<Status> status_ListView;
    public TextField status_textField;


    public void initialize(){
        status_ListView.setItems(Status.getList());
    }

    public void item_selected(MouseEvent mouseEvent) {
        Status s = status_ListView.getSelectionModel().getSelectedItem();

        if(s != null){
            status_textField.setText(s.toString());
        }


    }
}
