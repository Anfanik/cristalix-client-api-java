package dev.xdark.clientapi.entity;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.potion.Potion;
import dev.xdark.clientapi.potion.PotionEffect;
import java.util.Collection;

@SidedApi(Side.SERVER)
public interface EntityLivingBase extends Entity {

  DataParameter<Byte> HAND_STATES = objectValue();
  DataParameter<Float> HEALTH = objectValue();
  DataParameter<Integer> POTION_EFFECTS = objectValue();
  DataParameter<Boolean> HIDE_PARTICLES = objectValue();
  DataParameter<Integer> ARROW_COUNT_IN_ENTITY = objectValue();

  float getHealth();

  float getMaxHealth();

  boolean isMovementBlocked();

  void setMovementBlocked(boolean movementBlocked);

  ItemStack getHeldItemMainhand();

  ItemStack getHeldItemOffhand();

  //ItemStack getItemStackFromSlot(EntityEquipmentSlot slot);

  boolean isHandActive();

  //EnumHand getActiveHand();

  //void setActiveHand(EnumHand hand);

  ItemStack getActiveItemStack();

  int getItemInUseCount();

  int getItemInUseMaxCount();

  boolean isActiveItemStackBlocking();

  boolean isElytraFlying();

  int getTicksElytraFlying();

  boolean isChild();

  Collection<PotionEffect> getActivePotionEffects();

  boolean isPotionActive(Potion potion);

  PotionEffect getActivePotionEffect(Potion potion);

  void addPotionEffect(PotionEffect effect);

  boolean isPotionApplicable(PotionEffect effect);

  boolean isEntityUndead();

  PotionEffect removeActivePotionEffect(Potion potion);

  void removePotionEffect(Potion potion);

  void setHealth(float health);

  boolean isOnLadder();

  void performHurtAnimation();

  int getTotalArmorValue();

  int getArrowCountInEntity();

  void setArrowCountInEntity(int arrowCountInEntity);

  //void swingArm(EnumHand hand);

  //ItemStack getHeldItem(EnumHand hand);

  //void setHeldItem(EnumHand hand, ItemStack stack);

  //boolean hasItemInSlot(EntityEquipmentSlot slot);

  void jump();

  void travel(float x, float y, float z);

  float getAIMoveSpeed();

  void setAIMoveSpeed(float AIMoveSpeed);

  void setJumping(boolean jumping);

  boolean canEntityBeSeen(Entity entity);

  void setRenderYawOffset(float renderYawOffset);

  //EnumHandSide getPrimaryHand();

  boolean isJumping();

  float getRotationYawHead();

  void setRotationYawHead(float rotationYawHead);

  float getAbsorptionAmount();

  void setAbsorptionAmount(float absorptionAmount);

  boolean attemptTeleport(double x, double y, double z);
}
