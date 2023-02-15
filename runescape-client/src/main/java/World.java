import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("World")
public class World {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -903850231
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1916371087
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("n")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("l")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("Widget_spritesArchive")
	public static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2030773631
	)
	@Export("id")
	int id;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1049858737
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2072891101
	)
	@Export("population")
	int population;
	@ObfuscatedName("m")
	@Export("host")
	String host;
	@ObfuscatedName("t")
	@Export("activity")
	String activity;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -546644607
	)
	@Export("location")
	int location;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 118415625
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1502767212"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1721243202"
	)
	boolean method1823() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-506019028"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	boolean method1789() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-51668830"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035293626"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1774() {
		return (1073741824 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-513568052"
	)
	boolean method1781() {
		return (256 & this.properties) != 0; // L: 285
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	boolean method1782() {
		return (134217728 & this.properties) != 0; // L: 289
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llm;IIIBZI)V",
		garbageValue = "-1460079135"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 231
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 232
		if (var8 == null) { // L: 233
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 234
			if (var8 == null) { // L: 235
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 236
				if (var8 != null) { // L: 237
					if (var5) { // L: 238
						var8.removeDual(); // L: 239
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 240
						--NetCache.NetCache_pendingWritesCount; // L: 241
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 242
					}

				} else {
					if (!var5) { // L: 246
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 247
						if (var8 != null) { // L: 248
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 250
					var8.archive = var0; // L: 251
					var8.crc = var3; // L: 252
					var8.padding = var4; // L: 253
					if (var5) { // L: 254
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 255
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 256
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 259
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 260
						++NetCache.NetCache_pendingWritesCount; // L: 261
					}

				}
			}
		}
	} // L: 244 263

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "963791002"
	)
	public static void method1830() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 54
	} // L: 55

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "21"
	)
	static int method1825(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 4922
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class287.method5579() ? 1 : 0; // L: 4923
			return 1; // L: 4924
		} else {
			return 2; // L: 4926
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIIIIII)V",
		garbageValue = "-1837996894"
	)
	static final void method1791(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field681) { // L: 11506
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11507
		}

		Client.field681 = false; // L: 11508
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11509
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11510
				var0.scrollY -= 4; // L: 11511
				LoginScreenAnimation.invalidateWidget(var0); // L: 11512
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11514
				var0.scrollY += 4; // L: 11515
				LoginScreenAnimation.invalidateWidget(var0); // L: 11516
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11518
				var7 = var3 * (var3 - 32) / var4; // L: 11519
				if (var7 < 8) { // L: 11520
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11521
				int var9 = var3 - 32 - var7; // L: 11522
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11523
				LoginScreenAnimation.invalidateWidget(var0); // L: 11524
				Client.field681 = true; // L: 11525
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11528
			var7 = var0.width; // L: 11529
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11530
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11531
				LoginScreenAnimation.invalidateWidget(var0); // L: 11532
			}
		}

	} // L: 11535
}
