package fr.noah.api.manager.mysqlDB;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.sql.SQLException;
import java.util.UUID;

public class PlayerJoinListener implements Listener {
    private SqlConnection sqlConnection;

    public SqlConnection getSqlConnection() {
        return sqlConnection;
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) throws SQLException {
        final UUID uuid = event.getPlayer().getUniqueId();

    }
}
