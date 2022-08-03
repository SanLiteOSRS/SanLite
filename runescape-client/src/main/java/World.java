import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("World")
public class World {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 421072963
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1478653531
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("j")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("h")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1976884449
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2140124153
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1803769653
	)
	@Export("population")
	int population;
	@ObfuscatedName("g")
	@Export("host")
	String host;
	@ObfuscatedName("p")
	@Export("activity")
	String activity;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -940303367
	)
	@Export("location")
	int location;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 355835315
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10016"
	)
	boolean method1642() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "55"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1692512163"
	)
	boolean method1644() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-116"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "615462888"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-51"
	)
	boolean method1647() {
		return (1073741824 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "4"
	)
	static final int method1692(int var0, int var1) {
		if (var0 == -2) { // L: 972
			return 12345678;
		} else if (var0 == -1) { // L: 973
			if (var1 < 2) {
				var1 = 2; // L: 974
			} else if (var1 > 126) { // L: 975
				var1 = 126;
			}

			return var1; // L: 976
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 978
			if (var1 < 2) { // L: 979
				var1 = 2;
			} else if (var1 > 126) { // L: 980
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 981
		}
	}
}
