/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yusuf
 */
public class AlternativeWeightModel {

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLeadershipScore() {
        return leadershipScore;
    }

    public void setLeadershipScore(double leadershipScore) {
        this.leadershipScore = leadershipScore;
    }

    public double getKnowledgeScore() {
        return knowledgeScore;
    }

    public void setKnowledgeScore(double knowledgeScore) {
        this.knowledgeScore = knowledgeScore;
    }

    public double getTechnicalSkillScore() {
        return technicalSkillScore;
    }

    public void setTechnicalSkillScore(double technicalSkillScore) {
        this.technicalSkillScore = technicalSkillScore;
    }

    public double getAdvancedSkillScore() {
        return advancedSkillScore;
    }

    public void setAdvancedSkillScore(double advancedSkillScore) {
        this.advancedSkillScore = advancedSkillScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private int id;
    private double leadershipScore;
    private double knowledgeScore;
    private double technicalSkillScore;
    private double advancedSkillScore;
    public double weight;
    private String name; 
    
    public static List<AlternativeWeightModel> fromArray(Object[][] dataArray) {
        List<AlternativeWeightModel> models = new ArrayList<>();
        for (Object[] data : dataArray) {
            AlternativeWeightModel model = new AlternativeWeightModel();
            model.setId((Integer) data[0]);
            model.setName((String) data[1]);
            model.setLeadershipScore((Double) data[2]);
            model.setKnowledgeScore((Double) data[3]);
            model.setTechnicalSkillScore((Double) data[4]);
            model.setAdvancedSkillScore((Double) data[5]);
            model.weight = (Double) data[6];  // Assuming weight is at index 6
            models.add(model);
        }
        return models;
    }
}
