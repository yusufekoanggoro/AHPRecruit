package application.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AlternativeWeightTableModel extends AbstractTableModel {
    List<AlternativeWeightModel> alternatives;
    
    public AlternativeWeightTableModel(List<AlternativeWeightModel> alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public int getRowCount() {
        return alternatives.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama Calon Pelamar";
            case 2:
                return "Nilai Kepemimpinan";
            case 3:
                return "Pengetahuan";
            case 4:
                return "Kemampuan Teknis";
            case 5:
                return "Kemampuan Lanjutan";
            case 6:
                return "Bobot";
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return alternatives.get(row).getId();
            case 2:
                return alternatives.get(row).getName();
            case 3:
                return alternatives.get(row).getLeadershipScore();
            case 4:
                return alternatives.get(row).getKnowledgeScore();
            case 5:
                return alternatives.get(row).getTechnicalSkillScore();
            case 6:
                return alternatives.get(row).getAdvancedSkillScore();
            case 7:
                return alternatives.get(row).();
            default:
                return null;
        }
    }
}