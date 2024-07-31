package application.models;

import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class SelectionTableModel extends AbstractTableModel {
    List<SelectionModel> selections;
    DecimalFormat df2 = new DecimalFormat("0.000");
    
    public SelectionTableModel(List<SelectionModel> selections) {
        this.selections = selections;
    }

    @Override
    public int getRowCount() {
        return selections.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Ranking";
            case 2:
                return "Nama Calon Pelamar";
            case 3:
                return "No. HP";
            case 4:
                return "Hasil Penilaian";
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return selections.get(row).getId();
            case 1:
                return selections.get(row).getRanking();
            case 2:
                return selections.get(row).getName();
            case 3:
                return selections.get(row).getPhoneNumber();
            case 4:
                return df2.format(selections.get(row).getScore());
            default:
                return null;
        }
    }
}