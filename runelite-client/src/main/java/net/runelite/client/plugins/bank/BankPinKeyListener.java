package net.runelite.client.plugins.bank;

import com.google.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.input.KeyListener;

import java.awt.event.KeyEvent;

public class BankPinKeyListener implements KeyListener
{
	private BankPlugin bankPlugin;
	private final Client client;
	private final ClientThread clientThread;

	private int lastKeyInputCycle;

	@Inject
	public BankPinKeyListener(BankPlugin bankPlugin, final Client client, final ClientThread clientThread)
	{
		this.bankPlugin = bankPlugin;
		this.client = client;
		this.clientThread = clientThread;
	}

	@Override
	public void keyTyped(KeyEvent keyEvent)
	{
		if (!Character.isDigit(keyEvent.getKeyChar()))
		{
			return;
		}

		if (client.getGameCycle() - lastKeyInputCycle <= 5)
		{
			keyEvent.consume();
			return;
		}

		lastKeyInputCycle = client.getGameCycle();
		clientThread.invoke(() -> bankPlugin.handleBankPinKeyInput(keyEvent.getKeyChar()));
		keyEvent.consume();
	}

	@Override
	public void keyPressed(KeyEvent e)
	{

	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}
}
