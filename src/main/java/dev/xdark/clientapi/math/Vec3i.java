package dev.xdark.clientapi.math;

public interface Vec3i extends Comparable<Vec3i> {

  int getX();

  int getY();

  int getZ();

  Vec3i crossProduct(Vec3i other);

  double getDistance(int x, int y, int z);

  double distanceSq(double x, double y, double z);

  double distanceSqToCenter(double x, double y, double z);
}
