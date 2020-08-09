package mainLogik;

import listeners.*;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class BotControll {

    public static JDA jda;

    public static final String t1 = "NzQwMTU2NDg1NDYzNzAz";
    public static final String t2 = "NjEy.Xy";
    public static final String t3 = "k6cQ.-V8FyiS";
    public static final String t4 = "pRpUh5UDWABYmMr96CLA";
    public static final String token =t1+t2+t3+t4;

    public static void main(String args[]) throws LoginException {

     getJda().addEventListener(new ListenerLs());
     getJda().addEventListener(new ListenerLS0());
     getJda().addEventListener(new ListenerLS1());
     getJda().addEventListener(new ListenerLS2());
     getJda().addEventListener(new ListenerLS3());
     getJda().addEventListener(new ListenerLS4());
     getJda().addEventListener(new ListenerLS5());
     getJda().addEventListener(new ListenerLS6());
     getJda().addEventListener(new ListenerLS7());

    }

    public static JDA getJda() throws LoginException {
        if (jda == null) {
            jda = new JDABuilder(token).build();
        }
        return jda;
    }

}