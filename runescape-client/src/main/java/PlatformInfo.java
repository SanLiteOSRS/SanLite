import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1829594595
	)
	int field4495;
	@ObfuscatedName("al")
	boolean field4496;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1190689719
	)
	int field4509;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 20581817
	)
	int field4498;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 448571837
	)
	int field4521;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2094209953
	)
	int field4500;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 576772987
	)
	int field4502;
	@ObfuscatedName("at")
	boolean field4494;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -411038485
	)
	int field4503;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1620105907
	)
	int field4512;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1817578949
	)
	int field4505;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1465280651
	)
	int field4497;
	@ObfuscatedName("ae")
	String field4507;
	@ObfuscatedName("ay")
	String field4508;
	@ObfuscatedName("ak")
	String field4516;
	@ObfuscatedName("ao")
	String field4510;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2085430325
	)
	int field4518;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 547885147
	)
	int field4504;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1655451941
	)
	int field4513;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -451142221
	)
	int field4514;
	@ObfuscatedName("bs")
	String field4515;
	@ObfuscatedName("bg")
	String field4501;
	@ObfuscatedName("bv")
	int[] field4517;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 190975605
	)
	int field4511;
	@ObfuscatedName("bd")
	String field4485;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4517 = new int[3]; // L: 62
		this.field4495 = var1; // L: 67
		this.field4496 = var2; // L: 68
		this.field4509 = var3; // L: 69
		this.field4498 = var4; // L: 70
		this.field4521 = var5; // L: 71
		this.field4500 = var6; // L: 72
		this.field4502 = var7; // L: 73
		this.field4494 = var8; // L: 74
		this.field4503 = var9; // L: 75
		this.field4512 = var10; // L: 76
		this.field4505 = var11; // L: 77
		this.field4497 = var12; // L: 78
		this.field4507 = var13; // L: 79
		this.field4508 = var14; // L: 80
		this.field4516 = var15; // L: 81
		this.field4510 = var16; // L: 82
		this.field4518 = var17; // L: 83
		this.field4504 = var18; // L: 84
		this.field4513 = var19; // L: 85
		this.field4514 = var20; // L: 86
		this.field4515 = var21; // L: 87
		this.field4501 = var22; // L: 88
		this.field4517 = var23; // L: 89
		this.field4511 = var24; // L: 90
		this.field4485 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "-70"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field4495); // L: 96
		var1.writeByte(this.field4496 ? 1 : 0); // L: 97
		var1.writeShort(this.field4509); // L: 98
		var1.writeByte(this.field4498); // L: 99
		var1.writeByte(this.field4521); // L: 100
		var1.writeByte(this.field4500); // L: 101
		var1.writeByte(this.field4502); // L: 102
		var1.writeByte(this.field4494 ? 1 : 0); // L: 103
		var1.writeShort(this.field4503); // L: 104
		var1.writeByte(this.field4512); // L: 105
		var1.writeMedium(this.field4505); // L: 106
		var1.writeShort(this.field4497); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4507); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4508); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4516); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4510); // L: 111
		var1.writeByte(this.field4504); // L: 112
		var1.writeShort(this.field4518); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4515); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4501); // L: 115
		var1.writeByte(this.field4513); // L: 116
		var1.writeByte(this.field4514); // L: 117

		for (int var2 = 0; var2 < this.field4517.length; ++var2) { // L: 118
			var1.writeInt(this.field4517[var2]);
		}

		var1.writeInt(this.field4511); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4485); // L: 120
	} // L: 121

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-927828161"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		int var2 = var1 + class150.method3143(this.field4507); // L: 125
		var2 += class150.method3143(this.field4508); // L: 126
		var2 += class150.method3143(this.field4516); // L: 127
		var2 += class150.method3143(this.field4510); // L: 128
		var2 += class150.method3143(this.field4515); // L: 129
		var2 += class150.method3143(this.field4501); // L: 130
		var2 += class150.method3143(this.field4485); // L: 131
		return var2; // L: 132
	}
}
