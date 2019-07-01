package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Projectile;

/**
 * An event called whenever a {@link Projectile} has spawned.
 */
@Data
public class ProjectileSpawned
{
	/**
	 * The spawned projectile.
	 */
	private Projectile projectile;
}