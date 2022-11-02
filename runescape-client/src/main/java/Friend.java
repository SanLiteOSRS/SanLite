import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("a")
	boolean field4472;
	@ObfuscatedName("f")
	boolean field4473;

	Friend() {
	} // L: 9

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)I",
		garbageValue = "-1267649444"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4472 && !var1.field4472) { // L: 16
			return -1;
		} else if (!this.field4472 && var1.field4472) { // L: 17
			return 1;
		} else if (this.field4473 && !var1.field4473) { // L: 18
			return -1;
		} else if (!this.field4473 && var1.field4473) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 24
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)I",
		garbageValue = "-1675254672"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "-1139134966"
	)
	public static void method7303(AbstractArchive var0) {
		class458.field4848 = var0; // L: 20
	} // L: 21

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "34320253"
	)
	static final void method7293(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10792
		int var7 = var3 - var1; // L: 10793
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10794
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10795
		int var10 = var8; // L: 10796
		if (var8 < var9) { // L: 10797
			var10 = var9;
		}

		if (var10 != 0) { // L: 10798
			int var11 = (var6 << 16) / var10; // L: 10799
			int var12 = (var7 << 16) / var10; // L: 10800
			if (var12 <= var11) { // L: 10801
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10802
			}

			int var13 = var5 * var12 >> 17; // L: 10803
			int var14 = var5 * var12 + 1 >> 17; // L: 10804
			int var15 = var5 * var11 >> 17; // L: 10805
			int var16 = var5 * var11 + 1 >> 17; // L: 10806
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10807
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10808
			int var17 = var0 + var13; // L: 10809
			int var18 = var0 - var14; // L: 10810
			int var19 = var0 + var6 - var14; // L: 10811
			int var20 = var0 + var6 + var13; // L: 10812
			int var21 = var15 + var1; // L: 10813
			int var22 = var1 - var16; // L: 10814
			int var23 = var7 + var1 - var16; // L: 10815
			int var24 = var15 + var7 + var1; // L: 10816
			Rasterizer3D.method4233(var17, var18, var19); // L: 10817
			Rasterizer3D.method4220(var21, var22, var23, var17, var18, var19, var4); // L: 10818
			Rasterizer3D.method4233(var17, var19, var20); // L: 10819
			Rasterizer3D.method4220(var21, var23, var24, var17, var19, var20, var4); // L: 10820
		}
	} // L: 10821
}
