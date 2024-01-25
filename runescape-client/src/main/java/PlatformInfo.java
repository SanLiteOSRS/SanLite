import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -237812389
	)
	public int field4926;
	@ObfuscatedName("bn")
	boolean field4923;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 174577155
	)
	int field4906;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 978944667
	)
	int field4907;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1533166283
	)
	int field4908;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2069770939
	)
	int field4909;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1764080435
	)
	int field4910;
	@ObfuscatedName("bv")
	boolean field4911;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1703677853
	)
	int field4912;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 377173555
	)
	int field4913;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1057434447
	)
	int field4914;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 883555335
	)
	int field4905;
	@ObfuscatedName("bi")
	String field4916;
	@ObfuscatedName("bu")
	String field4917;
	@ObfuscatedName("be")
	String field4918;
	@ObfuscatedName("bs")
	String field4919;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 573776175
	)
	int field4927;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -710207929
	)
	int field4921;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1040819083
	)
	int field4903;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 834107987
	)
	int field4900;
	@ObfuscatedName("cb")
	String field4924;
	@ObfuscatedName("ci")
	String field4925;
	@ObfuscatedName("cv")
	int[] field4920;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1353395511
	)
	int field4896;
	@ObfuscatedName("cp")
	String field4928;
	@ObfuscatedName("cq")
	String field4929;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field4920 = new int[3]; // L: 65
		this.field4926 = var1; // L: 72
		this.field4923 = var2; // L: 73
		this.field4906 = var3; // L: 74
		this.field4907 = var4; // L: 75
		this.field4908 = var5; // L: 76
		this.field4909 = var6; // L: 77
		this.field4910 = var7; // L: 78
		this.field4911 = var8; // L: 79
		this.field4912 = var9; // L: 80
		this.field4913 = var10; // L: 81
		this.field4914 = var11; // L: 82
		this.field4905 = var12; // L: 83
		this.field4916 = var13; // L: 84
		this.field4917 = var14; // L: 85
		this.field4918 = var15; // L: 86
		this.field4919 = var16; // L: 87
		this.field4927 = var17; // L: 88
		this.field4921 = var18; // L: 89
		this.field4903 = var19; // L: 90
		this.field4900 = var20; // L: 91
		this.field4924 = var21; // L: 92
		this.field4925 = var22; // L: 93
		this.field4920 = var23; // L: 94
		this.field4896 = var24; // L: 95
		this.field4928 = var25; // L: 96
		this.field4929 = var26; // L: 97
	} // L: 98

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1357663767"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 101
		var1.writeByte(this.field4926); // L: 102
		var1.writeByte(this.field4923 ? 1 : 0); // L: 103
		var1.writeShort(this.field4906); // L: 104
		var1.writeByte(this.field4907); // L: 105
		var1.writeByte(this.field4908); // L: 106
		var1.writeByte(this.field4909);
		var1.writeByte(this.field4910);
		var1.writeByte(this.field4911 ? 1 : 0);
		var1.writeShort(this.field4912); // L: 110
		var1.writeByte(this.field4913); // L: 111
		var1.writeMedium(this.field4914);
		var1.writeShort(this.field4905);
		var1.writeStringCp1252NullCircumfixed(this.field4916); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4917); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4918);
		var1.writeStringCp1252NullCircumfixed(this.field4919); // L: 117
		var1.writeByte(this.field4921);
		var1.writeShort(this.field4927); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4924); // L: 120
		var1.writeStringCp1252NullCircumfixed(this.field4925); // L: 121
		var1.writeByte(this.field4903); // L: 122
		var1.writeByte(this.field4900); // L: 123

		for (int var2 = 0; var2 < this.field4920.length; ++var2) { // L: 124
			var1.method9373(this.field4920[var2]);
		}

		var1.method9373(this.field4896); // L: 125
		var1.writeStringCp1252NullCircumfixed(this.field4928); // L: 126
		var1.writeStringCp1252NullCircumfixed(this.field4929); // L: 127
	} // L: 128

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1952660625"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 131
		int var2 = var1 + class244.method4942(this.field4916); // L: 132
		var2 += class244.method4942(this.field4917); // L: 133
		var2 += class244.method4942(this.field4918); // L: 134
		var2 += class244.method4942(this.field4919); // L: 135
		var2 += class244.method4942(this.field4924); // L: 136
		var2 += class244.method4942(this.field4925); // L: 137
		var2 += class244.method4942(this.field4928); // L: 138
		var2 += class244.method4942(this.field4929); // L: 139
		return var2; // L: 140
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-412168738"
	)
	public String method8776(int var1) {
		String var2 = ""; // L: 144
		String var3 = ""; // L: 145
		switch(var1) { // L: 146
		case 1:
			var2 = "wmic csproduct get UUID"; // L: 156
			break;
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'"; // L: 151
		}

		try {
			Process var4 = Runtime.getRuntime().exec(var2); // L: 161
			BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream())); // L: 162
			StringBuffer var6 = new StringBuffer(); // L: 163

			String var7;
			while ((var7 = var5.readLine()) != null) { // L: 165
				var6.append(var7 + "\n"); // L: 166
			}

			if (var1 == 1) { // L: 168
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim(); // L: 169
			} else if (var1 == 2) { // L: 171
				int var8 = var6.indexOf("UUID: ") + 36; // L: 172
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", ""); // L: 173
			}
		} catch (IOException var9) { // L: 176
			var9.printStackTrace(); // L: 177
		}

		return var3; // L: 179
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;Ljava/lang/String;Ljava/lang/String;I)Lpv;",
		garbageValue = "659683137"
	)
	public static Font method8781(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) { // L: 107
			return null;
		} else {
			int var4 = var0.getGroupId(var2); // L: 108
			int var5 = var0.getFileId(var4, var3); // L: 109
			Font var6;
			if (!Varcs.method2829(var0, var4, var5)) { // L: 112
				var6 = null; // L: 113
			} else {
				var6 = class72.method2147(var1.takeFile(var4, var5)); // L: 116
			}

			return var6; // L: 118
		}
	}
}
