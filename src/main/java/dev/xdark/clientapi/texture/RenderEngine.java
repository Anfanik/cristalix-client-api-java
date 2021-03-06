package dev.xdark.clientapi.texture;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import java.awt.image.BufferedImage;

@SidedApi(Side.SERVER)
public interface RenderEngine {

  boolean loadTexture(ResourceLocation location, Texture texture);

  ResourceLocation getDynamicTextureLocation(String name, DynamicTexture texture);

  void deleteTexture(ResourceLocation location);

  void bindTexture(ResourceLocation location);

  Texture newSimpleTexture(ResourceLocation location);

  DynamicTexture newDynamicTexture(BufferedImage image);

  DynamicTexture newDynamicTexture(int width, int height);
}
