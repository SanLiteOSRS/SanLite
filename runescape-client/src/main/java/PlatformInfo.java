import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 878170419
	)
	public int field4969;
	@ObfuscatedName("bo")
	boolean field4959;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1310311493
	)
	int field4967;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1689581539
	)
	int field4970;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2015569039
	)
	int field4968;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1141333893
	)
	int field4989;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1271885861
	)
	int field4971;
	@ObfuscatedName("bu")
	boolean field4972;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1544098703
	)
	int field4981;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -883395987
	)
	int field4973;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 810587113
	)
	int field4975;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 88508091
	)
	int field4976;
	@ObfuscatedName("bq")
	String field4977;
	@ObfuscatedName("bi")
	String field4978;
	@ObfuscatedName("bw")
	String field4979;
	@ObfuscatedName("bm")
	String field4980;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -839520757
	)
	int field4990;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1407249247
	)
	int field4985;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -776651815
	)
	int field4983;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1066368687
	)
	int field4958;
	@ObfuscatedName("cj")
	String field4965;
	@ObfuscatedName("cr")
	String field4986;
	@ObfuscatedName("cy")
	int[] field4987;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 133663685
	)
	int field4988;
	@ObfuscatedName("cl")
	String field4966;
	@ObfuscatedName("cw")
	String field4974;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field4987 = new int[3]; // L: 65
		this.field4969 = var1; // L: 72
		this.field4959 = var2; // L: 73
		this.field4967 = var3; // L: 74
		this.field4970 = var4; // L: 75
		this.field4968 = var5; // L: 76
		this.field4989 = var6; // L: 77
		this.field4971 = var7; // L: 78
		this.field4972 = var8; // L: 79
		this.field4981 = var9; // L: 80
		this.field4973 = var10; // L: 81
		this.field4975 = var11; // L: 82
		this.field4976 = var12; // L: 83
		this.field4977 = var13; // L: 84
		this.field4978 = var14; // L: 85
		this.field4979 = var15; // L: 86
		this.field4980 = var16; // L: 87
		this.field4990 = var17; // L: 88
		this.field4985 = var18; // L: 89
		this.field4983 = var19; // L: 90
		this.field4958 = var20; // L: 91
		this.field4965 = var21; // L: 92
		this.field4986 = var22; // L: 93
		this.field4987 = var23; // L: 94
		this.field4988 = var24; // L: 95
		this.field4966 = var25; // L: 96
		this.field4974 = var26; // L: 97
	} // L: 98

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1557939418"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 101
		var1.writeByte(this.field4969); // L: 102
		var1.writeByte(this.field4959 ? 1 : 0); // L: 103
		var1.writeShort(this.field4967); // L: 104
		var1.writeByte(this.field4970); // L: 105
		var1.writeByte(this.field4968); // L: 106
		var1.writeByte(this.field4989); // L: 107
		var1.writeByte(this.field4971); // L: 108
		var1.writeByte(this.field4972 ? 1 : 0); // L: 109
		var1.writeShort(this.field4981); // L: 110
		var1.writeByte(this.field4973); // L: 111
		var1.writeMedium(this.field4975); // L: 112
		var1.writeShort(this.field4976); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4977); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4978); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4979); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4980); // L: 117
		var1.writeByte(this.field4985); // L: 118
		var1.writeShort(this.field4990); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4965); // L: 120
		var1.writeStringCp1252NullCircumfixed(this.field4986); // L: 121
		var1.writeByte(this.field4983); // L: 122
		var1.writeByte(this.field4958); // L: 123

		for (int var2 = 0; var2 < this.field4987.length; ++var2) { // L: 124
			var1.writeIntME(this.field4987[var2]);
		}

		var1.writeIntME(this.field4988); // L: 125
		var1.writeStringCp1252NullCircumfixed(this.field4966); // L: 126
		var1.writeStringCp1252NullCircumfixed(this.field4974); // L: 127
	} // L: 128

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1155603527"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 131
		String var4 = this.field4977; // L: 134
		int var3 = var4.length() + 2; // L: 136
		int var26 = var1 + var3; // L: 138
		String var7 = this.field4978; // L: 141
		int var6 = var7.length() + 2; // L: 143
		var26 += var6; // L: 145
		String var10 = this.field4979; // L: 148
		int var9 = var10.length() + 2; // L: 150
		var26 += var9; // L: 152
		String var13 = this.field4980; // L: 155
		int var12 = var13.length() + 2; // L: 157
		var26 += var12; // L: 159
		String var16 = this.field4965; // L: 162
		int var15 = var16.length() + 2; // L: 164
		var26 += var15; // L: 166
		String var19 = this.field4986; // L: 169
		int var18 = var19.length() + 2; // L: 171
		var26 += var18; // L: 173
		String var22 = this.field4966; // L: 176
		int var21 = var22.length() + 2; // L: 178
		var26 += var21; // L: 180
		String var25 = this.field4974; // L: 183
		int var24 = var25.length() + 2; // L: 185
		var26 += var24; // L: 187
		return var26; // L: 188
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2141866569"
	)
	public String method8630(int var1) {
		String var2 = ""; // L: 192
		String var3 = "12345678-0000-0000-0000-123456789012"; // L: 193
		switch(var1) { // L: 194
		case 1:
			var2 = "wmic csproduct get UUID"; // L: 202
			break; // L: 203
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'"; // L: 207
			break; // L: 208
		case 3:
			var2 = "cat /etc/machine-id"; // L: 197
			break; // L: 198
		default:
			return "Unknown"; // L: 211
		}

		try {
			Process var4 = Runtime.getRuntime().exec(var2); // L: 214
			BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream())); // L: 215
			StringBuilder var6 = new StringBuilder(); // L: 216

			String var7;
			while ((var7 = var5.readLine()) != null) { // L: 218
				var6.append(var7 + "\n"); // L: 219
			}

			if (var1 == 1) { // L: 221
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim(); // L: 222
			} else if (var1 == 2) { // L: 224
				int var8 = var6.indexOf("UUID: ") + 36; // L: 225
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", ""); // L: 226
			} else if (var1 == 3) { // L: 228
				if (var6.length() == 33) { // L: 229
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1)); // L: 230
				}

				if (var6.length() == 32) { // L: 232
					var6.insert(20, "-"); // L: 233
					var6.insert(16, "-"); // L: 234
					var6.insert(12, "-"); // L: 235
					var6.insert(8, "-"); // L: 236
					var3 = var6.toString(); // L: 237
				} else {
					var3 = "12345678-0000-0000-0000-123456789012"; // L: 240
				}
			}
		} catch (IOException var9) { // L: 244
		}

		return var3; // L: 245
	}
}
