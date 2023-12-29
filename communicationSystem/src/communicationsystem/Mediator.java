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
    private List<Observer> observers = new ArrayList<>();
    private List<Stakeholder> stakeholders = new ArrayList<>();

    public void registerStakeholder(Stakeholder stakeholder) {
        stakeholders.add(stakeholder);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
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
        notifyObservers(notification);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.updateRealTime(message);
        }
    }

    public List<Stakeholder> getStakeholders() {
        return stakeholders;
    }
}