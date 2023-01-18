import java.awt.FontMetrics;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("h")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1199730995
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("av")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "0"
	)
	public static void method2719(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IIIIIII)V",
		garbageValue = "-1974916673"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104; // L: 175
		int var8;
		if (var7) { // L: 177
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 178

			while (true) {
				var8 = Client.field515 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort(); // L: 180
				if (var8 == 0) { // L: 181
					if (var1 == 0) { // L: 182
						int[] var15 = Tiles.Tiles_heights[0][var2]; // L: 183
						int var12 = var4 + 932731; // L: 186
						int var13 = var5 + 556238; // L: 187
						int var14 = World.method1801(var12 + 45365, var13 + 91923, 4) - 128 + (World.method1801(10294 + var12, var13 + 37821, 2) - 128 >> 1) + (World.method1801(var12, var13, 1) - 128 >> 2); // L: 189
						var14 = (int)((double)var14 * 0.3D) + 35; // L: 190
						if (var14 < 10) { // L: 191
							var14 = 10;
						} else if (var14 > 60) { // L: 192
							var14 = 60;
						}

						var15[var3] = -var14 * 8; // L: 195
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 197
					}
					break;
				}

				if (var8 == 1) { // L: 200
					int var9 = var0.readUnsignedByte(); // L: 201
					if (var9 == 1) { // L: 202
						var9 = 0;
					}

					if (var1 == 0) { // L: 203
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8; // L: 204
					}
					break;
				}

				if (var8 <= 49) { // L: 207
					class490.field5062[var1][var2][var3] = Client.field515 < 209 ? (short)var0.readByte() : (short)var0.readShort(); // L: 208
					Tiles.field1033[var1][var2][var3] = (byte)((var8 - 2) / 4); // L: 209
					class358.field4344[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3); // L: 210
				} else if (var8 <= 81) { // L: 213
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49); // L: 214
				} else {
					Tiles.field1028[var1][var2][var3] = (short)(var8 - 81); // L: 217
				}
			}
		} else {
			while (true) {
				var8 = Client.field515 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort(); // L: 222
				if (var8 == 0) { // L: 223
					break;
				}

				if (var8 == 1) { // L: 224
					var0.readUnsignedByte(); // L: 225
					break; // L: 226
				}

				if (var8 <= 49) { // L: 228
					if (Client.field515 < 209) { // L: 229
						var0.readByte(); // L: 230
					} else {
						var0.readShort(); // L: 233
					}
				}
			}
		}

	} // L: 238
}
