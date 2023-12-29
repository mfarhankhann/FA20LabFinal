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
class Notification {
    private String content;
    private boolean mandatoryFeedback;

    public Notification(String content, boolean mandatoryFeedback) {
        this.content = content;
        this.mandatoryFeedback = mandatoryFeedback;
    }

    public String getContent() {
        return content;
    }

    public boolean isMandatoryFeedback() {
        return mandatoryFeedback;
    }
}