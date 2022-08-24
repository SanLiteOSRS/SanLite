import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1504444763
	)
	int field4509;
	@ObfuscatedName("au")
	boolean field4508;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 445223555
	)
	int field4491;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -233505363
	)
	int field4488;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -199706051
	)
	int field4489;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2076327411
	)
	int field4490;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -610401671
	)
	int field4478;
	@ObfuscatedName("af")
	boolean field4486;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -822666267
	)
	int field4493;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 828949577
	)
	int field4494;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 414932851
	)
	int field4495;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1216080859
	)
	int field4496;
	@ObfuscatedName("ah")
	String field4497;
	@ObfuscatedName("aa")
	String field4498;
	@ObfuscatedName("am")
	String field4499;
	@ObfuscatedName("ao")
	String field4500;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 891233991
	)
	int field4483;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -736208085
	)
	int field4501;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 433011061
	)
	int field4503;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -204682335
	)
	int field4504;
	@ObfuscatedName("bn")
	String field4505;
	@ObfuscatedName("bl")
	String field4506;
	@ObfuscatedName("bv")
	int[] field4507;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1067289661
	)
	int field4487;
	@ObfuscatedName("bb")
	String field4492;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4507 = new int[3]; // L: 62
		this.field4509 = var1; // L: 67
		this.field4508 = var2; // L: 68
		this.field4491 = var3; // L: 69
		this.field4488 = var4; // L: 70
		this.field4489 = var5; // L: 71
		this.field4490 = var6; // L: 72
		this.field4478 = var7; // L: 73
		this.field4486 = var8; // L: 74
		this.field4493 = var9; // L: 75
		this.field4494 = var10; // L: 76
		this.field4495 = var11; // L: 77
		this.field4496 = var12; // L: 78
		this.field4497 = var13; // L: 79
		this.field4498 = var14; // L: 80
		this.field4499 = var15; // L: 81
		this.field4500 = var16; // L: 82
		this.field4483 = var17; // L: 83
		this.field4501 = var18; // L: 84
		this.field4503 = var19; // L: 85
		this.field4504 = var20; // L: 86
		this.field4505 = var21; // L: 87
		this.field4506 = var22; // L: 88
		this.field4507 = var23; // L: 89
		this.field4487 = var24; // L: 90
		this.field4492 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-121"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field4509); // L: 96
		var1.writeByte(this.field4508 ? 1 : 0); // L: 97
		var1.writeShort(this.field4491); // L: 98
		var1.writeByte(this.field4488); // L: 99
		var1.writeByte(this.field4489); // L: 100
		var1.writeByte(this.field4490); // L: 101
		var1.writeByte(this.field4478); // L: 102
		var1.writeByte(this.field4486 ? 1 : 0); // L: 103
		var1.writeShort(this.field4493); // L: 104
		var1.writeByte(this.field4494); // L: 105
		var1.writeMedium(this.field4495); // L: 106
		var1.writeShort(this.field4496); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4497); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4498); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4499); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4500); // L: 111
		var1.writeByte(this.field4501); // L: 112
		var1.writeShort(this.field4483); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4505);
		var1.writeStringCp1252NullCircumfixed(this.field4506);
		var1.writeByte(this.field4503);
		var1.writeByte(this.field4504);

		for (int var2 = 0; var2 < this.field4507.length; ++var2) {
			var1.writeInt(this.field4507[var2]);
		}

		var1.writeInt(this.field4487);
		var1.writeStringCp1252NullCircumfixed(this.field4492);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-992171392"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class145.method3015(this.field4497); // L: 125
		var2 += class145.method3015(this.field4498);
		var2 += class145.method3015(this.field4499); // L: 127
		var2 += class145.method3015(this.field4500); // L: 128
		var2 += class145.method3015(this.field4505); // L: 129
		var2 += class145.method3015(this.field4506); // L: 130
		var2 += class145.method3015(this.field4492); // L: 131
		return var2; // L: 132
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1568227992"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 114
		int var4 = 0; // L: 115

		for (int var5 = 0; var5 < var2; ++var5) { // L: 116
			int var6 = var0[var5 + var1] & 255; // L: 117
			if (var6 != 0) { // L: 118
				if (var6 >= 128 && var6 < 160) { // L: 119
					char var7 = class341.cp1252AsciiExtension[var6 - 128]; // L: 120
					if (var7 == 0) { // L: 121
						var7 = '?';
					}

					var6 = var7; // L: 122
				}

				var3[var4++] = (char)var6; // L: 124
			}
		}

		return new String(var3, 0, var4); // L: 126
	}
}
