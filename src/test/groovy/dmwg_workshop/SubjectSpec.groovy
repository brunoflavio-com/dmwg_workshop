package dmwg_workshop

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Subject)
class SubjectSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "subject name can't be blank"() {
        when: "the name is blank"
            def subject = new Subject(name:"")            

        then: "subject is invalid"
            (!subject.validate()) && (!subject.save())
    }
}
