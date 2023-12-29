/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communicationsystem;

import java.util.List;

/**
 *
 * @author fa20-bse-069
 */
class Iterator {
    public void iterateStakeholders(List<Stakeholder> stakeholders) {
        for (Stakeholder stakeholder : stakeholders) {
            System.out.println(stakeholder);
        }
    }
}
