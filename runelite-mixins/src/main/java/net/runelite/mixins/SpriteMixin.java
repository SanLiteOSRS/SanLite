package net.runelite.mixins;

import net.runelite.api.SpritePixels;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSSpritePixels;

import java.util.HashMap;
import java.util.Map;

@Mixin(RSClient.class)
public abstract class SpriteMixin implements RSClient
{
	@Inject
	private static final Map<Integer, SpritePixels> spriteOverrides = new HashMap<Integer, SpritePixels>();

	@Inject
	private static final Map<Integer, SpritePixels> widgetSpriteOverrides = new HashMap<Integer, SpritePixels>();

	@Inject
	@Override
	public Map<Integer, SpritePixels> getSpriteOverrides()
	{
		return spriteOverrides;
	}

	@Inject
	@Override
	public Map<Integer, SpritePixels> getWidgetSpriteOverrides()
	{
		return widgetSpriteOverrides;
	}

	@Copy("SpriteBuffer_getSprite")
	public static RSSpritePixels rs$loadSprite(RSAbstractArchive var0, int var1, int var2)
	{
		throw new RuntimeException();
	}

	@Replace("SpriteBuffer_getSprite")
	public static RSSpritePixels rl$loadSprite(RSAbstractArchive var0, int var1, int var2)
	{
		SpritePixels spritePixels = spriteOverrides.get(var1);

		if (spritePixels != null)
		{
			return (RSSpritePixels) spritePixels;
		}

		return rs$loadSprite(var0, var1, var2);
	}
}