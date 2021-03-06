package dev.xdark.clientapi.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.UUID;

@SidedApi(Side.SERVER)
public interface ClientConnection {

  void addPlayerInfo(NetworkPlayerInfo info);

  NetworkPlayerInfo getPlayerInfo(UUID uuid);

  NetworkPlayerInfo getPlayerInfo(String name);

  NetworkPlayerInfo removePlayerInfo(UUID uuid);

  NetworkPlayerInfo removePlayerInfo(String name);

  Collection<NetworkPlayerInfo> getPlayerInfos();

  void sendPayload(String channel, ByteBuf buf);
}
