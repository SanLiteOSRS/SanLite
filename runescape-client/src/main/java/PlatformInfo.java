import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1020471777
	)
	int field3978;
	@ObfuscatedName("aw")
	boolean field3974;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1427969131
	)
	int field3960;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -257458079
	)
	int field3969;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1624069527
	)
	int field3961;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1468711737
	)
	int field3963;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -527267229
	)
	int field3964;
	@ObfuscatedName("ao")
	boolean field3965;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1760079217
	)
	int field3966;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -623871219
	)
	int field3971;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1977981671
	)
	int field3968;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1215936229
	)
	int field3982;
	@ObfuscatedName("aa")
	String field3977;
	@ObfuscatedName("al")
	String field3967;
	@ObfuscatedName("ar")
	String field3972;
	@ObfuscatedName("ak")
	String field3973;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1699686401
	)
	int field3970;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1455599319
	)
	int field3975;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1261873211
	)
	int field3976;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 321508639
	)
	int field3956;
	@ObfuscatedName("br")
	String field3950;
	@ObfuscatedName("bn")
	String field3979;
	@ObfuscatedName("bi")
	int[] field3980;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1522227319
	)
	int field3981;
	@ObfuscatedName("bk")
	String field3952;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3980 = new int[3];
		this.field3978 = var1;
		this.field3974 = var2;
		this.field3960 = var3;
		this.field3969 = var4;
		this.field3961 = var5;
		this.field3963 = var6;
		this.field3964 = var7;
		this.field3965 = var8;
		this.field3966 = var9;
		this.field3971 = var10;
		this.field3968 = var11;
		this.field3982 = var12;
		this.field3977 = var13;
		this.field3967 = var14;
		this.field3972 = var15;
		this.field3973 = var16;
		this.field3970 = var17;
		this.field3975 = var18;
		this.field3976 = var19;
		this.field3956 = var20;
		this.field3950 = var21;
		this.field3979 = var22;
		this.field3980 = var23;
		this.field3981 = var24;
		this.field3952 = var25;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "506631790"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3978);
		var1.writeByte(this.field3974 ? 1 : 0);
		var1.writeShort(this.field3960);
		var1.writeByte(this.field3969);
		var1.writeByte(this.field3961);
		var1.writeByte(this.field3963);
		var1.writeByte(this.field3964);
		var1.writeByte(this.field3965 ? 1 : 0);
		var1.writeShort(this.field3966);
		var1.writeByte(this.field3971);
		var1.writeMedium(this.field3968);
		var1.writeShort(this.field3982);
		var1.writeStringCp1252NullCircumfixed(this.field3977);
		var1.writeStringCp1252NullCircumfixed(this.field3967);
		var1.writeStringCp1252NullCircumfixed(this.field3972);
		var1.writeStringCp1252NullCircumfixed(this.field3973);
		var1.writeByte(this.field3975);
		var1.writeShort(this.field3970);
		var1.writeStringCp1252NullCircumfixed(this.field3950);
		var1.writeStringCp1252NullCircumfixed(this.field3979);
		var1.writeByte(this.field3976);
		var1.writeByte(this.field3956);

		for (int var2 = 0; var2 < this.field3980.length; ++var2) {
			var1.writeInt(this.field3980[var2]);
		}

		var1.writeInt(this.field3981);
		var1.writeStringCp1252NullCircumfixed(this.field3952);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "2100625862"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + UrlRequester.method2388(this.field3977);
		var2 += UrlRequester.method2388(this.field3967);
		var2 += UrlRequester.method2388(this.field3972);
		var2 += UrlRequester.method2388(this.field3973);
		var2 += UrlRequester.method2388(this.field3950);
		var2 += UrlRequester.method2388(this.field3979);
		var2 += UrlRequester.method2388(this.field3952);
		return var2;
	}
}
