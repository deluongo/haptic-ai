package haptic.crm

import haptic.connect.Call
import haptic.connect.Email
import haptic.connect.Post
import haptic.eval.Action
import haptic.eval.Note
import haptic.eval.Result
import haptic.org.Employee

import javax.xml.ws.Response


/*                          ==============  ***  ==============                          *
 #  ---------------------         Class ~Lead~ Definition          --------------------  #
 *                          ===================================                          */

class Lead {
/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String title
    String leadStage // MQL, SAL, etc.
    String leadStatus // Converted, Qualified, Dis-qualified, etc.

    // BANT Qualification
    String budget // Yes, No, Unknown
    String authority // Yes, No, Unknown
    String need // Yes, No, Unknown
    String timing // Yes, No, Unknown
    String budgetDetails // Allocated $10,000 for new string CRM
    String authorityDetails //Final decision maker involved
    String needDetails //Broken CRM costing string thousands a month
    Date timingDetails
    Float estimatedDealSize
    Date dateOpened
    Date dateClosed
    Employee leadOwner


    // Possible Mapping, Pivot Table Candidates

    // Possible transient or service
    def lastResponse  // Reference to linked row in call, email, or post w/ most recent timestamp

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [contacts: Contact, decisionMakers: Contact, internalChampions: Contact,
                      calls: Call, emails: Email, posts: Post, actions: Action, results: Result,
                      notes: Note]

    //TO-DO:
    //------
    // - Fix GORM Mappings
    //   - Need to include Mapping for self-referencing many-2-many
    //     - e.g. Contacts is broken into DecisionMakers, InternalChampions, Contacts, etc.

    static constraints = {
    }
}
