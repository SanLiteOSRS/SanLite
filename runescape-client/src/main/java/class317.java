import java.io.DataInputStream;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class317 implements Comparator {
	class317() {
	} // L: 688

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lll;Lll;I)I",
		garbageValue = "-1564510989"
	)
	int method6058(class310 var1, class310 var2) {
		return var1.field3459 - var2.field3459; // L: 691
	}

	public int compare(Object var1, Object var2) {
		return this.method6058((class310)var1, (class310)var2); // L: 695
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 699
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "-83"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					var2 = HealthBarUpdate.method2427(var1);
				}

				if (var0 != null) { // L: 36
					if (var1 != null) { // L: 37
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 38
				}

				System.out.println("Error: " + var2); // L: 40
				var2 = var2.replace(':', '.'); // L: 41
				var2 = var2.replace('@', '_'); // L: 42
				var2 = var2.replace('&', '_'); // L: 43
				var2 = var2.replace('#', '_'); // L: 44
				if (RunException.RunException_applet == null) { // L: 45
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5235 + "&u=" + RunException.field5234 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5236 + "&e=" + var2); // L: 46
				DataInputStream var4 = new DataInputStream(var3.openStream()); // L: 47
				var4.read(); // L: 48
				var4.close(); // L: 49
			} catch (Exception var5) { // L: 51
			}

		}
	} // L: 52

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "-1456057901"
	)
	static final void method6057(Widget var0) {
		if (var0.buttonType == 1) { // L: 11356
			class134.method3047(var0.field3753, "", 24, 0, 0, var0.id, var0.itemId); // L: 11357
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11360
			var1 = class13.Widget_getSpellActionName(var0); // L: 11361
			if (var1 != null) { // L: 11362
				class134.method3047(var1, MusicPatchPcmStream.colorStartTag(65280) + var0.field3752, 25, 0, -1, var0.id, var0.itemId); // L: 11363
			}
		}

		if (var0.buttonType == 3) { // L: 11367
			JagexCache.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11368
		}

		if (var0.buttonType == 4) { // L: 11371
			JagexCache.insertMenuItemNoShift(var0.field3753, "", 28, 0, 0, var0.id); // L: 11372
		}

		if (var0.buttonType == 5) { // L: 11375
			JagexCache.insertMenuItemNoShift(var0.field3753, "", 29, 0, 0, var0.id); // L: 11376
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11379
			JagexCache.insertMenuItemNoShift(var0.field3753, "", 30, 0, -1, var0.id); // L: 11380
		}

		if (var0.isIf3) { // L: 11383
			if (Client.isSpellSelected) { // L: 11384
				if (WorldMapRectangle.method5509(UserComparator8.getWidgetFlags(var0)) && (PcmPlayer.selectedSpellFlags & 32) == 32) { // L: 11385
					class134.method3047(Client.field636, Client.field734 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11386
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) { // L: 11391
					String var9 = class212.method4141(var0, var6); // L: 11392
					if (var9 != null) { // L: 11393
						class134.method3047(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11394
					}
				}

				var1 = class13.Widget_getSpellActionName(var0); // L: 11398
				if (var1 != null) { // L: 11399
					class134.method3047(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11400
				}

				for (int var2 = 4; var2 >= 0; --var2) { // L: 11403
					int var5 = UserComparator8.getWidgetFlags(var0); // L: 11407
					boolean var4 = (var5 >> var2 + 1 & 1) != 0; // L: 11409
					String var7;
					if (!var4 && var0.onOp == null) { // L: 11411
						var7 = null; // L: 11412
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11415
						var7 = var0.actions[var2]; // L: 11419
					} else {
						var7 = null; // L: 11416
					}

					if (var7 != null) { // L: 11422
						class7.method45(var7, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11423
					}
				}

				int var3 = UserComparator8.getWidgetFlags(var0); // L: 11428
				boolean var10 = (var3 & 1) != 0; // L: 11430
				if (var10) { // L: 11432
					JagexCache.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11433
				}
			}
		}

	} // L: 11438
}
