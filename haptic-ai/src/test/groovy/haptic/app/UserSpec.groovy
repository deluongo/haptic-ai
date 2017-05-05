package haptic.app

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Dashboard)
class UserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    @Unroll
    void "test User username: #username password: #password firstName: #firstName lastName: #lastName, roleTitle: #roleTitle is valid: #result"() {
        when:
        User user = new User(username: username, password: password, firstName: firstName, lastName: lastName, roleTitle: roleTitle)

        then:
        user.validate() == result

        where:
        username    |   password    |   firstName   |   lastName    |   roleTitle   |   result
        "user"      |   "pass"      |   "first"     |   "last"      |   "role"      |   true
        null        |   "pass"      |   "first"     |   "last"      |   "role"      |   false
        "user"      |   null        |   "first"     |   "last"      |   "role"      |   false
        "user"      |   "pass"      |   null        |   "last"      |   "role"      |   false
        "user"      |   "pass"      |   "first"     |   null        |   "role"      |   false
        "user"      |   "pass"      |   "first"     |   "last"      |   null        |   false
    }
}
