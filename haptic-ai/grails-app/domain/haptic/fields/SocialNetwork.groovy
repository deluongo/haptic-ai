package haptic.fields

import haptic.connect.Post


/*                          ==============  ***  ==============                          *
 #  ---------------------     Class ~SocialNetwork~ Definition     --------------------  #
 *                          ===================================                          */



class SocialNetwork {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String networkName //Facebook, Twitter, LinkedIn, Pintrist, GitHub, Google, etc.
    String networkUrl
    String handle //CaptainAwesome650
    Date lastActivity
    Post lastPost
    Date lastOnline

/*  -------------------             *** GORM Mapping ***            -------------------  */
    static hasMany = [posts: Post]


    static constraints = {
    }
}
