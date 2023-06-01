import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ay")
	@Export("args")
	Object[] args;
	@ObfuscatedName("an")
	boolean field1055;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1050512919
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 17016815
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1216366575
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1651571223
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1196212417
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ag")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1027852435
	)
	int field1052;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1834276031
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "0"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "81820084"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "803881076"
	)
	public void method2243(Widget var1) {
		this.widget = var1; // L: 30
	} // L: 31

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1139906449"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9780
			Widget var0 = ModelData0.getWidgetChild(class60.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9781
			if (var0 != null && var0.onTargetLeave != null) { // L: 9782
				ScriptEvent var1 = new ScriptEvent(); // L: 9783
				var1.widget = var0; // L: 9784
				var1.args = var0.onTargetLeave; // L: 9785
				class260.runScriptEvent(var1); // L: 9786
			}

			Client.selectedSpellItemId = -1; // L: 9788
			Client.isSpellSelected = false; // L: 9789
			HorizontalAlignment.invalidateWidget(var0); // L: 9790
		}
	} // L: 9791
}
