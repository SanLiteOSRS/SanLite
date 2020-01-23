package net.runelite.client.plugins.transmog;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Transmog")
public interface TransmogConfig extends Config
{
	@ConfigItem(
			keyName = "helmetId",
			name = "Helmet id",
			description = "Helmet item id",
			position = 1
	)
	default int getHelmetId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "capeId",
			name = "Cape id",
			description = "Cape item id",
			position = 2
	)
	default int getCapeId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "amuletId",
			name = "Amulet id",
			description = "Amulet item id",
			position = 3
	)
	default int getAmuletId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "weaponId",
			name = "Weapon id",
			description = "Weapon item id",
			position = 4
	)
	default int getWeaponId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "torsoId",
			name = "Torso id",
			description = "Torso item id",
			position = 5
	)
	default int getTorsoId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "shieldId",
			name = "Shield id",
			description = "Shield item id",
			position = 6
	)
	default int getShieldId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "legsId",
			name = "Legs id",
			description = "Legs item id",
			position = 7
	)
	default int getLegsId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "headId",
			name = "Head id",
			description = "Head item id",
			position = 8
	)
	default int getHeadId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "handsId",
			name = "Hands id",
			description = "Hands item id",
			position = 9
	)
	default int getHandsId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "bootsId",
			name = "Boots id",
			description = "Boots item id",
			position = 10
	)
	default int getBootsId()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "jawId",
			name = "Jaw id",
			description = "Jaw item id",
			position = 9
	)
	default int getJawId()
	{
		return 0;
	}
}
