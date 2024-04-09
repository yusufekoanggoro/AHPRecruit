package application.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;public class CandidateTableModel extends AbstractTableModel {
    List<CandidateModel> candidates;
    
    public CandidateTableModel(List<CandidateModel> candidates) {
        this.candidates = candidates;
    }

    @Override
    public int getRowCount() {
        return candidates.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "JKelamin";
            case 3:
                return "Pend Terakhir";
            case 4:
                return "No. HP";
            case 5:
                return "Alamat";
            case 6:
                return "Nilai Kepemimpinan";
            case 7:
                return "Pengetahuan";
            case 8:
                return "Kemampuan Teknis";
            case 9:
                return "Kemampuan Lanjutan";
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return candidates.get(row).getId();
            case 1:
                return candidates.get(row).getName();
            case 2:
                return candidates.get(row).getGender();
            case 3:
                return candidates.get(row).getLastEducation();
            case 4:
                return candidates.get(row).getPhoneNumber();
            case 5:
                return candidates.get(row).getAddress();
            case 6:
                return candidates.get(row).getLeadershipScore();
            case 7:
                return candidates.get(row).getKnowledgeScore();
            case 8:
                return candidates.get(row).getTechnicalSkillScore();
            case 9:
                return candidates.get(row).getAdvancedSkillScore();
            default:
                return null;
        }
    }
}