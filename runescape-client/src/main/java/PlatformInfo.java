import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1904420251
	)
	int field4830;
	@ObfuscatedName("bs")
	boolean field4831;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 264065611
	)
	int field4832;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1187086541
	)
	int field4833;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -187483369
	)
	int field4822;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -996711977
	)
	int field4837;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1640138069
	)
	int field4848;
	@ObfuscatedName("bp")
	boolean field4841;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1266013031
	)
	int field4838;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 518352535
	)
	int field4821;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1184785821
	)
	int field4840;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1985636101
	)
	int field4834;
	@ObfuscatedName("bi")
	String field4842;
	@ObfuscatedName("bz")
	String field4843;
	@ObfuscatedName("bx")
	String field4844;
	@ObfuscatedName("bn")
	String field4845;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1565841435
	)
	int field4846;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1567483585
	)
	int field4847;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1642110207
	)
	int field4852;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -632448413
	)
	int field4849;
	@ObfuscatedName("cf")
	String field4850;
	@ObfuscatedName("cm")
	String field4851;
	@ObfuscatedName("cn")
	int[] field4824;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -742143585
	)
	int field4853;
	@ObfuscatedName("cx")
	String field4854;
	@ObfuscatedName("cr")
	String field4855;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4824 = new int[3]; // L: 62
		this.field4830 = var1; // L: 68
		this.field4831 = var2; // L: 69
		this.field4832 = var3; // L: 70
		this.field4833 = var4; // L: 71
		this.field4822 = var5; // L: 72
		this.field4837 = var6; // L: 73
		this.field4848 = var7; // L: 74
		this.field4841 = var8; // L: 75
		this.field4838 = var9; // L: 76
		this.field4821 = var10; // L: 77
		this.field4840 = var11; // L: 78
		this.field4834 = var12; // L: 79
		this.field4842 = var13; // L: 80
		this.field4843 = var14; // L: 81
		this.field4844 = var15; // L: 82
		this.field4845 = var16; // L: 83
		this.field4846 = var17; // L: 84
		this.field4847 = var18; // L: 85
		this.field4852 = var19; // L: 86
		this.field4849 = var20; // L: 87
		this.field4850 = var21; // L: 88
		this.field4851 = var22; // L: 89
		this.field4824 = var23; // L: 90
		this.field4853 = var24; // L: 91
		this.field4854 = var25; // L: 92
		this.field4855 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "77"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4830); // L: 98
		var1.writeByte(this.field4831 ? 1 : 0); // L: 99
		var1.writeShort(this.field4832); // L: 100
		var1.writeByte(this.field4833); // L: 101
		var1.writeByte(this.field4822); // L: 102
		var1.writeByte(this.field4837); // L: 103
		var1.writeByte(this.field4848); // L: 104
		var1.writeByte(this.field4841 ? 1 : 0); // L: 105
		var1.writeShort(this.field4838); // L: 106
		var1.writeByte(this.field4821); // L: 107
		var1.writeMedium(this.field4840); // L: 108
		var1.writeShort(this.field4834); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4842); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4843); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4844); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4845); // L: 113
		var1.writeByte(this.field4847); // L: 114
		var1.writeShort(this.field4846); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4850); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4851); // L: 117
		var1.writeByte(this.field4852); // L: 118
		var1.writeByte(this.field4849); // L: 119

		for (int var2 = 0; var2 < this.field4824.length; ++var2) { // L: 120
			var1.writeInt(this.field4824[var2]);
		}

		var1.writeInt(this.field4853); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4854); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4855); // L: 123
	} // L: 124

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1863641013"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		String var4 = this.field4842; // L: 130
		int var3 = var4.length() + 2; // L: 132
		int var26 = var3 + var1; // L: 134
		String var7 = this.field4843; // L: 137
		int var6 = var7.length() + 2; // L: 139
		var26 += var6; // L: 141
		String var10 = this.field4844; // L: 144
		int var9 = var10.length() + 2; // L: 146
		var26 += var9; // L: 148
		String var13 = this.field4845; // L: 151
		int var12 = var13.length() + 2; // L: 153
		var26 += var12; // L: 155
		String var16 = this.field4850; // L: 158
		int var15 = var16.length() + 2; // L: 160
		var26 += var15; // L: 162
		String var19 = this.field4851; // L: 165
		int var18 = var19.length() + 2; // L: 167
		var26 += var18; // L: 169
		String var22 = this.field4854; // L: 172
		int var21 = var22.length() + 2; // L: 174
		var26 += var21; // L: 176
		String var25 = this.field4855; // L: 179
		int var24 = var25.length() + 2; // L: 181
		var26 += var24; // L: 183
		return var26; // L: 184
	}
}
