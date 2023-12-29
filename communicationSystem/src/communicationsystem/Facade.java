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
class Facade {
    private Mediator mediator;

    public Facade(Mediator mediator) {
        this.mediator = mediator;
    }

    public void notifyStakeholders(String message) {
        mediator.sendNotification(message, null);
    }
}