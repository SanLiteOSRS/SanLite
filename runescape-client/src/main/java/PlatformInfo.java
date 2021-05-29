import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1738879851
	)
	int field3962;
	@ObfuscatedName("ag")
	boolean field3960;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -841564613
	)
	int field3972;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1817348859
	)
	int field3965;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -664826965
	)
	int field3963;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 743323425
	)
	int field3977;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1340740659
	)
	int field3967;
	@ObfuscatedName("av")
	boolean field3966;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -862865125
	)
	int field3961;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -669385777
	)
	int field3981;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1636879871
	)
	int field3948;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -741619897
	)
	int field3970;
	@ObfuscatedName("aw")
	String field3971;
	@ObfuscatedName("af")
	String field3982;
	@ObfuscatedName("ak")
	String field3973;
	@ObfuscatedName("ay")
	String field3976;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 945045113
	)
	int field3975;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 611587281
	)
	int field3974;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 942702701
	)
	int field3956;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2113690795
	)
	int field3978;
	@ObfuscatedName("bt")
	String field3979;
	@ObfuscatedName("bq")
	String field3980;
	@ObfuscatedName("bu")
	int[] field3964;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1352170779
	)
	int field3983;
	@ObfuscatedName("bv")
	String field3952;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3964 = new int[3];
		this.field3962 = var1;
		this.field3960 = var2;
		this.field3972 = var3;
		this.field3965 = var4;
		this.field3963 = var5;
		this.field3977 = var6;
		this.field3967 = var7;
		this.field3966 = var8;
		this.field3961 = var9;
		this.field3981 = var10;
		this.field3948 = var11;
		this.field3970 = var12;
		this.field3971 = var13;
		this.field3982 = var14;
		this.field3973 = var15;
		this.field3976 = var16;
		this.field3975 = var17;
		this.field3974 = var18;
		this.field3956 = var19;
		this.field3978 = var20;
		this.field3979 = var21;
		this.field3980 = var22;
		this.field3964 = var23;
		this.field3983 = var24;
		this.field3952 = var25;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-57324099"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3962);
		var1.writeByte(this.field3960 ? 1 : 0);
		var1.writeShort(this.field3972);
		var1.writeByte(this.field3965);
		var1.writeByte(this.field3963);
		var1.writeByte(this.field3977);
		var1.writeByte(this.field3967);
		var1.writeByte(this.field3966 ? 1 : 0);
		var1.writeShort(this.field3961);
		var1.writeByte(this.field3981);
		var1.writeMedium(this.field3948);
		var1.writeShort(this.field3970);
		var1.writeStringCp1252NullCircumfixed(this.field3971);
		var1.writeStringCp1252NullCircumfixed(this.field3982);
		var1.writeStringCp1252NullCircumfixed(this.field3973);
		var1.writeStringCp1252NullCircumfixed(this.field3976);
		var1.writeByte(this.field3974);
		var1.writeShort(this.field3975);
		var1.writeStringCp1252NullCircumfixed(this.field3979);
		var1.writeStringCp1252NullCircumfixed(this.field3980);
		var1.writeByte(this.field3956);
		var1.writeByte(this.field3978);

		for (int var2 = 0; var2 < this.field3964.length; ++var2) {
			var1.writeInt(this.field3964[var2]);
		}

		var1.writeInt(this.field3983);
		var1.writeStringCp1252NullCircumfixed(this.field3952);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1999982360"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + BufferedFile.method6418(this.field3971);
		var2 += BufferedFile.method6418(this.field3982);
		var2 += BufferedFile.method6418(this.field3973);
		var2 += BufferedFile.method6418(this.field3976);
		var2 += BufferedFile.method6418(this.field3979);
		var2 += BufferedFile.method6418(this.field3980);
		var2 += BufferedFile.method6418(this.field3952);
		return var2;
	}
}
