import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class20 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -323821295
	)
	final int field107;
	@ObfuscatedName("an")
	final Map field105;
	@ObfuscatedName("av")
	final String field103;

	class20(String var1) {
		this.field107 = 400; // L: 35
		this.field105 = null; // L: 36
		this.field103 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field107 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field105 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field107 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field103 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1671621028"
	)
	public int method299() {
		return this.field107; // L: 41
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "6"
	)
	public Map method298() {
		return this.field105; // L: 45
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1995708520"
	)
	public String method302() {
		return this.field103; // L: 49
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "67341545"
	)
	static final void method305(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9154
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9155
				Client.field723[var4] = true;
			}
		}

	} // L: 9157

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIIIIII)V",
		garbageValue = "1532178928"
	)
	static final void method304(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field585) { // L: 11125
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11126
		}

		Client.field585 = false; // L: 11127
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11128
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11129
				var0.scrollY -= 4; // L: 11130
				Messages.invalidateWidget(var0); // L: 11131
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11133
				var0.scrollY += 4; // L: 11134
				Messages.invalidateWidget(var0); // L: 11135
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11137
				var7 = var3 * (var3 - 32) / var4; // L: 11138
				if (var7 < 8) { // L: 11139
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11140
				int var9 = var3 - 32 - var7; // L: 11141
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11142
				Messages.invalidateWidget(var0); // L: 11143
				Client.field585 = true; // L: 11144
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11147
			var7 = var0.width; // L: 11148
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11149
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11150
				Messages.invalidateWidget(var0); // L: 11151
			}
		}

	} // L: 11154
}
