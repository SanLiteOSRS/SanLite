import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class167 extends class160 {
	@ObfuscatedName("ai")
	String field1801;
	@ObfuscatedName("aj")
	byte field1802;
	@ObfuscatedName("ac")
	byte field1803;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class167(class161 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1847441946"
	)
	void vmethod3451(Buffer var1) {
		this.field1801 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1801 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1802 = var1.readByte(); // L: 161
			this.field1803 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "-1976910783"
	)
	void vmethod3453(ClanChannel var1) {
		var1.name = this.field1801; // L: 167
		if (this.field1801 != null) { // L: 168
			var1.field1787 = this.field1802; // L: 169
			var1.field1780 = this.field1803; // L: 170
		}

	} // L: 172

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	static void method3457(int var0) {
		class449.field4723 = var0; // L: 22
		class449.field4724 = new class449[var0]; // L: 23
		class449.field4725 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1012217685"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 10016
			Widget var0 = ServerPacket.getWidgetChild(Canvas.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 10017
			if (var0 != null && var0.onTargetLeave != null) { // L: 10018
				ScriptEvent var1 = new ScriptEvent(); // L: 10019
				var1.widget = var0; // L: 10020
				var1.args = var0.onTargetLeave; // L: 10021
				class170.runScriptEvent(var1); // L: 10022
			}

			Client.selectedSpellItemId = -1; // L: 10024
			Client.isSpellSelected = false; // L: 10025
			class303.invalidateWidget(var0); // L: 10026
		}
	} // L: 10027
}
