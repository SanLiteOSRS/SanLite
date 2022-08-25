import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("World")
public class World {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -898146975
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -68555585
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("k")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("o")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1527326097
	)
	@Export("id")
	int id;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -224086541
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 519550573
	)
	@Export("population")
	int population;
	@ObfuscatedName("u")
	@Export("host")
	String host;
	@ObfuscatedName("l")
	@Export("activity")
	String activity;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -192731231
	)
	@Export("location")
	int location;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1040647153
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1827716988"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1456709211"
	)
	boolean method1587() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1495382243"
	)
	boolean method1596() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-113"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1404429891"
	)
	boolean method1586() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Lpm;I)Lpm;",
		garbageValue = "-1783565282"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = WorldMapDecoration.method4914(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I[B[BB)V",
		garbageValue = "45"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3349 == null) { // L: 999
			if (var2 == null) { // L: 1000
				return; // L: 1006
			}

			var0.field3349 = new byte[11][]; // L: 1001
			var0.field3497 = new byte[11][]; // L: 1002
			var0.field3439 = new int[11]; // L: 1003
			var0.field3410 = new int[11]; // L: 1004
		}

		var0.field3349[var1] = var2; // L: 1008
		if (var2 != null) {
			var0.field3436 = true; // L: 1009
		} else {
			var0.field3436 = false; // L: 1011

			for (int var4 = 0; var4 < var0.field3349.length; ++var4) { // L: 1012
				if (var0.field3349[var4] != null) { // L: 1013
					var0.field3436 = true; // L: 1014
					break;
				}
			}
		}

		var0.field3497[var1] = var3; // L: 1019
	} // L: 1020

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2140498958"
	)
	static final int method1623(int var0, int var1) {
		int var2 = class228.method4802(var0 - 1, var1 - 1) + class228.method4802(var0 + 1, var1 - 1) + class228.method4802(var0 - 1, 1 + var1) + class228.method4802(var0 + 1, 1 + var1); // L: 1015
		int var3 = class228.method4802(var0 - 1, var1) + class228.method4802(var0 + 1, var1) + class228.method4802(var0, var1 - 1) + class228.method4802(var0, 1 + var1); // L: 1016
		int var4 = class228.method4802(var0, var1); // L: 1017
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 1018
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1723832052"
	)
	static int method1624(int var0, int var1) {
		int var2 = var1 - 334; // L: 5449
		if (var2 < 0) { // L: 5450
			var2 = 0;
		} else if (var2 > 100) { // L: 5451
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5452
		return var0 * var3 / 256; // L: 5453
	}
}
