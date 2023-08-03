import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2041558941
	)
	int field4856;
	@ObfuscatedName("bv")
	boolean field4832;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1905883459
	)
	int field4833;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -672936131
	)
	int field4834;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -967666951
	)
	int field4835;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1223199221
	)
	int field4845;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1848809189
	)
	int field4824;
	@ObfuscatedName("bc")
	boolean field4838;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1209160853
	)
	int field4839;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 87006035
	)
	int field4840;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -769087335
	)
	int field4852;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1080428069
	)
	int field4842;
	@ObfuscatedName("bh")
	String field4836;
	@ObfuscatedName("bm")
	String field4844;
	@ObfuscatedName("bl")
	String field4843;
	@ObfuscatedName("bt")
	String field4846;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 955279729
	)
	int field4847;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -157341337
	)
	int field4848;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 465604323
	)
	int field4849;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 334979683
	)
	int field4850;
	@ObfuscatedName("cf")
	String field4851;
	@ObfuscatedName("cz")
	String field4825;
	@ObfuscatedName("cb")
	int[] field4853;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -671441249
	)
	int field4854;
	@ObfuscatedName("cj")
	String field4855;
	@ObfuscatedName("cn")
	String field4841;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4853 = new int[3]; // L: 62
		this.field4856 = var1; // L: 68
		this.field4832 = var2; // L: 69
		this.field4833 = var3; // L: 70
		this.field4834 = var4; // L: 71
		this.field4835 = var5; // L: 72
		this.field4845 = var6; // L: 73
		this.field4824 = var7; // L: 74
		this.field4838 = var8; // L: 75
		this.field4839 = var9; // L: 76
		this.field4840 = var10; // L: 77
		this.field4852 = var11; // L: 78
		this.field4842 = var12; // L: 79
		this.field4836 = var13; // L: 80
		this.field4844 = var14; // L: 81
		this.field4843 = var15; // L: 82
		this.field4846 = var16; // L: 83
		this.field4847 = var17; // L: 84
		this.field4848 = var18; // L: 85
		this.field4849 = var19; // L: 86
		this.field4850 = var20; // L: 87
		this.field4851 = var21; // L: 88
		this.field4825 = var22; // L: 89
		this.field4853 = var23; // L: 90
		this.field4854 = var24; // L: 91
		this.field4855 = var25; // L: 92
		this.field4841 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-1478570586"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4856); // L: 98
		var1.writeByte(this.field4832 ? 1 : 0); // L: 99
		var1.writeShort(this.field4833); // L: 100
		var1.writeByte(this.field4834); // L: 101
		var1.writeByte(this.field4835); // L: 102
		var1.writeByte(this.field4845); // L: 103
		var1.writeByte(this.field4824); // L: 104
		var1.writeByte(this.field4838 ? 1 : 0); // L: 105
		var1.writeShort(this.field4839); // L: 106
		var1.writeByte(this.field4840); // L: 107
		var1.writeMedium(this.field4852); // L: 108
		var1.writeShort(this.field4842); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4836); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4844); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4843); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4846); // L: 113
		var1.writeByte(this.field4848); // L: 114
		var1.writeShort(this.field4847); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4851); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4825); // L: 117
		var1.writeByte(this.field4849); // L: 118
		var1.writeByte(this.field4850); // L: 119

		for (int var2 = 0; var2 < this.field4853.length; ++var2) { // L: 120
			var1.writeInt(this.field4853[var2]);
		}

		var1.writeInt(this.field4854); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4855); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4841); // L: 123
	} // L: 124

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-209852192"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + class387.method7246(this.field4836); // L: 128
		var2 += class387.method7246(this.field4844); // L: 129
		var2 += class387.method7246(this.field4843); // L: 130
		var2 += class387.method7246(this.field4846); // L: 131
		var2 += class387.method7246(this.field4851); // L: 132
		var2 += class387.method7246(this.field4825); // L: 133
		var2 += class387.method7246(this.field4855); // L: 134
		var2 += class387.method7246(this.field4841); // L: 135
		return var2; // L: 136
	}
}
