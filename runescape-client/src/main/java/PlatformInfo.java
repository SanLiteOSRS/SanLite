import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 866420121
	)
	int field4690;
	@ObfuscatedName("bk")
	boolean field4691;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -988253511
	)
	int field4692;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1200698943
	)
	int field4683;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2129153279
	)
	int field4711;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 2112872127
	)
	int field4695;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1861897227
	)
	int field4688;
	@ObfuscatedName("bt")
	boolean field4697;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1076112561
	)
	int field4698;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 648519259
	)
	int field4704;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1963553311
	)
	int field4694;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1789047105
	)
	int field4701;
	@ObfuscatedName("bb")
	String field4684;
	@ObfuscatedName("bx")
	String field4703;
	@ObfuscatedName("bn")
	String field4680;
	@ObfuscatedName("bj")
	String field4705;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1550142989
	)
	int field4686;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1918720287
	)
	int field4707;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 451790491
	)
	int field4693;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -511758947
	)
	int field4709;
	@ObfuscatedName("ca")
	String field4710;
	@ObfuscatedName("cb")
	String field4706;
	@ObfuscatedName("co")
	int[] field4712;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -777505601
	)
	int field4713;
	@ObfuscatedName("cn")
	String field4714;
	@ObfuscatedName("ce")
	String field4715;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4712 = new int[3]; // L: 62
		this.field4690 = var1; // L: 68
		this.field4691 = var2; // L: 69
		this.field4692 = var3; // L: 70
		this.field4683 = var4; // L: 71
		this.field4711 = var5; // L: 72
		this.field4695 = var6; // L: 73
		this.field4688 = var7; // L: 74
		this.field4697 = var8; // L: 75
		this.field4698 = var9; // L: 76
		this.field4704 = var10; // L: 77
		this.field4694 = var11; // L: 78
		this.field4701 = var12; // L: 79
		this.field4684 = var13; // L: 80
		this.field4703 = var14; // L: 81
		this.field4680 = var15; // L: 82
		this.field4705 = var16; // L: 83
		this.field4686 = var17; // L: 84
		this.field4707 = var18; // L: 85
		this.field4693 = var19; // L: 86
		this.field4709 = var20; // L: 87
		this.field4710 = var21; // L: 88
		this.field4706 = var22; // L: 89
		this.field4712 = var23; // L: 90
		this.field4713 = var24; // L: 91
		this.field4714 = var25; // L: 92
		this.field4715 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "202560901"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4690); // L: 98
		var1.writeByte(this.field4691 ? 1 : 0); // L: 99
		var1.writeShort(this.field4692); // L: 100
		var1.writeByte(this.field4683); // L: 101
		var1.writeByte(this.field4711); // L: 102
		var1.writeByte(this.field4695); // L: 103
		var1.writeByte(this.field4688); // L: 104
		var1.writeByte(this.field4697 ? 1 : 0); // L: 105
		var1.writeShort(this.field4698); // L: 106
		var1.writeByte(this.field4704); // L: 107
		var1.writeMedium(this.field4694); // L: 108
		var1.writeShort(this.field4701); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4684); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4703); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4680); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4705); // L: 113
		var1.writeByte(this.field4707); // L: 114
		var1.writeShort(this.field4686); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4710); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4706); // L: 117
		var1.writeByte(this.field4693); // L: 118
		var1.writeByte(this.field4709); // L: 119

		for (int var2 = 0; var2 < this.field4712.length; ++var2) { // L: 120
			var1.writeInt(this.field4712[var2]);
		}

		var1.writeInt(this.field4713); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4714); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4715); // L: 123
	} // L: 124

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "228584167"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + class19.method282(this.field4684); // L: 128
		var2 += class19.method282(this.field4703); // L: 129
		var2 += class19.method282(this.field4680); // L: 130
		var2 += class19.method282(this.field4705); // L: 131
		var2 += class19.method282(this.field4710); // L: 132
		var2 += class19.method282(this.field4706); // L: 133
		var2 += class19.method282(this.field4714); // L: 134
		var2 += class19.method282(this.field4715); // L: 135
		return var2; // L: 136
	}
}
