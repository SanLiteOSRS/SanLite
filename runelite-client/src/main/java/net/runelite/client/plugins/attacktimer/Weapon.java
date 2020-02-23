package net.runelite.client.plugins.attacktimer;

import lombok.Getter;

import java.util.ArrayList;

public class Weapon
{
	@Getter
	private ArrayList<Integer> weaponID;
	@Getter
	private ArrayList<Integer> animationID;
	@Getter
	private ArrayList<AttackStyle> attackStyle;
	@Getter
	private ArrayList<Integer> attackSpeed;

	public Weapon(ArrayList<Integer> weaponID, ArrayList<Integer> animationID,  ArrayList<AttackStyle> attackStyle, ArrayList<Integer> attackSpeed)
	{
		this.weaponID = weaponID;
		this.animationID = animationID;
		this.attackStyle = attackStyle;
		this.attackSpeed = attackSpeed;
	}
}
