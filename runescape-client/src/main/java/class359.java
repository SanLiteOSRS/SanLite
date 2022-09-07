import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class359 {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Lkn;III)V",
		garbageValue = "-748661685"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3659
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3660
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3661
				if (var3 == null) { // L: 3662
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3663
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3664
				if (var3.contains(var4, var5)) { // L: 3665
					var4 -= var3.width / 2; // L: 3666
					var5 -= var3.height / 2; // L: 3667
					int var6 = Client.camAngleY & 2047; // L: 3668
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3669
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3670
					int var9 = var5 * var7 + var8 * var4 >> 11; // L: 3671
					int var10 = var5 * var8 - var4 * var7 >> 11; // L: 3672
					int var11 = var9 + ScriptFrame.localPlayer.x >> 7; // L: 3673
					int var12 = ScriptFrame.localPlayer.y - var10 >> 7; // L: 3674
					PacketBufferNode var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 3676
					var13.packetBuffer.writeByte(18); // L: 3677
					var13.packetBuffer.writeIntME(class7.baseY * 64 + var12); // L: 3678
					var13.packetBuffer.method7667(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3679
					var13.packetBuffer.method7647(Decimator.baseX * 64 + var11); // L: 3680
					var13.packetBuffer.writeByte(var4); // L: 3681
					var13.packetBuffer.writeByte(var5); // L: 3682
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3683
					var13.packetBuffer.writeByte(57); // L: 3684
					var13.packetBuffer.writeByte(0); // L: 3685
					var13.packetBuffer.writeByte(0); // L: 3686
					var13.packetBuffer.writeByte(89); // L: 3687
					var13.packetBuffer.writeShort(ScriptFrame.localPlayer.x); // L: 3688
					var13.packetBuffer.writeShort(ScriptFrame.localPlayer.y); // L: 3689
					var13.packetBuffer.writeByte(63); // L: 3690
					Client.packetWriter.addNode(var13); // L: 3691
					Client.destinationX = var11; // L: 3692
					Client.destinationY = var12; // L: 3693
				}
			}

		}
	} // L: 3696

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "81"
	)
	static final void method6482(Widget var0) {
		int var1 = var0.contentType; // L: 11711
		if (var1 == 324) { // L: 11712
			if (Client.field757 == -1) { // L: 11713
				Client.field757 = var0.spriteId2; // L: 11714
				Client.field715 = var0.spriteId; // L: 11715
			}

			if (Client.playerAppearance.isFemale) { // L: 11717
				var0.spriteId2 = Client.field757;
			} else {
				var0.spriteId2 = Client.field715; // L: 11718
			}

		} else if (var1 == 325) { // L: 11721
			if (Client.field757 == -1) { // L: 11722
				Client.field757 = var0.spriteId2; // L: 11723
				Client.field715 = var0.spriteId; // L: 11724
			}

			if (Client.playerAppearance.isFemale) { // L: 11726
				var0.spriteId2 = Client.field715;
			} else {
				var0.spriteId2 = Client.field757; // L: 11727
			}

		} else if (var1 == 327) { // L: 11730
			var0.modelAngleX = 150; // L: 11731
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11732
			var0.modelType = 5; // L: 11733
			var0.modelId = 0; // L: 11734
		} else if (var1 == 328) { // L: 11737
			var0.modelAngleX = 150; // L: 11738
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11739
			var0.modelType = 5; // L: 11740
			var0.modelId = 1; // L: 11741
		}
	} // L: 11719 11728 11735 11742 11744
}
