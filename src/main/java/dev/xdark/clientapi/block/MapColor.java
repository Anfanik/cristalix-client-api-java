package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface MapColor {

  int getColor(int type);
}
