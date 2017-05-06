package haptic.crm

import haptic.connect.Communication
import haptic.eval.Action
import haptic.eval.Note
import haptic.eval.Result
import haptic.org.Employee



/*                          ==============  ***  ==============                          *
 #  ---------------------         Class ~Lead~ Definition          --------------------  #
 *                          ===================================                          */

class Lead {
/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String status
    String leadStage // MQL, SAL, etc.
    String leadStatus // Converted, Qualified, Dis-qualified, etc.

    // BANT Qualification
    String budget // Yes, No, Unknown
    String auth // Yes, No, Unknown
    String need // Yes, No, Unknown
    String timing // Yes, No, Unknown

    String budgetDetails // Allocated $10,000 for new string CRM
    String authorityDetails //Final decision maker involved
    String needDetails //Broken CRM costing string thousands a month
    Date timingDetails

    Float estimatedDealSize
    Date dateOpened
    Date dateClosed



    // Possible Mapping, Pivot Table Candidates
    Employee leadOwner

    // Possible transient or service
    Action lastContact //Last Action
    Action lastResponse  // Reference to linked row in call, email, or post w/ most recent timestamp

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [contacts      : Contact, decisionMakers: Contact, internalChampions: Contact,
                      communications: Communication, actions: Action, results: Result,
                      notes         : Note]

    static hasOne = [company: Company]


    //TO-DO:
    //------
    // - Fix GORM Mappings
    //   - Need to include Mapping for self-referencing many-2-many
    //     - e.g. Contacts is broken into DecisionMakers, InternalChampions, Contacts, etc.

    static constraints = {
        status blank: false
        leadStage blank: false
        leadStatus inList: ['Converted', 'Qualified', 'Dis-qualified']
        lastContact nullable: true
        lastResponse nullable: true
        contacts nullable: true
        decisionMakers nullable: true
        internalChampions nullable: true
        communications nullable: true
        actions nullable: true
        results nullable: true
        notes nullable: true
        company unique: true
    }

/*  -------------------           *** List Transients ***         -------------------  */
    static transients = [
            /* ___  stats  ___ */
            'rankedContacts'
    ]


/*                          ==============  ***  ==============                          *
 #  ---------------------                Functions                 --------------------  #
 *                          ===================================                          */






/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** TRANSIENTS ***--- !!! ========================  */

/*  ---------------                 *** Helpers ***             ---------------  */
    /*  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *  ~~~~ LIST CONFERENCE STANDINGS ~~~~
     *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
    def getRankedContacts() {
        /*--|  LIST company CONTACTS -> SORT by HAPTIC SCORE  |--*/
        Contact.findAllByCompany(company).sort{it.neuralNetValue}.reverse()
    }



}
