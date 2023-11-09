import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -214935499
	)
	int field4820;
	@ObfuscatedName("bb")
	boolean field4821;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -11698175
	)
	int field4822;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -730675399
	)
	int field4823;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -3574257
	)
	int field4824;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1532157363
	)
	int field4825;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1978399459
	)
	int field4815;
	@ObfuscatedName("bh")
	boolean field4836;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1140745941
	)
	int field4828;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1030201441
	)
	int field4829;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1999422963
	)
	int field4837;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 821634117
	)
	int field4831;
	@ObfuscatedName("bx")
	String field4832;
	@ObfuscatedName("bz")
	String field4833;
	@ObfuscatedName("bv")
	String field4834;
	@ObfuscatedName("bl")
	String field4843;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1446640343
	)
	int field4842;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1138523605
	)
	int field4835;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -367460249
	)
	int field4838;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 249985925
	)
	int field4827;
	@ObfuscatedName("cg")
	String field4840;
	@ObfuscatedName("ci")
	String field4826;
	@ObfuscatedName("cf")
	int[] field4841;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1381169553
	)
	int field4845;
	@ObfuscatedName("cm")
	String field4844;
	@ObfuscatedName("co")
	String field4830;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4841 = new int[3]; // L: 62
		this.field4820 = var1; // L: 68
		this.field4821 = var2; // L: 69
		this.field4822 = var3; // L: 70
		this.field4823 = var4; // L: 71
		this.field4824 = var5; // L: 72
		this.field4825 = var6; // L: 73
		this.field4815 = var7; // L: 74
		this.field4836 = var8; // L: 75
		this.field4828 = var9; // L: 76
		this.field4829 = var10; // L: 77
		this.field4837 = var11; // L: 78
		this.field4831 = var12; // L: 79
		this.field4832 = var13; // L: 80
		this.field4833 = var14; // L: 81
		this.field4834 = var15; // L: 82
		this.field4843 = var16; // L: 83
		this.field4842 = var17; // L: 84
		this.field4835 = var18; // L: 85
		this.field4838 = var19; // L: 86
		this.field4827 = var20; // L: 87
		this.field4840 = var21; // L: 88
		this.field4826 = var22; // L: 89
		this.field4841 = var23; // L: 90
		this.field4845 = var24; // L: 91
		this.field4844 = var25; // L: 92
		this.field4830 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "-33"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4820); // L: 98
		var1.writeByte(this.field4821 ? 1 : 0); // L: 99
		var1.writeShort(this.field4822); // L: 100
		var1.writeByte(this.field4823); // L: 101
		var1.writeByte(this.field4824); // L: 102
		var1.writeByte(this.field4825); // L: 103
		var1.writeByte(this.field4815); // L: 104
		var1.writeByte(this.field4836 ? 1 : 0); // L: 105
		var1.writeShort(this.field4828); // L: 106
		var1.writeByte(this.field4829); // L: 107
		var1.writeMedium(this.field4837); // L: 108
		var1.writeShort(this.field4831); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4832); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4833); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4834); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4843); // L: 113
		var1.writeByte(this.field4835); // L: 114
		var1.writeShort(this.field4842); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4840); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4826); // L: 117
		var1.writeByte(this.field4838); // L: 118
		var1.writeByte(this.field4827); // L: 119

		for (int var2 = 0; var2 < this.field4841.length; ++var2) { // L: 120
			var1.writeInt(this.field4841[var2]);
		}

		var1.writeInt(this.field4845); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4844); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4830); // L: 123
	} // L: 124

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2129596750"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + class508.method8984(this.field4832); // L: 128
		var2 += class508.method8984(this.field4833); // L: 129
		var2 += class508.method8984(this.field4834); // L: 130
		var2 += class508.method8984(this.field4843); // L: 131
		var2 += class508.method8984(this.field4840); // L: 132
		var2 += class508.method8984(this.field4826); // L: 133
		var2 += class508.method8984(this.field4844); // L: 134
		var2 += class508.method8984(this.field4830); // L: 135
		return var2; // L: 136
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	static void method8433() {
		class527.SpriteBuffer_xOffsets = null; // L: 254
		class527.SpriteBuffer_yOffsets = null; // L: 255
		class496.SpriteBuffer_spriteWidths = null; // L: 256
		BuddyRankComparator.SpriteBuffer_spriteHeights = null; // L: 257
		class527.SpriteBuffer_spritePalette = null; // L: 258
		class464.SpriteBuffer_pixels = null; // L: 259
	} // L: 260

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-924835623"
	)
	static int method8423() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1547
			int var0 = 0; // L: 1548

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1549
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1550
			}

			return var0 * 10000 / Client.field797; // L: 1552
		} else {
			return 10000;
		}
	}
}
