import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class348 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CB)B",
		garbageValue = "73"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 12
			if (var0 == 8364) { // L: 13
				var1 = -128;
			} else if (var0 == 8218) { // L: 14
				var1 = -126;
			} else if (var0 == 402) { // L: 15
				var1 = -125;
			} else if (var0 == 8222) { // L: 16
				var1 = -124;
			} else if (var0 == 8230) { // L: 17
				var1 = -123;
			} else if (var0 == 8224) { // L: 18
				var1 = -122;
			} else if (var0 == 8225) { // L: 19
				var1 = -121;
			} else if (var0 == 710) { // L: 20
				var1 = -120;
			} else if (var0 == 8240) { // L: 21
				var1 = -119;
			} else if (var0 == 352) { // L: 22
				var1 = -118;
			} else if (var0 == 8249) { // L: 23
				var1 = -117;
			} else if (var0 == 338) { // L: 24
				var1 = -116;
			} else if (var0 == 381) { // L: 25
				var1 = -114;
			} else if (var0 == 8216) {
				var1 = -111; // L: 26
			} else if (var0 == 8217) { // L: 27
				var1 = -110;
			} else if (var0 == 8220) { // L: 28
				var1 = -109;
			} else if (var0 == 8221) { // L: 29
				var1 = -108;
			} else if (var0 == 8226) { // L: 30
				var1 = -107;
			} else if (var0 == 8211) { // L: 31
				var1 = -106;
			} else if (var0 == 8212) { // L: 32
				var1 = -105;
			} else if (var0 == 732) { // L: 33
				var1 = -104;
			} else if (var0 == 8482) { // L: 34
				var1 = -103;
			} else if (var0 == 353) { // L: 35
				var1 = -102;
			} else if (var0 == 8250) { // L: 36
				var1 = -101;
			} else if (var0 == 339) { // L: 37
				var1 = -100;
			} else if (var0 == 382) { // L: 38
				var1 = -98;
			} else if (var0 == 376) { // L: 39
				var1 = -97;
			} else {
				var1 = 63; // L: 40
			}
		} else {
			var1 = (byte)var0;
		}

		return var1; // L: 41
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lmi;III)V",
		garbageValue = "1790851766"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3676
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3677
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3678
				if (var3 == null) { // L: 3679
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3680
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3681
				if (var3.contains(var4, var5)) { // L: 3682
					var4 -= var3.width / 2; // L: 3683
					var5 -= var3.height / 2; // L: 3684
					int var6 = Client.camAngleY & 2047; // L: 3685
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3686
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3687
					int var9 = var8 * var4 + var7 * var5 >> 11; // L: 3688
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 3689
					int var11 = var9 + VarbitComposition.localPlayer.x >> 7; // L: 3690
					int var12 = VarbitComposition.localPlayer.y - var10 >> 7; // L: 3691
					PacketBufferNode var13 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 3693
					var13.packetBuffer.writeByte(18); // L: 3694
					var13.packetBuffer.method9098(UrlRequester.baseX * 64 + var11); // L: 3695
					var13.packetBuffer.method9213(class47.baseY * 64 + var12); // L: 3696
					var13.packetBuffer.method9110(Client.field674.method4120(82) ? (Client.field674.method4120(81) ? 2 : 1) : 0); // L: 3697
					var13.packetBuffer.writeByte(var4); // L: 3698
					var13.packetBuffer.writeByte(var5); // L: 3699
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3700
					var13.packetBuffer.writeByte(57); // L: 3701
					var13.packetBuffer.writeByte(0); // L: 3702
					var13.packetBuffer.writeByte(0); // L: 3703
					var13.packetBuffer.writeByte(89); // L: 3704
					var13.packetBuffer.writeShort(VarbitComposition.localPlayer.x); // L: 3705
					var13.packetBuffer.writeShort(VarbitComposition.localPlayer.y); // L: 3706
					var13.packetBuffer.writeByte(63); // L: 3707
					Client.packetWriter.addNode(var13); // L: 3708
					Client.destinationX = var11; // L: 3709
					Client.destinationY = var12; // L: 3710
				}
			}

		}
	} // L: 3713
}
