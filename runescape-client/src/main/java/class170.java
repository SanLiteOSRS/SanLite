import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class170 implements WorldMapSection {
	@ObfuscatedName("qo")
	static boolean field2016;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1070894697
	)
	int field2015;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2078857995
	)
	int field2013;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -492732977
	)
	int field2014;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 748081581
	)
	int field2012;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -522763659
	)
	int field2023;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1748963509
	)
	int field2017;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1793396217
	)
	int field2018;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 589577767
	)
	int field2019;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -724496135
	)
	int field2020;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1652929447
	)
	int field2021;

	class170() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lfa;B)V",
		garbageValue = "120"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2023) {
			var1.regionLowX = this.field2023;
		}

		if (var1.regionHighX < this.field2023) {
			var1.regionHighX = this.field2023;
		}

		if (var1.regionLowY > this.field2017) {
			var1.regionLowY = this.field2017;
		}

		if (var1.regionHighY < this.field2017) {
			var1.regionHighY = this.field2017;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2105423832"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2015 && var1 < this.field2013 + this.field2015) {
			return var2 >= (this.field2014 << 6) + (this.field2018 << 3) && var2 <= (this.field2014 << 6) + (this.field2018 << 3) + 7 && var3 >= (this.field2012 << 6) + (this.field2019 << 3) && var3 <= (this.field2012 << 6) + (this.field2019 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-173753307"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2023 << 6) + (this.field2020 << 3) && var1 <= (this.field2023 << 6) + (this.field2020 << 3) + 7 && var2 >= (this.field2017 << 6) + (this.field2021 << 3) && var2 <= (this.field2017 << 6) + (this.field2021 << 3) + 7;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2086451205"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2023 * 64 - this.field2014 * 64 + var2 + (this.field2020 * 8 - this.field2018 * 8), var3 + (this.field2017 * 64 - this.field2012 * 64) + (this.field2021 * 8 - this.field2019 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liw;",
		garbageValue = "-36"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2014 * 64 - this.field2023 * 64 + (this.field2018 * 8 - this.field2020 * 8) + var1;
			int var4 = this.field2012 * 64 - this.field2017 * 64 + var2 + (this.field2019 * 8 - this.field2021 * 8);
			return new Coord(this.field2015, var3, var4);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1313413902"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2015 = var1.readUnsignedByte();
		this.field2013 = var1.readUnsignedByte();
		this.field2014 = var1.readUnsignedShort();
		this.field2018 = var1.readUnsignedByte();
		this.field2012 = var1.readUnsignedShort();
		this.field2019 = var1.readUnsignedByte();
		this.field2023 = var1.readUnsignedShort();
		this.field2020 = var1.readUnsignedByte();
		this.field2017 = var1.readUnsignedShort();
		this.field2021 = var1.readUnsignedByte();
		this.method3591();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1129174695"
	)
	void method3591() {
	}
}
