import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class260 implements WorldMapSection {
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = -117922917
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("pcmPlayerProvider")
	static class51 pcmPlayerProvider;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field2961;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1570226731
	)
	int field2956;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1898136605
	)
	int field2963;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2056811561
	)
	int field2952;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1378075731
	)
	int field2954;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1547031585
	)
	int field2955;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1789266801
	)
	int field2953;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1114005501
	)
	int field2957;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1179549517
	)
	int field2951;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1785266661
	)
	int field2959;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -285837019
	)
	int field2960;

	class260() {
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljh;I)V",
		garbageValue = "-821781156"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2955) { // L: 22
			var1.regionLowX = this.field2955;
		}

		if (var1.regionHighX < this.field2955) {
			var1.regionHighX = this.field2955; // L: 23
		}

		if (var1.regionLowY > this.field2953) { // L: 24
			var1.regionLowY = this.field2953;
		}

		if (var1.regionHighY < this.field2953) { // L: 25
			var1.regionHighY = this.field2953;
		}

	} // L: 26

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1764737995"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2956 && var1 < this.field2956 + this.field2963) { // L: 30
			return var2 >= (this.field2952 << 6) + (this.field2957 << 3) && var2 <= (this.field2952 << 6) + (this.field2957 << 3) + 7 && var3 >= (this.field2954 << 6) + (this.field2951 << 3) && var3 <= (this.field2954 << 6) + (this.field2951 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1249387971"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2955 << 6) + (this.field2959 << 3) && var1 <= (this.field2955 << 6) + (this.field2959 << 3) + 7 && var2 >= (this.field2953 << 6) + (this.field2960 << 3) && var2 <= (this.field2953 << 6) + (this.field2960 << 3) + 7; // L: 38
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-560637356"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2955 * 64 - this.field2952 * 64 + var2 + (this.field2959 * 8 - this.field2957 * 8), var3 + (this.field2953 * 64 - this.field2954 * 64) + (this.field2960 * 8 - this.field2951 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lmk;",
		garbageValue = "-1072096611"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2952 * 64 - this.field2955 * 64 + (this.field2957 * 8 - this.field2959 * 8) + var1; // L: 57
			int var4 = this.field2954 * 64 - this.field2953 * 64 + var2 + (this.field2951 * 8 - this.field2960 * 8); // L: 58
			return new Coord(this.field2956, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1760890975"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2956 = var1.readUnsignedByte(); // L: 64
		this.field2963 = var1.readUnsignedByte(); // L: 65
		this.field2952 = var1.readUnsignedShort(); // L: 66
		this.field2957 = var1.readUnsignedByte(); // L: 67
		this.field2954 = var1.readUnsignedShort(); // L: 68
		this.field2951 = var1.readUnsignedByte(); // L: 69
		this.field2955 = var1.readUnsignedShort(); // L: 70
		this.field2959 = var1.readUnsignedByte(); // L: 71
		this.field2953 = var1.readUnsignedShort(); // L: 72
		this.field2960 = var1.readUnsignedByte(); // L: 73
		this.method5445(); // L: 74
	} // L: 75

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	void method5445() {
	} // L: 77

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZI)V",
		garbageValue = "-1176177721"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12380
		int var3 = (int)var0.key; // L: 12381
		var0.remove(); // L: 12382
		if (var1 && var2 != -1 && class47.Widget_loadedInterfaces[var2]) { // L: 12383 12384 12385
			BuddyRankComparator.Widget_archive.clearFilesGroup(var2); // L: 12386
			if (class179.Widget_interfaceComponents[var2] != null) { // L: 12387
				for (int var4 = 0; var4 < class179.Widget_interfaceComponents[var2].length; ++var4) { // L: 12388
					if (class179.Widget_interfaceComponents[var2][var4] != null) { // L: 12389
						class179.Widget_interfaceComponents[var2][var4] = null; // L: 12390
					}
				}

				class179.Widget_interfaceComponents[var2] = null; // L: 12393
				class47.Widget_loadedInterfaces[var2] = false; // L: 12394
			}
		}

		HealthBarDefinition.method3776(var2); // L: 12396
		Widget var5 = Interpreter.getWidget(var3); // L: 12397
		if (var5 != null) { // L: 12398
			class303.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) { // L: 12399
			class295.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12400
}
