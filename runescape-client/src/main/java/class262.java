import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public abstract class class262 implements class264 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("ItemComposition_fontPlain11")
	static Font ItemComposition_fontPlain11;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 390677413
	)
	protected int field3022;

	@ObfuscatedSignature(
		descriptor = "(Llw;Lmb;I)V"
	)
	protected class262(StudioGame var1, Language var2, int var3) {
		this.field3022 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "67"
	)
	static int method5406(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 977
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 978
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIB)V",
		garbageValue = "64"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4238
			int var3 = class216.SequenceDefinition_get(var1).field2276; // L: 4239
			if (var3 == 1) { // L: 4240
				var0.sequenceFrame = 0; // L: 4241
				var0.sequenceFrameCycle = 0; // L: 4242
				var0.sequenceDelay = var2; // L: 4243
				var0.field1223 = 0; // L: 4244
			}

			if (var3 == 2) { // L: 4246
				var0.field1223 = 0; // L: 4247
			}
		} else if (var1 == -1 || var0.sequence == -1 || class216.SequenceDefinition_get(var1).field2300 >= class216.SequenceDefinition_get(var0.sequence).field2300) { // L: 4250
			var0.sequence = var1; // L: 4251
			var0.sequenceFrame = 0; // L: 4252
			var0.sequenceFrameCycle = 0; // L: 4253
			var0.sequenceDelay = var2; // L: 4254
			var0.field1223 = 0; // L: 4255
			var0.field1252 = var0.pathLength; // L: 4256
		}

	} // L: 4258

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1733231225"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class136.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 9866
		var2.packetBuffer.writeIntME(var1); // L: 9867
		var2.packetBuffer.method8536(var0); // L: 9868
		Client.packetWriter.addNode(var2); // L: 9869
	} // L: 9870
}
