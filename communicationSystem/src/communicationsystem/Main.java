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
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Facade facade = new Facade(mediator);

        Stakeholder stakeholder1 = new Stakeholder("Stakeholder 1", mediator);
        Stakeholder stakeholder2 = new Stakeholder("Stakeholder 2", mediator);

        facade.notifyStakeholders("Important Announcement!");

        CommunicationBuilder builder = new CommunicationBuilder();
        builder.buildMessage("Hello World");
        CommunicationObject communicationObject = builder.getCommunicationObject();

        stakeholder1.communicate(communicationObject.getMessage().getContent());
        stakeholder2.communicate(communicationObject.getAnnouncement().getContent());

        Iterator iterator = new Iterator();
        iterator.iterateStakeholders(mediator.getStakeholders());

        TemplateMethod templateMethod = new TemplateMethod() {
            @Override
            void step1() {
                System.out.println("Step 1");
            }

            @Override
            void step2() {
                System.out.println("Step 2");
            }

            @Override
            void step3() {
                System.out.println("Step 3");
            }
        };

        templateMethod.executeTemplate();

        Observer caseManagement = new CaseManagement();
        mediator.registerObserver(caseManagement);

        facade.notifyStakeholders("New Update!");

        Notification notification = new Notification("Compliance Issue", true);
        mediator.sendNotification(notification.getContent(), stakeholder1);

        Notification nonMandatoryNotification = new Notification("Non-Mandatory", false);
        mediator.sendNotification(nonMandatoryNotification.getContent(), stakeholder2);
    }
}