import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -2030368791
	)
	int field4778;
	@ObfuscatedName("bd")
	boolean field4771;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -377501257
	)
	int field4772;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1764874715
	)
	int field4789;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -571023749
	)
	int field4774;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 735267855
	)
	int field4787;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1056403691
	)
	int field4776;
	@ObfuscatedName("bh")
	boolean field4777;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1141519983
	)
	int field4775;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 971608119
	)
	int field4779;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1732961895
	)
	int field4780;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1262950683
	)
	int field4791;
	@ObfuscatedName("bz")
	String field4782;
	@ObfuscatedName("bm")
	String field4783;
	@ObfuscatedName("br")
	String field4784;
	@ObfuscatedName("bu")
	String field4785;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1942363389
	)
	int field4786;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1980385953
	)
	int field4793;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1721142979
	)
	int field4763;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -680624643
	)
	int field4770;
	@ObfuscatedName("cu")
	String field4790;
	@ObfuscatedName("ca")
	String field4788;
	@ObfuscatedName("cf")
	int[] field4781;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1787161071
	)
	int field4773;
	@ObfuscatedName("ch")
	String field4794;
	@ObfuscatedName("cp")
	String field4795;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4781 = new int[3]; // L: 62
		this.field4778 = var1; // L: 68
		this.field4771 = var2; // L: 69
		this.field4772 = var3; // L: 70
		this.field4789 = var4; // L: 71
		this.field4774 = var5; // L: 72
		this.field4787 = var6; // L: 73
		this.field4776 = var7; // L: 74
		this.field4777 = var8; // L: 75
		this.field4775 = var9; // L: 76
		this.field4779 = var10; // L: 77
		this.field4780 = var11; // L: 78
		this.field4791 = var12; // L: 79
		this.field4782 = var13; // L: 80
		this.field4783 = var14; // L: 81
		this.field4784 = var15; // L: 82
		this.field4785 = var16; // L: 83
		this.field4786 = var17; // L: 84
		this.field4793 = var18; // L: 85
		this.field4763 = var19; // L: 86
		this.field4770 = var20; // L: 87
		this.field4790 = var21; // L: 88
		this.field4788 = var22; // L: 89
		this.field4781 = var23; // L: 90
		this.field4773 = var24; // L: 91
		this.field4794 = var25; // L: 92
		this.field4795 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "559305271"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.field4778); // L: 98
		var1.writeByte(this.field4771 ? 1 : 0); // L: 99
		var1.writeShort(this.field4772); // L: 100
		var1.writeByte(this.field4789); // L: 101
		var1.writeByte(this.field4774); // L: 102
		var1.writeByte(this.field4787); // L: 103
		var1.writeByte(this.field4776); // L: 104
		var1.writeByte(this.field4777 ? 1 : 0); // L: 105
		var1.writeShort(this.field4775); // L: 106
		var1.writeByte(this.field4779); // L: 107
		var1.writeMedium(this.field4780); // L: 108
		var1.writeShort(this.field4791); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4782); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4783); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4784); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4785); // L: 113
		var1.writeByte(this.field4793); // L: 114
		var1.writeShort(this.field4786); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4790); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4788); // L: 117
		var1.writeByte(this.field4763); // L: 118
		var1.writeByte(this.field4770); // L: 119

		for (int var2 = 0; var2 < this.field4781.length; ++var2) { // L: 120
			var1.writeInt(this.field4781[var2]);
		}

		var1.writeInt(this.field4773); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4794); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4795); // L: 123
	} // L: 124

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1243632731"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + VarcInt.method3616(this.field4782); // L: 128
		var2 += VarcInt.method3616(this.field4783); // L: 129
		var2 += VarcInt.method3616(this.field4784); // L: 130
		var2 += VarcInt.method3616(this.field4785); // L: 131
		var2 += VarcInt.method3616(this.field4790); // L: 132
		var2 += VarcInt.method3616(this.field4788); // L: 133
		var2 += VarcInt.method3616(this.field4794); // L: 134
		var2 += VarcInt.method3616(this.field4795); // L: 135
		return var2; // L: 136
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	static final void method8309() {
		if (Clock.Client_plane != Client.field747) { // L: 3816
			Client.field747 = Clock.Client_plane; // L: 3817
			ItemContainer.method2239(Clock.Client_plane); // L: 3818
		}

	} // L: 3820

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-167178637"
	)
	static void method8310() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12103
			int var1 = var0.group; // L: 12104
			if (Client.loadInterface(var1)) { // L: 12105
				boolean var2 = true; // L: 12106
				Widget[] var3 = class16.Widget_interfaceComponents[var1]; // L: 12107

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12108
					if (var3[var4] != null) { // L: 12109
						var2 = var3[var4].isIf3; // L: 12110
						break;
					}
				}

				if (!var2) { // L: 12114
					var4 = (int)var0.key; // L: 12115
					Widget var5 = FriendSystem.getWidget(var4); // L: 12116
					if (var5 != null) { // L: 12117
						Messages.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12121
}
