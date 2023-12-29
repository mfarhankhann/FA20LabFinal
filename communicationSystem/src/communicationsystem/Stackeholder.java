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
class Stakeholder implements Observer {
    private Mediator mediator;
    private String name;

    public Stakeholder(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerStakeholder(this);
    }

    public void communicate(String message) {
        System.out.println(name + " is communicating: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received a message: " + message);
    }

    public void receiveNotification(String notification) {
        System.out.println(name + " received a notification: " + notification);
    }

    @Override
    public void updateRealTime(String message) {
        System.out.println(name + " received real-time update: " + message);
    }

    @Override
    public String toString() {
        return "Stakeholder: " + name;
    }
}
