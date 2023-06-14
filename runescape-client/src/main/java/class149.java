import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class149 extends class142 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 773809095
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("aj")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("at")
	boolean field1666;
	@ObfuscatedName("an")
	byte field1668;
	@ObfuscatedName("av")
	byte field1663;
	@ObfuscatedName("as")
	byte field1664;
	@ObfuscatedName("ax")
	byte field1665;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class149(class145 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		this.field1666 = var1.readUnsignedByte() == 1; // L: 251
		this.field1668 = var1.readByte(); // L: 252
		this.field1663 = var1.readByte(); // L: 253
		this.field1664 = var1.readByte(); // L: 254
		this.field1665 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.allowGuests = this.field1666; // L: 259
		var1.field1694 = this.field1668; // L: 260
		var1.field1695 = this.field1663; // L: 261
		var1.field1709 = this.field1664; // L: 262
		var1.field1697 = this.field1665; // L: 263
	} // L: 264

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-75"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5245
			if (Client.loadInterface(var0)) { // L: 5246
				Widget[] var1 = class16.Widget_interfaceComponents[var0]; // L: 5247

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5248
					Widget var3 = var1[var2]; // L: 5249
					if (var3.onLoad != null) { // L: 5250
						ScriptEvent var4 = new ScriptEvent(); // L: 5251
						var4.widget = var3; // L: 5252
						var4.args = var3.onLoad; // L: 5253
						SoundSystem.runScript(var4, 5000000, 0); // L: 5254
					}
				}

			}
		}
	} // L: 5257

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(ZLtl;I)V",
		garbageValue = "1237028886"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field634 = 0; // L: 8635
		Client.field579 = 0; // L: 8636
		class92.method2344(var1); // L: 8637

		int var3;
		while (true) {
			byte var2 = 16; // L: 8640
			var3 = 1 << var2; // L: 8641
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) { // L: 8642
				break;
			}

			int var4 = var1.readBits(var2); // L: 8643
			if (var4 == var3 - 1) { // L: 8644
				break;
			}

			boolean var5 = false; // L: 8645
			if (Client.npcs[var4] == null) { // L: 8646
				Client.npcs[var4] = new NPC(); // L: 8647
				var5 = true; // L: 8648
			}

			NPC var6 = Client.npcs[var4]; // L: 8650
			Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8651
			var6.npcCycle = Client.cycle; // L: 8652
			var6.definition = Bounds.getNpcDefinition(var1.readBits(14)); // L: 8656
			int var7 = var1.readBits(1); // L: 8657
			int var10 = Client.field778[var1.readBits(3)]; // L: 8658
			if (var5) { // L: 8659
				var6.orientation = var6.rotation = var10;
			}

			int var8;
			if (var0) { // L: 8660
				var8 = var1.readBits(8); // L: 8661
				if (var8 > 127) { // L: 8662
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5); // L: 8665
				if (var8 > 15) { // L: 8666
					var8 -= 32;
				}
			}

			boolean var11 = var1.readBits(1) == 1; // L: 8668
			if (var11) { // L: 8669
				var1.readBits(32); // L: 8670
			}

			int var9;
			if (var0) { // L: 8672
				var9 = var1.readBits(8); // L: 8673
				if (var9 > 127) { // L: 8674
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5); // L: 8677
				if (var9 > 15) { // L: 8678
					var9 -= 32;
				}
			}

			int var12 = var1.readBits(1); // L: 8680
			if (var12 == 1) {
				Client.field566[++Client.field579 - 1] = var4; // L: 8681
			}

			class381.method7122(var6); // L: 8682
			if (var6.field1220 == 0) { // L: 8683
				var6.rotation = 0;
			}

			var6.method2557(Projectile.localPlayer.pathX[0] + var8, Projectile.localPlayer.pathY[0] + var9, var7 == 1); // L: 8684
		}

		var1.exportIndex(); // L: 8686
		class166.method3380(var1); // L: 8688

		int var13;
		for (var13 = 0; var13 < Client.field634; ++var13) { // L: 8689
			var3 = Client.field635[var13]; // L: 8690
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8691
				Client.npcs[var3].definition = null; // L: 8692
				Client.npcs[var3] = null; // L: 8693
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8696
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8697
		} else {
			for (var13 = 0; var13 < Client.npcCount; ++var13) { // L: 8699
				if (Client.npcs[Client.npcIndices[var13]] == null) { // L: 8700
					throw new RuntimeException(var13 + "," + Client.npcCount); // L: 8701
				}
			}

		}
	} // L: 8704
}
