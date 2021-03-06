package com.benberi.cadesim.server.codec.packet.in;

import com.benberi.cadesim.server.ServerContext;
import com.benberi.cadesim.server.codec.util.Packet;
import com.benberi.cadesim.server.model.player.Player;
import com.benberi.cadesim.server.codec.packet.ServerPacketExecutor;

public class PlayerPlaceCannonPacket extends ServerPacketExecutor {

    public PlayerPlaceCannonPacket(ServerContext ctx) {
        super(ctx);
    }

    @Override
    public void execute(Player pl, Packet p) {
        int slot = p.readByte();
        int side = p.readByte();

        pl.placeCannon(slot, side);
    }
}
