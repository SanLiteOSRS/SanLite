import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1696581137
	)
	int field4700;
	@ObfuscatedName("at")
	boolean field4712;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -616314079
	)
	int field4702;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1322171453
	)
	int field4714;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1721213915
	)
	int field4704;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1060935769
	)
	int field4705;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1680914369
	)
	int field4706;
	@ObfuscatedName("az")
	boolean field4719;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1977940473
	)
	int field4708;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1625606725
	)
	int field4709;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1936122295
	)
	int field4710;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -325910601
	)
	int field4724;
	@ObfuscatedName("aw")
	String field4717;
	@ObfuscatedName("aj")
	String field4721;
	@ObfuscatedName("aq")
	String field4694;
	@ObfuscatedName("ap")
	String field4692;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1556899685
	)
	int field4716;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 730782471
	)
	int field4701;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 966550467
	)
	int field4720;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1361935411
	)
	int field4713;
	@ObfuscatedName("be")
	String field4703;
	@ObfuscatedName("bf")
	String field4718;
	@ObfuscatedName("bo")
	int[] field4722;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -315982999
	)
	int field4723;
	@ObfuscatedName("bw")
	String field4707;
	@ObfuscatedName("bp")
	String field4725;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4722 = new int[3]; // L: 62
		this.field4700 = var1; // L: 68
		this.field4712 = var2; // L: 69
		this.field4702 = var3; // L: 70
		this.field4714 = var4; // L: 71
		this.field4704 = var5; // L: 72
		this.field4705 = var6; // L: 73
		this.field4706 = var7; // L: 74
		this.field4719 = var8; // L: 75
		this.field4708 = var9; // L: 76
		this.field4709 = var10; // L: 77
		this.field4710 = var11; // L: 78
		this.field4724 = var12; // L: 79
		this.field4717 = var13; // L: 80
		this.field4721 = var14; // L: 81
		this.field4694 = var15; // L: 82
		this.field4692 = var16; // L: 83
		this.field4716 = var17; // L: 84
		this.field4701 = var18; // L: 85
		this.field4720 = var19; // L: 86
		this.field4713 = var20; // L: 87
		this.field4703 = var21; // L: 88
		this.field4718 = var22; // L: 89
		this.field4722 = var23; // L: 90
		this.field4723 = var24; // L: 91
		this.field4707 = var25; // L: 92
		this.field4725 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "0"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4700); // L: 98
		var1.writeByte(this.field4712 ? 1 : 0); // L: 99
		var1.writeShort(this.field4702); // L: 100
		var1.writeByte(this.field4714); // L: 101
		var1.writeByte(this.field4704); // L: 102
		var1.writeByte(this.field4705); // L: 103
		var1.writeByte(this.field4706); // L: 104
		var1.writeByte(this.field4719 ? 1 : 0); // L: 105
		var1.writeShort(this.field4708); // L: 106
		var1.writeByte(this.field4709); // L: 107
		var1.writeMedium(this.field4710); // L: 108
		var1.writeShort(this.field4724); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4717); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4721); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4694); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4692); // L: 113
		var1.writeByte(this.field4701); // L: 114
		var1.writeShort(this.field4716); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4703); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4718); // L: 117
		var1.writeByte(this.field4720); // L: 118
		var1.writeByte(this.field4713); // L: 119

		for (int var2 = 0; var2 < this.field4722.length; ++var2) { // L: 120
			var1.method8536(this.field4722[var2]);
		}

		var1.method8536(this.field4723); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4707); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4725); // L: 123
	} // L: 124

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "316580569"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + FaceNormal.method4618(this.field4717); // L: 128
		var2 += FaceNormal.method4618(this.field4721); // L: 129
		var2 += FaceNormal.method4618(this.field4694); // L: 130
		var2 += FaceNormal.method4618(this.field4692); // L: 131
		var2 += FaceNormal.method4618(this.field4703); // L: 132
		var2 += FaceNormal.method4618(this.field4718); // L: 133
		var2 += FaceNormal.method4618(this.field4707); // L: 134
		var2 += FaceNormal.method4618(this.field4725); // L: 135
		return var2; // L: 136
	}
}
