package net.runelite.client.ui;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.util.SwingUtil;
import org.pushingpixels.substance.internal.SubstanceSynapse;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Slf4j
public class SanLiteSplashScreen
{
	private final RuneLiteProperties runeLiteProperties = new RuneLiteProperties();

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JLabel messageLabel;
	private JLabel subMessageLabel;
	private final JProgressBar progressBar = new JProgressBar();

	private int currentStep;

	/**
	 * This is not done in the constructor in order to avoid processing in case the user chooses to not load
	 * the splash screen.
	 *
	 * @param estimatedSteps steps until completion, used for the progress bar
	 */
	private void initLayout(final int estimatedSteps)
	{
		SwingUtil.setupRuneLiteLookAndFeel();

		// Init fields with updated swing look and feel
		frame = new JFrame("SanLite");
		messageLabel = new JLabel("Loading client");
		subMessageLabel = new JLabel();
		progressBar.setUI(new BasicProgressBarUI());
		progressBar.setMinimum(0);
		progressBar.setMaximum(estimatedSteps);

		// Frame setup
		frame.setSize(220, 280);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);

		// Main panel setup
		// To reduce substance's colorization (tinting)
		panel.putClientProperty(SubstanceSynapse.COLORIZATION_FACTOR, 1.0);
		panel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		final GridBagLayout layout = new GridBagLayout();
		layout.columnWeights = new double[]{1};
		layout.rowWeights = new double[]{1, 0, 0, 1, 0, 1};
		panel.setLayout(layout);

		// Logo
		synchronized (ImageIO.class)
		{
			try
			{
				final BufferedImage logo = ImageIO.read(SanLiteSplashScreen.class.getResourceAsStream("/sanlite.png"));
				frame.setIconImage(logo);

				final BufferedImage logoTransparent = ImageIO.read(SanLiteSplashScreen.class.getResourceAsStream("/sanlite_transparent.png"));
				final GridBagConstraints logoConstraints = new GridBagConstraints();
				logoConstraints.anchor = GridBagConstraints.SOUTH;
				panel.add(new JLabel(new ImageIcon(logoTransparent.getScaledInstance(96, 96, Image.SCALE_SMOOTH))), logoConstraints);
			}
			catch (IOException e)
			{
				log.warn("Error loading logo", e);
			}
		}

		// Title
		final JLabel title = new JLabel("SanLite");
		final GridBagConstraints titleConstraints = new GridBagConstraints();
		titleConstraints.gridy = 1;
		panel.add(title, titleConstraints);

		// SanLite version
		final JLabel sanliteVersion = new JLabel("Version " + runeLiteProperties.getSanLiteVersion());
		sanliteVersion.setFont(FontManager.getRunescapeSmallFont());
		sanliteVersion.setForeground(sanliteVersion.getForeground().darker());
		final GridBagConstraints sanliteVersionConstraints = new GridBagConstraints();
		sanliteVersionConstraints.gridy = 2;
		panel.add(sanliteVersion, sanliteVersionConstraints);

		// Progress bar
		final GridBagConstraints progressConstraints = new GridBagConstraints();
		progressConstraints.insets = new Insets(0, 25, 0, 25);
		progressConstraints.fill = GridBagConstraints.HORIZONTAL;
		progressConstraints.gridy = 3;
		panel.add(progressBar, progressConstraints);

		// Main message
		messageLabel.setFont(FontManager.getRunescapeSmallFont());
		final GridBagConstraints messageConstraints = new GridBagConstraints();
		messageConstraints.gridy = 4;
		panel.add(messageLabel, messageConstraints);

		// Alternate message
		final GridBagConstraints subMessageConstraints = new GridBagConstraints();
		subMessageLabel.setForeground(subMessageLabel.getForeground().darker());
		subMessageLabel.setFont(FontManager.getRunescapeSmallFont());
		subMessageConstraints.gridy = 5;
		panel.add(subMessageLabel, subMessageConstraints);

		frame.setContentPane(panel);
	}

	private boolean notActive()
	{
		return frame == null || !frame.isDisplayable();
	}

	/**
	 * Close/dispose of the splash screen
	 */
	public void close()
	{
		SwingUtilities.invokeLater(() ->
		{
			if (notActive())
			{
				return;
			}

			frame.dispose();
		});
	}

	/**
	 * Set the splash screen to be visible.
	 *
	 * @param estimatedSteps steps until completion, used for the progress bar
	 */
	public void open(final int estimatedSteps)
	{
		SwingUtilities.invokeLater(() ->
		{
			initLayout(estimatedSteps);
			frame.setVisible(true);
		});
	}

	public void setMessage(final String message)
	{
		SwingUtilities.invokeLater(() ->
		{
			if (notActive())
			{
				return;
			}
			messageLabel.setText(message);
			progressBar.setValue(++currentStep);
		});
	}

	public void setSubMessage(final String subMessage)
	{
		SwingUtilities.invokeLater(() ->
		{
			if (notActive())
			{
				return;
			}
			subMessageLabel.setText(subMessage);
		});
	}
}
