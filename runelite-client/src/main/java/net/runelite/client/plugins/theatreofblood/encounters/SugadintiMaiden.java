/*
 * Copyright (c) 2019, Siraz <https://github.com/Sirazzz>
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
package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class SugadintiMaiden extends TheatreOfBloodEncounter
{
	@Getter
	private int startTime;
	@Getter
	private int percent;

	@Inject
	private ChatMessageManager chatMessageManager;

	public SugadintiMaiden(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
	}

	public boolean isBloodSplatAttack(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.MAIDEN_BLOOD_SPLAT_ATTACK;
	}

	public boolean isBloodSpawnBloodTile(int gameObjectId)
	{
		return gameObjectId == NullObjectID.NULL_32984;
	}

	/**
	 * Adds game object to the game objects list if it matches the blood spawn object id
	 *
	 * @param gameObject game object
	 */
	public void addBloodSpawnBloodObject(GameObject gameObject)
	{
		if (gameObject == null)
		{
			return;
		}

		if (isBloodSpawnBloodTile(gameObject.getId()))
		{
			getGameObjects().add(gameObject);
		}
	}

	/**
	 * Removes game object from the game objects list if it matches the blood spawn object id
	 *
	 * @param gameObject game object
	 */
	public void removeBloodSpawnBloodObject(GameObject gameObject)
	{
		if (gameObject == null)
		{
			return;
		}

		if (isBloodSpawnBloodTile(gameObject.getId()))
		{
			getGameObjects().remove(gameObject);
		}
	}

	/**
	 * Checks for the graphics objects thrown out by the Sugadinti Maiden's blood splat attack
	 *
	 * @param clientGraphicObjects the clients current graphics objects list
	 */
	public void checkBloodSplatGraphicObjects(List<GraphicsObject> clientGraphicObjects)
	{
		setAoeEffects(
				clientGraphicObjects.stream()
						.filter(x -> isBloodSplatAttack(x.getId()))
						.collect(Collectors.toList()));
	}

	public void startTimer(int clientTick)
	{
		startTime = clientTick;
		percent = 100;
	}

	public void checkMaidenHealth(int health, int clientTick)
	{
		if (health == 0) return;

		if (percent == 100 && health <= 700)
		{
			percent = 70;
			int secondsTaken = (int)Math.ceil(((clientTick - startTime) / 5.0) / 10.0);
			sendChatMessage(Integer.toString(percent), Integer.toString(secondsTaken / 60), Integer.toString(secondsTaken % 60));
		}
		else if (percent == 70 && health <= 500)
		{
			percent = 50;
			int secondsTaken = (int)Math.ceil(((clientTick - startTime) / 5.0) / 10.0);
			sendChatMessage(Integer.toString(percent), Integer.toString(secondsTaken / 60), Integer.toString(secondsTaken % 60));
		}
		else if (percent == 50 && health <= 300)
		{
			percent = 30;
			int secondsTaken = (int)Math.ceil(((clientTick - startTime) / 5.0) / 10.0);
			sendChatMessage(Integer.toString(percent), Integer.toString(secondsTaken / 60), Integer.toString(secondsTaken % 60));
		}
	}

	private void sendChatMessage(String percent, String minutes, String seconds)
	{
		log.warn(percent + " % " + minutes + "minutes " + seconds + " seconds");
		final String currentTimeMessage = new ChatMessageBuilder()
				.append(ChatColorType.HIGHLIGHT)
				.append("Maiden " + percent + "% health: " + minutes + " minute(s)" + seconds + " second(s).")
				.build();
		chatMessageManager.queue(
				QueuedMessage.builder()
						.type(ChatMessageType.CONSOLE)
						.runeLiteFormattedMessage(currentTimeMessage)
						.build());
	}
}
