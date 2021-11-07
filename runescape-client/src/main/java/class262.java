import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class262 {
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1378458919"
	)
	static void method5136() {
		class392.method6871(ObjectComposition.menuWidth / 2 + SecureRandomCallable.menuX, Frames.menuY);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "292857439"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = ItemContainer.getWidgetChild(FontName.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Tile.runScriptEvent(var1);
			}

			Client.field627 = -1;
			Client.isSpellSelected = false;
			class184.invalidateWidget(var0);
		}
	}
}
