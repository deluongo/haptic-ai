package haptic.fields

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Address)
class AddressSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test locName not blank"() {
        when: "Location name is blank"
            Address testAddress = new Address(  locName: '',
                                                locType: 'Main Office',
                                                streetNumber: 20,
                                                streetName: 'Harvard Street',
                                                city: 'Boston',
                                                state: 'MA',
                                                country: 'United States Of America',
                                                zip: '12345')

        then: "Fail validation"
            !testAddress.validate()
    }

    void "Test locType not blank"() {
        when: "Location type is blank"
            Address testAddress = new Address(  locName: 'Harvard University',
                                                locType: '',
                                                streetNumber: 20,
                                                streetName: 'Harvard Street',
                                                city: 'Boston',
                                                state: 'MA',
                                                country: 'United States Of America',
                                                zip: '12345')

        then: "Fail validation"
            !testAddress.validate()
    }

    void "Test streetName not blank"() {
        when: "Street name is blank"
            Address testAddress = new Address(  locName: 'Harvard University',
                                                locType: 'Main Office',
                                                streetNumber: 20,
                                                streetName: '',
                                                city: 'Boston',
                                                state: 'MA',
                                                country: 'United States Of America',
                                                zip: '12345')

        then: "Fail validation"
            !testAddress.validate()
    }

    void "Test city not blank"() {
        when: "City is blank"
            Address testAddress = new Address(  locName: 'Harvard University',
                                                locType: 'Main Office',
                                                streetNumber: 20,
                                                streetName: 'Harvard Street',
                                                city: '',
                                                state: 'MA',
                                                country: 'United States Of America',
                                                zip: '12345')

        then: "Fail validation"
            !testAddress.validate()
    }

    void "Test state not blank"() {
        when: "State is blank"
            Address testAddress = new Address(  locName: 'Harvard University',
                                                locType: 'Main Office',
                                                streetNumber: 20,
                                                streetName: 'Harvard Street',
                                                city: 'Boston',
                                                state: '',
                                                country: 'United States Of America',
                                                zip: '12345')

        then: "Fail validation"
            !testAddress.validate()
    }

    void "Test country not blank"() {
        when: "Country is blank"
            Address testAddress = new Address(  locName: 'Harvard University',
                                                locType: 'Main Office',
                                                streetNumber: 20,
                                                streetName: 'Harvard Street',
                                                city: 'Boston',
                                                state: 'MA',
                                                country: '',
                                                zip: '12345')

        then: "Fail validation"
            !testAddress.validate()
    }

    void "Test zip code in proper format"() {
        when: "Zip is not in proper format"
            Address testAddress = new Address(  locName: 'Harvard University',
                                                locType: 'Main Office',
                                                streetNumber: 20,
                                                streetName: 'Harvard Street',
                                                city: 'Boston',
                                                state: 'MA',
                                                country: 'United States of America',
                                                zip: '45678998765')

        then: "Fail validation"
            !testAddress.validate()
    }


}
