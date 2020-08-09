package mainLogik;

import listeners.*;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class BotControll {

    public static JDA jda;
    public static final String token = "NzQwMTU2NDg1NDYzNzAzNjEy.Xyk6cQ.-9F931M_xuXBCKAc1g517NpFdmw";

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