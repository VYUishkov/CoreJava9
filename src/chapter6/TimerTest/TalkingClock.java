package chapter6.TimerTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by VICTOR on 30.05.2017.
 */
public class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        class TimePrinter implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                if (beep)
                {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }
}
