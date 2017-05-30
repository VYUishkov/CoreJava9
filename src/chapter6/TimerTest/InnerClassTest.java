package chapter6.TimerTest;

import javax.swing.*;

/**
 * Created by VICTOR on 30.05.2017.
 */
public class InnerClassTest
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock(10, false);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

