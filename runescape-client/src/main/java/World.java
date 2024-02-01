import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("World")
public class World {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lch;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1400134735
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1226484089
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ao")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ae")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 949505101
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -857776505
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1854816577
	)
	@Export("population")
	int population;
	@ObfuscatedName("ax")
	@Export("host")
	String host;
	@ObfuscatedName("aw")
	@Export("activity")
	String activity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2046997537
	)
	@Export("location")
	int location;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -337156259
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	String field821;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 28

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1879877142"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class526.field5149.rsOrdinal() & this.properties) != 0; // L: 258
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1551707870"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class526.field5160.rsOrdinal() & this.properties) != 0; // L: 262
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-35176563"
	)
	boolean method1841() {
		return (class526.field5150.rsOrdinal() & this.properties) != 0; // L: 266
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "662458741"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class526.field5136.rsOrdinal() & this.properties) != 0; // L: 270
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "197916706"
	)
	boolean method1845() {
		return (class526.field5137.rsOrdinal() & this.properties) != 0; // L: 274
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "97"
	)
	boolean method1842() {
		return (class526.field5163.rsOrdinal() & this.properties) != 0; // L: 278
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-989897710"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class526.field5151.rsOrdinal() & this.properties) != 0; // L: 282
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2019572946"
	)
	boolean method1844() {
		return (class526.field5164.rsOrdinal() & this.properties) != 0; // L: 286
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1167071721"
	)
	boolean method1893() {
		return (class526.field5142.rsOrdinal() & this.properties) != 0; // L: 290
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1549455343"
	)
	boolean method1858() {
		return (class526.field5161.rsOrdinal() & this.properties) != 0; // L: 294
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfx;I)V",
		garbageValue = "-222950832"
	)
	static void method1863(float var0, float var1, float var2, float var3, class131 var4) {
		float var5 = var1 - var0; // L: 346
		float var6 = var2 - var1; // L: 347
		float var7 = var3 - var2; // L: 348
		float var8 = var6 - var5; // L: 349
		var4.field1542 = var7 - var6 - var8; // L: 350
		var4.field1529 = var8 + var8 + var8; // L: 351
		var4.field1531 = var5 + var5 + var5; // L: 352
		var4.field1537 = var0; // L: 353
	} // L: 354

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lch;Lch;IZI)I",
		garbageValue = "-84905403"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 222
			int var4 = var0.population; // L: 223
			int var5 = var1.population; // L: 224
			if (!var3) { // L: 225
				if (var4 == -1) { // L: 226
					var4 = 2001;
				}

				if (var5 == -1) { // L: 227
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 229
		} else if (var2 == 2) { // L: 231
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 232
			if (var0.activity.equals("-")) { // L: 233
				if (var1.activity.equals("-")) { // L: 234
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 235
				}
			} else if (var1.activity.equals("-")) { // L: 237
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 238
			}
		} else if (var2 == 4) { // L: 240
			return var0.method1845() ? (var1.method1845() ? 0 : 1) : (var1.method1845() ? -1 : 0);
		} else if (var2 == 5) { // L: 241
			return var0.method1841() ? (var1.method1841() ? 0 : 1) : (var1.method1841() ? -1 : 0);
		} else if (var2 == 6) { // L: 242
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 243
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 244
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1793102624"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class189.method3780(); // L: 2916
		switch(var0) { // L: 2917
		case 1:
			class255.method5036(); // L: 2925
			break;
		case 2:
			KeyHandler.method434(); // L: 2920
		}

	} // L: 2929

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1688710746"
	)
	static final void method1896(boolean var0) {
		WorldMapRectangle.method5020(); // L: 5964
		++Client.packetWriter.pendingWrites; // L: 5965
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5966
			Client.packetWriter.pendingWrites = 0; // L: 5967
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5968
				PacketBufferNode var1 = class482.getPacketBufferNode(ClientPacket.field3206, Client.packetWriter.isaacCipher); // L: 5970
				Client.packetWriter.addNode(var1); // L: 5971

				try {
					Client.packetWriter.flush(); // L: 5973
				} catch (IOException var3) { // L: 5975
					Client.hadNetworkError = true; // L: 5976
				}
			}

		}
	} // L: 5979

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	static void method1898() {
		if (Client.field597 && class25.localPlayer != null) { // L: 12706
			int var0 = class25.localPlayer.pathX[0]; // L: 12707
			int var1 = class25.localPlayer.pathY[0]; // L: 12708
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12709
				return;
			}

			class367.oculusOrbFocalPointX = class25.localPlayer.x; // L: 12710
			int var2 = class19.getTileHeight(class25.localPlayer.x, class25.localPlayer.y, class113.Client_plane) - Client.camFollowHeight; // L: 12711
			if (var2 < WorldMapArea.field2516) { // L: 12712
				WorldMapArea.field2516 = var2;
			}

			WorldMapCacheName.oculusOrbFocalPointY = class25.localPlayer.y; // L: 12713
			Client.field597 = false; // L: 12714
		}

	} // L: 12716
}
