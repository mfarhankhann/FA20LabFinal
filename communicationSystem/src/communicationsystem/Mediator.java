/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communicationsystem;

/**
 *
 * @author fa20-bse-069
 */
import java.util.ArrayList;
import java.util.List;

class Mediator {
    private List<Stakeholder> stakeholders = new ArrayList<>();

    public void registerStakeholder(Stakeholder stakeholder) {
        stakeholders.add(stakeholder);
    }

    public void sendMessage(String message, Stakeholder sender) {
        for (Stakeholder stakeholder : stakeholders) {
            if (!stakeholder.equals(sender)) {
                stakeholder.receiveMessage(message);
            }
        }
    }

    public void sendNotification(String notification, Stakeholder sender) {
        for (Stakeholder stakeholder : stakeholders) {
            if (!stakeholder.equals(sender)) {
                stakeholder.receiveNotification(notification);
            }
        }
    }

    public List<Stakeholder> getStakeholders() {
        return stakeholders;
    }

    void registerObserver(Observer caseManagement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}