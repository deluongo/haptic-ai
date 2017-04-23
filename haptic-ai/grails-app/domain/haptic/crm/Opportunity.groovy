package haptic.crm

import haptic.connect.Communication
import haptic.eval.Action
import haptic.eval.Note
import haptic.eval.Result
import haptic.org.Employee


/*                          ==============  ***  ==============                          *
 #  ---------------------      Class ~Opportunity~ Definition      --------------------  #
 *                          ===================================                          */


class Opportunity {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String status
    String opportunityStage // 10%, 25%, etc.
    String oportunityStatus // pre-Demo, Post-Demo, Post-RFP, etc.
    String nextStep

    // BANT Qualification
    String budget // Yes, No, Unknown
    String auth // Yes, No, Unknown
    String need // Yes, No, Unknown
    String timing // Yes, No, Unknown
    String budgetDetails // Allocated $10,000 for new string CRM
    String authorityDetails //Final decision maker involved
    String needDetails //Broken CRM costing string thousands a month
    Date timingDetails
    Date dateOpened
    Date dateClosed

    // Forcasts
    Date forcastedCloseDate
    Float projectedDealSize

    // Possible Mapping, Pivot Table Candidates
    Employee opportunityOwner

    // Possible transient or service
    Action lastContact //Last Action
    def lastResponse  // Reference to linked row in call, email, or post w/ most recent timestamp

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [contacts     : Contact, decisionMakers: Contact, internalChampions: Contact,
                      communication: Communication, actions: Action, results: Result,
                      notes        : Note, leads: Lead]

    static constraints = {
    }
}
