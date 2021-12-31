package new00.new00;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Item extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("안녕").setExecutor(this);

    }

    @Override
    public void onDisable() {

    }
    //ctrl + o

    @EventHandler
    public void a123123412412321(BlockBreakEvent e){
        Player p = e.getPlayer();
    }
    @EventHandler
    public void a123123412412321(BlockPlaceEvent e){
        Player p = e.getPlayer();
        p.sendMessage("네 "+p.getName()+"가"+e.getBlock().getType()+"불럭을 설치했어");
        if(e.getBlock().getType() == Material.STONE){
            p.sendMessage("돌을 설치했어!");
        }
    }
    @EventHandler
    public void a123123(PlayerMoveEvent a){
        Player p = a.getPlayer();
        p.sendMessage("너 움직임.");
    }

    @EventHandler
    public void a12312321(PlayerJoinEvent a) {
        Player p = a.getPlayer();
        p.sendMessage("안녕하세요");
    }
    @EventHandler
    public void a12312312412(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        p.sendMessage("즐겜 : "+p.getName());
        if(e.getMessage().equals("하이")){ //하이라는 채팅을 쳤을경우.
            p.sendMessage("안녕~");
        }
    }
}
