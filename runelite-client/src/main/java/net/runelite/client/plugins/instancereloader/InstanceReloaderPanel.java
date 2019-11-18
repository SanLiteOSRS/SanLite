/*
 * Copyright (c) 2018, Lyzrds
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
package net.runelite.client.plugins.instancereloader;

import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

@Singleton
class InstanceReloaderPanel extends PluginPanel
{
	@Inject
	private Client client;

	private final JButton reloadButton = new JButton("Reload Instance");

	void init()
	{
		setLayout(new GridLayout(2, 1));
		setBackground(ColorScheme.DARK_GRAY_COLOR);
		setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel instanceReloaderPanel = new JPanel();
		instanceReloaderPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		instanceReloaderPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		instanceReloaderPanel.setLayout(new GridLayout(2, 1));

		JLabel title = new JLabel(htmlLabel("<center>Instance Reloader</center>"), SwingConstants.CENTER);
		title.setFont(FontManager.getRunescapeFont());

		JLabel subTitle = new JLabel(htmlLabel("Reloading an instance will cause your client to disconnect temporarily."));
		subTitle.setFont(FontManager.getRunescapeSmallFont());

		instanceReloaderPanel.add(title);
		instanceReloaderPanel.add(subTitle);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		buttonPanel.setLayout(new GridLayout(2, 1, 0, 5));

		reloadButton.addActionListener((ActionEvent e) ->
		{
			if ((client.getGameState() == GameState.LOGGED_IN) && client.isInInstancedRegion())
			{
				client.setGameState(GameState.CONNECTION_LOST);
			}
		});

		buttonPanel.add(reloadButton);

		add(instanceReloaderPanel);
		add(buttonPanel);
	}

	private static String htmlLabel(String text)
	{
		return "<html><body><span style = 'color:white'>" + text + "</span></body></html>";
	}
}
