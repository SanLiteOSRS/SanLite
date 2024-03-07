import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class169 extends class145 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1880688967
	)
	int field1829;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5589666788794460147L
	)
	long field1827;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class169(class148 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1829 = var1.readInt(); // L: 310
		this.field1827 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3337(this.field1829, this.field1827); // L: 315
	} // L: 316

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1501143177"
	)
	public static void method3521(int var0, int var1) {
		ScriptFrame.method1158(var0, var1, 0, 0); // L: 64
		class321.field3484.clear(); // L: 65
		class321.field3481.clear(); // L: 66
		if (!class321.field3474.isEmpty() && (var0 != 0 || var1 != 0)) { // L: 67
			class321.field3481.add(new class421((class425)null, class321.field3483)); // L: 68
			class321.field3481.add(new class423((class425)null, 0, false, class321.field3476)); // L: 69
			ArrayList var10 = new ArrayList(); // L: 72
			Iterator var4 = class321.field3474.iterator(); // L: 73

			while (var4.hasNext()) {
				class333 var5 = (class333)var4.next(); // L: 74
				var10.add(var5); // L: 76
			}

			class321.field3481.add(new class420((class425)null, var10)); // L: 82
		} else {
			Iterator var2 = class321.field3474.iterator(); // L: 86

			while (true) {
				class333 var3;
				do {
					if (!var2.hasNext()) {
						class321.field3474.clear(); // L: 108
						return; // L: 111
					}

					var3 = (class333)var2.next(); // L: 87
				} while(var3 == null); // L: 89

				var3.field3594.clear(); // L: 92
				var3.field3594.method6202(); // L: 93
				var3.field3594.setPcmStreamVolume(0); // L: 94
				var3.field3594.field3518 = 0; // L: 95
				int var8 = var3.field3590; // L: 96
				int var9 = var3.field3591; // L: 97
				Iterator var6 = class321.field3482.iterator(); // L: 99

				while (var6.hasNext()) {
					class327 var7 = (class327)var6.next(); // L: 100
					var7.vmethod6339(var8, var9); // L: 102
				}
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	static final void method3518() {
		int var0 = class245.menuX; // L: 9254
		int var1 = Decimator.menuY; // L: 9255
		int var2 = class60.menuWidth; // L: 9256
		int var3 = class167.menuHeight; // L: 9257
		int var4 = 6116423; // L: 9258
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9259
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9260
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9261
		class166.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9262
		int var5 = MouseHandler.MouseHandler_x; // L: 9263
		int var6 = MouseHandler.MouseHandler_y; // L: 9264

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9265
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 9266
			int var9 = 16777215; // L: 9267
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9268
				var9 = 16776960;
			}

			Font var10 = class166.fontBold12; // L: 9269
			String var11;
			if (var7 < 0) { // L: 9272
				var11 = ""; // L: 9273
			} else if (Client.menuTargets[var7].length() > 0) { // L: 9276
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7]; // L: 9277
			}

			var10.draw(var11, var0 + 3, var8, var9, 0); // L: 9279
		}

		class106.method2774(class245.menuX, Decimator.menuY, class60.menuWidth, class167.menuHeight); // L: 9281
	} // L: 9282
}
