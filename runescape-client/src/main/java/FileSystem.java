import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("v")
	@Export("FileSystem_hasPermissions")
	public static boolean FileSystem_hasPermissions;
	@ObfuscatedName("n")
	@Export("FileSystem_cacheDir")
	public static File FileSystem_cacheDir;
	@ObfuscatedName("f")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383441651"
	)
	public static void method2548() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-26460885"
	)
	static final void method2545() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom;
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom;
			int var10 = Rasterizer3D.method3867(var7, var4, var1, var0);
			int var11 = Rasterizer3D.method3897(var7, var4, var1, var0);
			var7 = var10;
			var10 = Rasterizer3D.method3867(var9, var5, var1, var0);
			int var12 = Rasterizer3D.method3897(var9, var5, var1, var0);
			var9 = var10;
			var10 = Rasterizer3D.method3865(var6, var11, var3, var2);
			var11 = Rasterizer3D.method3866(var6, var11, var3, var2);
			var6 = var10;
			var10 = Rasterizer3D.method3865(var8, var12, var3, var2);
			var12 = Rasterizer3D.method3866(var8, var12, var3, var2);
			ViewportMouse.field2492 = (var10 + var6) / 2;
			class249.field3118 = (var9 + var7) / 2;
			ViewportMouse.field2497 = (var12 + var11) / 2;
			ViewportMouse.field2496 = (var10 - var6) / 2;
			WorldMapDecoration.field2082 = (var9 - var7) / 2;
			DirectByteArrayCopier.field3126 = (var12 - var11) / 2;
			class161.field1920 = Math.abs(ViewportMouse.field2496);
			class15.field140 = Math.abs(WorldMapDecoration.field2082);
			ApproximateRouteStrategy.field629 = Math.abs(DirectByteArrayCopier.field3126);
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-828545505"
	)
	static final void method2547(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = MilliClock.method2588();
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) {
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) {
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = MouseRecorder.method2098(var2);
				}

				if (Client.menuOptionsCount > 2) {
					var3 = var3 + class44.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				Widget.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}
