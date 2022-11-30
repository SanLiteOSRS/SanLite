import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1986853609
	)
	int field4661;
	@ObfuscatedName("av")
	boolean field4652;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 503045331
	)
	int field4651;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 951411975
	)
	int field4654;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2078295935
	)
	int field4655;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1360270049
	)
	int field4645;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1414009049
	)
	int field4657;
	@ObfuscatedName("al")
	boolean field4658;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1913366845
	)
	int field4643;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -57306917
	)
	int field4660;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1124886807
	)
	int field4656;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 676182769
	)
	int field4670;
	@ObfuscatedName("au")
	String field4663;
	@ObfuscatedName("aw")
	String field4664;
	@ObfuscatedName("at")
	String field4646;
	@ObfuscatedName("ar")
	String field4666;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -468699877
	)
	int field4675;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -304749407
	)
	int field4668;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 871091663
	)
	int field4659;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 621341049
	)
	int field4647;
	@ObfuscatedName("bh")
	String field4671;
	@ObfuscatedName("bm")
	String field4672;
	@ObfuscatedName("bp")
	int[] field4673;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1955870365
	)
	int field4674;
	@ObfuscatedName("bo")
	String field4662;
	@ObfuscatedName("bg")
	String field4665;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4673 = new int[3]; // L: 62
		this.field4661 = var1; // L: 68
		this.field4652 = var2; // L: 69
		this.field4651 = var3; // L: 70
		this.field4654 = var4; // L: 71
		this.field4655 = var5; // L: 72
		this.field4645 = var6; // L: 73
		this.field4657 = var7; // L: 74
		this.field4658 = var8; // L: 75
		this.field4643 = var9; // L: 76
		this.field4660 = var10; // L: 77
		this.field4656 = var11; // L: 78
		this.field4670 = var12; // L: 79
		this.field4663 = var13; // L: 80
		this.field4664 = var14; // L: 81
		this.field4646 = var15; // L: 82
		this.field4666 = var16; // L: 83
		this.field4675 = var17; // L: 84
		this.field4668 = var18; // L: 85
		this.field4659 = var19; // L: 86
		this.field4647 = var20; // L: 87
		this.field4671 = var21; // L: 88
		this.field4672 = var22; // L: 89
		this.field4673 = var23; // L: 90
		this.field4674 = var24; // L: 91
		this.field4662 = var25; // L: 92
		this.field4665 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1670253037"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4661); // L: 98
		var1.writeByte(this.field4652 ? 1 : 0); // L: 99
		var1.writeShort(this.field4651); // L: 100
		var1.writeByte(this.field4654); // L: 101
		var1.writeByte(this.field4655); // L: 102
		var1.writeByte(this.field4645); // L: 103
		var1.writeByte(this.field4657); // L: 104
		var1.writeByte(this.field4658 ? 1 : 0); // L: 105
		var1.writeShort(this.field4643); // L: 106
		var1.writeByte(this.field4660); // L: 107
		var1.writeMedium(this.field4656); // L: 108
		var1.writeShort(this.field4670); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4663); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4664); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4646); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4666); // L: 113
		var1.writeByte(this.field4668); // L: 114
		var1.writeShort(this.field4675); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4671); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4672); // L: 117
		var1.writeByte(this.field4659); // L: 118
		var1.writeByte(this.field4647); // L: 119

		for (int var2 = 0; var2 < this.field4673.length; ++var2) { // L: 120
			var1.writeInt(this.field4673[var2]);
		}

		var1.writeInt(this.field4674); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4662); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4665); // L: 123
	} // L: 124

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		String var4 = this.field4663; // L: 130
		int var3 = var4.length() + 2; // L: 132
		int var26 = var1 + var3; // L: 134
		String var7 = this.field4664; // L: 137
		int var6 = var7.length() + 2; // L: 139
		var26 += var6; // L: 141
		String var10 = this.field4646; // L: 144
		int var9 = var10.length() + 2; // L: 146
		var26 += var9; // L: 148
		String var13 = this.field4666; // L: 151
		int var12 = var13.length() + 2; // L: 153
		var26 += var12; // L: 155
		String var16 = this.field4671; // L: 158
		int var15 = var16.length() + 2; // L: 160
		var26 += var15; // L: 162
		String var19 = this.field4672; // L: 165
		int var18 = var19.length() + 2; // L: 167
		var26 += var18; // L: 169
		String var22 = this.field4662; // L: 172
		int var21 = var22.length() + 2; // L: 174
		var26 += var21; // L: 176
		String var25 = this.field4665; // L: 179
		int var24 = var25.length() + 2; // L: 181
		var26 += var24; // L: 183
		return var26; // L: 184
	}
}
