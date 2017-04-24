package haptic.app

import haptic.eval.Note
import haptic.org.Employee
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/*                          ==============  ***  ==============                          *
 #  ---------------------         Class ~User~ Definition          --------------------  #
 *                          ===================================                          */



@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable {

/*  _________________________                                  ________________________  */
/*  ========================= !!! ---*** PROPERTIES ***--- !!! ========================  */



/*  -------------------             *** Default Params ***          -------------------  */
	private static final long serialVersionUID = 1
	transient springSecurityService

/*  -------------------         *** Instantiate Variables ***       -------------------  */

	// Default
	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	Employee employee

/*  -------------------             *** Default Params ***          -------------------  */
	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this)*.role
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}


/*  -------------------             *** List Transients ***         -------------------  */
	static transients = ['springSecurityService']

/*  -------------------              *** Constraints ***            -------------------  */
	static constraints = {
		password blank: false, password: true
		username blank: false, unique: true
	}

/*  -------------------          *** Database Designations ***      -------------------  */
	static mapping = {
		password column: '`password`'
	}

/*  -------------------             *** GORM Mapping ***            -------------------  */
	static hasMany = [notes: Note]

/*  -------------------           *** Transient Functions ***       -------------------  */

}
