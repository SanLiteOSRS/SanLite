import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class153 extends class143 {
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	static class360 field1700;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 176567155
	)
	int field1699;
	@ObfuscatedName("ay")
	String field1698;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class153(class146 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1699 = var1.readInt(); // L: 326
		this.field1698 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3288(this.field1699, this.field1698); // L: 331
	} // L: 332

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "769155110"
	)
	public static String method3222(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "871826027"
	)
	public static String method3218(String var0) {
		int var1 = var0.length(); // L: 186
		char[] var2 = new char[var1]; // L: 187
		byte var3 = 2; // L: 188

		for (int var4 = 0; var4 < var1; ++var4) { // L: 189
			char var5 = var0.charAt(var4); // L: 190
			if (var3 == 0) { // L: 191
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 192
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 195
					var6 = Character.toTitleCase(var5); // L: 199
				} else {
					var6 = var5; // L: 196
				}

				var5 = var6; // L: 201
			}

			if (Character.isLetter(var5)) {
				var3 = 0; // L: 203
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 204
				if (Character.isSpaceChar(var5)) { // L: 205
					if (var3 != 2) { // L: 206
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 208
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 209
		}

		return new String(var2); // L: 211
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1514663394"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class302.scrollBarSprites[0].drawAt(var0, var1); // L: 11239
		class302.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11240
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field593); // L: 11241
		int var5 = var3 * (var3 - 32) / var4; // L: 11242
		if (var5 < 8) { // L: 11243
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11244
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field594); // L: 11245
		Rasterizer2D.method9440(var0, var6 + var1 + 16, var5, Client.field772); // L: 11246
		Rasterizer2D.method9440(var0 + 1, var6 + var1 + 16, var5, Client.field772); // L: 11247
		Rasterizer2D.method9438(var0, var6 + var1 + 16, 16, Client.field772); // L: 11248
		Rasterizer2D.method9438(var0, var6 + var1 + 17, 16, Client.field772); // L: 11249
		Rasterizer2D.method9440(var0 + 15, var6 + var1 + 16, var5, Client.field595); // L: 11250
		Rasterizer2D.method9440(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field595); // L: 11251
		Rasterizer2D.method9438(var0, var6 + var5 + var1 + 15, 16, Client.field595); // L: 11252
		Rasterizer2D.method9438(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field595); // L: 11253
	} // L: 11254
}
