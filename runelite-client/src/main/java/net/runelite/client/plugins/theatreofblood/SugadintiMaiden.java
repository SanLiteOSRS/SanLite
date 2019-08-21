package net.runelite.client.plugins.theatreofblood;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GraphicID;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;

import java.util.ArrayList;
import java.util.List;

class SugadintiMaiden
{

	@Getter
	private NPC npc;

	@Getter
	@Setter
	private List<GraphicsObject> aoeEffects;

	SugadintiMaiden(NPC npc)
	{
		this.npc = npc;
		this.aoeEffects = new ArrayList<>();
	}

	boolean isBloodAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.MAIDEN_BLOOD_SPLAT_ATTACK;
	}
}
