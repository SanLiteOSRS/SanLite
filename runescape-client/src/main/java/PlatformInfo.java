import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 157418053
	)
	int field4717;
	@ObfuscatedName("at")
	boolean field4726;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -49893931
	)
	int field4724;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 735467929
	)
	int field4728;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1390513459
	)
	int field4735;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1777154845
	)
	int field4731;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1791776075
	)
	int field4720;
	@ObfuscatedName("ac")
	boolean field4732;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1233820199
	)
	int field4730;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1281215561
	)
	int field4734;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 701970541
	)
	int field4748;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 365972939
	)
	int field4736;
	@ObfuscatedName("ah")
	String field4737;
	@ObfuscatedName("ad")
	String field4738;
	@ObfuscatedName("ab")
	String field4739;
	@ObfuscatedName("an")
	String field4740;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -618051943
	)
	int field4741;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1518623831
	)
	int field4727;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -554434077
	)
	int field4743;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1007178449
	)
	int field4744;
	@ObfuscatedName("bf")
	String field4719;
	@ObfuscatedName("bz")
	String field4746;
	@ObfuscatedName("br")
	int[] field4747;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1466787915
	)
	int field4742;
	@ObfuscatedName("be")
	String field4749;
	@ObfuscatedName("bo")
	String field4750;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4747 = new int[3]; // L: 62
		this.field4717 = var1; // L: 68
		this.field4726 = var2; // L: 69
		this.field4724 = var3; // L: 70
		this.field4728 = var4; // L: 71
		this.field4735 = var5; // L: 72
		this.field4731 = var6; // L: 73
		this.field4720 = var7; // L: 74
		this.field4732 = var8; // L: 75
		this.field4730 = var9; // L: 76
		this.field4734 = var10; // L: 77
		this.field4748 = var11; // L: 78
		this.field4736 = var12; // L: 79
		this.field4737 = var13; // L: 80
		this.field4738 = var14; // L: 81
		this.field4739 = var15; // L: 82
		this.field4740 = var16; // L: 83
		this.field4741 = var17; // L: 84
		this.field4727 = var18; // L: 85
		this.field4743 = var19; // L: 86
		this.field4744 = var20; // L: 87
		this.field4719 = var21; // L: 88
		this.field4746 = var22; // L: 89
		this.field4747 = var23; // L: 90
		this.field4742 = var24; // L: 91
		this.field4749 = var25; // L: 92
		this.field4750 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "1532139983"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4717); // L: 98
		var1.writeByte(this.field4726 ? 1 : 0); // L: 99
		var1.writeShort(this.field4724); // L: 100
		var1.writeByte(this.field4728); // L: 101
		var1.writeByte(this.field4735); // L: 102
		var1.writeByte(this.field4731); // L: 103
		var1.writeByte(this.field4720); // L: 104
		var1.writeByte(this.field4732 ? 1 : 0); // L: 105
		var1.writeShort(this.field4730); // L: 106
		var1.writeByte(this.field4734); // L: 107
		var1.writeMedium(this.field4748); // L: 108
		var1.writeShort(this.field4736); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4737); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4738); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4739); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4740); // L: 113
		var1.writeByte(this.field4727); // L: 114
		var1.writeShort(this.field4741); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4719); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4746); // L: 117
		var1.writeByte(this.field4743); // L: 118
		var1.writeByte(this.field4744); // L: 119

		for (int var2 = 0; var2 < this.field4747.length; ++var2) { // L: 120
			var1.writeInt(this.field4747[var2]);
		}

		var1.writeInt(this.field4742); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4749); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4750); // L: 123
	} // L: 124

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1699578121"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		String var4 = this.field4737; // L: 130
		int var3 = var4.length() + 2; // L: 132
		int var26 = var1 + var3; // L: 134
		String var7 = this.field4738; // L: 137
		int var6 = var7.length() + 2; // L: 139
		var26 += var6; // L: 141
		String var10 = this.field4739; // L: 144
		int var9 = var10.length() + 2; // L: 146
		var26 += var9; // L: 148
		String var13 = this.field4740; // L: 151
		int var12 = var13.length() + 2; // L: 153
		var26 += var12; // L: 155
		String var16 = this.field4719; // L: 158
		int var15 = var16.length() + 2; // L: 160
		var26 += var15; // L: 162
		String var19 = this.field4746; // L: 165
		int var18 = var19.length() + 2; // L: 167
		var26 += var18; // L: 169
		String var22 = this.field4749; // L: 172
		int var21 = var22.length() + 2; // L: 174
		var26 += var21; // L: 176
		String var25 = this.field4750; // L: 179
		int var24 = var25.length() + 2; // L: 181
		var26 += var24; // L: 183
		return var26; // L: 184
	}
}
