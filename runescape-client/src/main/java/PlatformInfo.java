import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 828307537
	)
	int field4873;
	@ObfuscatedName("bz")
	boolean field4883;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1658886897
	)
	int field4875;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1807303785
	)
	int field4876;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -425030365
	)
	int field4877;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1904445675
	)
	int field4878;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 935774115
	)
	int field4894;
	@ObfuscatedName("br")
	boolean field4874;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -25939819
	)
	int field4881;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1028955517
	)
	int field4864;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 916640685
	)
	int field4866;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1516575009
	)
	int field4884;
	@ObfuscatedName("bl")
	String field4885;
	@ObfuscatedName("bg")
	String field4886;
	@ObfuscatedName("bj")
	String field4879;
	@ObfuscatedName("bx")
	String field4868;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1640241405
	)
	int field4872;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 151518255
	)
	int field4890;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1955875315
	)
	int field4891;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1794447707
	)
	int field4889;
	@ObfuscatedName("cu")
	String field4893;
	@ObfuscatedName("cw")
	String field4865;
	@ObfuscatedName("co")
	int[] field4895;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 189369881
	)
	int field4896;
	@ObfuscatedName("cg")
	String field4897;
	@ObfuscatedName("cq")
	String field4898;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4895 = new int[3]; // L: 62
		this.field4873 = var1; // L: 68
		this.field4883 = var2; // L: 69
		this.field4875 = var3; // L: 70
		this.field4876 = var4; // L: 71
		this.field4877 = var5; // L: 72
		this.field4878 = var6; // L: 73
		this.field4894 = var7; // L: 74
		this.field4874 = var8; // L: 75
		this.field4881 = var9; // L: 76
		this.field4864 = var10; // L: 77
		this.field4866 = var11; // L: 78
		this.field4884 = var12; // L: 79
		this.field4885 = var13; // L: 80
		this.field4886 = var14; // L: 81
		this.field4879 = var15; // L: 82
		this.field4868 = var16; // L: 83
		this.field4872 = var17; // L: 84
		this.field4890 = var18; // L: 85
		this.field4891 = var19; // L: 86
		this.field4889 = var20; // L: 87
		this.field4893 = var21; // L: 88
		this.field4865 = var22; // L: 89
		this.field4895 = var23; // L: 90
		this.field4896 = var24; // L: 91
		this.field4897 = var25; // L: 92
		this.field4898 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1684641716"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4873); // L: 98
		var1.writeByte(this.field4883 ? 1 : 0); // L: 99
		var1.writeShort(this.field4875); // L: 100
		var1.writeByte(this.field4876); // L: 101
		var1.writeByte(this.field4877); // L: 102
		var1.writeByte(this.field4878); // L: 103
		var1.writeByte(this.field4894); // L: 104
		var1.writeByte(this.field4874 ? 1 : 0); // L: 105
		var1.writeShort(this.field4881); // L: 106
		var1.writeByte(this.field4864); // L: 107
		var1.writeMedium(this.field4866); // L: 108
		var1.writeShort(this.field4884); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4885); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4886); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4879); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4868); // L: 113
		var1.writeByte(this.field4890); // L: 114
		var1.writeShort(this.field4872); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4893); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4865); // L: 117
		var1.writeByte(this.field4891); // L: 118
		var1.writeByte(this.field4889); // L: 119

		for (int var2 = 0; var2 < this.field4895.length; ++var2) { // L: 120
			var1.writeInt(this.field4895[var2]);
		}

		var1.writeInt(this.field4896); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4897); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4898); // L: 123
	} // L: 124

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "725870581"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		String var4 = this.field4885; // L: 130
		int var3 = var4.length() + 2; // L: 132
		int var26 = var1 + var3; // L: 134
		String var7 = this.field4886; // L: 137
		int var6 = var7.length() + 2; // L: 139
		var26 += var6; // L: 141
		String var10 = this.field4879; // L: 144
		int var9 = var10.length() + 2; // L: 146
		var26 += var9; // L: 148
		String var13 = this.field4868; // L: 151
		int var12 = var13.length() + 2; // L: 153
		var26 += var12; // L: 155
		String var16 = this.field4893; // L: 158
		int var15 = var16.length() + 2; // L: 160
		var26 += var15; // L: 162
		String var19 = this.field4865; // L: 165
		int var18 = var19.length() + 2; // L: 167
		var26 += var18; // L: 169
		String var22 = this.field4897; // L: 172
		int var21 = var22.length() + 2; // L: 174
		var26 += var21; // L: 176
		String var25 = this.field4898; // L: 179
		int var24 = var25.length() + 2; // L: 181
		var26 += var24; // L: 183
		return var26; // L: 184
	}
}
