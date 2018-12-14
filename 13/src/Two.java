import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Two
{
    static boolean DEBUG = false;
    public static void main(String[] args)
    {
        String input = "                           /-------------------------------------------------------------------------------------------------\\                        \n" +
                " /-------------------------+--\\/---------------------------------------------------------------------------------------------+----------\\             \n" +
                " |                       /-+--++---------------------------------------------------------------------------------------------+------\\   |             \n" +
                " |                /------+-+--++-------------------------------------------------------------------------<-\\                 |      |   |             \n" +
                " |           /----+------+-+--++----------------\\                                                          |                 |      |   |             \n" +
                " |           |    |      | |  ||                |                   /----------------\\                     |                 |      |   |             \n" +
                " |           |    |      | | /++---------\\      |                   |                |                     |        /--------+------+---+-----------\\ \n" +
                " |           |   /+------+-+-+++---------+------+-------------------+-------\\   /----+---------------------+--------+--------+------+--\\|           | \n" +
                " |           |   ||      | | |||         |      |  /----------------+-------+---+----+---------------------+\\       |        |      |  ||           | \n" +
                " | /---------+\\  ||      | | |||         |      |  |       /--------+-------+---+----+---------------------++-------+--------+------+--++--------\\  | \n" +
                " | |         ||  ||      | | |||         |      |  |       | /------+-\\     |   |    |                     ||       |   /----+------+--++------\\ |  | \n" +
                " | |         ||  ||      | | ||| /-------+---\\  |  |       | |      | |     |   |    |                     ||       |   |    |      |  ||      | |  | \n" +
                " | |         ||  ||   /--+-+-+++-+--\\    |   |  |  |       | |      | |     |   |    |          /----------++-------+---+----+------+--++------+-+-\\| \n" +
                " | |         ||  ||   |  | | ||| |  |    |   |  |  |       | |      | |     |  /+----+----------+----------++-------+---+----+------+--++------+-+\\|| \n" +
                " | |         \\+--++---+--+-+-+++-+--+----+---+--/  |       | |      | |     |  ||    |          |          ||       |   |    |      |  ||      | |||| \n" +
                " | |          |  ||   |  | | ||| |  |    |   |     |       | |      | |     |  ||    |          |          ||      /+---+----+------+--++-----\\| |||| \n" +
                " | |          |  ||   |  | | ||| |/-+----+---+-----+-------+-+------+-+-----+--++----+----------+----------++------++---+----+---\\  |  ||     || |||| \n" +
                "/+-+----------+--++---+--+-+-+++-++-+----+---+-----+-------+-+------+-+-----+--++----+---------\\|          ||      ||   |    | /-+--+--++---\\ || |||| \n" +
                "|| |          |  ||   |  | | ||| || |/---+---+-----+-------+-+------+-+-----+--++----+---------++----------++------++-\\ |    | | |  |  ||   | || |||| \n" +
                "|| |         /+--++---+--+-+-+++-++-++---+---+-----+\\      | |      | |     |  ||    |         ||          ||      || | |    | | |  |  ||   | || |||| \n" +
                "|| |         || /++---+--+-+-+++-++-++---+---+-----++------+-+------+-+-----+--++----+--\\      ||          ||      || | |    | | |  |  ||   | || |||| \n" +
                "|| |  /------++-+++---+--+\\| \\++-++-++---/   |     ||      | |   /--+-+-----+--++----+--+------++---------\\||      || | \\----+-+-+--+--++---+-+/ |||| \n" +
                "|| |  |      || |||   |  ||\\--++-++-++-------+-----++------+-+---+--+-+-----+--++----+--+------++-------->+++------++-+------/ | |  |  ||   | |  |||| \n" +
                "|| |  |      || |||   |  ||   || || ||       |     ||      | |   |  | |     |  || /--+--+------++---------+++------++-+--------+-+--+--++\\  | |  |||| \n" +
                "|| |  |      || |||   |  \\+---++-++-++-------+-----++------+-+---+--+-+-----+--++-+--+--+------++---------+++------++-+--------+-+--/  |||  | |  |||| \n" +
                "|| |  |      || |||   | /-+---++-++-++-------+-----++------+-+---+--+-+-----+--++-+--+--+------++---------+++------++-+\\       |/+-----+++--+-+--++++\\\n" +
                "|| \\--+------+/ |||   | | |   || || ||       |     ||      | |   |  | |     |  || |  |  |      ||         |||      || ||       |||     |||  | |  |||||\n" +
                "||    |      |  ||| /-+-+-+---++-++-++-------+-----++------+-+---+--+-+-----+--++-+--+\\ |      ||         |||      ||/++-------+++-----+++--+-+-\\|||||\n" +
                "||    |      |  ||| | | | |   || || ||       | /---++------+-+---+--+-+-----+--++-+\\ || |      ||   /-----+++------+++++---\\   |||     |||  | | ||||||\n" +
                "||    |    /-+--+++-+-+-+-+---++-++-++-------+-+---++------+-+---+--+-+-----+--++-++-++-+------++---+----\\|||      |||||   |   |||     |||  | | ||||||\n" +
                "||/---+----+-+--+++-+-+-+-+---++-++-++-------+-+---++---\\  | |   |  \\-+-----+--++-++-/| |      ||   |    ||||      |||||   |   |||     |||  | | ||||||\n" +
                "|||   |    | |  ||| | | | |   || || ||       | |   ||   |  | |   |    |     |  || ||  | |      ||   |    ||||      |||||   |   |||     |||  | | ||||||\n" +
                "|||   |    | |  ||| | | | |/--++-++-++-------+-+---++---+--+-+---+----+-----+--++-++--+-+------++---+----++++\\     |||||   |   |||     |||  | | ||||||\n" +
                "|||   |    | |  ||| | | | ||  || || ||       | |/--++---+--+-+---+----+-----+--++-++--+-+------++---+----+++++-----+++++-\\ |   |||     |||  | | ||||||\n" +
                "|||   |    | |  ||| |/+-+-++--++-++-++-------+-++--++---+--+-+---+----+-----+--++-++--+-+------++---+----+++++-----+++++-+\\|   |||     |||  | | ||||||\n" +
                "|||   |    | |  ||| ||| | ||  || || ||       | ||  ||   |  |/+---+----+--\\  |  || ||  | |      ||   |    |||||    /+++++-+++-\\ |||     |||  | | ||||||\n" +
                "|||   |    | |  ||| ||| | ||  || \\+-++-------/ ||  ||   |  |||   |    |  |  |  \\+-++--+-+------++---+----+++++----++++++-+++-+-+++-----+++--+-+-++/|||\n" +
                "|||   |   /+-+--+++-+++-+-++--++--+-++---------++--++---+--+++--\\|    |  |  |   | ||  | |      ||   | /--+++++----++++++-+++-+-+++--\\  |||  | | || |||\n" +
                "|||   |   || |  ||| ||| | ||  || /+-++---------++--++---+--+++--++----+--+--+---+-++--+-+------++---+-+--+++++-\\  |||||| ||| | |||  |  |||  | | || |||\n" +
                "|||   |   || |  ||| ||| \\-++--++-++-++---------++--++---+--+++--++----+--+--+---+-++--+-+------++---+-+--+++++-+--+++++/ ||| | |||  |  |||  | | || |||\n" +
                "|||   |   || |  ||| |||   ||  || || ||  /------++--++---+--+++--++----+--+--+---+-++--+-+-<----++---+-+--+++++\\|  |||||  ||| | |||  |  |||  | | || |||\n" +
                "|||   |   || |  ||| |||   ||  || || ||  |/-----++--++---+--+++--++----+--+--+---+-++--+-+\\     ||   | |  |||||||  |||||  ||| | |||  |  |||  | | || |||\n" +
                "|||   |   || |  ||| |||   |^  || || ||  ||     |\\--++---+--+++--++----+--+--+---+-++--+-++-----++---+-+--+++++++--+++++--/|| | |||  |  |||  | | || |||\n" +
                "|||   |   || |  ||| |||/--++--++-++-++--++-----+---++---+--+++--++----+--+--+---+\\||  | ||     ||   | |  |||||||  |||||   || | |\\+--+--+++--+-+-++-++/\n" +
                "|||   |   || |  ||| ||||/-++--++-++-++--++-----+---++---+--+++--++----+--+--+-\\ ||||  | ||     ||   \\-+--+++++++--+++++---+/ | | |  |  |||  | | || || \n" +
                "|||   |   ||/+--+++-+++++-++--++-++-++--++----\\|   ||   |  |||  ||    |  |  | | ||||  | ||     ||   /-+--+++++++--+++++---+--+-+-+--+--+++\\ | | || || \n" +
                "||\\---+---++++--+++-+++++-++--++-++-++--++----++---++---/  |||  ||    |  |  | | ||||  | ||     ||   | |  |||||||  |||\\+---+--+-+-+<-+--++++-+-+-/| || \n" +
                "||    |   ||||  ||| ||||| ||  || ||/++--++----++---++------+++--++----+--+--+-+-++++--+-++-----++---+-+-\\|||||||  ||| |   |  | | |  |  |||| | |  | || \n" +
                "||    |   ||||  ||| ||||| ||  || |||||  ||    ||   ||      |||  ||    |  |  | | ||\\+--+-++-----++---+-+-++++++++--+++-+---+--+-+-+--+--++/| | |  | || \n" +
                "||   /+---++++--+++-+++++-++--++\\|||||  || /--++---++------+++--++----+--+--+-+-++-+--+-++-----++---+-+-++++++++--+++-+---+--+-+-+--+--++-+-+-+--+-++\\\n" +
                "||   ||   ||||  ||| ||||| ||  |||||||| /++-+--++---++------+++--++----+--+--+-+-++-+--+-++-----++---+-+-++++++++--+++-+---+--+-+-+--+-\\|| | | |  | |||\n" +
                "||   ||   ||||  ||| \\++++-++--++++++++-+++-+--++---++------+++--++----+--+--+-+-++-+--/ ||     |\\---+-+-++++++++--+++-+---+--+-+-+--+-+++-+-+-+--+-/||\n" +
                "||   ||   ||||  |||/-++++-++--++++++++-+++-+--++---++------+++--++----+--+--+-+-++-+----++-\\   |    | | ||||||||  ||| |   |  | | |  | ||| | | |  |  ||\n" +
                "||   ||   ||||  |||| \\+++-++--++++++++-+++-+--++---++------+++--++----+--+--+-+-++-+----++-+---+----+-+-++++++++--+++-+---/  | | |  | ||| | | |  |  ||\n" +
                "||   ||   ||||  ||||  ||| ||  |||||||| |||/+--++---++------+++--++----+--+\\ | | || |    || |   |    | | ||||||||  ||| |      | | |  | ||| | | |  |  ||\n" +
                "||   ||   ||||  ||||  ||| ||  |||||||| |||||  ||  /++------+++--++----+--++-+-+-++-+\\   || |   |    | | ||||||||  ||| |      | | |  |/+++-+-+-+-\\|  ||\n" +
                "||   || /-++++--++++--+++-++--++++++++-+++++--++--+++------+++--++----+--++-+-+-++-++---++-+---+----+-+-++++++++-\\||| |      | | |  ||||| | | | ||  ||\n" +
                "|| /-++-+-++++--++++--+++-++--++++++++-+++++--++--+++------+++--++----+-\\|| | | || ||   || |   |    | | |||||||| |||| |      | | |  ||||| | | | ||  ||\n" +
                "|| | || | ||||  ||||  ||| ||  |||||||| |||||  ||  |||      |||  ||    | ||| | | || ||   || |   |    | | |||||||| |||| |      | | |  ||||| | | | ||  ||\n" +
                "|| | || | ||||  ||||  ||| ||  |||||||| |||||  || /+++------+++--++----+-+++-+-+-++-++---++-+---+----+-+-++++++++\\|||| |      | | |  ||||| | | | ||  ||\n" +
                "|| | || | |||\\--++++--+++-++--++++++++-+++++--++-+++/      |||/-++----+-+++-+-+-++-++---++-+---+----+-+\\||||||||||||| |      | | |  ||||| | | | ||  ||\n" +
                "|| | || | |||   |||| /+++-++--++++++++-+++++--++\\|||       |||| ||    | ||| | | || ||   || |   |    | ||||||||||||||| |      | | |  ||||| | | | ||  ||\n" +
                "||/+-++-+-+++---++++-++++-++--++++++++-+++++--++++++-------++++-++----+-+++\\| | || ||   || |   |    | ||||||||||||||| |      | \\-+--+++++-+-/ | ||  ||\n" +
                "|||| || | |||   |||| |||| ||  |||||||| |||||  ||||||       |||| ||/---+-+++++-+-++-++---++-+---+-\\  | ||||||||||||||| |      |   |  ||||| |   | ||  ||\n" +
                "|||| || | |||   |||| |||| ||  |||||||| |||||  ||||||       ||\\+-+++---/ ||||| | || ||   || |   | |  | ||||||||||||||| |      |   |  ||||| |   | ||  ||\n" +
                "|||| || | |||   |||| |||| ||  |||||||| |||||  ||||||       || | |||     ||||| | || ||   || |   | |  | ||||||||||||||| |      |   |  ||||| |   | ||  ||\n" +
                "|||| || | ||\\---++++-++++-++--++++++++-+++++--/|||||       || | |||  /--+++++-+-++-++---++-+---+-+--+-+++++++++++++++-+------+--\\|  ||||| |   | ||  ||\n" +
                "|||| || \\-++----++++-++++-++--++++++++-+++++---+++++-------++-+-+++--+--+++++-+-++>++---++-+---+-+>-+-+++++++++++/||| |      |  ||  ||||| |   | ||  ||\n" +
                "||||/++---++---\\||\\+-++++-++--++++++++-+++++---+++++-------++-+-+++--+--+++++-+-++-++---++-+---+-+--+-+++++/||||| ||| |      |  ||  ||||| |   | ||  ||\n" +
                "|||||||   ||   ||| | |||\\-++--++++++++-+++++---+++++-------++-+-+++--+--+++++-/ || ||   ||/+---+-+-\\| ||||| ||||| ||| |   /--+--++--+++++-+---+-++-\\||\n" +
                "|||||||  /++---+++-+-+++-\\||  |||||||| |||||   |||||       || | |||  |  |||||   || ||   ||||   | | || ||||| ||||| ||| |   |  |  ||  ||||| |   | || |||\n" +
                "|||||||  |||   ||| | ||| |||  |||||||| |||||   |||||       || | ||v  |  |||||   || ||   ||||   | | || ||||| ||||| ||| |   |  |  ||  ||||| |   | || |||\n" +
                "|||||||  |||   ||| | ||| |||  |||||||| |||||   |||||     /-++-+-+++--+--+++++---++-++---++++---+-+-++-+++++-+++++-+++-+-\\ |  |  ||  ||||| |   | || |||\n" +
                "|||||||  |||   ||| | ||| |||  |||||||| ||\\++---+++++-----+-++-+-+++--+--+++++---++-++---+/||   | | || ||||| ||||| ||| | | |  |  ||  ||||| |   | || |||\n" +
                "|||||||  ||| /-+++-+-+++-+++--++++++++-++-++---+++++-\\   | || | |\\+--+--+++++---++-++---+-++---+-+-++-++++/ ||||| ||| | | |  |  ||  ||||| |   | || |||\n" +
                "|||||||  ||| | ||| | ||| ||| /++++++++-++-++---+++++-+---+-++-+\\| |  |  |||||   || ||   | ||   | | || ||||  ||||| ||| | | |  |  || /+++++-+--\\| || |||\n" +
                "|||||||  ||| | ||| | ||| ||| ||||||||| || ||   ||||| |/--+-++-+++-+--+--+++++---++-++-\\ | ||   | | || ||||  ||||| ||| | | |  |  || |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| ||| ||||||||| || ||   ||||| ||  | || ||| |  |  |||||   || || | | ||   | | || ||||  ||||| ||| | | |  |  || |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| ||| ||||||||| || ||   ||||| ||  | || ||| |  |  |||||   || || | | \\+---+-+-/| ||||  ||||| ||| | | |  |  || |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| ||| |||||\\+++-++-++---+++++-++--+-++-+++-+--+--+++++---++-++-+-+--+---+-+--+-++++--+++++-+++-+-+-+--+--+/ |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| |||/+++++-+++-++-++---+++++-++--+-++-+++-+--+--+++++---++-++-+-+--+---+-+--+-++++--+++++-+++-+-+-+--+-\\|  |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| ||||||||| |||/++-++---+++++-++--+-++-+++-+--+--+++++---++-++-+-+--+--\\| |  | ||||  ||||| ||| | | |  | ||  |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| ||||||||| |||||| ||   ||||| ||  | || ||| |  |  |||||   || || | |  |  || |  | ||||  ||||| ||| | | |  | ||  |||||| |  || || |||\n" +
                "|||||||  ||| | ||| | ||| ||||||||| |||||| ||   ||||| ||  | || ||| |  |  |||||   || || | |  |  || |  | ||||  ||||| ||\\-+-+-+--+-++--++++++-+--++-++-+/|\n" +
                "|||||||  ||| | ||| | ||| ||||||||| |||||| ||   ||||| ||  | || ||| |/-+--+++++---++-++-+-+--+--++-+--+-++++--+++++-++--+-+-+--+-++--++++++-+\\ || || | |\n" +
                "|||||||  ||| | ||| | |\\+-+++++++++-+/|||| ||   ||||| ||  | || ||| || |  |||||   || || | |  |  || |  | ||||  ||||| ||  | | |  | ||  \\+++++-++-/| || | |\n" +
                "|||||||  ||| | ||| | | | ||||||||| | |||| ||   ||||| |\\--+-++-+++-++-+--+++++---++-++-/ |  |  || |  | ||||  ||||| |\\--+-+-+--+-++---+++++-++--/ || | |\n" +
                "|||||||  ||| | ||| | | | ||||||||| | ||\\+-++---+++++-+---+-++-+++-++-+--+++++---++-++---+--+--++-+--+-++++--+++++-+---+-+-+--+-++---++/|| ||    || | |\n" +
                "|\\+++++--+++-+-+++-+-+-+-+++++/||| | || | ||   ||||| |   | || ||| || |/-+++++---++-++---+--+--++\\|  | ||||  ||||| |   | | |  | ||   || || ||    || | |\n" +
                "| |||||  ||| | ||| | | | ||||| ||| | || | ||   ||||| |   | || ||| || || |||||   || ||   |  |  ||||  | ||||  ||||| |   | | |  | ||   || || ||    || | |\n" +
                "| ||\\++--+++-+-/|| | | | ||||| ||| | || | ||/--+++++-+---+-++-+++-++-++\\|||||   || ||   |  |  ||||  | ||||  ||||| |   | | |  | ||   || || ||    || | |\n" +
                "| || ||  ||| |  || | | | ||||| ||| | || | |||  ||||\\-+---+-++-+++-++-++++++++---++-++---+--+--++++--+-++++--/|||| |   | | |  | ||   || || ||    || | |\n" +
                "| || ||  ||| |  || | | | ||||| ||| |/++-+-+++--++++--+---+-++-+++-++-++++++++---++-++---+--+--++++-\\| ||||   |||| |   | | |  | ||   || |v ||    || | |\n" +
                "| || ||  |||/+--++-+-+-+-+++++-+++-++++-+-+++--++++--+---+-++-+++-++-++++++++---++-++---+--+--++++\\|| ||||   |||| |   | | |  | ||   || || ||    || | |\n" +
                "| || ||  |||||  || | | | ||||| ||| ||\\+-+-+++--++++--+---+-++-+++-++-++++++++---++-++---+--+--+++++++-++++---++++-+---/ | |  | ||   v| || ||    || | |\n" +
                "| ||/++--+++++--++-+-+-+-+++++-+++-++-+-+-+++--++++--+---+-++-+++-++-++++++++---++-++--\\|  |  ||||||| ||||   |||| |     | |  | ||   || || ||    || | |\n" +
                "| |||||  |||||  |\\-+-+-+-+++++-+++-++-+-+-+++--++++--+---+-++-+++-++-+++++++/   || ||  ||  |  ||||||| ||||   |||| |     | |  | ||   || || ||    || | |\n" +
                "| |||||  |||||  |  | | | ||||| ||| || | | |||  ||||  |   | || ||| || |||||||  /-++-++--++--+-\\||||||| ||||   |||| |     | |  | ||   || || ||    || | |\n" +
                "| |||||  |||||  |/-+-+-+-+++++-+++-++-+-+\\|||  ||||  |   | || \\++-++-+++++++--+-++-++--++--+-++++++++-+/||   |||| \\-----+-+--/ ||   || || ||    || | |\n" +
                "| |||||  |||||  || | | | |v||| ||| || | |||||  ||||/-+---+-++--++-++-+++++++--+-++-++--++--+-++++++++-+-++---++++-------+-+----++---++-++-++----++-+\\|\n" +
                "| |||||  |||||  || | | | ||||| ||| || | |||||  ||||| |   | ||  || || |||||||  | || ||  ||  | |^||||||/+-++---++++------\\| |    ||   || || ||    || |||\n" +
                "| |||||  |||||  || | | | ||||\\-+++-++-+-+++++--+++++-+---+-++--/| || |||||||  | || ||  ||  | |||||||||| ||   ||||      || |    ||   || || ||    || |||\n" +
                "| |||||  |||||  || | | | ||||  \\++-++-+-+++++--+++++-+---+-++---+-++-+++++++--+-++-++--++--+-++++++++++-++---++++------++-+----++---++-+/ ||    || |||\n" +
                "| |||||  |||||  || | | | ||||   || || | |||||  ||||| |   | ||   | |\\-+++++++--+-++-++--++--+-++++++++++-++---++++------++-+----++---++-+--+/    || |||\n" +
                "| |||||  |||||/-++-+-+-+-++++---++-++-+-+++++--+++++-+---+-++---+-+>-+++++++--+-++-++--++--+-++++++++++-++---++++----\\ || |    ||   || |  |     || |||\n" +
                "| |||||  |||||| || | | | ||||   || || | |||||  ||||| |   | ||   | |  |||||||  | |^ ||  ||  | |||||||||| ||   ||||    | || |   /++-<-++-+--+---\\ || |||\n" +
                "| |||||  |||||| || | | | ||||   || || \\-+++++--+++++-+---+-++---+-+--+++++++--+-++-++--++--+-+/|||||||| ||   ||||    | || |   |||   || |  |   | || |||\n" +
                "| |||||  |||||| || | | | ||\\+---++-++---+++++--+++++-+---+-++---+-+--+++++++--+-++-++--++--+-+-++++++++-++---/|||    | || |   |||   || |  |   | || |||\n" +
                "| ||||\\--++++++-++-+-+-+-+/ |   || ||   |||||  ||||| |   | ||   | |  |||||||  | || ||  ||  | | |||||||| ||    |||    | || |   |||   || |  |   | || |||\n" +
                "| ||||   |||||| || | | \\-+--+---++-++---+++++--+++++-+---+-++---+-+--+++++++--+-+/ ||  ||  | | |||||||| ||    |||    | || \\---+++---++-+--+---+-++-/||\n" +
                "| ||||   |||||| || | |   |  |   || ||   \\++++--+++++-+---+-++---+-+--+++++++--+-+--++--++--+-+-++++++++-++----/||    | ||     |||   || |  |   | ||  ||\n" +
                "| ||||   |||||| |\\-+-+---+--+---++-++----/||\\--+++++-+---+-++---+-+--++/||||  | |  ||  ||  | | |||||||| ||     ||/---+-++-\\   |||   || |  |   | ||  ||\n" +
                "| ||||   |||||| |  | |   |  |   || ||     ||   ||||| |   | \\+---+-+--++-++++--+-+--++--++--+-+-++++++++-++-----+++---+-++-+---+++---++-+--+---+-+/  ||\n" +
                "| ||\\+---++++++-+--+-+---+--+---++-++-----++---+++++-+---+--+---+-+--++-++++--+-+--++--/|  | | |||||||| ||     |||   | || |   |||   || |  |   | |   ||\n" +
                "| || |   |||||| |  | |   |  |   || ||     ||   ||||| |   |  |   | |  || ||||  | \\--++---+--+-+-++++++++-++-----+++---+-++-+---+++---++-/  |   | |   ||\n" +
                "| || |   |||||| |  | |   |  |   || ||     ||   ||||| |   |  |   | |  || ||||  |    ||   |  | | |||||||| ||     |||   | || |   |||   ||/---+---+-+-\\ ||\n" +
                "| || |   \\+++++-+--+-+---/  |   || ||     ||   ||||\\-+---+--+---+-+--++-++++--+----++---+--+-+-++++++++-++-----+++---+-++-+---+++---+++---+---+-+-+-/|\n" +
                "| \\+-+----+++++-+--+-+------+---++-++-----++---++++--+---+--+---+-+--++-+++/  |    ||/--+--+-+-++++++++-++-----+++---+-++-+\\  |||   |||   |   | | |  |\n" +
                "|  | |    ||||| |  | |      |   || ||     ||   ||||  |   |  |   | |  || |||   |    |||  |  | | |||||||| ||     |||   | || ||  ||| /-+++---+\\  | | |  |\n" +
                "|  | |    ||||| |  | |  /---+---++-++-----++---++++\\ |   |  |   | |  || |||   |    |||  |  | | |||||||| ||     |||   | || ||  ||| | |||   ||  | | |  |\n" +
                "|  | |    ||||| |  | |  |   |   || ||     ||   \\++++-+---+--+---+-+--++-+++---+----/||  |  | | |||||||| ||     |||   | || ||  ||| | |||   ||  | | |  |\n" +
                "\\--+-+----+++++-+--+-+--+---+---++-++-----++----++++-+---+--+---+-+--++-+++---+-----++--+--+-+-/||||\\++-++-----+++---+-++-++--+++-+-+++---/|  | | |  |\n" +
                "   | |    ||\\++-+--+-+--+---+---++-++-----++----++++-+---+--+---+-+--++-+++---+-----++--+--+-+--++/| || ||     |||   | || ||  ||| | |||    |  | | |  |\n" +
                "   | |    |\\-++-+--+-+--+---+---++-++-----++----++++-+---+--+---+-+--++-+++---+-----++--+--+-+--++-+-++-+/     |||   | || ||  ||| | |||    |  | | |  |\n" +
                "   | |    |  || |  | |  |   |   |\\-++-----++----++++-+---+--+---+-+--++-+++---+-----++--+--+-+--++-+-++-+------/||   | || ||  ||| | |||    |  | | |  |\n" +
                "   | |    |  || |  | |  |   |   |  ||     ||    |||| |   |  |   | |/-++-+++---+-----++--+--+-+--++-+-++>+-------++---+-++-++--+++-+\\|||    |  | | |  |\n" +
                "   | |    |  || \\--+-+--+---+---+--++-----++----++++-+---+--+---+-++-++-+++---+-----++--/  | |  || | || |       ||   |/++-++--+++-+++++----+--+-+\\|  |\n" +
                "   | |    |  ||    | |  |   |   |  ||     ||    |\\++-+---+--+---+-++-++-+++---+-----++-----+-+--++-+-++-+-------/|   |||| ||  ||| |||||    |  | |||  |\n" +
                "   \\-+----+--++----+-+--+---+---+--++-----++----+-++-+---+--+---+-++-++-/||   |     ||     | |  || | || |        |   |||| ||  ||| |||||    |  | |||  |\n" +
                "     |    |  ||    | |  |   |   |  ||     ||    | || |   |  |   | \\+-++--++---+-----++-----+-+--+/ | || |        |   |||| ||  ||| |||||    |  | |||  |\n" +
                "     |    |  ||    | |  |   |   |  \\+-----++----+-++-+---+--+---+--+-++--++---+-----++-----+-+--+--+-++-//-------+---++++\\||  ||| |||||    |  | |||  |\n" +
                "     |    |  ||  /-+-+--+---+---+---+\\    ||    | || |   |  |   |  | |\\--++---+-----++-----+-+--/  | ||  |       |   |||||||  ||| |||||    |  | |||  |\n" +
                "     |    \\--++--+-+-+--+---+---+---++----++----+-++-+---+--+---/  | |   ||   |     ||     | |     | ||  |       |   |||||||  ||| |||\\+----+--+-/||  |\n" +
                "     |       ||  | | |  |   |   |   ||    |\\----+-++-+---+--+------+-+---++---+-----++-----+-+-----+-++--+-------+---+++++++--+++-+++-+----+--+--++--/\n" +
                "     |       ||  | | |  \\---+---+---++----+-----+-+/ |   |  |      | |   ||   |     ||     | |     | ||  |       |   |||||||  ||| ||| |    |  |  ||   \n" +
                "     |       ||  | | |      |   |   ||    |     | |  |   |  |      | |   ||   |     |\\-----+-+-----+-++--+-------+---++++++/  ||| ||| |    |  |  ||   \n" +
                "     |       ||  | | \\------+---+---++----+-----/ |  |   |  |      \\-+---++---+-----+------+-+-----+-++--+-------+---++++++---+++-+/| |    |  |  ||   \n" +
                "     |       ||  | |        |   |   ||    |       |  |   |  |        |   ||   \\-----+------+-/     | |\\--+-------+---++++++---+++-+-/ |    |  |  ||   \n" +
                "     |       \\+--+-+--------+---+---++----+-------+--/   |  |        |   ||         |      |       | \\---+-------+---++/|||   ||| |   |    |  |  ||   \n" +
                "     |        |  | \\--------+---+---++----+-------+------+--+--------+---++---------+------/       |     |       |   || |||   ||| |   |    |  |  ||   \n" +
                "     |        |  |          |   |   ||    |       |      |  \\--------+---/| /-------+--------------+-----+-------+\\  |\\-+++-<-+++-+---+----+--+--/|   \n" +
                "     |        |  |          |   |   ||    |       |      \\-----------+----+-+-------+--------------+-----+-------++--+--/||   ||| |   |    |  |   |   \n" +
                "     |        |  |          |   |   \\+----+-------+------------------+----+-+-------+--------------/     |       ||  |   ||   ||| |   |    |  |   |   \n" +
                "     |        |  |          |   |    |    |       |                  \\----+-+-------+--------------------+-------++--+---++---++/ |   |    |  |   |   \n" +
                "     |        |  \\----------+---+----/    |       \\-----------------------+-+-------/                    |       \\+--+---+/   \\+--+---+----+--/   |   \n" +
                "     \\--------+-------------+---/         |                               | |                            \\--------+--+---/     |  \\---+----/      |   \n" +
                "              |             \\-------------+-------------------------------+-+-------------------------------------+--+---------/      |           |   \n" +
                "              \\---------------------------+-------------------------------+-+-------------------------------------+--/                |           |   \n" +
                "                                          |                               | |                                     |                   \\-----------/   \n" +
                "                                          \\-------------------------------/ \\-------------------------------------/                                   ";

        String example = "/->-\\        \n" +
                "|   |  /----\\\n" +
                "| /-+--+-\\  |\n" +
                "| | |  | v  |\n" +
                "\\-+-/  \\-+--/\n" +
                "  \\------/   ";

        String test1 = "/-<-\\        \n" +
                "|   |  /----\\\n" +
                "| /-+--+-\\  |\n" +
                "| | |  | v  |\n" +
                "\\-+-/  \\-+--/\n" +
                "  \\------/   ";

        String test2 = ">---<";

        String test3 = ">\\   \n" +
                " |   \n" +
                " |   \n" +
                " |   \n" +
                " \\<  ";

        String test4 = "v    \n" +
                "|    \n" +
                "|    \n" +
                "|    \n" +
                "^    ";

        String test5 = ">\\     \n" +
                " |     \n" +
                " \\---\\  \n" +
                "     |   \n" +
                "     \\<";

        String test6 = "     /<\n" +
                "     | \n" +
                " /---/ \n" +
                " |     \n" +
                ">/     ";

        String test7 = "    +-<\n" +
                "    +  \n" +
                "  +-+  \n" +
                "  +    \n" +
                ">-+    ";

        String test8 = "        +-<\n" +
                "        +  \n" +
                "      +-+  \n" +
                "      +    \n" +
                "    +-+    \n" +
                "    +      \n" +
                "  +-+      \n" +
                "  +        \n" +
                ">-+        ";

        String test9 = "v  /--\\\n" +
                "|  |  |\n" +
                "|  |  |\n" +
                "|  |  |\n" +
                "\\--/  ^";


        String[] lines = input.split("\n");

        int width = lines[0].length();
        int height = lines.length;
        int max = Math.max(width, height);

        Cell[][] grid = new Cell[max][max];

        for (int j = 0; j < grid[0].length; j++)
        {
            for (int i = 0; i < grid[0].length; i++)
            {
                grid[i][j] = new Cell();
                grid[i][j].cart = new Cart(-1, -1, false);
            }
        }

        List<Point> carts = new ArrayList<>();

        for (int y = 0; y < lines.length; y++)
        {
            for (int x = 0; x < lines[0].length(); x++)
            {
                if (lines[y].charAt(x) == '+')
                    grid[x][y].isCross = true;
                else if (lines[y].charAt(x) == '|')
                    grid[x][y].isVertLine = true;
                else if (lines[y].charAt(x) == '-')
                    grid[x][y].isHoriLine = true;
                else if (lines[y].charAt(x) == '\\')
                    grid[x][y].isBackSlash = true;
                else if (lines[y].charAt(x) == '/')
                    grid[x][y].isForwSlash = true;
                else if (lines[y].charAt(x) == ' ')
                    grid[x][y].isEmpty = true;
                else if (lines[y].charAt(x) == 'v')
                {
                    grid[x][y].cart = new Cart(0, 0, true);
                    grid[x][y].isVertLine = true;
                    carts.add(new Point(x, y));
                }
                else if (lines[y].charAt(x) == '<')
                {
                    grid[x][y].cart = new Cart(1, 0, true);
                    grid[x][y].isHoriLine = true;
                    carts.add(new Point(x, y));
                }
                else if (lines[y].charAt(x) == '^')
                {
                    grid[x][y].cart = new Cart(2, 0, true);
                    grid[x][y].isVertLine = true;
                    carts.add(new Point(x, y));
                }
                else if (lines[y].charAt(x) == '>')
                {
                    grid[x][y].cart = new Cart(3, 0, true);
                    grid[x][y].isHoriLine = true;
                    carts.add(new Point(x, y));
                }
            }
        }

        boolean crash = false;
        int tick = 0;

        System.out.println();

        while (true)
        {
            tick++;
            if (tick > 3921)
                printGrid(grid, lines);
            carts.sort(new comparePoints());

            for (Point cart : carts)
            {
                int x = (int) cart.getX();
                int y = (int) cart.getY();

                if (grid[x][y].cart.occupied)
                {
                    int dir = grid[x][y].cart.dir;
                    int nextDir = grid[x][y].cart.nextDir;
                    if (dir == 0)
                    {
                        crash = checkCart(grid, x, y + 1);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x][y + 1].cart.occupied = false;
                        }
                        else
                        {
                            grid[x][y + 1].cart = new Cart(0, nextDir, true);
                            checkDir(grid[x][y + 1]);
                            grid[x][y].cart.occupied = false;
                            cart.setLocation(new Point(x, y + 1));
                        }

                    }
                    else if (dir == 1)
                    {
                        crash = checkCart(grid, x - 1, y);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x - 1][y].cart.occupied = false;
                        }
                        else
                        {
                            grid[x - 1][y].cart = new Cart(1, nextDir, true);
                            checkDir(grid[x - 1][y]);
                            grid[x][y].cart.occupied = false;
                            cart.setLocation(new Point(x - 1, y));
                        }

                    }
                    else if (dir == 2)
                    {
                        crash = checkCart(grid, x, y - 1);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x][y - 1].cart.occupied = false;
                        }
                        else
                        {
                            grid[x][y - 1].cart = new Cart(2, nextDir, true);
                            checkDir(grid[x][y - 1]);
                            grid[x][y].cart.occupied = false;
                            cart.setLocation(new Point(x, y - 1));
                        }

                    }
                    else if (dir == 3)
                    {
                        crash = checkCart(grid, x + 1, y);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x + 1][y].cart.occupied = false;
                        }
                        else
                        {
                            grid[x + 1][y].cart = new Cart(3, nextDir, true);
                            checkDir(grid[x + 1][y]);
                            grid[x][y].cart.occupied = false;
                            cart.setLocation(new Point(x + 1, y));
                        }
                    }
                }
            }
            int working = 0;
            int index = 0;
            for (int i = 0; i < carts.size(); i++)
            {
                int x = (int) carts.get(i).getX();
                int y = (int) carts.get(i).getY();

                if (grid[x][y].cart.occupied)
                {
                    working++;
                    index = i;
                }
            }
            if (working == 1)
            {
                printGrid(grid, lines);
                System.out.println(carts.get(index).getLocation().toString());
                break;
            }
        }
    }

    /*
Collision log

v collided with v at 64,57 on tick 124
    15 carts left.
v collided with ^ at 111,100 on tick 293
    13 carts left.
> collided with v at 31,57 on tick 415
    11 carts left.
^ collided with v at 75,87 on tick 523
    9 carts left.
> collided with < at 119,28 on tick 801
    7 carts left.
v collided with ^ at 26,74 on tick 933
    5 carts left.
> collided with < at 90,56 on tick 3924
    3 carts left.
< collided with > at 58,42 on tick 10830

Last cart @ 136,8
     */

    static int numWorking(Cell[][] grid)
    {
        int working = 0;
        for (int y = 0; y < grid[0].length; y++)
        {
            for (int x = 0; x < grid[0].length; x++)
            {
                if (grid[x][y].cart.occupied)
                {
                    working++;
                }
            }
        }
        if (working == 1)
        {
            System.out.println("omfg");
        }
        return working;
    }

    static boolean checkCart(Cell[][] grid, int x, int y)
    {
        if (grid[x][y].cart.occupied)
        {
            System.out.println("CRASH AT: " + x + "," + y);
            if (x == 26 && y == 74)
            {
                DEBUG = true;
            }
            return true;
        }
        return false;
    }

    static void checkDir(Cell cell)
    {
        if (cell.isCross)
        {
            if (cell.cart.dir == 0)
            {
                if (cell.cart.nextDir == 0)
                {
                    cell.cart.dir = 3;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 1)
                {
                    cell.cart.dir = 0;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 2)
                {
                    cell.cart.dir = 1;
                    cell.cart.setNextDir();
                }
            }
            else if (cell.cart.dir == 1)
            {
                if (cell.cart.nextDir == 0)
                {
                    cell.cart.dir = 0;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 1)
                {
                    cell.cart.dir = 1;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 2)
                {
                    cell.cart.dir = 2;
                    cell.cart.setNextDir();
                }
            }
            else if (cell.cart.dir == 2)
            {
                if (cell.cart.nextDir == 0)
                {
                    cell.cart.dir = 1;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 1)
                {
                    cell.cart.dir = 2;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 2)
                {
                    cell.cart.dir = 3;
                    cell.cart.setNextDir();
                }
            }
            else if (cell.cart.dir == 3)
            {
                if (cell.cart.nextDir == 0)
                {
                    cell.cart.dir = 2;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 1)
                {
                    cell.cart.dir = 3;
                    cell.cart.setNextDir();
                }
                else if (cell.cart.nextDir == 2)
                {
                    cell.cart.dir = 0;
                    cell.cart.setNextDir();
                }
            }
        }
        else if (cell.isForwSlash)
        {
            if (cell.cart.dir == 0)
                cell.cart.dir = 1;
            else if (cell.cart.dir == 1)
                cell.cart.dir = 0;
            else if (cell.cart.dir == 2)
                cell.cart.dir = 3;
            else if (cell.cart.dir == 3)
                cell.cart.dir = 2;
        }
        else if (cell.isBackSlash)
        {
            if (cell.cart.dir == 0)
                cell.cart.dir = 3;
            else if (cell.cart.dir == 1)
                cell.cart.dir = 2;
            else if (cell.cart.dir == 2)
                cell.cart.dir = 1;
            else if (cell.cart.dir == 3)
                cell.cart.dir = 0;
        }
    }

    static void printGrid(Cell[][] grid, String[] lines)
    {
        for (int y = 0; y < lines.length; y++)
        {
            for (int x = 0; x < grid[0].length; x++)
            {
                System.out.print(grid[x][y].toString());
            }
            System.out.println();
        }
        System.out.println();
    }

    private static class comparePoints implements Comparator<Point>
    {
        public int compare(final Point a, final Point b)
        {
            if (a.getY() < b.getY())
                return -1;
            else if (a.getY() > b.getY())
                return 1;
            else
            {
                if (a.getX() < b.getX())
                    return -1;
                else if (a.getX() > b.getX())
                    return 1;
                else
                    return 0;
            }
        }
    }
}