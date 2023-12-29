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
class CommunicationBuilder {
    private CommunicationObject communicationObject;

    public CommunicationBuilder() {
        reset();
    }

    public void reset() {
        this.communicationObject = new CommunicationObject();
    }

    public void buildMessage(String content) {
        communicationObject.setMessage(new Message(content));
    }

    public void buildAnnouncement(String content) {
        communicationObject.setAnnouncement(new Announcement(content));
    }

    public void buildNotification(String content, boolean mandatoryFeedback) {
        communicationObject.setNotification(new Notification(content, mandatoryFeedback));
    }

    public CommunicationObject getCommunicationObject() {
        CommunicationObject result = communicationObject;
        reset();
        return result;
    }
}

