import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 835329369
	)
	int field4796;
	@ObfuscatedName("bo")
	boolean field4776;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 177400385
	)
	int field4775;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2010600163
	)
	int field4778;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -44712611
	)
	int field4792;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1516030387
	)
	int field4787;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -834764925
	)
	int field4781;
	@ObfuscatedName("bz")
	boolean field4782;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 716305295
	)
	int field4783;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1523165285
	)
	int field4799;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1377960795
	)
	int field4785;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -542380237
	)
	int field4786;
	@ObfuscatedName("bx")
	String field4795;
	@ObfuscatedName("by")
	String field4788;
	@ObfuscatedName("bd")
	String field4789;
	@ObfuscatedName("bn")
	String field4777;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1894544209
	)
	int field4791;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -161070107
	)
	int field4793;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 935864139
	)
	int field4768;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 113321729
	)
	int field4794;
	@ObfuscatedName("cg")
	String field4790;
	@ObfuscatedName("cr")
	String field4798;
	@ObfuscatedName("ce")
	int[] field4797;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -156564641
	)
	int field4779;
	@ObfuscatedName("cd")
	String field4784;
	@ObfuscatedName("cz")
	String field4800;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4797 = new int[3]; // L: 62
		this.field4796 = var1; // L: 68
		this.field4776 = var2; // L: 69
		this.field4775 = var3; // L: 70
		this.field4778 = var4; // L: 71
		this.field4792 = var5; // L: 72
		this.field4787 = var6; // L: 73
		this.field4781 = var7; // L: 74
		this.field4782 = var8; // L: 75
		this.field4783 = var9; // L: 76
		this.field4799 = var10; // L: 77
		this.field4785 = var11; // L: 78
		this.field4786 = var12; // L: 79
		this.field4795 = var13; // L: 80
		this.field4788 = var14; // L: 81
		this.field4789 = var15; // L: 82
		this.field4777 = var16; // L: 83
		this.field4791 = var17; // L: 84
		this.field4793 = var18; // L: 85
		this.field4768 = var19; // L: 86
		this.field4794 = var20; // L: 87
		this.field4790 = var21; // L: 88
		this.field4798 = var22; // L: 89
		this.field4797 = var23; // L: 90
		this.field4779 = var24; // L: 91
		this.field4784 = var25; // L: 92
		this.field4800 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-831549793"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4796); // L: 98
		var1.writeByte(this.field4776 ? 1 : 0); // L: 99
		var1.writeShort(this.field4775); // L: 100
		var1.writeByte(this.field4778); // L: 101
		var1.writeByte(this.field4792); // L: 102
		var1.writeByte(this.field4787); // L: 103
		var1.writeByte(this.field4781); // L: 104
		var1.writeByte(this.field4782 ? 1 : 0); // L: 105
		var1.writeShort(this.field4783); // L: 106
		var1.writeByte(this.field4799); // L: 107
		var1.writeMedium(this.field4785); // L: 108
		var1.writeShort(this.field4786); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4795); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4788); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4789); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4777); // L: 113
		var1.writeByte(this.field4793); // L: 114
		var1.writeShort(this.field4791); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4790); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4798); // L: 117
		var1.writeByte(this.field4768); // L: 118
		var1.writeByte(this.field4794); // L: 119

		for (int var2 = 0; var2 < this.field4797.length; ++var2) { // L: 120
			var1.writeIntME(this.field4797[var2]);
		}

		var1.writeIntME(this.field4779); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4784); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4800); // L: 123
	} // L: 124

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1372011703"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		String var4 = this.field4795; // L: 130
		int var3 = var4.length() + 2; // L: 132
		int var17 = var3 + var1; // L: 134
		String var7 = this.field4788; // L: 137
		int var6 = var7.length() + 2; // L: 139
		var17 += var6; // L: 141
		String var10 = this.field4789; // L: 144
		int var9 = var10.length() + 2; // L: 146
		var17 += var9; // L: 148
		String var13 = this.field4777; // L: 151
		int var12 = var13.length() + 2; // L: 153
		var17 += var12; // L: 155
		String var16 = this.field4790; // L: 158
		int var15 = var16.length() + 2; // L: 160
		var17 += var15; // L: 162
		var17 += class104.method2655(this.field4798); // L: 163
		var17 += class104.method2655(this.field4784); // L: 164
		var17 += class104.method2655(this.field4800); // L: 165
		return var17; // L: 166
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2035496253"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12370

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12371
			var1.clearIsFromIgnored(); // L: 12373
		}

		if (BZip2State.friendsChatManager != null) { // L: 12377
			BZip2State.friendsChatManager.invalidateIgnoreds(); // L: 12378
		}

	} // L: 12380
}
