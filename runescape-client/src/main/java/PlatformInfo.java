import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1360196685
	)
	int field3955;
	@ObfuscatedName("ag")
	boolean field3944;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -478220417
	)
	int field3957;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2073563121
	)
	int field3971;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1289812549
	)
	int field3959;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 506643985
	)
	int field3966;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1565324279
	)
	int field3961;
	@ObfuscatedName("al")
	boolean field3962;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1486256621
	)
	int field3963;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -581400105
	)
	int field3964;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2081035797
	)
	int field3965;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1584067855
	)
	int field3973;
	@ObfuscatedName("am")
	String field3958;
	@ObfuscatedName("aa")
	String field3977;
	@ObfuscatedName("ai")
	String field3969;
	@ObfuscatedName("av")
	String field3970;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2036376595
	)
	int field3946;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 141038615
	)
	int field3947;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1617164359
	)
	int field3972;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1247214845
	)
	int field3974;
	@ObfuscatedName("bx")
	String field3975;
	@ObfuscatedName("bi")
	String field3949;
	@ObfuscatedName("bz")
	int[] field3956;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1203517763
	)
	int field3978;
	@ObfuscatedName("bv")
	String field3967;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3956 = new int[3];
		this.field3955 = var1;
		this.field3944 = var2;
		this.field3957 = var3;
		this.field3971 = var4;
		this.field3959 = var5;
		this.field3966 = var6;
		this.field3961 = var7;
		this.field3962 = var8;
		this.field3963 = var9;
		this.field3964 = var10;
		this.field3965 = var11;
		this.field3973 = var12;
		this.field3958 = var13;
		this.field3977 = var14;
		this.field3969 = var15;
		this.field3970 = var16;
		this.field3946 = var17;
		this.field3947 = var18;
		this.field3972 = var19;
		this.field3974 = var20;
		this.field3975 = var21;
		this.field3949 = var22;
		this.field3956 = var23;
		this.field3978 = var24;
		this.field3967 = var25;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "406658197"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3955);
		var1.writeByte(this.field3944 ? 1 : 0);
		var1.writeShort(this.field3957);
		var1.writeByte(this.field3971);
		var1.writeByte(this.field3959);
		var1.writeByte(this.field3966);
		var1.writeByte(this.field3961);
		var1.writeByte(this.field3962 ? 1 : 0);
		var1.writeShort(this.field3963);
		var1.writeByte(this.field3964);
		var1.writeMedium(this.field3965);
		var1.writeShort(this.field3973);
		var1.writeStringCp1252NullCircumfixed(this.field3958);
		var1.writeStringCp1252NullCircumfixed(this.field3977);
		var1.writeStringCp1252NullCircumfixed(this.field3969);
		var1.writeStringCp1252NullCircumfixed(this.field3970);
		var1.writeByte(this.field3947);
		var1.writeShort(this.field3946);
		var1.writeStringCp1252NullCircumfixed(this.field3975);
		var1.writeStringCp1252NullCircumfixed(this.field3949);
		var1.writeByte(this.field3972);
		var1.writeByte(this.field3974);

		for (int var2 = 0; var2 < this.field3956.length; ++var2) {
			var1.writeInt(this.field3956[var2]);
		}

		var1.writeInt(this.field3978);
		var1.writeStringCp1252NullCircumfixed(this.field3967);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "97981657"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class32.method387(this.field3958);
		var2 += class32.method387(this.field3977);
		var2 += class32.method387(this.field3969);
		var2 += class32.method387(this.field3970);
		var2 += class32.method387(this.field3975);
		var2 += class32.method387(this.field3949);
		var2 += class32.method387(this.field3967);
		return var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "104"
	)
	public static byte[] method6115() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}
}
