package net.runelite.client.config;

import com.google.common.base.Strings;
import com.google.common.primitives.Ints;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.config.ConfigPanel;
import net.runelite.client.plugins.config.HotkeyButton;
import net.runelite.client.plugins.config.PluginListItem;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.ui.components.colorpicker.RuneliteColorPicker;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;

@Slf4j
public class ConfigItemUI
{
	private static final int SPINNER_FIELD_WIDTH = 6;

	private final ConfigManager configManager;
	private final ConfigPanel configPanel;

	public ConfigItemUI(ConfigManager configManager, ConfigPanel configPanel)
	{
		this.configManager = configManager;
		this.configPanel = configPanel;
	}

	/**
	 * Creates UI components for a checkbox config item
	 *
	 * @param listItem plugin list item
	 * @param config   plugin config
	 * @param cd       plugin config descriptor
	 * @param cid      config item descriptor
	 * @return JCheckBox
	 */
	public JCheckBox createCheckboxConfigItem(PluginListItem listItem, Config config, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JCheckBox checkbox = new JCheckBox();
		checkbox.setBackground(ColorScheme.LIGHT_GRAY_COLOR);
		checkbox.setSelected(Boolean.parseBoolean(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName())));
		checkbox.addActionListener(ae -> changeConfiguration(listItem, config, checkbox, cd, cid));
		return checkbox;
	}

	/**
	 * Creates UI components for a spinner config item
	 *
	 * @param listItem plugin list item
	 * @param config   plugin config
	 * @param cd       plugin config descriptor
	 * @param cid      config item descriptor
	 * @return JSpinner
	 */
	public JSpinner createSpinnerConfigItem(PluginListItem listItem, Config config, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		int value = Integer.parseInt(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));

		Range range = cid.getRange();
		int min = 0, max = Integer.MAX_VALUE;
		if (range != null)
		{
			min = range.min();
			max = range.max();
		}

		// Config may previously have been out of range
		value = Ints.constrainToRange(value, min, max);

		SpinnerModel model = new SpinnerNumberModel(value, min, max, 1);
		JSpinner spinner = new JSpinner(model);
		Component editor = spinner.getEditor();
		JFormattedTextField spinnerTextField = ((JSpinner.DefaultEditor) editor).getTextField();
		spinnerTextField.setColumns(SPINNER_FIELD_WIDTH);
		spinner.addChangeListener(ce -> changeConfiguration(listItem, config, spinner, cd, cid));
		return spinner;
	}

	/**
	 * Creates UI components for a text config item
	 *
	 * @param listItem plugin list item
	 * @param config   plugin config
	 * @param cd       plugin config descriptor
	 * @param cid      config item descriptor
	 * @return JTextComponent
	 */
	public JTextComponent createTextConfigItem(PluginListItem listItem, Config config, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JTextComponent textField;
		if (cid.getItem().secret())
		{
			textField = new JPasswordField();
		}
		else
		{
			final JTextArea textArea = new JTextArea();
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textField = textArea;
		}

		textField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		textField.setText(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));
		textField.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusLost(FocusEvent e)
			{
				changeConfiguration(listItem, config, textField, cd, cid);
			}
		});
		return textField;
	}

	/**
	 * Creates UI components for a color picker config item
	 *
	 * @param listItem plugin list item
	 * @param config   plugin config
	 * @param cd       plugin config descriptor
	 * @param cid      config item descriptor
	 * @return JButton
	 */
	public JButton createColorPickerButtonConfigItem(PluginListItem listItem, Config config, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		String existing = configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName());
		Color existingColor;
		JButton colorPickerBtn;

		if (existing == null)
		{
			existingColor = Color.BLACK;
			colorPickerBtn = new JButton("Pick a color");
		}
		else
		{
			existingColor = ColorUtil.fromString(existing);
			colorPickerBtn = new JButton(ColorUtil.toHexColor(existingColor).toUpperCase());
		}

		colorPickerBtn.setFocusable(false);
		colorPickerBtn.setBackground(existingColor);
		colorPickerBtn.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				RuneliteColorPicker colorPicker = new RuneliteColorPicker(SwingUtilities.windowForComponent(configPanel),
						colorPickerBtn.getBackground(), cid.getItem().name(), cid.getAlpha() == null);
				colorPicker.setLocation(configPanel.getLocationOnScreen());
				colorPicker.setOnColorChange(c ->
				{
					colorPickerBtn.setBackground(c);
					colorPickerBtn.setText(ColorUtil.toHexColor(c).toUpperCase());
				});

				colorPicker.addWindowListener(new WindowAdapter()
				{
					@Override
					public void windowClosing(WindowEvent e)
					{
						changeConfiguration(listItem, config, colorPicker, cd, cid);
					}
				});
				colorPicker.setVisible(true);
			}
		});
		return colorPickerBtn;
	}

	/**
	 * Creates UI components for a dimension config item
	 *
	 * @param cd  plugin config descriptor
	 * @param cid config item descriptor
	 * @return JPanel dimension item
	 */
	public JPanel createDimensionConfigItem(ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		JPanel dimensionPanel = new JPanel();
		dimensionPanel.setLayout(new BorderLayout());

		String str = configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName());
		String[] splitStr = str.split("x");
		int width = Integer.parseInt(splitStr[0]);
		int height = Integer.parseInt(splitStr[1]);

		SpinnerModel widthModel = new SpinnerNumberModel(width, 0, Integer.MAX_VALUE, 1);
		JSpinner widthSpinner = new JSpinner(widthModel);
		Component widthEditor = widthSpinner.getEditor();
		JFormattedTextField widthSpinnerTextField = ((JSpinner.DefaultEditor) widthEditor).getTextField();
		widthSpinnerTextField.setColumns(4);

		SpinnerModel heightModel = new SpinnerNumberModel(height, 0, Integer.MAX_VALUE, 1);
		JSpinner heightSpinner = new JSpinner(heightModel);
		Component heightEditor = heightSpinner.getEditor();
		JFormattedTextField heightSpinnerTextField = ((JSpinner.DefaultEditor) heightEditor).getTextField();
		heightSpinnerTextField.setColumns(4);

		ChangeListener listener = e ->
				configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), widthSpinner.getValue() + "x" + heightSpinner.getValue());

		widthSpinner.addChangeListener(listener);
		heightSpinner.addChangeListener(listener);

		dimensionPanel.add(widthSpinner, BorderLayout.WEST);
		dimensionPanel.add(new JLabel(" x "), BorderLayout.CENTER);
		dimensionPanel.add(heightSpinner, BorderLayout.EAST);
		return dimensionPanel;
	}

	/**
	 * Creates UI components for a combobox config item
	 *
	 * @param listItem plugin list item
	 * @param config   plugin config
	 * @param cd       plugin config descriptor
	 * @param cid      config item descriptor
	 * @return JComboBox
	 */
	public JComboBox createComboBoxConfigItem(PluginListItem listItem, Config config, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		Class<? extends Enum> type = (Class<? extends Enum>) cid.getType();
		JComboBox comboBox = new JComboBox(type.getEnumConstants());
		comboBox.setPreferredSize(new Dimension(comboBox.getPreferredSize().width, 25));
		comboBox.setRenderer(new ComboBoxListRenderer());
		comboBox.setForeground(Color.WHITE);
		comboBox.setFocusable(false);
		comboBox.setPrototypeDisplayValue("XXXXXXXX"); // Sorry but this is the way to keep the size of the combobox in check.
		try
		{
			Enum selectedItem = Enum.valueOf(type, configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));
			comboBox.setSelectedItem(selectedItem);
			comboBox.setToolTipText(Text.titleCase(selectedItem));
		}
		catch (IllegalArgumentException ex)
		{
			log.debug("Invalid selected item", ex);
		}
		comboBox.addItemListener(e ->
		{
			if (e.getStateChange() == ItemEvent.SELECTED)
			{
				changeConfiguration(listItem, config, comboBox, cd, cid);
				comboBox.setToolTipText(Text.titleCase((Enum) comboBox.getSelectedItem()));
			}
		});
		return comboBox;
	}

	/**
	 * Creates UI components for a keybind config item
	 *
	 * @param listItem plugin list item
	 * @param config   plugin config
	 * @param cd       plugin config descriptor
	 * @param cid      config item descriptor
	 * @return HotKeyButton
	 */
	public HotkeyButton createKeybindConfigItem(PluginListItem listItem, Config config, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		Keybind startingValue = configManager.getConfiguration(cd.getGroup().value(),
				cid.getItem().keyName(),
				(Class<? extends Keybind>) cid.getType());

		HotkeyButton button = new HotkeyButton(startingValue, cid.getType() == ModifierlessKeybind.class);

		button.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusLost(FocusEvent e)
			{
				changeConfiguration(listItem, config, button, cd, cid);
			}
		});
		return button;
	}

	/**
	 * Save configuration change for config descriptor item
	 *
	 * @param listItem  plugin list item
	 * @param config    plugin config
	 * @param component config descriptor item UI component
	 * @param cd        config descriptor
	 * @param cid       config item descriptor
	 */
	private void changeConfiguration(PluginListItem listItem, Config config, Component component, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		final ConfigItem configItem = cid.getItem();

		if (!Strings.isNullOrEmpty(configItem.warning()))
		{
			final int result = JOptionPane.showOptionDialog(component, configItem.warning(),
					"Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
					null, new String[] {"Yes", "No"}, "No");

			if (result != JOptionPane.YES_OPTION)
			{
				configPanel.openGroupConfigPanel(listItem, config, cd);
				return;
			}
		}

		if (component instanceof JCheckBox)
		{
			JCheckBox checkbox = (JCheckBox) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), "" + checkbox.isSelected());
		}
		else if (component instanceof JSpinner)
		{
			JSpinner spinner = (JSpinner) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), "" + spinner.getValue());
		}
		else if (component instanceof JTextComponent)
		{
			JTextComponent textField = (JTextComponent) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), textField.getText());
		}
		else if (component instanceof RuneliteColorPicker)
		{
			RuneliteColorPicker colorPicker = (RuneliteColorPicker) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), colorPicker.getSelectedColor().getRGB() + "");
		}
		else if (component instanceof JComboBox)
		{
			JComboBox jComboBox = (JComboBox) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), ((Enum) jComboBox.getSelectedItem()).name());
		}
		else if (component instanceof HotkeyButton)
		{
			HotkeyButton hotkeyButton = (HotkeyButton) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), hotkeyButton.getValue());
		}
	}
}
