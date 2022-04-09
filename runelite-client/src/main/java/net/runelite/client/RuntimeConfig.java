/*
 * Copyright (c) 2022, Adam <Adam@sigterm.info>
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
package net.runelite.client;

import com.google.common.base.Strings;
import java.util.Collections;
import java.util.Map;
import javax.swing.SwingUtilities;
import lombok.Data;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.util.LinkBrowser;

@Data
public class RuntimeConfig
{
	private Map<String, ?> props = Collections.emptyMap();
	private Map<String, String> sysProps = Collections.emptyMap();

	private String outageMessage;
	private Map<String, String> outageLinks;

	public boolean showOutageMessage()
	{
		if (Strings.isNullOrEmpty(getOutageMessage()))
		{
			return false;
		}

		SwingUtilities.invokeLater(() ->
		{
			FatalErrorDialog fed = new FatalErrorDialog(getOutageMessage());
			if (getOutageLinks() != null)
			{
				for (Map.Entry<String, String> e : getOutageLinks().entrySet())
				{
					fed.addButton(e.getKey(), () -> LinkBrowser.browse(e.getValue()));
				}
			}
			else
			{
				fed.addButton("OSRS Twitter", () -> LinkBrowser.browse(RuneLiteProperties.getOSRSTwitterLink()));
			}
			fed.open();
		});
		return true;
	}
}