package haptic.crm

import haptic.connect.Communication
import haptic.eval.Action
import haptic.eval.Note
import haptic.eval.Result
import haptic.org.Employee


/*                          ==============  ***  ==============                          *
 #  ---------------------       Class ~Customer~ Definition        --------------------  #
 *                          ===================================                          */


class Customer {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String status //Sentance summarizing state of the relationsip
    String customerStatus //Active, Churned, At-Risk, int Expired, Upsell Opportunity
    Date dateOpened
    Date dateClosed
    Float revenue
    Date renewalDate


    // Possible Mapping, Pivot Table Candidates
    Company company
    Employee accountManager
    Employee qualifiedBy
    Employee wonBy
    Employee customerSuccessManager


    // Possible transient or service
    Action lastContact //Last Action
    def lastResponse  // Reference to linked row in call, email, or post w/ most recent timestamp


/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [contacts      : Contact, decisionMakers: Contact, internalChampions: Contact,
                      communications: Communication, actions: Action, results: Result,
                      notes         : Note]


    static constraints = {
        status blank: false
        customerStatus inList: ['Active', 'Churned', 'At-Risk', 'Expired', 'Upsell Opportunity']
    }
}
