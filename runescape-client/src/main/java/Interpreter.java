import java.awt.Desktop;
import java.awt.FontMetrics;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -1034939264
	)
	static int field947;
	@ObfuscatedName("t")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("v")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("b")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("q")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("x")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1509964487
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("j")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("f")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field950;
	@ObfuscatedName("w")
	static boolean field951;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 991337999
	)
	static int field956;
	@ObfuscatedName("aj")
	static final double field953;
	@ObfuscatedName("aw")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field950 = false;
		field951 = false;
		field956 = 0;
		field953 = Math.log(2.0D);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "710417468"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class44.field305.startsWith("win")) {
				class9.method98(var0, 0);
			} else if (class44.field305.startsWith("mac")) {
				class230.method4348(var0, 1, "openjs");
			} else {
				class9.method98(var0, 2);
			}
		} else {
			class9.method98(var0, 3);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZS)I",
		garbageValue = "-19668"
	)
	static int method1921(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = DevicePcmPlayerProvider.getWidget(Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
		}

		VerticalAlignment.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class35.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			int var4 = Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			int var5 = Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = Strings.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3019 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3019;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-4124956"
	)
	static int method1808(int var0) {
		return (int)((Math.log((double)var0) / field953 - 7.0D) * 256.0D);
	}
}
