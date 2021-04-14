import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("World")
public class World {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -466976069
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 284068341
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("g")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("h")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lda;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -53330073
	)
	@Export("id")
	int id;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1889608255
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 677246703
	)
	@Export("population")
	int population;
	@ObfuscatedName("c")
	@Export("host")
	String host;
	@ObfuscatedName("j")
	@Export("activity")
	String activity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 931546619
	)
	@Export("location")
	int location;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1351760003
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-19498881"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2123080773"
	)
	boolean method1672() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "8"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(S)Z",
		garbageValue = "-30852"
	)
	boolean method1695() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "118"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "54"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-91"
	)
	boolean method1677() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		signature = "(Lhu;Lko;IIZI)V",
		garbageValue = "-1691139839"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			AbstractByteArrayCopier.insertMenuItem(var7, DefaultsGroup.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
