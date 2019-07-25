package net.runelite.rs.api;

import net.runelite.api.Projectile;
import net.runelite.mapping.Import;

public interface RSProjectile extends RSEntity, Projectile
{
	@Import("id")
	@Override
	int getId();

	@Import("targetIndex")
	int getRsInteracting();

	@Import("sourceZ")
	@Override
	int getHeight();

	@Import("endHeight")
	@Override
	int getEndHeight();

	@Import("sourceX")
	@Override
	int getX1();

	@Import("sourceY")
	@Override
	int getY1();

	@Import("plane")
	@Override
	int getFloor();

	@Import("cycleStart")
	@Override
	int getStartMovementCycle();

	@Import("cycleEnd")
	@Override
	int getEndCycle();

	@Import("slope")
	@Override
	int getSlope();

	@Import("startHeight")
	@Override
	int getStartHeight();

	@Import("x")
	@Override
	double getX();

	@Import("y")
	@Override
	double getY();

	@Import("z")
	@Override
	double getZ();

	@Import("speed")
	@Override
	double getScalar();

	@Import("speedX")
	@Override
	double getVelocityX();

	@Import("speedY")
	@Override
	double getVelocityY();

	@Import("speedZ")
	@Override
	double getVelocityZ();
}
