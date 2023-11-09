import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class335 {
	@ObfuscatedName("au")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 702273735
	)
	static int field3834;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class330[] var2 = class4.method17(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class330 var4 = var2[var3]; // L: 14
			if (var4.field3796 > var0) {
				var0 = var4.field3796; // L: 16
			}

			if (var4.field3797 > var1) { // L: 17
				var1 = var4.field3797;
			}
		}

	} // L: 21

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "-478627331"
	)
	static final void method6599(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) { // L: 10693
			var1 = var0.field3699; // L: 10694
			var2 = var0.id; // L: 10695
			var3 = var0.itemId; // L: 10696
			SceneTilePaint.method4912(var1, "", 24, 0, 0, var2, var3, false); // L: 10698
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 10702
			var1 = MusicPatchNode.Widget_getSpellActionName(var0); // L: 10703
			if (var1 != null) { // L: 10704
				class138.method3204(var1, class383.colorStartTag(65280) + var0.field3698, 25, 0, -1, var0.id, var0.itemId); // L: 10705
			}
		}

		if (var0.buttonType == 3) { // L: 10709
			MenuAction.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 10710
		}

		if (var0.buttonType == 4) { // L: 10713
			MenuAction.insertMenuItemNoShift(var0.field3699, "", 28, 0, 0, var0.id); // L: 10714
		}

		if (var0.buttonType == 5) { // L: 10717
			MenuAction.insertMenuItemNoShift(var0.field3699, "", 29, 0, 0, var0.id); // L: 10718
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 10721
			MenuAction.insertMenuItemNoShift(var0.field3699, "", 30, 0, -1, var0.id); // L: 10722
		}

		if (var0.isIf3) { // L: 10725
			if (Client.isSpellSelected) { // L: 10726
				if (ScriptEvent.method2258(class25.getWidgetFlags(var0)) && (SecureRandomFuture.selectedSpellFlags & 32) == 32) { // L: 10727
					class138.method3204(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 10728
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) { // L: 10733
					int var4 = class25.getWidgetFlags(var0); // L: 10737
					boolean var11 = (var4 >> var6 + 1 & 1) != 0; // L: 10739
					String var9;
					if (!var11 && var0.onOp == null) { // L: 10741
						var9 = null; // L: 10742
					} else if (var0.actions != null && var0.actions.length > var6 && var0.actions[var6] != null && var0.actions[var6].trim().length() != 0) { // L: 10745
						var9 = var0.actions[var6]; // L: 10749
					} else {
						var9 = null; // L: 10746
					}

					if (var9 != null) { // L: 10752
						class138.method3204(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId); // L: 10753
					}
				}

				var1 = MusicPatchNode.Widget_getSpellActionName(var0); // L: 10757
				if (var1 != null) { // L: 10758
					class138.method3204(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 10759
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 10762
					int var5 = class25.getWidgetFlags(var0); // L: 10766
					boolean var12 = (var5 >> var2 + 1 & 1) != 0; // L: 10768
					String var7;
					if (!var12 && var0.onOp == null) { // L: 10770
						var7 = null; // L: 10771
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 10774
						var7 = var0.actions[var2]; // L: 10778
					} else {
						var7 = null; // L: 10775
					}

					if (var7 != null) { // L: 10781
						SceneTilePaint.method4912(var7, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 10782
					}
				}

				var3 = class25.getWidgetFlags(var0); // L: 10787
				boolean var10 = (var3 & 1) != 0; // L: 10789
				if (var10) { // L: 10791
					MenuAction.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 10792
				}
			}
		}

	} // L: 10797
}
