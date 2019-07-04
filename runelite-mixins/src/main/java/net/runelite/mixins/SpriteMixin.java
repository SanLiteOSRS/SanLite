package net.runelite.mixins;

import net.runelite.api.Sprite;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.rs.api.RSAbstractIndexCache;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSSprite;

import java.util.HashMap;
import java.util.Map;

@Mixin(RSClient.class)
public abstract class SpriteMixin implements RSClient
{
	@Inject
	private static final Map<Integer, Sprite> spriteOverrides = new HashMap<Integer, Sprite>();

	@Inject
	private static final Map<Integer, Sprite> widgetSpriteOverrides = new HashMap<Integer, Sprite>();

	@Inject
	@Override
	public Map<Integer, Sprite> getSpriteOverrides()
	{
		return spriteOverrides;
	}

	@Inject
	@Override
	public Map<Integer, Sprite> getWidgetSpriteOverrides()
	{
		return widgetSpriteOverrides;
	}

	@Copy("readSprite")
	public static RSSprite rs$loadSprite(RSAbstractIndexCache var0, int var1, int var2)
	{
		throw new RuntimeException();
	}

	@Replace("readSprite")
	public static RSSprite rl$loadSprite(RSAbstractIndexCache var0, int var1, int var2)
	{
		Sprite sprite = spriteOverrides.get(var1);

		if (sprite != null)
		{
			return (RSSprite) sprite;
		}

		return rs$loadSprite(var0, var1, var2);
	}
}