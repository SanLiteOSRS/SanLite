package net.runelite.client.plugins.bank;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.input.KeyListener;

import java.awt.event.KeyEvent;

@Slf4j
public class BankPinKeyListener implements KeyListener
{
	private BankPlugin bankPlugin;
	private Client client;
	private ClientThread clientThread;

	private int lastKeyCycle;

	public BankPinKeyListener(BankPlugin bankPlugin, Client client, ClientThread clientThread)
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

		log.debug("client: {}", client == null);
		log.debug("gamecycle: {}", client.getGameCycle());
		log.debug("lastKeyCycle: {}", lastKeyCycle);
		if (client.getGameCycle() - lastKeyCycle <= 5)
		{
			keyEvent.consume();
			return;
		}

		lastKeyCycle = client.getGameCycle();

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
