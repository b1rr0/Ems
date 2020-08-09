package listeners;


import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.util.ArrayList;

public class ListenerLS2 extends ListenerAdapter {
    public static long userId;


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        User author = event.getAuthor();
        userId = author.getIdLong();
        Message message = event.getMessage();
        if (!message.getContentDisplay().replaceAll("\\s+", "").equalsIgnoreCase("Лекция2")) return;
        if (!author.isBot()) {
            author.openPrivateChannel().queue((channel) ->
            {
                ArrayList<String> arrayList;
                arrayList = TXTreader.get("L2");
                for (String s : arrayList) {
                    System.out.println( "");
                    channel.sendMessageFormat(s).queue();
                }
            });
            author.openPrivateChannel().queue((channel) ->{channel.sendMessage("===============Конец Экзамена============").queue();});
        }
    }
}