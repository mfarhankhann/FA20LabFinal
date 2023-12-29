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
class CaseManagement implements Observer {
    @Override
    public void updateRealTime(String message) {
        System.out.println("Case Management received real-time update: " + message);
    }
}