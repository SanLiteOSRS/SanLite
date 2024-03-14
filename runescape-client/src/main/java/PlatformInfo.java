import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 180468389
	)
	public int field4959;
	@ObfuscatedName("bk")
	boolean field4936;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1525358399
	)
	int field4944;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -382850923
	)
	int field4938;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -561302681
	)
	int field4939;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1703628029
	)
	int field4940;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -5008815
	)
	int field4937;
	@ObfuscatedName("bn")
	boolean field4951;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 293556831
	)
	int field4948;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1434028233
	)
	int field4949;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -978084925
	)
	int field4942;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -512283169
	)
	int field4946;
	@ObfuscatedName("bc")
	String field4947;
	@ObfuscatedName("bz")
	String field4952;
	@ObfuscatedName("bh")
	String field4931;
	@ObfuscatedName("bs")
	String field4950;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 482849939
	)
	int field4956;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1971283421
	)
	int field4929;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1206311181
	)
	int field4953;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1980466983
	)
	int field4954;
	@ObfuscatedName("ch")
	String field4955;
	@ObfuscatedName("co")
	String field4927;
	@ObfuscatedName("cd")
	int[] field4957;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -2016058655
	)
	int field4958;
	@ObfuscatedName("cn")
	String field4943;
	@ObfuscatedName("cz")
	String field4960;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field4957 = new int[3]; // L: 65
		this.field4959 = var1; // L: 72
		this.field4936 = var2; // L: 73
		this.field4944 = var3; // L: 74
		this.field4938 = var4; // L: 75
		this.field4939 = var5; // L: 76
		this.field4940 = var6; // L: 77
		this.field4937 = var7; // L: 78
		this.field4951 = var8; // L: 79
		this.field4948 = var9; // L: 80
		this.field4949 = var10; // L: 81
		this.field4942 = var11; // L: 82
		this.field4946 = var12; // L: 83
		this.field4947 = var13; // L: 84
		this.field4952 = var14; // L: 85
		this.field4931 = var15; // L: 86
		this.field4950 = var16; // L: 87
		this.field4956 = var17; // L: 88
		this.field4929 = var18; // L: 89
		this.field4953 = var19; // L: 90
		this.field4954 = var20; // L: 91
		this.field4955 = var21; // L: 92
		this.field4927 = var22; // L: 93
		this.field4957 = var23; // L: 94
		this.field4958 = var24; // L: 95
		this.field4943 = var25; // L: 96
		this.field4960 = var26; // L: 97
	} // L: 98

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1274102943"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 101
		var1.writeByte(this.field4959); // L: 102
		var1.writeByte(this.field4936 ? 1 : 0); // L: 103
		var1.writeShort(this.field4944); // L: 104
		var1.writeByte(this.field4938); // L: 105
		var1.writeByte(this.field4939); // L: 106
		var1.writeByte(this.field4940); // L: 107
		var1.writeByte(this.field4937); // L: 108
		var1.writeByte(this.field4951 ? 1 : 0); // L: 109
		var1.writeShort(this.field4948); // L: 110
		var1.writeByte(this.field4949); // L: 111
		var1.writeMedium(this.field4942); // L: 112
		var1.writeShort(this.field4946); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4947); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4952); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4931); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4950); // L: 117
		var1.writeByte(this.field4929); // L: 118
		var1.writeShort(this.field4956); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4955); // L: 120
		var1.writeStringCp1252NullCircumfixed(this.field4927); // L: 121
		var1.writeByte(this.field4953); // L: 122
		var1.writeByte(this.field4954); // L: 123

		for (int var2 = 0; var2 < this.field4957.length; ++var2) { // L: 124
			var1.writeInt(this.field4957[var2]);
		}

		var1.writeInt(this.field4958); // L: 125
		var1.writeStringCp1252NullCircumfixed(this.field4943); // L: 126
		var1.writeStringCp1252NullCircumfixed(this.field4960); // L: 127
	} // L: 128

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "930770389"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 131
		int var2 = var1 + class174.method3546(this.field4947); // L: 132
		var2 += class174.method3546(this.field4952); // L: 133
		var2 += class174.method3546(this.field4931); // L: 134
		var2 += class174.method3546(this.field4950); // L: 135
		var2 += class174.method3546(this.field4955); // L: 136
		var2 += class174.method3546(this.field4927); // L: 137
		var2 += class174.method3546(this.field4943); // L: 138
		var2 += class174.method3546(this.field4960); // L: 139
		return var2; // L: 140
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-525384882"
	)
	public String method8836(int var1) {
		String var2 = ""; // L: 144
		String var3 = ""; // L: 145
		switch(var1) { // L: 146
		case 1:
			var2 = "wmic csproduct get UUID"; // L: 149
			break; // L: 150
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'"; // L: 154
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
}
