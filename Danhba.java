import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.Collections;
import java.util.Comparator;

public class Danhba {

    public TextField tlPhone;
    public TextField txtName;
    public Text txtInfo;
    public ObservableList<InDanhBa> listNguoidung = FXCollections.observableArrayList();
    public ListView<InDanhBa> lv;
    public InDanhBa editNguoidung;
    public void submit(ActionEvent actionEvent) {
        String nn = txtName.getText();
        String tp = tlPhone.getText();

        if (editNguoidung == null){
            InDanhBa s = new InDanhBa(nn, tp);
            listNguoidung.add(s);
        }else {
            for (InDanhBa s : listNguoidung){
                if (s.ten.equals(editNguoidung.ten) && s.sdt.equals((editNguoidung).sdt)){
                    s.setTen(nn);
                    s.setSdt(tp);
                }
            }
        }
        lv.setItems(listNguoidung);
        lv.refresh();
        editNguoidung = null;
        clearInput();
    }
    void clearInput(){
        txtName.clear();
        tlPhone.clear();
    }
    public void edit(MouseEvent mouseEvent) {
        editNguoidung = lv.getSelectionModel().getSelectedItem();
        txtName.setText(editNguoidung.getTen());
        tlPhone.setText(editNguoidung.getSdt());
    }

    private boolean az = true;
    public void sort(ActionEvent actionEvent) {
        az = !az;
        Collections.sort(listNguoidung, new Comparator<InDanhBa>() {
            @Override
            public int compare(InDanhBa o1, InDanhBa o2) {
                if (az) {
                    return o1.ten.compareTo(o2.ten);
                } else {
                    return o2.ten.compareTo(o1.ten);
                }
            }
        });
    }
}
