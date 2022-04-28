import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class204 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 899584583
	)
	int field2294;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 891163721
	)
	int field2287;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -789708035
	)
	int field2288;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1083583131
	)
	int field2289;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1662345179
	)
	int field2290;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2097442135
	)
	int field2291;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -165365561
	)
	int field2295;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1619929283
	)
	int field2293;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1300866769
	)
	int field2286;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1331564349
	)
	int field2292;

	class204() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "964088357"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2290) {
			var1.regionLowX = this.field2290;
		}

		if (var1.regionHighX < this.field2290) {
			var1.regionHighX = this.field2290;
		}

		if (var1.regionLowY > this.field2291) {
			var1.regionLowY = this.field2291;
		}

		if (var1.regionHighY < this.field2291) {
			var1.regionHighY = this.field2291;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1337137401"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2294 && var1 < this.field2294 + this.field2287) {
			return var2 >= (this.field2288 << 6) + (this.field2295 << 3) && var2 <= (this.field2288 << 6) + (this.field2295 << 3) + 7 && var3 >= (this.field2289 << 6) + (this.field2293 << 3) && var3 <= (this.field2289 << 6) + (this.field2293 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1769831605"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2290 << 6) + (this.field2286 << 3) && var1 <= (this.field2290 << 6) + (this.field2286 << 3) + 7 && var2 >= (this.field2291 << 6) + (this.field2292 << 3) && var2 <= (this.field2291 << 6) + (this.field2292 << 3) + 7;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1941144122"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2290 * 64 - this.field2288 * 64 + var2 + (this.field2286 * 8 - this.field2295 * 8), var3 + (this.field2291 * 64 - this.field2289 * 64) + (this.field2292 * 8 - this.field2293 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Lks;",
		garbageValue = "-670243838"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2288 * 64 - this.field2290 * 64 + (this.field2295 * 8 - this.field2286 * 8) + var1;
			int var4 = this.field2289 * 64 - this.field2291 * 64 + var2 + (this.field2293 * 8 - this.field2292 * 8);
			return new Coord(this.field2294, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-860121653"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2294 = var1.readUnsignedByte();
		this.field2287 = var1.readUnsignedByte();
		this.field2288 = var1.readUnsignedShort();
		this.field2295 = var1.readUnsignedByte();
		this.field2289 = var1.readUnsignedShort();
		this.field2293 = var1.readUnsignedByte();
		this.field2290 = var1.readUnsignedShort();
		this.field2286 = var1.readUnsignedByte();
		this.field2291 = var1.readUnsignedShort();
		this.field2292 = var1.readUnsignedByte();
		this.method4246();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2032484679"
	)
	void method4246() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)I",
		garbageValue = "-42"
	)
	static final int method4255(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4557) {
			case 1:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-1799343928"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (DevicePcmPlayerProvider.World_worlds != null) {
			ObjectSound.doWorldSorting(0, DevicePcmPlayerProvider.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
