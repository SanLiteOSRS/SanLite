import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 225638553
	)
	int field3964;
	@ObfuscatedName("al")
	boolean field3965;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -370023237
	)
	int field3966;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1543630699
	)
	int field3967;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1684646587
	)
	int field3962;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1100339875
	)
	int field3969;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1933828239
	)
	int field3975;
	@ObfuscatedName("ai")
	boolean field3971;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 596740761
	)
	int field3982;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -503242177
	)
	int field3983;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 663108825
	)
	int field3968;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 464711431
	)
	int field3976;
	@ObfuscatedName("az")
	String field3977;
	@ObfuscatedName("aq")
	String field3978;
	@ObfuscatedName("ab")
	String field3979;
	@ObfuscatedName("ar")
	String field3984;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2062627009
	)
	int field3981;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 425785549
	)
	int field3973;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2012520725
	)
	int field3986;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1740741469
	)
	int field3959;
	@ObfuscatedName("bw")
	String field3974;
	@ObfuscatedName("bf")
	String field3985;
	@ObfuscatedName("bu")
	int[] field3987;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1599832113
	)
	int field3988;
	@ObfuscatedName("bk")
	String field3989;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3987 = new int[3];
		this.field3964 = var1;
		this.field3965 = var2;
		this.field3966 = var3;
		this.field3967 = var4;
		this.field3962 = var5;
		this.field3969 = var6;
		this.field3975 = var7;
		this.field3971 = var8;
		this.field3982 = var9;
		this.field3983 = var10;
		this.field3968 = var11;
		this.field3976 = var12;
		this.field3977 = var13;
		this.field3978 = var14;
		this.field3979 = var15;
		this.field3984 = var16;
		this.field3981 = var17;
		this.field3973 = var18;
		this.field3986 = var19;
		this.field3959 = var20;
		this.field3974 = var21;
		this.field3985 = var22;
		this.field3987 = var23;
		this.field3988 = var24;
		this.field3989 = var25;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-1736449577"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3964);
		var1.writeByte(this.field3965 ? 1 : 0);
		var1.writeShort(this.field3966);
		var1.writeByte(this.field3967);
		var1.writeByte(this.field3962);
		var1.writeByte(this.field3969);
		var1.writeByte(this.field3975);
		var1.writeByte(this.field3971 ? 1 : 0);
		var1.writeShort(this.field3982);
		var1.writeByte(this.field3983);
		var1.writeMedium(this.field3968);
		var1.writeShort(this.field3976);
		var1.writeStringCp1252NullCircumfixed(this.field3977);
		var1.writeStringCp1252NullCircumfixed(this.field3978);
		var1.writeStringCp1252NullCircumfixed(this.field3979);
		var1.writeStringCp1252NullCircumfixed(this.field3984);
		var1.writeByte(this.field3973);
		var1.writeShort(this.field3981);
		var1.writeStringCp1252NullCircumfixed(this.field3974);
		var1.writeStringCp1252NullCircumfixed(this.field3985);
		var1.writeByte(this.field3986);
		var1.writeByte(this.field3959);

		for (int var2 = 0; var2 < this.field3987.length; ++var2) {
			var1.writeInt(this.field3987[var2]);
		}

		var1.writeInt(this.field3988);
		var1.writeStringCp1252NullCircumfixed(this.field3989);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1618063694"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field3977;
		int var3 = var4.length() + 2;
		int var23 = var3 + var1;
		String var7 = this.field3978;
		int var6 = var7.length() + 2;
		var23 += var6;
		String var10 = this.field3979;
		int var9 = var10.length() + 2;
		var23 += var9;
		String var13 = this.field3984;
		int var12 = var13.length() + 2;
		var23 += var12;
		String var16 = this.field3974;
		int var15 = var16.length() + 2;
		var23 += var15;
		String var19 = this.field3985;
		int var18 = var19.length() + 2;
		var23 += var18;
		String var22 = this.field3989;
		int var21 = var22.length() + 2;
		var23 += var21;
		return var23;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lbc;B)V",
		garbageValue = "3"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			KeyHandler.method451(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = class43.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				FontName.logoSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		class26.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class69.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class24.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		BoundaryObject.currentPort = class69.worldPort;
	}
}
