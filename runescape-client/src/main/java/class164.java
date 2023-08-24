import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class164 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "2043897954"
	)
	public static int[] method3322(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) { // L: 164
			int[] var1 = new int[var0.length]; // L: 167

			for (int var2 = 0; var2 < var0.length; ++var2) { // L: 168
				if (var0[var2] < 0 || var0[var2] > class538.field5261.length) { // L: 169
					return null; // L: 170
				}

				var1[var2] = class538.field5261[var0[var2]]; // L: 172
			}

			return var1; // L: 174
		} else {
			return null; // L: 165
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1654219145"
	)
	static final void method3324() {
		if (Client.field772 != HealthBar.Client_plane) { // L: 3669
			Client.field772 = HealthBar.Client_plane; // L: 3670
			class17.method262(HealthBar.Client_plane); // L: 3671
		}

	} // L: 3673

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1697845802"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		GrandExchangeOfferOwnWorldComparator.scrollBarSprites[0].drawAt(var0, var1); // L: 11155
		GrandExchangeOfferOwnWorldComparator.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11156
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field607); // L: 11157
		int var5 = var3 * (var3 - 32) / var4; // L: 11158
		if (var5 < 8) { // L: 11159
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11160
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field718); // L: 11161
		Rasterizer2D.method9385(var0, var6 + var1 + 16, var5, Client.field798); // L: 11162
		Rasterizer2D.method9385(var0 + 1, var6 + var1 + 16, var5, Client.field798); // L: 11163
		Rasterizer2D.method9410(var0, var6 + var1 + 16, 16, Client.field798); // L: 11164
		Rasterizer2D.method9410(var0, var6 + var1 + 17, 16, Client.field798); // L: 11165
		Rasterizer2D.method9385(var0 + 15, var6 + var1 + 16, var5, Client.field609); // L: 11166
		Rasterizer2D.method9385(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field609); // L: 11167
		Rasterizer2D.method9410(var0, var5 + var6 + var1 + 15, 16, Client.field609); // L: 11168
		Rasterizer2D.method9410(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field609); // L: 11169
	} // L: 11170
}
