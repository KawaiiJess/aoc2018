import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class One
{
    public static void main(String[] args)
    {
        /*
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
        */
        /*
        String input = "/->-\\        \n" +
                "|   |  /----\\\n" +
                "| /-+--+-\\  |\n" +
                "| | |  | v  |\n" +
                "\\-+-/  \\-+--/\n" +
                "  \\------/   ";
                */

        String input = "/-<-\\        \n" +
                "|   |  /----\\\n" +
                "| /-+--+-\\  |\n" +
                "| | |  | v  |\n" +
                "\\-+-/  \\-+--/\n" +
                "  \\------/   ";


        String[] lines = input.split("\n");

        int len = 0;
        for (String s : lines)
        {
            if (s.length() > len)
                len = s.length();
        }
        int max = Math.max(len, lines.length);

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
            for (int x = 0; x < grid[0].length; x++)
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
        int a = 0;

        printGrid(grid);

        while (true)
        {
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
                            grid[x][y + 1].isCrash = true;
                            printGrid(grid);
                            System.exit(0);
                        }
                        grid[x][y + 1].cart = new Cart(0, nextDir, true);
                        checkDir(grid[x][y + 1]);
                        grid[x][y].cart.occupied = false;
                        cart.setLocation(new Point(x, y + 1));
                    }
                    else if (dir == 1)
                    {
                        crash = checkCart(grid, x - 1, y);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x - 1][y].isCrash = true;
                            printGrid(grid);
                            System.exit(0);
                        }
                        grid[x - 1][y].cart = new Cart(1, nextDir, true);
                        checkDir(grid[x - 1][y]);
                        grid[x][y].cart.occupied = false;
                        cart.setLocation(new Point(x - 1, y));
                    }
                    else if (dir == 2)
                    {
                        crash = checkCart(grid, x, y - 1);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x][y - 1].isCrash = true;
                            printGrid(grid);
                            System.exit(0);
                        }
                        grid[x][y - 1].cart = new Cart(2, nextDir, true);
                        checkDir(grid[x][y - 1]);
                        grid[x][y].cart.occupied = false;
                        cart.setLocation(new Point(x, y - 1));
                    }
                    else if (dir == 3)
                    {
                        crash = checkCart(grid, x + 1, y);
                        if (crash)
                        {
                            grid[x][y].cart.occupied = false;
                            grid[x + 1][y].isCrash = true;
                            printGrid(grid);
                            System.exit(0);
                        }
                        grid[x + 1][y].cart = new Cart(3, nextDir, true);
                        checkDir(grid[x + 1][y]);
                        grid[x][y].cart.occupied = false;
                        cart.setLocation(new Point(x + 1, y));
                    }
                }
            }
            printGrid(grid);
            a++;
        }
    }

    static boolean checkCart(Cell[][] grid, int x, int y)
    {
        if (grid[x][y].cart.occupied)
        {
            System.out.println("CRASH AT: " + x + "," + y);
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

    static void printGrid(Cell[][] grid)
    {
        for (int y = 0; y < grid[0].length; y++)
        {
            for (int x = 0; x < grid[0].length; x++)
            {
                System.out.print(grid[x][y].toString());
            }
            System.out.println();
        }
        System.out.println();
    }
}