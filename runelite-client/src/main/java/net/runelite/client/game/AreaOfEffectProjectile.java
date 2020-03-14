package net.runelite.client.game;

import lombok.Data;
import net.runelite.api.Actor;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.ProjectileMoved;

import java.awt.*;

/**
 * A projectile that targets an area and is not interacting with an {@link Actor}.
 * The projectile target point has been added when the {@link ProjectileMoved} event is triggered.
 */
@Data
public class AreaOfEffectProjectile
{
	private Projectile projectile;

	/**
	 * The local point of the area targeted by the projectile.
	 */
	private LocalPoint targetPoint;

	/**
	 * The game cycle that the projectile begun movement at.
	 */
	private int startCycle;

	/**
	 * The game cycle that the projectile will reach its target at.
	 */
	private int endCycle;

	/**
	 * The size of the area affected by the projectile (e.g. 3 is a 3x3 area).
	 */
	private int tileSize;

	/**
	 * The color of the projectile tile marker highlight.
	 */
	private Color highlightColor;

	public AreaOfEffectProjectile(Projectile projectile, int tileSize, LocalPoint targetPoint, Color highlightColor)
	{
		if (projectile == null || projectile.getInteracting() != null)
			throw new IllegalArgumentException("Projectile is null or is not an area of effect projectile");

		this.projectile = projectile;
		this.startCycle = projectile.getStartMovementCycle();
		this.endCycle = projectile.getEndCycle();
		this.tileSize = tileSize;
		this.targetPoint = targetPoint;
		this.highlightColor = highlightColor;
	}
}
