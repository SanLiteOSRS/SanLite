import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1632669579
	)
	static int field1437;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;B)I",
		garbageValue = "-4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;I)V",
		garbageValue = "-2028269623"
	)
	public static void method2876(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 29
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 30
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 31
	} // L: 32

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "79027296"
	)
	static final void method2877() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 100
			int var0 = Scene.Scene_cameraPitchSine; // L: 101
			int var1 = Scene.Scene_cameraPitchCosine; // L: 102
			int var2 = Scene.Scene_cameraYawSine; // L: 103
			int var3 = Scene.Scene_cameraYawCosine; // L: 104
			byte var4 = 50; // L: 105
			short var5 = 3500; // L: 106
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4375()) * var4 / Rasterizer3D.method4374(); // L: 107
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4376()) * var4 / Rasterizer3D.method4374(); // L: 108
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4375()) * var5 / Rasterizer3D.method4374(); // L: 109
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4376()) * var5 / Rasterizer3D.method4374(); // L: 110
			int var10 = JagexCache.method3498(var7, var4, var1, var0); // L: 112
			int var11 = var1 * var4 - var0 * var7 >> 16; // L: 115
			var7 = var10; // L: 118
			var10 = JagexCache.method3498(var9, var5, var1, var0); // L: 119
			int var12 = var1 * var5 - var9 * var0 >> 16; // L: 122
			var9 = var10; // L: 125
			var10 = class164.method3368(var6, var11, var3, var2); // L: 126
			int var13 = ClientPreferences.method2435(var6, var11, var3, var2); // L: 127
			var6 = var10; // L: 128
			var10 = class164.method3368(var8, var12, var3, var2); // L: 129
			int var14 = ClientPreferences.method2435(var8, var12, var3, var2); // L: 130
			class177.field1853 = (var6 + var10) / 2; // L: 132
			ViewportMouse.field2766 = (var9 + var7) / 2; // L: 133
			ViewportMouse.field2767 = (var13 + var14) / 2; // L: 134
			ViewportMouse.field2762 = (var10 - var6) / 2; // L: 135
			class1.field4 = (var9 - var7) / 2; // L: 136
			VarpDefinition.field1905 = (var14 - var13) / 2; // L: 137
			class393.field4436 = Math.abs(ViewportMouse.field2762); // L: 138
			class337.field3782 = Math.abs(class1.field4); // L: 139
			class136.field1585 = Math.abs(VarpDefinition.field1905); // L: 140
		}
	} // L: 141

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)Z",
		garbageValue = "-215765606"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12631
	}
}
