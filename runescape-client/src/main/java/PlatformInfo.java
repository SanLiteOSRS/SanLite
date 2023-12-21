import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 573770851
	)
	int field4880;
	@ObfuscatedName("ba")
	boolean field4871;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1183795873
	)
	int field4886;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1769216281
	)
	int field4875;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 22239183
	)
	int field4874;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1727264349
	)
	int field4856;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 169278833
	)
	int field4876;
	@ObfuscatedName("bo")
	boolean field4866;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1737818385
	)
	int field4878;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1827301789
	)
	int field4879;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -944630579
	)
	int field4873;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2071056303
	)
	int field4887;
	@ObfuscatedName("bc")
	String field4882;
	@ObfuscatedName("bs")
	String field4883;
	@ObfuscatedName("bx")
	String field4884;
	@ObfuscatedName("bb")
	String field4885;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1248614073
	)
	int field4870;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1619244905
	)
	int field4892;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2095679823
	)
	int field4888;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1054492559
	)
	int field4893;
	@ObfuscatedName("cg")
	String field4890;
	@ObfuscatedName("cv")
	String field4891;
	@ObfuscatedName("cx")
	int[] field4862;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1805875485
	)
	int field4889;
	@ObfuscatedName("ce")
	String field4894;
	@ObfuscatedName("ci")
	String field4895;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4862 = new int[3]; // L: 62
		this.field4880 = var1; // L: 68
		this.field4871 = var2; // L: 69
		this.field4886 = var3; // L: 70
		this.field4875 = var4; // L: 71
		this.field4874 = var5; // L: 72
		this.field4856 = var6; // L: 73
		this.field4876 = var7; // L: 74
		this.field4866 = var8; // L: 75
		this.field4878 = var9; // L: 76
		this.field4879 = var10; // L: 77
		this.field4873 = var11; // L: 78
		this.field4887 = var12; // L: 79
		this.field4882 = var13; // L: 80
		this.field4883 = var14; // L: 81
		this.field4884 = var15; // L: 82
		this.field4885 = var16; // L: 83
		this.field4870 = var17; // L: 84
		this.field4892 = var18; // L: 85
		this.field4888 = var19; // L: 86
		this.field4893 = var20; // L: 87
		this.field4890 = var21; // L: 88
		this.field4891 = var22; // L: 89
		this.field4862 = var23; // L: 90
		this.field4889 = var24; // L: 91
		this.field4894 = var25; // L: 92
		this.field4895 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1412255226"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4880); // L: 98
		var1.writeByte(this.field4871 ? 1 : 0); // L: 99
		var1.writeShort(this.field4886); // L: 100
		var1.writeByte(this.field4875); // L: 101
		var1.writeByte(this.field4874); // L: 102
		var1.writeByte(this.field4856); // L: 103
		var1.writeByte(this.field4876); // L: 104
		var1.writeByte(this.field4866 ? 1 : 0); // L: 105
		var1.writeShort(this.field4878); // L: 106
		var1.writeByte(this.field4879); // L: 107
		var1.writeMedium(this.field4873); // L: 108
		var1.writeShort(this.field4887); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4882); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4883); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4884); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4885); // L: 113
		var1.writeByte(this.field4892); // L: 114
		var1.writeShort(this.field4870); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4890); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4891); // L: 117
		var1.writeByte(this.field4888); // L: 118
		var1.writeByte(this.field4893); // L: 119

		for (int var2 = 0; var2 < this.field4862.length; ++var2) { // L: 120
			var1.writeInt(this.field4862[var2]);
		}

		var1.writeInt(this.field4889); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4894); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4895); // L: 123
	} // L: 124

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2077819620"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		String var4 = this.field4882; // L: 130
		int var3 = var4.length() + 2; // L: 132
		int var26 = var1 + var3; // L: 134
		String var7 = this.field4883; // L: 137
		int var6 = var7.length() + 2; // L: 139
		var26 += var6; // L: 141
		String var10 = this.field4884; // L: 144
		int var9 = var10.length() + 2; // L: 146
		var26 += var9; // L: 148
		String var13 = this.field4885; // L: 151
		int var12 = var13.length() + 2; // L: 153
		var26 += var12; // L: 155
		String var16 = this.field4890; // L: 158
		int var15 = var16.length() + 2; // L: 160
		var26 += var15; // L: 162
		String var19 = this.field4891; // L: 165
		int var18 = var19.length() + 2; // L: 167
		var26 += var18; // L: 169
		String var22 = this.field4894; // L: 172
		int var21 = var22.length() + 2; // L: 174
		var26 += var21; // L: 176
		String var25 = this.field4895; // L: 179
		int var24 = var25.length() + 2; // L: 181
		var26 += var24; // L: 183
		return var26; // L: 184
	}
}
