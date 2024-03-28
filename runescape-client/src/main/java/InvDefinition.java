import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1271664897
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1210197869"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "70"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-490434356"
	)
	static final int method3695(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 981
		int var4 = var0 & var2 - 1; // L: 982
		int var5 = var1 / var2; // L: 983
		int var6 = var1 & var2 - 1; // L: 984
		int var7 = MilliClock.method3544(var3, var5); // L: 985
		int var8 = MilliClock.method3544(var3 + 1, var5); // L: 986
		int var9 = MilliClock.method3544(var3, var5 + 1); // L: 987
		int var10 = MilliClock.method3544(var3 + 1, var5 + 1); // L: 988
		int var11 = class165.method3401(var7, var8, var4, var2); // L: 989
		int var12 = class165.method3401(var9, var10, var4, var2); // L: 990
		return class165.method3401(var11, var12, var6, var2); // L: 991
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1849013746"
	)
	static final void method3708(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class19.field85 || class9.field36 != var1) { // L: 5994
			class19.field85 = var0; // L: 5997
			class9.field36 = var1; // L: 5998
			FaceNormal.method4886(25); // L: 5999
			WorldMapSectionType.drawLoadingMessage("Loading - please wait.", true); // L: 6000
			int var3 = GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 6001
			int var4 = DevicePcmPlayerProvider.baseY * 64; // L: 6002
			GrandExchangeOfferOwnWorldComparator.baseX = (var0 - 6) * 8; // L: 6003
			DevicePcmPlayerProvider.baseY = (var1 - 6) * 8; // L: 6004
			int var5 = GrandExchangeOfferOwnWorldComparator.baseX * 64 - var3; // L: 6005
			int var6 = DevicePcmPlayerProvider.baseY * 64 - var4; // L: 6006
			var3 = GrandExchangeOfferOwnWorldComparator.baseX * 64; // L: 6007
			var4 = DevicePcmPlayerProvider.baseY * 64; // L: 6008

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 6009
				NPC var19 = Client.npcs[var7]; // L: 6010
				if (var19 != null) { // L: 6011
					for (var9 = 0; var9 < 10; ++var9) { // L: 6012
						var10000 = var19.pathX; // L: 6013
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 6014
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 6016
					var19.y -= var6 * 128; // L: 6017
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 6020
				Player var22 = Client.players[var7]; // L: 6021
				if (var22 != null) { // L: 6022
					for (var9 = 0; var9 < 10; ++var9) { // L: 6023
						var10000 = var22.pathX; // L: 6024
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 6025
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 6027
					var22.y -= var6 * 128; // L: 6028
				}
			}

			byte var20 = 0; // L: 6031
			byte var8 = 104; // L: 6032
			byte var21 = 1; // L: 6033
			if (var5 < 0) { // L: 6034
				var20 = 103; // L: 6035
				var8 = -1; // L: 6036
				var21 = -1; // L: 6037
			}

			byte var10 = 0; // L: 6039
			byte var11 = 104; // L: 6040
			byte var12 = 1; // L: 6041
			if (var6 < 0) { // L: 6042
				var10 = 103; // L: 6043
				var11 = -1; // L: 6044
				var12 = -1; // L: 6045
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 6047
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 6048
					int var15 = var13 + var5; // L: 6049
					int var16 = var6 + var14; // L: 6050

					for (int var17 = 0; var17 < 4; ++var17) { // L: 6051
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 6052
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 6053
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6057 6058 6062
				var18.x -= var5; // L: 6059
				var18.y -= var6; // L: 6060
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 6061
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 6064
				Client.destinationX -= var5; // L: 6065
				Client.destinationY -= var6; // L: 6066
			}

			Client.soundEffectCount = 0; // L: 6068
			Client.isCameraLocked = false; // L: 6069
			WorldMapLabelSize.cameraX -= var5 << 7; // L: 6070
			class193.cameraZ -= var6 << 7; // L: 6071
			class185.oculusOrbFocalPointX -= var5 << 7; // L: 6072
			Skeleton.oculusOrbFocalPointY -= var6 << 7; // L: 6073
			Client.field756 = -1; // L: 6074
			Client.graphicsObjects.clear(); // L: 6075
			Client.projectiles.clear(); // L: 6076

			for (var14 = 0; var14 < 4; ++var14) { // L: 6077
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5995 6078

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2083220223"
	)
	static final void method3706(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12373
		if (var0 != NPC.clientPreferences.method2503()) { // L: 12374
			label60: {
				if (NPC.clientPreferences.method2503() == 0) { // L: 12376
					boolean var1 = !class321.field3496.isEmpty(); // L: 12379
					if (var1) { // L: 12381
						class190.method3711(UserComparator6.field1508, var0); // L: 12382
						Client.playingJingle = false; // L: 12383
						break label60;
					}
				}

				if (var0 == 0) { // L: 12387
					class11.method108(0, 0); // L: 12388
					Client.playingJingle = false; // L: 12389
				} else if (!class321.field3495.isEmpty()) { // L: 12392
					Iterator var3 = class321.field3495.iterator(); // L: 12393

					while (var3.hasNext()) {
						class333 var2 = (class333)var3.next(); // L: 12394
						if (var2 != null) { // L: 12396
							var2.field3607 = var0; // L: 12399
						}
					}

					class333 var4 = (class333)class321.field3495.get(0); // L: 12402
					if (var4 != null && var4.field3613 != null && var4.field3613.isReady() && !var4.field3604) { // L: 12403
						var4.field3613.setPcmStreamVolume(var0); // L: 12404
						var4.field3608 = (float)var0; // L: 12405
					}
				}
			}

			NPC.clientPreferences.method2471(var0); // L: 12410
		}

	} // L: 12412
}
