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
package net.sanlite.client.util;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;

/**
 * Utility class used for file browser navigation
 */
@Singleton
@Slf4j
public class FileBrowser
{
	private static boolean attemptDesktopOpen(String directory)
	{
		if (!Desktop.isDesktopSupported())
		{
			return false;
		}

		final Desktop desktop = Desktop.getDesktop();

		if (!desktop.isSupported(Desktop.Action.OPEN))
		{
			return false;
		}

		try
		{
			desktop.open(new File(directory));
			return true;
		}
		catch (IOException ex)
		{
			log.warn("Failed to open Desktop#open {}", directory, ex);
			return false;
		}
	}

	/**
	 * Tries to open the specified {@code File} with the systems default text editor. If operation fails
	 * an error message is displayed with the option to copy the absolute file path to clipboard.
	 *
	 * @param file the File instance of the log file
	 * @return did the file open successfully?
	 */
	public static boolean openLocalFile(final File file)
	{
		if (file == null || !file.exists())
		{
			return false;
		}

		if (attemptDesktopOpen(file.getAbsolutePath()))
		{
			log.debug("Opened file through Desktop#edit to {}", file);
			return true;
		}

		showMessageBox("Unable to open file. Press 'OK' and the file path will be copied to your clipboard", file.getAbsolutePath());
		return false;
	}

	/**
	 * Open swing message box with specified message and copy data to clipboard
	 * @param message message to show
	 */
	private static void showMessageBox(final String message, final String data)
	{
		SwingUtilities.invokeLater(() ->
		{
			final int result = JOptionPane.showConfirmDialog(null, message, "Message",
				JOptionPane.OK_CANCEL_OPTION);

			if (result == JOptionPane.OK_OPTION)
			{
				final StringSelection stringSelection = new StringSelection(data);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			}
		});
	}
}
