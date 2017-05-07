package haptic.app

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import haptic.org.Employee
import spock.lang.Specification
import spock.lang.Unroll
import spock.lang.*
import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
@Mock([Employee])
class UserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    @Unroll
    void "test User username: #username password: #password employee: #employee , roleTitle: #roleTitle is valid: #result"() {
        when:
        User user = new User(username: username, password: password, employee: employee, roleTitle: roleTitle)

        then:
        user.validate() == result

        where:
        username    |   password    |   employee     |   roleTitle   |   result
        "user"      |   "pass"      |   null         |   "role"      |   true
        null        |   "pass"      |   Employee     |   "role"      |   false
        "user"      |   null        |   Employee     |   "role"      |   false
        "user"      |   "pass"      |   null         |   "role"      |   true
        "user"      |   "pass"      |   null         |   "role"      |   true
        "user"      |   "pass"      |   null         |   null        |   true
    }
}
