import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        String input = "position=< 10775, -31651> velocity=<-1,  3>\n" +
                "position=<-21064, -42262> velocity=< 2,  4>\n" +
                "position=< 53217,  53247> velocity=<-5, -5>\n" +
                "position=<-42269, -52869> velocity=< 4,  5>\n" +
                "position=< 10768,  53245> velocity=<-1, -5>\n" +
                "position=<-31694,  53253> velocity=< 3, -5>\n" +
                "position=< 42632, -10428> velocity=<-4,  1>\n" +
                "position=<-10439,  53253> velocity=< 1, -5>\n" +
                "position=<-21043,  42635> velocity=< 2, -4>\n" +
                "position=<-21032, -52876> velocity=< 2,  5>\n" +
                "position=<-52911, -42259> velocity=< 5,  4>\n" +
                "position=< 10771,  53252> velocity=<-1, -5>\n" +
                "position=<-31695, -52867> velocity=< 3,  5>\n" +
                "position=< 32001,  21417> velocity=<-3, -2>\n" +
                "position=<-10478,  42641> velocity=< 1, -4>\n" +
                "position=< 42611, -52871> velocity=<-4,  5>\n" +
                "position=<-31662, -21031> velocity=< 3,  2>\n" +
                "position=<-42288,  32025> velocity=< 4, -3>\n" +
                "position=<-10441,  42638> velocity=< 1, -4>\n" +
                "position=< 10799, -31651> velocity=<-1,  3>\n" +
                "position=< 10796,  42635> velocity=<-1, -4>\n" +
                "position=<-42276, -31652> velocity=< 4,  3>\n" +
                "position=< 21372, -31650> velocity=<-2,  3>\n" +
                "position=< 10800,  10799> velocity=<-1, -1>\n" +
                "position=< 21367, -52870> velocity=<-2,  5>\n" +
                "position=<-42267,  21411> velocity=< 4, -2>\n" +
                "position=< 42627, -52875> velocity=<-4,  5>\n" +
                "position=<-10441,  42639> velocity=< 1, -4>\n" +
                "position=<-42305, -31648> velocity=< 4,  3>\n" +
                "position=< 42640, -42264> velocity=<-4,  4>\n" +
                "position=< 42583, -21031> velocity=<-4,  2>\n" +
                "position=<-31681, -21037> velocity=< 3,  2>\n" +
                "position=< 10801, -10424> velocity=<-1,  1>\n" +
                "position=< 53244, -21039> velocity=<-5,  2>\n" +
                "position=< 53235, -21040> velocity=<-5,  2>\n" +
                "position=< 42592, -31652> velocity=<-4,  3>\n" +
                "position=<-10428,  53252> velocity=< 1, -5>\n" +
                "position=<-21092, -42260> velocity=< 2,  4>\n" +
                "position=<-21083, -52867> velocity=< 2,  5>\n" +
                "position=<-31681, -52871> velocity=< 3,  5>\n" +
                "position=< 32015, -21035> velocity=<-3,  2>\n" +
                "position=< 31967, -42257> velocity=<-3,  4>\n" +
                "position=<-42277,  53252> velocity=< 4, -5>\n" +
                "position=<-42269,  53244> velocity=< 4, -5>\n" +
                "position=<-31654,  42638> velocity=< 3, -4>\n" +
                "position=<-31680,  10798> velocity=< 3, -1>\n" +
                "position=< 21381, -31649> velocity=<-2,  3>\n" +
                "position=< 31979, -21032> velocity=<-3,  2>\n" +
                "position=< 10769, -42260> velocity=<-1,  4>\n" +
                "position=<-31705, -21040> velocity=< 3,  2>\n" +
                "position=< 53248, -52869> velocity=<-5,  5>\n" +
                "position=<-10424, -31646> velocity=< 1,  3>\n" +
                "position=<-31702,  42632> velocity=< 3, -4>\n" +
                "position=<-42288, -42257> velocity=< 4,  4>\n" +
                "position=< 21355,  10800> velocity=<-2, -1>\n" +
                "position=<-10457,  10797> velocity=< 1, -1>\n" +
                "position=<-21052, -42255> velocity=< 2,  4>\n" +
                "position=< 10777,  53244> velocity=<-1, -5>\n" +
                "position=<-10452, -31650> velocity=< 1,  3>\n" +
                "position=< 31983, -10419> velocity=<-3,  1>\n" +
                "position=< 21355,  53245> velocity=<-2, -5>\n" +
                "position=< 42603, -42257> velocity=<-4,  4>\n" +
                "position=<-31645,  53250> velocity=< 3, -5>\n" +
                "position=< 21392, -10420> velocity=<-2,  1>\n" +
                "position=<-52881,  32026> velocity=< 5, -3>\n" +
                "position=<-42297, -21037> velocity=< 4,  2>\n" +
                "position=<-10425,  32020> velocity=< 1, -3>\n" +
                "position=< 10759,  21408> velocity=<-1, -2>\n" +
                "position=< 31979,  10796> velocity=<-3, -1>\n" +
                "position=<-31649, -10428> velocity=< 3,  1>\n" +
                "position=< 10794,  21414> velocity=<-1, -2>\n" +
                "position=<-10461, -10425> velocity=< 1,  1>\n" +
                "position=<-52908, -10419> velocity=< 5,  1>\n" +
                "position=<-10449,  42635> velocity=< 1, -4>\n" +
                "position=<-42290,  53249> velocity=< 4, -5>\n" +
                "position=<-31652,  21410> velocity=< 3, -2>\n" +
                "position=< 31985, -31648> velocity=<-3,  3>\n" +
                "position=< 21374, -31647> velocity=<-2,  3>\n" +
                "position=< 21379,  10801> velocity=<-2, -1>\n" +
                "position=< 21356, -31643> velocity=<-2,  3>\n" +
                "position=<-10422, -10423> velocity=< 1,  1>\n" +
                "position=<-31665,  53246> velocity=< 3, -5>\n" +
                "position=< 10791,  53245> velocity=<-1, -5>\n" +
                "position=< 10763, -52869> velocity=<-1,  5>\n" +
                "position=< 10796,  21413> velocity=<-1, -2>\n" +
                "position=< 10783,  53246> velocity=<-1, -5>\n" +
                "position=< 10788,  10804> velocity=<-1, -1>\n" +
                "position=<-21061, -42256> velocity=< 2,  4>\n" +
                "position=< 31992, -21039> velocity=<-3,  2>\n" +
                "position=<-21069,  42637> velocity=< 2, -4>\n" +
                "position=< 53215,  10797> velocity=<-5, -1>\n" +
                "position=< 10793, -52872> velocity=<-1,  5>\n" +
                "position=< 10759,  32028> velocity=<-1, -3>\n" +
                "position=<-52876, -52870> velocity=< 5,  5>\n" +
                "position=< 21355,  32022> velocity=<-2, -3>\n" +
                "position=<-31693, -42263> velocity=< 3,  4>\n" +
                "position=< 42582, -31648> velocity=<-4,  3>\n" +
                "position=<-42264, -10421> velocity=< 4,  1>\n" +
                "position=<-52927,  32020> velocity=< 5, -3>\n" +
                "position=< 42608, -42258> velocity=<-4,  4>\n" +
                "position=<-21057,  53244> velocity=< 2, -5>\n" +
                "position=< 21355, -42258> velocity=<-2,  4>\n" +
                "position=< 53240,  21409> velocity=<-5, -2>\n" +
                "position=< 32025, -52872> velocity=<-3,  5>\n" +
                "position=< 53203,  32021> velocity=<-5, -3>\n" +
                "position=<-42301, -42256> velocity=< 4,  4>\n" +
                "position=< 10767,  32028> velocity=<-1, -3>\n" +
                "position=< 53240,  53246> velocity=<-5, -5>\n" +
                "position=<-21040,  21416> velocity=< 2, -2>\n" +
                "position=< 10772,  53252> velocity=<-1, -5>\n" +
                "position=< 42599, -31650> velocity=<-4,  3>\n" +
                "position=< 42597, -10423> velocity=<-4,  1>\n" +
                "position=<-52894, -52867> velocity=< 5,  5>\n" +
                "position=<-21066,  53250> velocity=< 2, -5>\n" +
                "position=<-31704,  32020> velocity=< 3, -3>\n" +
                "position=<-10469, -21033> velocity=< 1,  2>\n" +
                "position=< 21375, -21033> velocity=<-2,  2>\n" +
                "position=< 31995,  42639> velocity=<-3, -4>\n" +
                "position=< 53247, -31651> velocity=<-5,  3>\n" +
                "position=<-31693,  21413> velocity=< 3, -2>\n" +
                "position=< 53219,  53251> velocity=<-5, -5>\n" +
                "position=<-10452,  53247> velocity=< 1, -5>\n" +
                "position=< 42638,  21412> velocity=<-4, -2>\n" +
                "position=<-21048,  21409> velocity=< 2, -2>\n" +
                "position=< 21381,  53248> velocity=<-2, -5>\n" +
                "position=<-10452, -10422> velocity=< 1,  1>\n" +
                "position=<-21040,  53250> velocity=< 2, -5>\n" +
                "position=<-10456,  21410> velocity=< 1, -2>\n" +
                "position=<-10464,  21415> velocity=< 1, -2>\n" +
                "position=< 42580,  21408> velocity=<-4, -2>\n" +
                "position=<-21093,  32028> velocity=< 2, -3>\n" +
                "position=<-52905, -42260> velocity=< 5,  4>\n" +
                "position=< 10791, -21038> velocity=<-1,  2>\n" +
                "position=<-31681, -42260> velocity=< 3,  4>\n" +
                "position=< 10775, -21038> velocity=<-1,  2>\n" +
                "position=<-10440,  32020> velocity=< 1, -3>\n" +
                "position=< 42598,  21413> velocity=<-4, -2>\n" +
                "position=< 42621,  21417> velocity=<-4, -2>\n" +
                "position=< 42638, -21036> velocity=<-4,  2>\n" +
                "position=< 42616, -21039> velocity=<-4,  2>\n" +
                "position=< 31972,  10796> velocity=<-3, -1>\n" +
                "position=<-10432, -31651> velocity=< 1,  3>\n" +
                "position=<-21058, -42264> velocity=< 2,  4>\n" +
                "position=<-21076,  42638> velocity=< 2, -4>\n" +
                "position=<-21040, -21039> velocity=< 2,  2>\n" +
                "position=<-21053, -52873> velocity=< 2,  5>\n" +
                "position=<-21093, -21039> velocity=< 2,  2>\n" +
                "position=<-31693,  10803> velocity=< 3, -1>\n" +
                "position=<-52917,  10801> velocity=< 5, -1>\n" +
                "position=< 21380,  21410> velocity=<-2, -2>\n" +
                "position=<-31705, -52870> velocity=< 3,  5>\n" +
                "position=< 21367,  42635> velocity=<-2, -4>\n" +
                "position=< 21373, -42260> velocity=<-2,  4>\n" +
                "position=< 10755,  53245> velocity=<-1, -5>\n" +
                "position=<-42305,  53248> velocity=< 4, -5>\n" +
                "position=<-31697,  32028> velocity=< 3, -3>\n" +
                "position=<-21077, -31651> velocity=< 2,  3>\n" +
                "position=< 53193,  53253> velocity=<-5, -5>\n" +
                "position=< 32016, -52874> velocity=<-3,  5>\n" +
                "position=< 21403,  21415> velocity=<-2, -2>\n" +
                "position=<-21035,  42637> velocity=< 2, -4>\n" +
                "position=< 42627, -31652> velocity=<-4,  3>\n" +
                "position=<-21050,  53244> velocity=< 2, -5>\n" +
                "position=<-42258, -10423> velocity=< 4,  1>\n" +
                "position=< 10803,  32022> velocity=<-1, -3>\n" +
                "position=< 21360,  53244> velocity=<-2, -5>\n" +
                "position=< 31996, -21031> velocity=<-3,  2>\n" +
                "position=<-52902,  42637> velocity=< 5, -4>\n" +
                "position=< 31994, -42259> velocity=<-3,  4>\n" +
                "position=< 53224,  21408> velocity=<-5, -2>\n" +
                "position=< 10776,  32020> velocity=<-1, -3>\n" +
                "position=< 21371,  10797> velocity=<-2, -1>\n" +
                "position=< 31971,  32020> velocity=<-3, -3>\n" +
                "position=<-10425, -42256> velocity=< 1,  4>\n" +
                "position=<-52869, -42262> velocity=< 5,  4>\n" +
                "position=< 42612, -10428> velocity=<-4,  1>\n" +
                "position=< 10796,  32025> velocity=<-1, -3>\n" +
                "position=< 10743,  42637> velocity=<-1, -4>\n" +
                "position=< 42590, -52867> velocity=<-4,  5>\n" +
                "position=<-52929,  32028> velocity=< 5, -3>\n" +
                "position=<-10470,  10796> velocity=< 1, -1>\n" +
                "position=< 21413,  53248> velocity=<-2, -5>\n" +
                "position=<-52905, -52869> velocity=< 5,  5>\n" +
                "position=<-52895, -10428> velocity=< 5,  1>\n" +
                "position=<-52881,  32029> velocity=< 5, -3>\n" +
                "position=< 10803,  21411> velocity=<-1, -2>\n" +
                "position=< 42599,  21410> velocity=<-4, -2>\n" +
                "position=< 42636, -21038> velocity=<-4,  2>\n" +
                "position=<-31701,  21412> velocity=< 3, -2>\n" +
                "position=< 21403, -52867> velocity=<-2,  5>\n" +
                "position=< 10767,  32022> velocity=<-1, -3>\n" +
                "position=< 42615, -31652> velocity=<-4,  3>\n" +
                "position=<-42276,  42632> velocity=< 4, -4>\n" +
                "position=<-52873,  21417> velocity=< 5, -2>\n" +
                "position=<-10452,  10798> velocity=< 1, -1>\n" +
                "position=< 42632, -21040> velocity=<-4,  2>\n" +
                "position=<-31700, -42255> velocity=< 3,  4>\n" +
                "position=< 10804, -21032> velocity=<-1,  2>\n" +
                "position=<-31665, -52874> velocity=< 3,  5>\n" +
                "position=< 53196, -42255> velocity=<-5,  4>\n" +
                "position=< 10786, -31652> velocity=<-1,  3>\n" +
                "position=< 53203, -42260> velocity=<-5,  4>\n" +
                "position=< 31970,  21408> velocity=<-3, -2>\n" +
                "position=< 53228,  21409> velocity=<-5, -2>\n" +
                "position=< 10800,  10799> velocity=<-1, -1>\n" +
                "position=< 42638,  42637> velocity=<-4, -4>\n" +
                "position=<-21037,  32029> velocity=< 2, -3>\n" +
                "position=< 32019,  32028> velocity=<-3, -3>\n" +
                "position=< 10743, -52872> velocity=<-1,  5>\n" +
                "position=<-31669,  32020> velocity=< 3, -3>\n" +
                "position=< 10746,  32020> velocity=<-1, -3>\n" +
                "position=<-21061,  10804> velocity=< 2, -1>\n" +
                "position=<-10437, -42264> velocity=< 1,  4>\n" +
                "position=< 42598, -10423> velocity=<-4,  1>\n" +
                "position=< 10775,  32024> velocity=<-1, -3>\n" +
                "position=< 42623,  21417> velocity=<-4, -2>\n" +
                "position=<-21064, -10427> velocity=< 2,  1>\n" +
                "position=< 10800, -31646> velocity=<-1,  3>\n" +
                "position=< 42603,  32026> velocity=<-4, -3>\n" +
                "position=<-42299, -42260> velocity=< 4,  4>\n" +
                "position=< 42632, -21040> velocity=<-4,  2>\n" +
                "position=< 10760,  10803> velocity=<-1, -1>\n" +
                "position=< 53235,  32020> velocity=<-5, -3>\n" +
                "position=<-42317,  42636> velocity=< 4, -4>\n" +
                "position=<-52877, -52869> velocity=< 5,  5>\n" +
                "position=<-42256, -52875> velocity=< 4,  5>\n" +
                "position=<-21034,  32024> velocity=< 2, -3>\n" +
                "position=<-10433, -21033> velocity=< 1,  2>\n" +
                "position=<-10481, -10425> velocity=< 1,  1>\n" +
                "position=<-52924,  53253> velocity=< 5, -5>\n" +
                "position=<-52897, -21033> velocity=< 5,  2>\n" +
                "position=< 10767,  10798> velocity=<-1, -1>\n" +
                "position=<-21045, -10422> velocity=< 2,  1>\n" +
                "position=<-42308, -42255> velocity=< 4,  4>\n" +
                "position=<-21051,  32029> velocity=< 2, -3>\n" +
                "position=<-10465,  10804> velocity=< 1, -1>\n" +
                "position=<-10469, -52874> velocity=< 1,  5>\n" +
                "position=< 32000, -31643> velocity=<-3,  3>\n" +
                "position=< 10743,  32025> velocity=<-1, -3>\n" +
                "position=<-21069,  10802> velocity=< 2, -1>\n" +
                "position=<-10433, -42255> velocity=< 1,  4>\n" +
                "position=< 32027,  10799> velocity=<-3, -1>\n" +
                "position=<-21084, -42255> velocity=< 2,  4>\n" +
                "position=<-21081,  21408> velocity=< 2, -2>\n" +
                "position=<-21045,  10802> velocity=< 2, -1>\n" +
                "position=< 53252, -21031> velocity=<-5,  2>\n" +
                "position=<-10455,  21411> velocity=< 1, -2>\n" +
                "position=< 10775,  21416> velocity=<-1, -2>\n" +
                "position=<-42317, -52868> velocity=< 4,  5>\n" +
                "position=<-42305, -42259> velocity=< 4,  4>\n" +
                "position=<-52929,  10805> velocity=< 5, -1>\n" +
                "position=<-31673, -21034> velocity=< 3,  2>\n" +
                "position=<-42289, -10420> velocity=< 4,  1>\n" +
                "position=< 53223,  10802> velocity=<-5, -1>\n" +
                "position=< 32001,  53253> velocity=<-3, -5>\n" +
                "position=< 10794,  21413> velocity=<-1, -2>\n" +
                "position=<-42293,  21412> velocity=< 4, -2>\n" +
                "position=<-52887, -10428> velocity=< 5,  1>\n" +
                "position=< 32004,  53252> velocity=<-3, -5>\n" +
                "position=<-31665, -10421> velocity=< 3,  1>\n" +
                "position=<-42264, -21037> velocity=< 4,  2>\n" +
                "position=< 21387,  32025> velocity=<-2, -3>\n" +
                "position=< 21416, -42255> velocity=<-2,  4>\n" +
                "position=< 21403,  32022> velocity=<-2, -3>\n" +
                "position=< 42579, -52869> velocity=<-4,  5>\n" +
                "position=<-10481, -21034> velocity=< 1,  2>\n" +
                "position=<-52917, -21034> velocity=< 5,  2>\n" +
                "position=<-10457,  42632> velocity=< 1, -4>\n" +
                "position=<-42298, -21036> velocity=< 4,  2>\n" +
                "position=< 10743,  53253> velocity=<-1, -5>\n" +
                "position=< 42627,  21413> velocity=<-4, -2>\n" +
                "position=< 42595,  32029> velocity=<-4, -3>\n" +
                "position=< 10775,  10803> velocity=<-1, -1>\n" +
                "position=<-10479,  32024> velocity=< 1, -3>\n" +
                "position=<-52876, -10419> velocity=< 5,  1>\n" +
                "position=< 32003,  32029> velocity=<-3, -3>\n" +
                "position=<-21053, -31647> velocity=< 2,  3>\n" +
                "position=<-21090,  32029> velocity=< 2, -3>\n" +
                "position=<-52876,  32024> velocity=< 5, -3>\n" +
                "position=< 53240, -52875> velocity=<-5,  5>\n" +
                "position=<-31644,  53244> velocity=< 3, -5>\n" +
                "position=< 53215,  21409> velocity=<-5, -2>\n" +
                "position=<-31689, -42263> velocity=< 3,  4>\n" +
                "position=<-21089,  32024> velocity=< 2, -3>\n" +
                "position=< 21408,  10797> velocity=<-2, -1>\n" +
                "position=<-10481,  21413> velocity=< 1, -2>\n" +
                "position=<-31657,  10800> velocity=< 3, -1>\n" +
                "position=<-31670, -42255> velocity=< 3,  4>\n" +
                "position=< 42603,  21417> velocity=<-4, -2>\n" +
                "position=< 31996,  53251> velocity=<-3, -5>\n" +
                "position=< 21413, -10423> velocity=<-2,  1>\n" +
                "position=<-10429,  10804> velocity=< 1, -1>\n" +
                "position=< 42627, -52868> velocity=<-4,  5>\n" +
                "position=<-31665, -42263> velocity=< 3,  4>\n" +
                "position=< 21392, -42256> velocity=<-2,  4>\n" +
                "position=<-21040,  10800> velocity=< 2, -1>\n" +
                "position=<-10420, -21039> velocity=< 1,  2>\n" +
                "position=<-10441, -42261> velocity=< 1,  4>\n" +
                "position=<-52928,  32029> velocity=< 5, -3>\n" +
                "position=<-21081, -21034> velocity=< 2,  2>\n" +
                "position=<-42260,  21414> velocity=< 4, -2>\n" +
                "position=<-31644,  32021> velocity=< 3, -3>\n" +
                "position=<-21040,  42636> velocity=< 2, -4>\n" +
                "position=< 53251, -10425> velocity=<-5,  1>\n" +
                "position=<-10448,  32029> velocity=< 1, -3>\n" +
                "position=< 53199, -21033> velocity=<-5,  2>\n" +
                "position=< 32015, -10424> velocity=<-3,  1>\n" +
                "position=< 21390,  53253> velocity=<-2, -5>\n" +
                "position=< 42631, -31644> velocity=<-4,  3>\n" +
                "position=< 53219,  42639> velocity=<-5, -4>\n" +
                "position=<-10464, -52869> velocity=< 1,  5>\n" +
                "position=<-52913, -52867> velocity=< 5,  5>\n" +
                "position=< 21376,  21416> velocity=<-2, -2>\n" +
                "position=< 10803, -42257> velocity=<-1,  4>\n" +
                "position=<-10428, -42258> velocity=< 1,  4>\n" +
                "position=< 10753,  21417> velocity=<-1, -2>\n" +
                "position=<-21064, -52873> velocity=< 2,  5>\n" +
                "position=<-10460,  21409> velocity=< 1, -2>\n" +
                "position=<-52881,  32023> velocity=< 5, -3>\n" +
                "position=<-10461, -10422> velocity=< 1,  1>\n" +
                "position=<-42280,  10797> velocity=< 4, -1>\n" +
                "position=< 53231, -21036> velocity=<-5,  2>\n" +
                "position=< 21387, -52872> velocity=<-2,  5>\n" +
                "position=<-42317, -31643> velocity=< 4,  3>\n" +
                "position=< 32027,  21415> velocity=<-3, -2>\n" +
                "position=< 10786,  42632> velocity=<-1, -4>\n" +
                "position=< 31999, -10422> velocity=<-3,  1>\n" +
                "position=< 10772,  53244> velocity=<-1, -5>\n" +
                "position=<-10449,  53246> velocity=< 1, -5>\n" +
                "position=<-10464,  42635> velocity=< 1, -4>\n" +
                "position=<-52879,  53248> velocity=< 5, -5>\n" +
                "position=< 42632,  21416> velocity=<-4, -2>\n" +
                "position=<-21061, -52871> velocity=< 2,  5>\n" +
                "position=<-31676,  53248> velocity=< 3, -5>\n" +
                "position=< 21376, -52876> velocity=<-2,  5>\n" +
                "position=< 42596, -52870> velocity=<-4,  5>\n" +
                "position=< 10775, -31649> velocity=<-1,  3>";

        //Jfc I hate parsing
        List<int[]> points = new ArrayList<>();
        String[] lines = input.split("\n");
        for (String line : lines)
        {
            String[] pos = line.substring(line.indexOf("<") + 1, line.indexOf(">")).trim().split(", ");
            String[] vel = line.substring(line.lastIndexOf("<") + 1, line.length() - 1).trim().split(", ");
            points.add(new int[]{Integer.parseInt(pos[0].trim()), Integer.parseInt(pos[1].trim()),
                    Integer.parseInt(vel[0].trim()), Integer.parseInt(vel[1].trim())});
        }

        //Stupid, but preventing long overflow
        BigInteger area = BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(Long.MAX_VALUE));
        int len = 0;
        int wid = 0;
        int count = 0;

        while (true)
        {
            count++;
            int xmin = Integer.MAX_VALUE;
            int xmax = Integer.MIN_VALUE;
            int ymin = Integer.MAX_VALUE;
            int ymax = Integer.MIN_VALUE;
            for (int[] p : points)
            {
                p[0] = p[0] + p[2];
                p[1] = p[1] + p[3];

                if (p[1] < xmin)
                    xmin = p[1];
                if (p[1] > xmax)
                    xmax = p[1];
                if (p[0] < ymin)
                    ymin = p[0];
                if (p[0] > ymax)
                    ymax = p[0];
            }
            int l = xmax - xmin + 1;
            int w = ymax - ymin + 1;

            BigInteger t = BigInteger.valueOf(l).multiply(BigInteger.valueOf(w));
            if (t.compareTo(area) < 0)
            {
                area = t;
                len = l;
                wid = w;
            }
            else
            {
                break;
            }
        }

        //Get back to positions with smallest area
        for (int[] p : points)
        {
            p[0] = p[0] - p[2];
            p[1] = p[1] - p[3];
        }
        count--;

        //Find offsets for entering into grid so the word is top-left.
        int dx = Integer.MAX_VALUE;
        int dy = Integer.MAX_VALUE;
        for (int[] p : points)
        {
            if (p[0] < dx)
                dx = p[0];
            if (p[1] < dy)
                dy = p[1];
        }

        int max = Math.max(len, wid);
        String[][] grid = new String[max][max];

        //Populate with default values
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                grid[i][j] = ".";
            }
        }

        //Enter data
        for (int[] p : points)
        {
            grid[p[1] - dy][p[0] - dx] = "#";
        }

        printGrid(grid); //SOLUTION TO PART 1
        System.out.println(count); //SOLUTION TO PART 2
    }

    private static void printGrid(String[][] grid)
    {
        for (String[] aGrid : grid)
        {
            for (int j = 0; j < grid.length; j++)
            {
                System.out.print(aGrid[j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
