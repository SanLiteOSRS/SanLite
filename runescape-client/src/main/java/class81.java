import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class81 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "1164059747"
	)
	static boolean method2247(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance(); // L: 1367
		var1.set(1, var1.get(1) - 13); // L: 1368
		var1.set(5, var1.get(5) + 1); // L: 1369
		var1.set(11, 0); // L: 1370
		var1.set(12, 0); // L: 1371
		var1.set(13, 0); // L: 1372
		var1.set(14, 0); // L: 1373
		Date var2 = var1.getTime(); // L: 1374
		return var0.before(var2); // L: 1375
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-2147193321"
	)
	static final void method2248(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8053
			if (Client.isLowDetail && var0 != GameEngine.Client_plane) { // L: 8054
				return;
			}

			long var8 = 0L; // L: 8055
			boolean var10 = true; // L: 8056
			boolean var11 = false; // L: 8057
			boolean var12 = false; // L: 8058
			if (var1 == 0) { // L: 8059
				var8 = class31.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8060
				var8 = class31.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8061
				var8 = class31.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8062
				var8 = class31.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) { // L: 8063
				var13 = class31.scene.getObjectFlags(var0, var2, var3, var8); // L: 8064
				int var15 = InterfaceParent.Entity_unpackID(var8); // L: 8065
				int var16 = var13 & 31; // L: 8066
				int var17 = var13 >> 6 & 3; // L: 8067
				ObjectComposition var14;
				if (var1 == 0) { // L: 8068
					class31.scene.method4622(var0, var2, var3); // L: 8069
					var14 = class144.getObjectDefinition(var15); // L: 8070
					if (var14.interactType != 0) { // L: 8071
						Client.collisionMaps[var0].method4252(var2, var3, var16, var17, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8073
					class31.scene.method4621(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8074
					class31.scene.removeGameObject(var0, var2, var3); // L: 8075
					var14 = class144.getObjectDefinition(var15); // L: 8076
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8077
						return;
					}

					if (var14.interactType != 0) { // L: 8078
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8080
					class31.scene.method4538(var0, var2, var3); // L: 8081
					var14 = class144.getObjectDefinition(var15); // L: 8082
					if (var14.interactType == 1) { // L: 8083
						Client.collisionMaps[var0].method4254(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8086
				var13 = var0; // L: 8087
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8088
					var13 = var0 + 1;
				}

				class165.method3480(var0, var13, var2, var3, var4, var5, var6, var7, class31.scene, Client.collisionMaps[var0]); // L: 8089
			}
		}

	} // L: 8092

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "27574"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 9495
		var2.packetBuffer.writeIntME(var0); // L: 9496
		var2.packetBuffer.method9132(var1); // L: 9497
		Client.packetWriter.addNode(var2); // L: 9498
	} // L: 9499

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2013563855"
	)
	static boolean method2249(int var0) {
		for (int var1 = 0; var1 < Client.field487; ++var1) { // L: 11324
			if (Client.field556[var1] == var0) { // L: 11325
				return true;
			}
		}

		return false; // L: 11327
	}
}
