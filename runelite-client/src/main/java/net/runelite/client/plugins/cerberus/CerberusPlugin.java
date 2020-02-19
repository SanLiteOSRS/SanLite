/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.client.plugins.cerberus;

import com.google.common.collect.ComparisonChain;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
	name = "Cerberus",
	description = "Show what to pray against Cerberus, including special attacks",
	tags = {"bosses", "combat", "ghosts", "prayer", "pve", "overlay", "souls", "pvm", "cerb", "cerberus"},
	type = PluginType.SANLITE_USE_AT_OWN_RISK
)

@Slf4j
@Singleton
public class CerberusPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private CerberusOverlay overlay;

	//@Inject
	//private CerberusDebugOverlay debugOverlay;

	@Inject
	private Client client;

	@Getter
	private Cerberus cerberus;

	@Getter
	private boolean encounter;

	private final int[] CERBERUS_REGION_WEST = {
			4626, 4627,
			4882, 4883,
			5138, 5139
	};

	private final int[] CERBERUS_REGION_EAST = {
			5138, 5139,
			5349, 5395,
			5650, 5651
	};

	private final int[] CERBERUS_REGION_NORTH = {
			4883, 4884,
			5139, 5140,
			5395, 5396
	};

	private ArrayList<int[]> CERBERUS_REGIONS = new ArrayList<>();

	private boolean isNpcCerberus(int npcID)
	{
		return npcID == NpcID.CERBERUS ||
				npcID == NpcID.CERBERUS_5863 ||
				npcID == NpcID.CERBERUS_5866;
	}

	private List<GraphicsObject> graphicsObjects = new ArrayList<>();

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
		//overlayManager.add(debugOverlay);
		encounter = false;
		CERBERUS_REGIONS.add(CERBERUS_REGION_EAST);
		CERBERUS_REGIONS.add(CERBERUS_REGION_NORTH);
		CERBERUS_REGIONS.add(CERBERUS_REGION_WEST);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		//overlayManager.remove(debugOverlay);
		encounter = false;
	}

	private boolean isCerberusRegion()
	{
		boolean isInRegion = false;

		for (int[] intArray : CERBERUS_REGIONS)
		{
			List<Integer> intListCerbRegion = new ArrayList<>(intArray.length);

			for (int i : intArray)
			{
				intListCerbRegion.add(i);
			}

			List<Integer> intListMapRegion = new ArrayList<>(client.getMapRegions().length);

			for (int i : client.getMapRegions())
			{
				intListMapRegion.add(i);
			}

			if (intListMapRegion.containsAll(intListCerbRegion))
			{
				isInRegion = true;
			}
			else
			{
				isInRegion = false;
			}
		}

		return isInRegion;

	}

	@Subscribe
	protected void onClientTick(ClientTick event)
	{
		if (isCerberusRegion())
		{
			encounter = true;
		}
		else
		{
			encounter = false;
		}

		if (validateInstanceAndNpc())
		{
			cerberus.updateHealth();
			cerberus.setNextPrayer();
			cerberus.checkPoolSpawns(client.getGraphicsObjects());

			if (!cerberus.getGhosts().isEmpty())
			{
				cerberus.getGhosts().sort((a, b) -> ComparisonChain.start()
						.compare(a.getLocalLocation().getX(), b.getLocalLocation().getX())
						.result());

				if (cerberus.getGhosts().size() > 3)
				{
					cerberus.getGhosts().sort((a, b) -> ComparisonChain.start()
							.compare(a.getLocalLocation().getY(), b.getLocalLocation().getY())
							.result());
				}
			}

			if ((cerberus.getAttackCount() - 1) % 10 == 0)
			{
				cerberus.setTripleAttack(true);
				cerberus.setCurrentAttack(Cerberus.Attack.TRIPLE);
			}
			else if (cerberus.getAttackCount() % 7 == 0 && cerberus.getHealth() < 400)
			{
				cerberus.setCurrentAttack(Cerberus.Attack.GHOSTS);
			}
			else if (cerberus.getAttackCount() % 5 == 0 && cerberus.getHealth() < 200)
			{
				cerberus.setCurrentAttack(Cerberus.Attack.LAVA);
			}
			else
			{
				cerberus.setCurrentAttack(Cerberus.Attack.DEFAULT);
			}
		}
	}

	@Subscribe
	public void onNpcSpawned(final NpcSpawned event)
	{
		final NPC eventNpc = event.getNpc();

		if (encounter && isNpcCerberus(eventNpc.getId()))
		{
			cerberus = new Cerberus(eventNpc);
		}
		else if (cerberus != null)
		{
			if (encounter && cerberus.isCerberusGhost(eventNpc.getId()))
			{
				cerberus.getGhosts().add(eventNpc);
			}
		}
	}

	@Subscribe
	public void onNpcDespawned(final NpcDespawned event)
	{
		final NPC eventNpc = event.getNpc();

		if (isNpcCerberus(eventNpc.getId()))
		{
			cerberus = null;
		}
		else if (cerberus != null)
		{
			if (cerberus.isCerberusGhost(eventNpc.getId()))
			{
				cerberus.getGhosts().remove(eventNpc);
			}
		}
	}


	@Subscribe
	public void onAnimationChanged(AnimationChanged animation)
	{
		if (validateInstanceAndNpc())
		{
			if ((client.getGameCycle() - cerberus.getTimeOfLastAnimation()) >= 170 || cerberus.isTripleAttack())
			{
				if (cerberus.isCerberusAttack(animation.getActor().getAnimation()))
				{
					if (cerberus.isTripleAttack())
					{
						if (cerberus.getNpc().getAnimation() == AnimationID.CERBERUS_MELEE)
						{
							cerberus.setAttackCount(cerberus.getAttackCount() + 1);
							cerberus.setTripleAttack(false);
							cerberus.setTripleAttackCount(0);
						}
					}
					else
					{
						cerberus.setAttackCount(cerberus.getAttackCount() + 1);
					}
					cerberus.setTimeOfLastAnimation(client.getGameCycle());
				}
			}
		}
	}

	@Subscribe
	private void onProjectileSpawned(ProjectileSpawned event)
	{
		if (validateInstanceAndNpc())
		{
			if (cerberus.isGhostProjectile(event.getProjectile().getId()))
			{
				cerberus.setGhostsCycleCount(cerberus.getGhostsCycleCount() + 1);
				cerberus.checkGhostCycle();
			}

			if ((client.getGameCycle() - cerberus.getTimeOfLastAnimation()) >= 170 || cerberus.isTripleAttack())
			{
				if (cerberus.isCerberusProjectile(event.getProjectile().getId()))
				{
					if (cerberus.isTripleAttack())
					{
						cerberus.setTripleAttackCount(cerberus.getTripleAttackCount() + 1);
					}
					else
					{
						cerberus.setAttackCount(cerberus.getAttackCount() + 1);
						cerberus.setTimeOfLastAnimation(client.getGameCycle());
					}
				}
			}
		}
	}

	public boolean validateInstanceAndNpc()
	{
		if (encounter && cerberus != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Subscribe
	public void onOverheadTextChanged(OverheadTextChanged event)
	{
		if (cerberus != null)
		{
			if (event.getActor() == cerberus.getNpc())
			{
				if (cerberus.isGhostsOverheadText())
				{
					cerberus.setGhostsActive(true);
					cerberus.setGhostsCycleCount(1);
				}
			}
		}
	}
}
