package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface EntityPlayerSP extends AbstractClientPlayer {

  String getServerBrand();

  int getPermissionLevel();

  void setXPStats(float currentXP, int maxXP, int level);

  boolean isRidingHorse();

  boolean isCurrentViewEntity();

  boolean isRowingBoat();

  boolean isAutoJumpEnabled();
}
