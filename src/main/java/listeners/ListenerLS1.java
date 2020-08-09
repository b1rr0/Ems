package listeners;


import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ListenerLS1 extends ListenerAdapter
{
    private  long userId;


    public static void main(String[] args) {

    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        String s ="https://docs.google.com/document/d/1-QH3OGdqfb5mqR_NBqtrNAFZlI1GiyBOgvbUBZl95K4/edit";
        User author = event.getAuthor();
        userId=author.getIdLong();
        Message message = event.getMessage();
        if (!message.getContentDisplay().replaceAll("\\s+","").equalsIgnoreCase("Лекция1"))return;
          if (!author.isBot()){
            author.openPrivateChannel().queue((channel) ->
            {

                channel.sendMessageFormat(s).queue();
            });
              author.openPrivateChannel().queue((channel) ->{channel.sendMessage("===============Конец Экзамена============").queue();});
        }}
    }

