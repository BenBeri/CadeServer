package com.benberi.cadesim.server;

import com.benberi.cadesim.server.model.PlayerManager;
import com.benberi.cadesim.server.model.cade.BlockadeTimeMachine;

public class ServerContext {

    /**
     * The player manager
     */
    private PlayerManager players;

    /**
     * The time machine of blockade
     */
    private BlockadeTimeMachine timeMachine;

    /**
     * The configuration of the server
     */
    private ServerConfiguration configuration;

    public ServerContext(ServerConfiguration config) {
        this.configuration = config;
        this.players = new PlayerManager(this);
        this.timeMachine = new BlockadeTimeMachine(this);
    }

    /**
     * Gets the player manager
     * @return {@link #players}
     */
    public PlayerManager getPlayerManager() {
        return players;
    }

    /**
     * Gets the server configuration
     * @return {@link #configuration}
     */
    public ServerConfiguration getConfiguration() {
         return configuration;
    }

    /**
     * Gets the blokade time machine
     * @return {@link #timeMachine}
     */
    public BlockadeTimeMachine getTimeMachine() {
        return timeMachine;
    }
}