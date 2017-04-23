package haptic.connect


/*                          ==============  ***  ==============                          *
 #  ---------------------         Class ~Post~ Definition          --------------------  #
 *                          ===================================                          */

class Post {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */


/*  -------------------         *** Instantiate Variables ***       -------------------  */


    // Fixed Fields
    String postType // Direct message, review response, post, comment
    String website
    Date postDate
    Date timeStamp
    String postTitle
    String postContent
    String productsMentioned // JSON, Array, how do we store a list
    String competitorsMentioned // JSON, Array, how do we store a list
    String keywords // JSON, Array, how do we store a list
    Float score

    static constraints = {
    }

    static mapping = {
        postContent sqlType: 'longText'
        postTitle sqlType: 'longText'
    }
}
