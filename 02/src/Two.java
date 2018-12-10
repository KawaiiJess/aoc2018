import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Two
{
    public static void main(String[] args)
    {
        String input = "mvgowxqubnhaefjslkjlrptzyi\n" +
                "pvgowlqubnhaefmslkjdrpteyi\n" +
                "ovgowoqubnhaefmslkjnrptzyi\n" +
                "cvgowxqubnrxefmslkjdrptzyo\n" +
                "cvgowxqubnhaefmsokjdrprzyf\n" +
                "cvgowxqubnhjeflslkjgrptzyi\n" +
                "cvgowxqvbnhaefmslkhdrotzyi\n" +
                "hvgowxqmbnharfmslkjdrptzyi\n" +
                "cvgoaxqubqhaefmslkjdrutzyi\n" +
                "cvxowxqdbnhaefmslkjdgptzyi\n" +
                "cvgikxqubnhaefmslkjdrptzyz\n" +
                "cvgnwxqubnhaqfjslkjdrptzyi\n" +
                "cqgowxqubnhaecmslkjgrptzyi\n" +
                "cvpowxqucnhaefmslkjdrptzyz\n" +
                "fvuoexqubnhaefmslkjdrptzyi\n" +
                "svgowxqubnhaefmsvkjdrttzyi\n" +
                "cvgowxqubnhaefmblkjdfpbzyi\n" +
                "cvkoyxqubnhaefsslkjdrptzyi\n" +
                "bvgowxqublhaefmslkjdrptzfi\n" +
                "xvgewxqubnhaefmslkjdrztzyi\n" +
                "cvgowxqubzhaefmslkkrrptzyi\n" +
                "cvgowxqubnhaefmslkudruuzyi\n" +
                "cvgowxqubnhaefmvlkjdrptwyl\n" +
                "cvgoyxqubnhaefmslkjvrotzyi\n" +
                "cvgowxoubnhaewmslkjdrpbzyi\n" +
                "cvgowxgubnhaefmslijdrptzxi\n" +
                "lvgowxqkbnhaefmslkjdrptzqi\n" +
                "xvgowxqubyhaefmflkjdrptzyi\n" +
                "wvnowxgubnhaefmslkjdrptzyi\n" +
                "cvgowxguwnhaefhslkjdrptzyi\n" +
                "cvgowfquxnhaefmdlkjdrptzyi\n" +
                "cvgywxqubnuaefmsldjdrpfzyi\n" +
                "cvkowxqzbrhaefmslkjdrptzyi\n" +
                "cviowxzubnhaefmslkjdrptqyi\n" +
                "cvgowxqubnhaefmsozjdrptzyc\n" +
                "cvglwxuubnhaewmslkjdrptzyi\n" +
                "cvgowxquknhaebmsfkjdrptzyi\n" +
                "vvgowxqubnhaesmslkjdrptzri\n" +
                "cvgowxoubndaefmslkjdrftzyi\n" +
                "cvgowxqubghaefmslkjdeptzyw\n" +
                "cvgowxqubnhaetmhlkjdrpvzyi\n" +
                "cvgowmquunhaefmslkjdrptzyt\n" +
                "cvgooxqpbniaefmslkjdrptzyi\n" +
                "cvgowxqubnhaeumslkjdkptiyi\n" +
                "cvgrwxqsbnhaemmslkjdrptzyi\n" +
                "cvrowxqubnhaefmslkjdrctcyi\n" +
                "dvgcwxqubnhaefmslkjdrptzyq\n" +
                "cugowxqubnhasfmmlkjdrptzyi\n" +
                "cwgowxqobzhaefmslkjdrptzyi\n" +
                "cvgowxquwnhaefmulkjdrptbyi\n" +
                "nvgowxqmbnhaefmslyjdrptzyi\n" +
                "cvgowxqubniakvmslkjdrptzyi\n" +
                "cvyowxqubnhaefmslejdrptzyx\n" +
                "cvgobxqubghaefeslkjdrptzyi\n" +
                "cvgowxiubnhaebmslkjdfptzyi\n" +
                "cvgosbqubnhaefmslkvdrptzyi\n" +
                "cvgpwxqubnhaefvslkjdrptzyh\n" +
                "cvgowxqubnyaefmslgjdsptzyi\n" +
                "cvgowxqubnhaefmslkjdrprzzp\n" +
                "cvgowxqubwhaemmslkjdrpazyi\n" +
                "cvgowxqpbnhaemmslkjdrpczyi\n" +
                "cvgoqxqubnhaelmslkjdrptzye\n" +
                "cvgowxqubnhaefmslbjdrttzvi\n" +
                "cvgowxqubnhlefmslkvurptzyi\n" +
                "cvgowxqujngaefmslktdrptzyi\n" +
                "cvgowxqubnhaefmsckjdcwtzyi\n" +
                "cvcowxqubnhaetmslkjorptzyi\n" +
                "jvnowxqubnhaefmslkjdrptzyf\n" +
                "cygowxqkbnhaefmslejdrptzyi\n" +
                "cvmowxqubnhaefmslkjdritzoi\n" +
                "cvgowxqubnpaefmslkjdrpnnyi\n" +
                "cvgowxqubnhaefmolkjdrpnzyy\n" +
                "uvgowxoubnhaefmslkjdrptzvi\n" +
                "cvgowxbabehaefmslkjdrptzyi\n" +
                "cvgokxqubnhaefmsckjdrjtzyi\n" +
                "cvgoxwqubahaefmslkjdrptzyi\n" +
                "cvgowxqusnhaefmslijdrptyyi\n" +
                "cvgowxqubmhaeqmslkxdrptzyi\n" +
                "cvgouxhubnhaefmslkjdrjtzyi\n" +
                "cvgowxqubnhaefmslrjdqptzyk\n" +
                "cvgowxiublhaefsslkjdrptzyi\n" +
                "cvgowxqubnxgefmslkadrptzyi\n" +
                "ovgowxqugshaefmslkjdrptzyi\n" +
                "cvgowxquznhaeemslsjdrptzyi\n" +
                "cvkowxqubnhaeomslkjdeptzyi\n" +
                "cvgvwxqubxhaefmslkjdrptzyu\n" +
                "cvglwxqybnhaefmslkjdrptzyb\n" +
                "cvgowxqubnlfwfmslkjdrptzyi\n" +
                "cvaowxqubnhaefmslkjdrvtzbi\n" +
                "cvgowxqubnrmefaslkjdrptzyi\n" +
                "cvgowxqubnhaefmsnkjdfpwzyi\n" +
                "cvgawxqmbnhaefmsykjdrptzyi\n" +
                "chgowmqubnhaefmslkjdrptwyi\n" +
                "cogowxqubnhaefmslkjxrptzri\n" +
                "cvgohxqubnoaesmslkjdrptzyi\n" +
                "cvdowxqubnhaofmslkjdrpvzyi\n" +
                "vvgowrqubnhaefmslkjdrpthyi\n" +
                "cvgowxquknhuefmslkjdoptzyi\n" +
                "cvyowxeubnhaefmslhjdrptzyi\n" +
                "cvglwxqubnhaefmslkjdrptdyq\n" +
                "cvgowxqubnhaefmsikgdrptayi\n" +
                "cvgowxqubnhaefjhlkjdrpczyi\n" +
                "cvgzwxkubnhaefmslkjdjptzyi\n" +
                "cxgowxqubnhaefmslkjdrptwyy\n" +
                "cvgowxqubnhaefeslkjdrmqzyi\n" +
                "cvgowxvubnhaefmilijdrptzyi\n" +
                "cvgowxqzbthaeomslkjdrptzyi\n" +
                "cvgowhqubndaefmglkjdrptzyi\n" +
                "cvgowxvubnhaeamylkjdrptzyi\n" +
                "cvgowiqubnhgefmslkjdrctzyi\n" +
                "cvgowxqubchaefmslksdritzyi\n" +
                "cvgowxqubnhaefmsnkjdreyzyi\n" +
                "cvgowxqubihaefmslkgdrutzyi\n" +
                "cvgowxqjbnhaeamslkjdrptzwi\n" +
                "cvgowxzubnhaefmsxkjdrrtzyi\n" +
                "cvgowxqubyhaetmslnjdrptzyi\n" +
                "cvgowxquhnhaebmslkjdxptzyi\n" +
                "cvgowxqubnhanfmslujdxptzyi\n" +
                "cvgowxqublhnefaslkjdrptzyi\n" +
                "cvgmwxqtbnhaefmslkjsrptzyi\n" +
                "jvgowxqubnhaeamslkjdrpmzyi\n" +
                "cvgowxqubhiaefmsljjdrptzyi\n" +
                "svgowxqubnhaefmswkjdrpozyi\n" +
                "cvgowxqebnhaeqmslkjdiptzyi\n" +
                "cveowxqubnhayzmslkjdrptzyi\n" +
                "cvglwxqubnhaefmxlkjdiptzyi\n" +
                "cvgowkqubdhaefmszkjdrptzyi\n" +
                "cvgowxkxbnhaeffslkjdrptzyi\n" +
                "cugowxqubnnaefmslujdrptzyi\n" +
                "cqgowxwubnhaepmslkjdrptzyi\n" +
                "cvgowxqubnhayfmmlkjwrptzyi\n" +
                "cvgowxquenhaefmsskxdrptzyi\n" +
                "cvgowxqubnhiefmsrkjdtptzyi\n" +
                "mvgowxkubnhaefmjlkjdrptzyi\n" +
                "cvgowkquunhaefmglkjdrptzyi\n" +
                "cvgowxqubqhaexmslgjdrptzyi\n" +
                "jvgowxqubnhaefmslkjddptlyi\n" +
                "cvgiwxqubnhaefmslkjdpptmyi\n" +
                "czgowxqubntaevmslkjdrptzyi\n" +
                "cvgotmqubnhaefmslkjdrpazyi\n" +
                "cvgowxtubnhaefmslkqdtptzyi\n" +
                "cvbowxqhnnhaefmslkjdrptzyi\n" +
                "cvgowkqubshaefmstkjdrptzyi\n" +
                "cvgowqqrbnaaefmslkjdrptzyi\n" +
                "cvgoixqubnhaefmslkjdrpmryi\n" +
                "cvgoxxqubnhaeimsxkjdrptzyi\n" +
                "cvgowxqubzhaebmslkjyrptzyi\n" +
                "cjgewxqubnhaefsslkjdrptzyi\n" +
                "cvgowxqdbnkaefmslwjdrptzyi\n" +
                "cvgowxqzbnhaeamslkjdrftzyi\n" +
                "cvgoixqubnsaewmslkjdrptzyi\n" +
                "cvgswxqubnhaxfmslkjdrptzni\n" +
                "cvwowxmubnhgefmslkjdrptzyi\n" +
                "cvggwxqubnhaefmslqjdbptzyi\n" +
                "cvgzwxqjbnhaefaslkjdrptzyi\n" +
                "cvgowzqubnharfmspkjdrptzyi\n" +
                "cvgowxqubnhawfmslkjdeptzyb\n" +
                "cvuowequbnhaefmslkjdrntzyi\n" +
                "gvgowxqubnxaefmslkjdrjtzyi\n" +
                "cvgowxqubnhmetmsldjdrptzyi\n" +
                "cvgowxqubnhamfmsqkjdrptyyi\n" +
                "cvgoqxqubnhaefmslkjtrpazyi\n" +
                "cvgoexqubhhaefmslkjdrhtzyi\n" +
                "cvgowwqubnhaeflslkjdrptzyf\n" +
                "cvgowlpubnhaefmslkjdrptvyi\n" +
                "cvgowxouunhaebmslkjdrptzyi\n" +
                "cvdowhqubnhaefmslijdrptzyi\n" +
                "cvgowxqubnkatfmslkjdrhtzyi\n" +
                "cvgowxqpbnhxeumslkjdrptzyi\n" +
                "cvgowxqubnhaefmsukjjrptzyn\n" +
                "cvgowxqubnhmefmslzjdrvtzyi\n" +
                "cvtowxqubihaefmclkjdrptzyi\n" +
                "chgowcqubnhayfmslkjdrptzyi\n" +
                "cvguwxqubnhaefmblkjarptzyi\n" +
                "cvgowoqubnhaefmsikjdrytzyi\n" +
                "cvgkwxqubnhaefmslkjdrptchi\n" +
                "cvhowxqubnhaefmslkjdrvlzyi\n" +
                "cvlowxfubnhaefmslkjkrptzyi\n" +
                "cvgowxqubhhaefoslkjdrytzyi\n" +
                "cvgowxsubqhaefmslpjdrptzyi\n" +
                "cvgowxpubnhaefmslhjdrptzyb\n" +
                "cvgowxqubnhrefmjlkddrptzyi\n" +
                "cvgowxqubnhaxfmykkjdrptzyi\n" +
                "mvgowxqubnhakfmslkjdrptnyi\n" +
                "cwgowxqubnhaffmslkadrptzyi\n" +
                "chgowxquwnhaefmslsjdrptzyi\n" +
                "cvgowxqubnhaefmslkjdwpnsyi\n" +
                "cvgawxqubnhaefmslkldyptzyi\n" +
                "cvgowxqubnhiefmslkjdiprzyi\n" +
                "cvgkqxqubnhaefcslkjdrptzyi\n" +
                "cvgovoqubnhaefmslkjdrpuzyi\n" +
                "cvgowxqubnhaefmszkjdrjtzyk\n" +
                "cvgopxqubnhaefmslkjdqpnzyi\n" +
                "cvgtwxqubnhaefmslkjnrptzri\n" +
                "cvgowxqurnhaedmslfjdrptzyi\n" +
                "cvpowxqubnhaefmswkjdrltzyi\n" +
                "cvgowxqujnpaefmslkjdrptdyi\n" +
                "cvgowgqubnhzifmslkjdrptzyi\n" +
                "lvgowxqubnhaenmslkjdbptzyi\n" +
                "ebgowxqubnhaeymslkjdrptzyi\n" +
                "cvgowxtubqhaefmslkedrptzyi\n" +
                "cvgowxqubshaesmslkjdrptryi\n" +
                "cvgowxqubnhaefmflkjmrpkzyi\n" +
                "cvgowxqubngaefmslkjdrytzgi\n" +
                "cvgowxqubnhaefmslklhzptzyi\n" +
                "cveowxqubnhgefmslkjdrpezyi\n" +
                "cvgowxqubnhaeomslkjdrqtzym\n" +
                "cvgowxqubzhaefmslwjdrptfyi\n" +
                "cmgowxqubnhaefmsdkjdrptzui\n" +
                "cvlowxqubnhaefmslsjdrptzwi\n" +
                "cvhowxpubnhaefmslkjhrptzyi\n" +
                "cveosxqurnhaefmslkjdrptzyi\n" +
                "cvgowxqubnhaefgsdkjdrptjyi\n" +
                "cvgvwxqubnhaefmslzjdmptzyi\n" +
                "cviowxqubnhalfmslkjdrptzyr\n" +
                "cvgowxqubchqefmslkjdrptzoi\n" +
                "cvgownqubnhaefmsyktdrptzyi\n" +
                "cvgywxqubnuaefmslkjdrpfzyi\n" +
                "cvgobxqunnhaefmslkjdrptzbi\n" +
                "cvgowxqubshaefgslkjdrxtzyi\n" +
                "cvghwxqubnhaefmslkjdrbtmyi\n" +
                "cvhowxqubnhaefmslkjdrpnzys\n" +
                "cvgowxqubnmaefmslejdrptzyq\n" +
                "cvmrwxqubnhaefmslkjdrpzzyi\n" +
                "cvgowxqubshaefmslkfdrptzyu\n" +
                "cvgowqqubnhaefmslkodrpjzyi\n" +
                "cvgnwnquknhaefmslkjdrptzyi\n" +
                "cvgowxquxnhacfmflkjdrptzyi\n" +
                "ovgowxqubnhaefmslkjmrmtzyi\n" +
                "cvgowxqubneaefmslkedrptzqi\n" +
                "cvgowxqubphweflslkjdrptzyi\n" +
                "cvgowxqudnhaefmplkjdrptdyi\n" +
                "cvwowxbubnhaefmslkjurptzyi\n" +
                "cvgowxtubnhaefmslkjdrwwzyi\n" +
                "cvgowxqubnhkefmslajdrptzyn\n" +
                "cvgowxqxbphaefmslkjdrptzsi\n" +
                "cvgowxquenhaefmslmjwrptzyi\n" +
                "zvgowdqubnhaeftslkjdrptzyi\n" +
                "csgowxqubnhgefmslkjdrptzyy\n" +
                "cvgolxqubahaefmslkjdrpvzyi\n" +
                "cvgoqxquhwhaefmslkjdrptzyi\n" +
                "cvgawxqubghaefmsrkjdrptzyi\n" +
                "cvgozxqubnhaefmslkwdfptzyi\n" +
                "cvgowxqubnhaefmslhjdkptzzi\n" +
                "cvnowxqubnhaefmsqkjdrptqyi\n" +
                "cvpowxqubnhaefmslkpdrptdyi\n" +
                "cvgowxoubnhaermslkjdrctzyi\n" +
                "cvgowxqubnheefmslkjdrctzyr\n" +
                "cvgowxqunnhaqfhslkjdrptzyi\n" +
                "cvgowxqulnhaefmslrjdrntzyi";

        Scanner in = new Scanner(input);
        List<String> lines = new ArrayList<>();

        while (in.hasNextLine())
        {
            lines.add(in.nextLine());
        }

        for (String line : lines)
        {
            for (String other : lines)
            {
                int count = 0;

                for (int j = 0; j < other.length(); j++)
                {
                    if (line.charAt(j) == other.charAt(j))
                    {
                        count++;
                    }
                }

                if (count == other.length() - 1)
                {
                    String output = "";

                    for (int j = 0; j < other.length(); j++)
                    {
                        if (line.charAt(j) == other.charAt(j))
                        {
                            output += line.charAt(j);
                        }
                    }
                    System.out.println(output);
                    System.exit(0);
                }
            }
        }
    }
}
