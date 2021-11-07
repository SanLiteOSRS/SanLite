import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -855312751
	)
	int field4092;
	@ObfuscatedName("as")
	boolean field4091;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 934385817
	)
	int field4093;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -841511077
	)
	int field4095;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -88776347
	)
	int field4096;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1463853317
	)
	int field4094;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 117450165
	)
	int field4103;
	@ObfuscatedName("ar")
	boolean field4086;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 330580727
	)
	int field4100;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -376982197
	)
	int field4101;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 922950559
	)
	int field4102;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1991963229
	)
	int field4104;
	@ObfuscatedName("au")
	String field4098;
	@ObfuscatedName("aj")
	String field4099;
	@ObfuscatedName("af")
	String field4106;
	@ObfuscatedName("aw")
	String field4107;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1913673055
	)
	int field4108;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1121209561
	)
	int field4109;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -64925851
	)
	int field4112;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 933896169
	)
	int field4111;
	@ObfuscatedName("bl")
	String field4105;
	@ObfuscatedName("bx")
	String field4113;
	@ObfuscatedName("bd")
	int[] field4114;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -194577267
	)
	int field4115;
	@ObfuscatedName("bf")
	String field4116;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4114 = new int[3];
		this.field4092 = var1;
		this.field4091 = var2;
		this.field4093 = var3;
		this.field4095 = var4;
		this.field4096 = var5;
		this.field4094 = var6;
		this.field4103 = var7;
		this.field4086 = var8;
		this.field4100 = var9;
		this.field4101 = var10;
		this.field4102 = var11;
		this.field4104 = var12;
		this.field4098 = var13;
		this.field4099 = var14;
		this.field4106 = var15;
		this.field4107 = var16;
		this.field4108 = var17;
		this.field4109 = var18;
		this.field4112 = var19;
		this.field4111 = var20;
		this.field4105 = var21;
		this.field4113 = var22;
		this.field4114 = var23;
		this.field4115 = var24;
		this.field4116 = var25;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "1363785145"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4092);
		var1.writeByte(this.field4091 ? 1 : 0);
		var1.writeShort(this.field4093);
		var1.writeByte(this.field4095);
		var1.writeByte(this.field4096);
		var1.writeByte(this.field4094);
		var1.writeByte(this.field4103);
		var1.writeByte(this.field4086 ? 1 : 0);
		var1.writeShort(this.field4100);
		var1.writeByte(this.field4101);
		var1.writeMedium(this.field4102);
		var1.writeShort(this.field4104);
		var1.writeStringCp1252NullCircumfixed(this.field4098);
		var1.writeStringCp1252NullCircumfixed(this.field4099);
		var1.writeStringCp1252NullCircumfixed(this.field4106);
		var1.writeStringCp1252NullCircumfixed(this.field4107);
		var1.writeByte(this.field4109);
		var1.writeShort(this.field4108);
		var1.writeStringCp1252NullCircumfixed(this.field4105);
		var1.writeStringCp1252NullCircumfixed(this.field4113);
		var1.writeByte(this.field4112);
		var1.writeByte(this.field4111);

		for (int var2 = 0; var2 < this.field4114.length; ++var2) {
			var1.writeInt(this.field4114[var2]);
		}

		var1.writeInt(this.field4115);
		var1.writeStringCp1252NullCircumfixed(this.field4116);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1151210729"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4098;
		int var3 = var4.length() + 2;
		int var23 = var1 + var3;
		String var7 = this.field4099;
		int var6 = var7.length() + 2;
		var23 += var6;
		String var10 = this.field4106;
		int var9 = var10.length() + 2;
		var23 += var9;
		String var13 = this.field4107;
		int var12 = var13.length() + 2;
		var23 += var12;
		String var16 = this.field4105;
		int var15 = var16.length() + 2;
		var23 += var15;
		String var19 = this.field4113;
		int var18 = var19.length() + 2;
		var23 += var18;
		String var22 = this.field4116;
		int var21 = var22.length() + 2;
		var23 += var21;
		return var23;
	}
}
