import java.io.IOException;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mi
@ObfuscatedName("lh")
public final class class299 {
	@ObfuscatedName("ar")
	static final HashMap field3356;

	static {
		field3356 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5753("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "875663250"
	)
	static TimeZone method5753(String var0) {
		synchronized(field3356) { // L: 22
			TimeZone var2 = (TimeZone)field3356.get(var0); // L: 23
			if (var2 == null) { // L: 24
				var2 = TimeZone.getTimeZone(var0); // L: 25
				field3356.put(var0, var2); // L: 26
			}

			return var2; // L: 28
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-63"
	)
	public static void method5759(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 44
			try {
				Buffer var1 = new Buffer(4); // L: 46
				var1.writeByte(var0 ? 2 : 3); // L: 47
				var1.writeMedium(0); // L: 48
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 49
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 53
				} catch (Exception var3) { // L: 55
				}

				++NetCache.NetCache_ioExceptions; // L: 56
				NetCache.NetCache_socket = null; // L: 57
			}

		}
	} // L: 59

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-2003994890"
	)
	public static String method5754(byte[] var0) {
		return World.method1827(var0, 0, var0.length); // L: 58
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-135875924"
	)
	static void method5757() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				ClanChannelMember.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				ClanChannelMember.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("ag")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 88
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "2"
	)
	static final void method5756(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = ItemLayer.method4224(var5, var6); // L: 5710
		int var7 = 2048 - var3 & 2047; // L: 5711
		int var8 = 2048 - var4 & 2047; // L: 5712
		int var9 = 0; // L: 5713
		int var10 = 0; // L: 5714
		int var11 = var5; // L: 5715
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5716
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5717
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5718
			var14 = var13 * var10 - var12 * var5 >> 16; // L: 5719
			var11 = var5 * var13 + var10 * var12 >> 16; // L: 5720
			var10 = var14; // L: 5721
		}

		if (var8 != 0) { // L: 5723
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5724
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5725
			var14 = var12 * var11 + var13 * var9 >> 16; // L: 5726
			var11 = var11 * var13 - var9 * var12 >> 16; // L: 5727
			var9 = var14; // L: 5728
		}

		if (Client.isCameraLocked) { // L: 5730
			class167.field1798 = var0 - var9; // L: 5731
			PacketWriter.field1398 = var1 - var10; // L: 5732
			class27.field119 = var2 - var11; // L: 5733
			class19.field78 = var3; // L: 5734
			HitSplatDefinition.field2128 = var4; // L: 5735
		} else {
			class19.cameraX = var0 - var9; // L: 5738
			DynamicObject.cameraY = var1 - var10; // L: 5739
			BuddyRankComparator.cameraZ = var2 - var11; // L: 5740
			ObjectComposition.cameraPitch = var3; // L: 5741
			Coord.cameraYaw = var4; // L: 5742
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (WorldMapSection0.oculusOrbFocalPointX >> 7 != HitSplatDefinition.localPlayer.x >> 7 || TextureProvider.oculusOrbFocalPointY >> 7 != HitSplatDefinition.localPlayer.y >> 7)) { // L: 5744 5745
			var12 = HitSplatDefinition.localPlayer.plane; // L: 5746
			var13 = class147.baseX * 64 + (WorldMapSection0.oculusOrbFocalPointX >> 7); // L: 5747
			var14 = ModeWhere.baseY * 64 + (TextureProvider.oculusOrbFocalPointY >> 7); // L: 5748
			Decimator.method1104(var13, var14, var12, true); // L: 5749
		}

	} // L: 5752
}
