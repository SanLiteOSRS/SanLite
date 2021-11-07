import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
public class class91 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "21"
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

			if (class29.field158.startsWith("win")) {
				Message.method1143(var0, 0);
			} else if (class29.field158.startsWith("mac")) {
				Occluder.method4485(var0, 1, "openjs");
			} else {
				Message.method1143(var0, 2);
			}
		} else {
			Message.method1143(var0, 3);
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lbw;",
		garbageValue = "-50"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? WorldMapEvent.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1496971599"
	)
	static int method2271(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class134.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					HorizontalAlignment.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class14.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					class14.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--class14.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					class295.Interpreter_stringStackSize -= 2;
					--class14.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--class295.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class408.clientPreferences.windowMode = var3;
					Login.savePreferences();
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1813589022"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class6.fontPlain12.lineWidth(var0, 250);
			int var6 = class6.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
			class6.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var5 + var2;
			int var10 = var2 + var2 + var6;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
					Client.field594[var11] = true;
				}
			}

			if (var1) {
				Canvas.rasterProvider.drawFull(0, 0);
			} else {
				Language.method5516(var3, var4, var5, var6);
			}

		}
	}
}
