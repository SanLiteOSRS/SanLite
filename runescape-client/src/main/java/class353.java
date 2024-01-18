import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class353 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "1180448642"
	)
	static void method6906(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 26
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 27
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 29
					return; // L: 30
				} catch (Exception var5) { // L: 32
				}
			}

			if (class31.field161.startsWith("win") && !var3) { // L: 34 35
				class414.method7910(var0, 0); // L: 36
				return; // L: 37
			}

			if (class31.field161.startsWith("mac")) { // L: 40
				KeyHandler.method428(var0, 1, var2); // L: 41
				return; // L: 42
			}

			class414.method7910(var0, 2); // L: 44
		} else {
			class414.method7910(var0, 3); // L: 47
		}

	} // L: 49

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-201582987"
	)
	static final void method6914(String var0, int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 220
		var2.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 221
		var2.packetBuffer.method9416(var1); // L: 222
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 223
		Client.packetWriter.addNode(var2); // L: 224
	} // L: 225

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;I)V",
		garbageValue = "-1277234617"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field708 = 0; // L: 8654
		Client.field549 = 0; // L: 8655
		PcmPlayer.method846(var1); // L: 8656

		int var3;
		while (true) {
			byte var2 = 16; // L: 8659
			var3 = 1 << var2; // L: 8660
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) { // L: 8661
				break;
			}

			int var4 = var1.readBits(var2); // L: 8662
			if (var4 == var3 - 1) { // L: 8663
				break;
			}

			boolean var5 = false; // L: 8664
			if (Client.npcs[var4] == null) { // L: 8665
				Client.npcs[var4] = new NPC(); // L: 8666
				var5 = true; // L: 8667
			}

			NPC var6 = Client.npcs[var4]; // L: 8669
			Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8670
			var6.npcCycle = Client.cycle; // L: 8671
			int var10 = var1.readBits(1); // L: 8675
			if (var10 == 1) { // L: 8676
				Client.field603[++Client.field549 - 1] = var4;
			}

			boolean var11 = var1.readBits(1) == 1; // L: 8677
			if (var11) { // L: 8678
				var1.readBits(32); // L: 8679
			}

			int var7 = var1.readBits(1); // L: 8681
			int var9;
			if (var0) { // L: 8682
				var9 = var1.readBits(8); // L: 8683
				if (var9 > 127) { // L: 8684
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5); // L: 8687
				if (var9 > 15) { // L: 8688
					var9 -= 32;
				}
			}

			int var8;
			if (var0) { // L: 8690
				var8 = var1.readBits(8); // L: 8691
				if (var8 > 127) { // L: 8692
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5); // L: 8695
				if (var8 > 15) { // L: 8696
					var8 -= 32;
				}
			}

			int var12 = Client.field635[var1.readBits(3)]; // L: 8698
			if (var5) { // L: 8699
				var6.orientation = var6.rotation = var12;
			}

			var6.definition = Script.getNpcDefinition(var1.readBits(14)); // L: 8700
			class142.method3229(var6); // L: 8701
			if (var6.field1240 == 0) { // L: 8702
				var6.rotation = 0;
			}

			var6.method2658(class25.localPlayer.pathX[0] + var8, class25.localPlayer.pathY[0] + var9, var7 == 1); // L: 8703
		}

		var1.exportIndex(); // L: 8705
		UrlRequester.method2903(var1); // L: 8707

		int var13;
		for (var13 = 0; var13 < Client.field708; ++var13) { // L: 8708
			var3 = Client.field625[var13]; // L: 8709
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8710
				Client.npcs[var3].definition = null; // L: 8711
				Client.npcs[var3] = null; // L: 8712
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8715
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8716
		} else {
			for (var13 = 0; var13 < Client.npcCount; ++var13) { // L: 8718
				if (Client.npcs[Client.npcIndices[var13]] == null) { // L: 8719
					throw new RuntimeException(var13 + "," + Client.npcCount); // L: 8720
				}
			}

		}
	} // L: 8723
}
