import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class168 extends class144 {
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		longValue = -5266360311756812969L
	)
	static long field1806;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 708041349
	)
	int field1804;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -6330281372932819365L
	)
	long field1805;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class168(class147 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1804 = var1.readInt(); // L: 310
		this.field1805 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3305(this.field1804, this.field1805); // L: 315
	} // L: 316

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lbg;B)V",
		garbageValue = "-100"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lme;IB)V",
		garbageValue = "-42"
	)
	public static void method3465(Widget var0, int var1) {
		ItemComposition var2 = class141.ItemComposition_get(var1); // L: 1078
		var0.field3685.equipment[var2.maleModel] = var1 + 512; // L: 1079
		if (var2.maleModel1 != -1) { // L: 1080
			var0.field3685.equipment[var2.maleModel1] = 0; // L: 1081
		}

		if (var2.maleModel2 != -1) { // L: 1083
			var0.field3685.equipment[var2.maleModel2] = 0; // L: 1084
		}

		var0.field3685.method6137(); // L: 1086
	} // L: 1087

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "288984874"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field602 = 0L; // L: 4582
		if (var0 >= 2) { // L: 4583
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4584
		}

		if (class179.getWindowedMode() == 1) { // L: 4585
			class415.client.setMaxCanvasSize(765, 503); // L: 4586
		} else {
			class415.client.setMaxCanvasSize(7680, 2160); // L: 4589
		}

		if (Client.gameState >= 25) { // L: 4591
			PacketBufferNode var1 = class217.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 4593
			var1.packetBuffer.writeByte(class179.getWindowedMode()); // L: 4594
			var1.packetBuffer.writeShort(VarbitComposition.canvasWidth); // L: 4595
			var1.packetBuffer.writeShort(class370.canvasHeight); // L: 4596
			Client.packetWriter.addNode(var1); // L: 4597
		}

	} // L: 4599
}
