package listeners;


import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.io.File;
import java.util.ArrayList;

public class ListenerLS6 extends ListenerAdapter
{
    private  long userId;



    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        User author = event.getAuthor();
        userId=author.getIdLong();
        Message message = event.getMessage();
        if (!message.getContentDisplay().replaceAll("\\s+","").equalsIgnoreCase("Лекция6"))return;
        if (!author.isBot()) {
            author.openPrivateChannel().queue((channel) ->
            {
                ArrayList<String> arrayList;
                arrayList = TXTreader.get("L6");
                int count=0;
                for (String s : arrayList) {
                    channel.sendMessageFormat(s).queue();
                    if(count==2)channel.sendFile(new File("L6.1.png")).queue();
                    if(count==4)channel.sendFile(new File("L6.2.png")).queue();
                    if(count==8)channel.sendFile(new File("L6.3.png")).queue();
                    if(count==9)channel.sendFile(new File("L6.4.png")).queue();
                    count++;
                }
            });
            author.openPrivateChannel().queue((channel) ->{channel.sendMessage("===============Конец Экзамена============").queue();});
        }
    }

}