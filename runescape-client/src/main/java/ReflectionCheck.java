import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1477135249
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -130340467
	)
	@Export("size")
	int size;
	@ObfuscatedName("ac")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("aw")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ay")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ap")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("av")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("an")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2120761690"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Projectile.addChatMessage(var0, var1, var2, (String)null); // L: 23
	} // L: 24

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "14"
	)
	static int method701(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 570
		Widget var4;
		if (var0 >= 2000) { // L: 572
			var0 -= 1000; // L: 573
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 574
			var4 = Interpreter.getWidget(var3); // L: 575
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 577
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 578
			Interpreter.Interpreter_intStackSize -= 4; // L: 579
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 580
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 581
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 582
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 583
			class303.invalidateWidget(var4); // L: 584
			class415.client.alignWidget(var4); // L: 585
			if (var3 != -1 && var4.type == 0) { // L: 586
				class238.revalidateWidgetScroll(class179.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 587
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 589
			Interpreter.Interpreter_intStackSize -= 4; // L: 590
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 591
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 592
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 593
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 594
			class303.invalidateWidget(var4); // L: 595
			class415.client.alignWidget(var4); // L: 596
			if (var3 != -1 && var4.type == 0) { // L: 597
				class238.revalidateWidgetScroll(class179.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 598
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 600
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 601
			if (var5 != var4.isHidden) { // L: 602
				var4.isHidden = var5; // L: 603
				class303.invalidateWidget(var4); // L: 604
			}

			return 1; // L: 606
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 608
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 609
			return 1; // L: 610
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 612
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 613
			return 1; // L: 614
		} else {
			return 2; // L: 616
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "0"
	)
	static final void method702(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8319

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8320 8321 8326
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8322
				var10 = var11; // L: 8323
				break;
			}
		}

		if (var10 == null) { // L: 8328
			var10 = new PendingSpawn(); // L: 8329
			var10.plane = var0; // L: 8330
			var10.type = var3; // L: 8331
			var10.x = var1; // L: 8332
			var10.y = var2; // L: 8333
			var10.field1174 = -1; // L: 8334
			MilliClock.method3630(var10); // L: 8335
			Client.pendingSpawns.addFirst(var10); // L: 8336
		}

		var10.field1168 = var4; // L: 8338
		var10.field1171 = var5; // L: 8339
		var10.field1170 = var6; // L: 8340
		var10.delay = var8; // L: 8341
		var10.hitpoints = var9; // L: 8342
		var10.method2418(var7); // L: 8343
	} // L: 8344

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldm;",
		garbageValue = "736438369"
	)
	static final InterfaceParent method703(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12362
		var3.group = var1; // L: 12363
		var3.type = var2; // L: 12364
		Client.interfaceParents.put(var3, (long)var0); // L: 12365
		class451.Widget_resetModelFrames(var1); // L: 12366
		Widget var4 = Interpreter.getWidget(var0); // L: 12367
		class303.invalidateWidget(var4); // L: 12368
		if (Client.meslayerContinueWidget != null) { // L: 12369
			class303.invalidateWidget(Client.meslayerContinueWidget); // L: 12370
			Client.meslayerContinueWidget = null; // L: 12371
		}

		class238.revalidateWidgetScroll(class179.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12373
		class1.runWidgetOnLoadListener(var1); // L: 12374
		if (Client.rootInterface != -1) { // L: 12375
			class295.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12376
	}
}
