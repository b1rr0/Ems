package listeners;


import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class ListenerLs extends ListenerAdapter
{
    private  long userId;



    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        User author = event.getAuthor();
        userId=author.getIdLong();
        Message message = event.getMessage();
        if (!message.getContentDisplay().replaceAll("\\s+","").toLowerCase().contains("лекция"))
        {
            if (author.getIdLong() == userId) {
                author.openPrivateChannel().queue((channel) ->
                {
                    channel.sendMessageFormat("Напишите \"лекция  \"номер лекции\" \"").queue();

                });
            }   }
    }

}