import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class30 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Ldc;",
		garbageValue = "-1173392084"
	)
	static Script method448(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 61
		if (var2 != null) { // L: 62
			return var2; // L: 63
		} else {
			String var3 = String.valueOf(var0); // L: 65
			int var4 = class126.archive12.getGroupId(var3); // L: 66
			if (var4 == -1) { // L: 67
				return null; // L: 68
			} else {
				byte[] var5 = class126.archive12.takeFileFlat(var4); // L: 70
				if (var5 != null) { // L: 71
					if (var5.length <= 1) { // L: 72
						return null; // L: 73
					}

					var2 = SoundCache.newScript(var5); // L: 75
					if (var2 != null) { // L: 76
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 77
						return var2; // L: 78
					}
				}

				return null; // L: 81
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2078832853"
	)
	static int method447(int var0, Script var1, boolean var2) {
		return 2; // L: 5108
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-74"
	)
	static final void method446(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = NameableContainer.method8016(var5, var6); // L: 5766
		int var7 = 2048 - var3 & 2047; // L: 5767
		int var8 = 2048 - var4 & 2047; // L: 5768
		int var9 = 0; // L: 5769
		int var10 = 0; // L: 5770
		int var11 = var5; // L: 5771
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5772
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5773
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5774
			var14 = var13 * var10 - var12 * var5 >> 16; // L: 5775
			var11 = var12 * var10 + var13 * var5 >> 16; // L: 5776
			var10 = var14; // L: 5777
		}

		if (var8 != 0) { // L: 5779
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5780
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5781
			var14 = var12 * var11 + var13 * var9 >> 16; // L: 5782
			var11 = var11 * var13 - var9 * var12 >> 16; // L: 5783
			var9 = var14; // L: 5784
		}

		if (Client.isCameraLocked) { // L: 5786
			class422.field4606 = var0 - var9; // L: 5787
			class406.field4522 = var1 - var10; // L: 5788
			ModeWhere.field4410 = var2 - var11; // L: 5789
			class165.field1791 = var3; // L: 5790
			class4.field11 = var4; // L: 5791
		} else {
			class157.cameraX = var0 - var9; // L: 5794
			class384.cameraY = var1 - var10; // L: 5795
			SoundSystem.cameraZ = var2 - var11; // L: 5796
			class19.cameraPitch = var3; // L: 5797
			class456.cameraYaw = var4; // L: 5798
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class467.oculusOrbFocalPointX >> 7 != class136.localPlayer.x >> 7 || class36.oculusOrbFocalPointY >> 7 != class136.localPlayer.y >> 7)) { // L: 5800 5801
			var12 = class136.localPlayer.plane; // L: 5802
			var13 = AbstractArchive.baseX * 64 + (class467.oculusOrbFocalPointX >> 7); // L: 5803
			var14 = class148.baseY * 64 + (class36.oculusOrbFocalPointY >> 7); // L: 5804
			PacketBufferNode var15 = class503.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 5807
			var15.packetBuffer.method9138(Client.field624); // L: 5808
			var15.packetBuffer.writeIntME(var13); // L: 5809
			var15.packetBuffer.method9188(var12); // L: 5810
			var15.packetBuffer.method9126(var14); // L: 5811
			Client.packetWriter.addNode(var15); // L: 5812
		}

	} // L: 5816
}
