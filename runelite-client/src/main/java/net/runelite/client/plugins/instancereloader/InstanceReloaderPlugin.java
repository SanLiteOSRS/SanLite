package net.runelite.client.plugins.instancereloader;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

import javax.inject.Inject;
import java.awt.image.BufferedImage;

@PluginDescriptor(
		name = "Instance Reloader",
		description = "Allows the user to reload an instance by disconnecting themselves temporarily. This is used for raids scouting",
		tags = {"raids", "instance", "scouter", "scout"},
		type = PluginType.SANLITE,
		enabledByDefault = false
)
@Slf4j
public class InstanceReloaderPlugin extends Plugin
{

	@Inject
	private ClientToolbar clientToolbar;

	private NavigationButton navButton;

	@Override
	protected void startUp() throws Exception
	{
		InstanceReloaderPanel panel = injector.getInstance(InstanceReloaderPanel.class);
		panel.init();
		final BufferedImage icon = ImageUtil.getResourceStreamFromClass(this.getClass(), "instancereloadhelper.png");

		navButton = NavigationButton.builder()
				.tooltip("Instance Reloader")
				.icon(icon)
				.priority(8)
				.panel(panel)
				.build();
		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientToolbar.removeNavigation(navButton);
	}
}
