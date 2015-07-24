package quero10

import grails.test.spock.IntegrationSpec

class GreatAreaIntegrationSpec extends IntegrationSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "Salvar e obter GreatArea do banco"() {
        when:
        def greatArea = new GreatArea(id: 1, title: 'Ciências Exatas e da Terra', description: 'Descrição detalhada do que é a Ciências Exatas e da Terra')

        then:
        greatArea.save() != null
        greatArea.id != null

        when:
        def foundUser = GreatArea.get(greatArea.id)

        then:
        1 == foundUser.id
    }
}
