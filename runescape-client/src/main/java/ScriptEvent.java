import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ai")
	@Export("args")
	Object[] args;
	@ObfuscatedName("aj")
	boolean field1074;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1292644207
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1299316113
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -968705449
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2072453003
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1894525465
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("az")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2051284605
	)
	int field1077;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -84148979
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "633862964"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lme;S)V",
		garbageValue = "-6458"
	)
	public void method2309(Widget var1) {
		this.widget = var1; // L: 30
	} // L: 31

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lme;B)V",
		garbageValue = "1"
	)
	static final void method2314(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) { // L: 11273
			var1 = var0.field3677; // L: 11274
			var2 = var0.id; // L: 11275
			var3 = var0.itemId; // L: 11276
			StructComposition.method3990(var1, "", 24, 0, 0, var2, var3, false); // L: 11278
		}

		int var4;
		String var8;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11282
			var1 = class108.Widget_getSpellActionName(var0); // L: 11283
			if (var1 != null) { // L: 11284
				var8 = class17.colorStartTag(65280) + var0.field3756; // L: 11285
				var3 = var0.id; // L: 11286
				var4 = var0.itemId; // L: 11287
				StructComposition.method3990(var1, var8, 25, 0, -1, var3, var4, false); // L: 11289
			}
		}

		if (var0.buttonType == 3) { // L: 11294
			class238.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11295
		}

		if (var0.buttonType == 4) { // L: 11298
			class238.insertMenuItemNoShift(var0.field3677, "", 28, 0, 0, var0.id); // L: 11299
		}

		if (var0.buttonType == 5) { // L: 11302
			class238.insertMenuItemNoShift(var0.field3677, "", 29, 0, 0, var0.id); // L: 11303
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11306
			class238.insertMenuItemNoShift(var0.field3677, "", 30, 0, -1, var0.id); // L: 11307
		}

		if (var0.isIf3) { // L: 11310
			int var5;
			if (Client.isSpellSelected) { // L: 11311
				if (SecureRandomFuture.method2177(class19.getWidgetFlags(var0)) && (class13.selectedSpellFlags & 32) == 32) { // L: 11312
					var1 = Client.field665; // L: 11313
					var8 = Client.field666 + " " + "->" + " " + var0.dataText; // L: 11314
					var3 = var0.childIndex; // L: 11315
					var4 = var0.id; // L: 11316
					var5 = var0.itemId; // L: 11317
					StructComposition.method3990(var1, var8, 58, 0, var3, var4, var5, false); // L: 11319
				}
			} else {
				String var10;
				for (int var9 = 9; var9 >= 5; --var9) { // L: 11325
					var8 = class132.method3125(var0, var9); // L: 11326
					if (var8 != null) { // L: 11327
						var10 = var0.dataText; // L: 11328
						var4 = var9 + 1; // L: 11329
						var5 = var0.childIndex; // L: 11330
						int var6 = var0.id; // L: 11331
						int var7 = var0.itemId; // L: 11332
						StructComposition.method3990(var8, var10, 1007, var4, var5, var6, var7, false); // L: 11334
					}
				}

				var1 = class108.Widget_getSpellActionName(var0); // L: 11339
				if (var1 != null) { // L: 11340
					var8 = var0.dataText; // L: 11341
					var3 = var0.childIndex; // L: 11342
					var4 = var0.id; // L: 11343
					var5 = var0.itemId; // L: 11344
					StructComposition.method3990(var1, var8, 25, 0, var3, var4, var5, false); // L: 11346
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11350
					var10 = class132.method3125(var0, var2); // L: 11351
					if (var10 != null) { // L: 11352
						StructComposition.method3990(var10, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11353
					}
				}

				var3 = class19.getWidgetFlags(var0); // L: 11358
				boolean var11 = (var3 & 1) != 0; // L: 11360
				if (var11) { // L: 11362
					class238.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11363
				}
			}
		}

	} // L: 11368

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lme;S)Lme;",
		garbageValue = "23598"
	)
	static Widget method2318(Widget var0) {
		Widget var1 = NPC.method2687(var0); // L: 12085
		if (var1 == null) {
			var1 = var0.parent; // L: 12086
		}

		return var1; // L: 12087
	}
}
