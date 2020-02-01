package net.runelite.client.plugins.transmog;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.runelite.api.kit.KitType;

@Getter(AccessLevel.PACKAGE)
public class EquipmentSet
{
	private String name;

	private int helmet;
	private int cape;
	private int amulet;
	private int weapon;
	private int torso;
	private int shield;
	private int legs;
	private int hands;
	private int boots;

	@Setter(AccessLevel.PACKAGE)
	private boolean isJawEnabled;

	@Setter(AccessLevel.PACKAGE)
	private boolean isHeadEnabled;

	@Setter(AccessLevel.PACKAGE)
	private boolean isArmsEnabled;

	@Setter(AccessLevel.PACKAGE)
	private boolean isHandsEnabled;

	public EquipmentSet(String name)
	{
		this.name = name;
	}

	int getEquipmentSlotIdByKitType(KitType kitType)
	{
		switch (kitType)
		{
			case HELMET:
				return helmet;
			case CAPE:
				return cape;
			case AMULET:
				return amulet;
			case WEAPON:
				return weapon;
			case TORSO:
				return torso;
			case SHIELD:
				return shield;
			case LEGS:
				return legs;
			case HANDS:
				return hands;
			case BOOTS:
				return boots;
			default:
				return -1;
		}
	}

	void setEquipmentSlotIdByKitType(KitType kitType, int id)
	{
		switch (kitType)
		{
			case HELMET:
				helmet = id;
				break;
			case CAPE:
				cape = id;
				break;
			case AMULET:
				amulet = id;
				break;
			case WEAPON:
				weapon = id;
				break;
			case TORSO:
				torso = id;
				break;
			case SHIELD:
				shield = id;
				break;
			case LEGS:
				legs = id;
				break;
			case HANDS:
				hands = id;
				break;
			case BOOTS:
				boots = id;
				break;
		}
	}

	@Override
	public String toString()
	{
		return "EquipmentSet{" +
				"name='" + name + '\'' +
				", helmet=" + helmet +
				", cape=" + cape +
				", amulet=" + amulet +
				", weapon=" + weapon +
				", torso=" + torso +
				", shield=" + shield +
				", legs=" + legs +
				", hands=" + hands +
				", boots=" + boots +
				", isJawEnabled=" + isJawEnabled +
				", isHeadEnabled=" + isHeadEnabled +
				", isArmsEnabled=" + isArmsEnabled +
				", isHandsEnabled=" + isHandsEnabled +
				'}';
	}
}
