import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -414762469
	)
	int field4783;
	@ObfuscatedName("bz")
	boolean field4759;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -189842087
	)
	int field4760;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1690004953
	)
	int field4761;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -943340083
	)
	int field4762;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1022418583
	)
	int field4778;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1753943345
	)
	int field4764;
	@ObfuscatedName("bs")
	boolean field4769;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1410621599
	)
	int field4784;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -618885727
	)
	int field4777;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 674530299
	)
	int field4758;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1910222221
	)
	int field4763;
	@ObfuscatedName("ba")
	String field4771;
	@ObfuscatedName("bv")
	String field4772;
	@ObfuscatedName("bl")
	String field4773;
	@ObfuscatedName("bp")
	String field4774;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -335545265
	)
	int field4770;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1802285345
	)
	int field4776;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2136442625
	)
	int field4768;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -180252201
	)
	int field4765;
	@ObfuscatedName("ci")
	String field4779;
	@ObfuscatedName("cs")
	String field4767;
	@ObfuscatedName("cc")
	int[] field4780;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -656820395
	)
	int field4782;
	@ObfuscatedName("ca")
	String field4766;
	@ObfuscatedName("cu")
	String field4781;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4780 = new int[3]; // L: 62
		this.field4783 = var1; // L: 68
		this.field4759 = var2; // L: 69
		this.field4760 = var3; // L: 70
		this.field4761 = var4; // L: 71
		this.field4762 = var5; // L: 72
		this.field4778 = var6; // L: 73
		this.field4764 = var7; // L: 74
		this.field4769 = var8; // L: 75
		this.field4784 = var9; // L: 76
		this.field4777 = var10; // L: 77
		this.field4758 = var11; // L: 78
		this.field4763 = var12; // L: 79
		this.field4771 = var13; // L: 80
		this.field4772 = var14; // L: 81
		this.field4773 = var15; // L: 82
		this.field4774 = var16; // L: 83
		this.field4770 = var17; // L: 84
		this.field4776 = var18; // L: 85
		this.field4768 = var19; // L: 86
		this.field4765 = var20; // L: 87
		this.field4779 = var21; // L: 88
		this.field4767 = var22; // L: 89
		this.field4780 = var23; // L: 90
		this.field4782 = var24; // L: 91
		this.field4766 = var25; // L: 92
		this.field4781 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "15"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4783); // L: 98
		var1.writeByte(this.field4759 ? 1 : 0); // L: 99
		var1.writeShort(this.field4760); // L: 100
		var1.writeByte(this.field4761); // L: 101
		var1.writeByte(this.field4762); // L: 102
		var1.writeByte(this.field4778); // L: 103
		var1.writeByte(this.field4764); // L: 104
		var1.writeByte(this.field4769 ? 1 : 0); // L: 105
		var1.writeShort(this.field4784); // L: 106
		var1.writeByte(this.field4777); // L: 107
		var1.writeMedium(this.field4758); // L: 108
		var1.writeShort(this.field4763); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4771); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4772); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4773); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4774); // L: 113
		var1.writeByte(this.field4776); // L: 114
		var1.writeShort(this.field4770); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4779); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4767); // L: 117
		var1.writeByte(this.field4768); // L: 118
		var1.writeByte(this.field4765); // L: 119

		for (int var2 = 0; var2 < this.field4780.length; ++var2) { // L: 120
			var1.writeInt(this.field4780[var2]);
		}

		var1.writeInt(this.field4782); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4766); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4781); // L: 123
	} // L: 124

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "70"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + class179.method3628(this.field4771); // L: 128
		var2 += class179.method3628(this.field4772); // L: 129
		var2 += class179.method3628(this.field4773); // L: 130
		var2 += class179.method3628(this.field4774); // L: 131
		var2 += class179.method3628(this.field4779); // L: 132
		var2 += class179.method3628(this.field4767); // L: 133
		var2 += class179.method3628(this.field4766); // L: 134
		var2 += class179.method3628(this.field4781); // L: 135
		return var2; // L: 136
	}
}
