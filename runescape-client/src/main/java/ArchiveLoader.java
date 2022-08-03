import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		longValue = -1051997318633043321L
	)
	static long field1020;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -902001095
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 31215071
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Llu;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1616560321"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5813(var1) || this.archive.method5812(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IZIZS)V",
		garbageValue = "8977"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class93.World_worlds != null) { // L: 171
			Language.doWorldSorting(0, class93.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1129495977"
	)
	static long method2130() {
		return Client.field614; // L: 2974
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "3347924"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class293.getWidgetChild(var1, var2); // L: 9464
		if (var5 != null) { // L: 9465
			if (var5.onOp != null) { // L: 9466
				ScriptEvent var6 = new ScriptEvent(); // L: 9467
				var6.widget = var5; // L: 9468
				var6.opIndex = var0; // L: 9469
				var6.targetName = var4; // L: 9470
				var6.args = var5.onOp; // L: 9471
				class17.runScriptEvent(var6); // L: 9472
			}

			boolean var8 = true; // L: 9474
			if (var5.contentType > 0) { // L: 9475
				var8 = method2131(var5);
			}

			if (var8) { // L: 9476
				if (class201.method4100(class67.getWidgetFlags(var5), var0 - 1)) { // L: 9477
					PacketBufferNode var7;
					if (var0 == 1) { // L: 9480
						var7 = class433.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 9482
						var7.packetBuffer.writeInt(var1); // L: 9483
						var7.packetBuffer.writeShort(var2); // L: 9484
						var7.packetBuffer.writeShort(var3); // L: 9485
						Client.packetWriter.addNode(var7); // L: 9486
					}

					if (var0 == 2) { // L: 9488
						var7 = class433.getPacketBufferNode(ClientPacket.field2927, Client.packetWriter.isaacCipher); // L: 9490
						var7.packetBuffer.writeInt(var1); // L: 9491
						var7.packetBuffer.writeShort(var2); // L: 9492
						var7.packetBuffer.writeShort(var3); // L: 9493
						Client.packetWriter.addNode(var7); // L: 9494
					}

					if (var0 == 3) { // L: 9496
						var7 = class433.getPacketBufferNode(ClientPacket.field2920, Client.packetWriter.isaacCipher); // L: 9498
						var7.packetBuffer.writeInt(var1); // L: 9499
						var7.packetBuffer.writeShort(var2); // L: 9500
						var7.packetBuffer.writeShort(var3); // L: 9501
						Client.packetWriter.addNode(var7); // L: 9502
					}

					if (var0 == 4) { // L: 9504
						var7 = class433.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher); // L: 9506
						var7.packetBuffer.writeInt(var1); // L: 9507
						var7.packetBuffer.writeShort(var2); // L: 9508
						var7.packetBuffer.writeShort(var3); // L: 9509
						Client.packetWriter.addNode(var7); // L: 9510
					}

					if (var0 == 5) { // L: 9512
						var7 = class433.getPacketBufferNode(ClientPacket.field2929, Client.packetWriter.isaacCipher); // L: 9514
						var7.packetBuffer.writeInt(var1); // L: 9515
						var7.packetBuffer.writeShort(var2); // L: 9516
						var7.packetBuffer.writeShort(var3); // L: 9517
						Client.packetWriter.addNode(var7); // L: 9518
					}

					if (var0 == 6) { // L: 9520
						var7 = class433.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher); // L: 9522
						var7.packetBuffer.writeInt(var1); // L: 9523
						var7.packetBuffer.writeShort(var2); // L: 9524
						var7.packetBuffer.writeShort(var3); // L: 9525
						Client.packetWriter.addNode(var7); // L: 9526
					}

					if (var0 == 7) { // L: 9528
						var7 = class433.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher); // L: 9530
						var7.packetBuffer.writeInt(var1); // L: 9531
						var7.packetBuffer.writeShort(var2); // L: 9532
						var7.packetBuffer.writeShort(var3); // L: 9533
						Client.packetWriter.addNode(var7); // L: 9534
					}

					if (var0 == 8) { // L: 9536
						var7 = class433.getPacketBufferNode(ClientPacket.field2998, Client.packetWriter.isaacCipher); // L: 9538
						var7.packetBuffer.writeInt(var1); // L: 9539
						var7.packetBuffer.writeShort(var2); // L: 9540
						var7.packetBuffer.writeShort(var3); // L: 9541
						Client.packetWriter.addNode(var7); // L: 9542
					}

					if (var0 == 9) { // L: 9544
						var7 = class433.getPacketBufferNode(ClientPacket.field2939, Client.packetWriter.isaacCipher); // L: 9546
						var7.packetBuffer.writeInt(var1); // L: 9547
						var7.packetBuffer.writeShort(var2); // L: 9548
						var7.packetBuffer.writeShort(var3); // L: 9549
						Client.packetWriter.addNode(var7); // L: 9550
					}

					if (var0 == 10) { // L: 9552
						var7 = class433.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher); // L: 9554
						var7.packetBuffer.writeInt(var1); // L: 9555
						var7.packetBuffer.writeShort(var2); // L: 9556
						var7.packetBuffer.writeShort(var3); // L: 9557
						Client.packetWriter.addNode(var7); // L: 9558
					}

				}
			}
		}
	} // L: 9478 9560

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)Z",
		garbageValue = "885899604"
	)
	static final boolean method2131(Widget var0) {
		int var1 = var0.contentType; // L: 12010
		if (var1 == 205) { // L: 12011
			Client.logoutTimer = 250; // L: 12012
			return true; // L: 12013
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12015
				var2 = (var1 - 300) / 2; // L: 12016
				var3 = var1 & 1; // L: 12017
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12018
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12020
				var2 = (var1 - 314) / 2; // L: 12021
				var3 = var1 & 1; // L: 12022
				Client.playerAppearance.method5584(var2, var3 == 1); // L: 12023
			}

			if (var1 == 324) { // L: 12025
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 12026
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 12027
				PacketBufferNode var4 = class433.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher); // L: 12029
				Client.playerAppearance.write(var4.packetBuffer); // L: 12030
				Client.packetWriter.addNode(var4); // L: 12031
				return true; // L: 12032
			} else {
				return false; // L: 12034
			}
		}
	}
}
