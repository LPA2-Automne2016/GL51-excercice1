import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

class IPFormater {

    @Inject
    List<IPResolver> resolver

    String myDoubledIPToBinaryString() {
        def currentResolver = resolver.find { it.canResolveCurrentIP()}
        def ip = resolver.doubleIP()
    }

    String myDoubledIPToHexaDecimal() {}


}
class Address {
    List<Integer> ipsegments
}

interface IPResolver {
    Adress doubleIP(Adress ip)
    boolean canResolveCurrentIP()
}

@Singleton
class IPv4Resolver implements IPResolver {

    Adress doubleIP(Adress ip) {

    }

    boolean canResolveCurrentIP() {

    }

}
