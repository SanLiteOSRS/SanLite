package net.runelite.mixins;

import net.runelite.api.SpritePixels;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSWidget;

import java.util.Map;

@Mixin(RSWidget.class)
public abstract class WidgetSpriteMixin implements RSWidget
{
	@Shadow("widgetSpriteOverrides")
	private static Map<Integer, SpritePixels> widgetSpriteOverrides;

	@Copy("getSprite")
	public RSSpritePixels rs$getWidgetSprite(boolean var1)
	{
		throw new RuntimeException();
	}

	@Replace("getSprite")
	public RSSpritePixels rl$getWidgetSprite(boolean var1)
	{
		if (getSpriteId() != -1)
		{
			SpritePixels spritePixels = widgetSpriteOverrides.get(getId());

			if (spritePixels != null)
			{
				return (RSSpritePixels) spritePixels;
			}
		}

		return rs$getWidgetSprite(var1);
	}

	@Inject
	@Override
	public SpritePixels getSprite()
	{
		return getSprite(false);
	}
}