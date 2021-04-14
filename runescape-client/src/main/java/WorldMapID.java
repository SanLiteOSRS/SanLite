import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lfo;"
	)
	static final WorldMapID field1741;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lfo;"
	)
	static final WorldMapID field1744;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1654868251
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1211698009
	)
	@Export("value")
	final int value;

	static {
		field1741 = new WorldMapID(0);
		field1744 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1238552841"
	)
	static int method3116(int var0) {
		return var0 * 3 + 600;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "397252901"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = class231.getWidgetChild(class148.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class19.runScriptEvent(var1);
			}

			Client.field874 = -1;
			Client.isSpellSelected = false;
			class29.invalidateWidget(var0);
		}
	}
}
