import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fl")
public class class155 extends class145 {
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	static ArchiveDisk field1730;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1154179727
	)
	int field1731;
	@ObfuscatedName("aw")
	String field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class155(class148 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1731 = var1.readInt(); // L: 326
		this.field1728 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3338(this.field1731, this.field1728); // L: 331
	} // L: 332

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "1"
	)
	static void method3318(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 26
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 27
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 29
					return; // L: 30
				} catch (Exception var5) { // L: 32
				}
			}

			if (class31.field160.startsWith("win") && !var3) { // L: 34 35
				AbstractSocket.method8473(var0, 0, "openjs"); // L: 37
				return; // L: 39
			}

			if (class31.field160.startsWith("mac")) { // L: 42
				AbstractSocket.method8473(var0, 1, var2); // L: 43
				return; // L: 44
			}

			AbstractSocket.method8473(var0, 2, "openjs"); // L: 47
		} else {
			AbstractSocket.method8473(var0, 3, "openjs"); // L: 52
		}

	} // L: 55

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1815025797"
	)
	static int method3310(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1371
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1372
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1373
			return 1; // L: 1374
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1376
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1377
			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1380
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1381
			return 1; // L: 1382
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1384
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1385
			return 1; // L: 1386
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1388
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1389
			return 1; // L: 1390
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1392
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1393
			return 1; // L: 1394
		} else {
			return 2; // L: 1396
		}
	}
}
