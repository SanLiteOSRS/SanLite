import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class130 implements class121 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILip;Liz;B)Z",
		garbageValue = "-117"
	)
	static final boolean method3028(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 197
		int var5 = var1; // L: 198
		byte var6 = 64; // L: 199
		byte var7 = 64; // L: 200
		int var8 = var0 - var6; // L: 201
		int var9 = var1 - var7; // L: 202
		class212.directions[var6][var7] = 99; // L: 203
		class212.distances[var6][var7] = 0; // L: 204
		byte var10 = 0; // L: 205
		int var11 = 0; // L: 206
		class212.bufferX[var10] = var0; // L: 207
		byte var10001 = var10;
		int var18 = var10 + 1;
		class212.bufferY[var10001] = var1; // L: 208
		int[][] var12 = var3.flags; // L: 209

		while (var18 != var11) { // L: 210
			var4 = class212.bufferX[var11]; // L: 211
			var5 = class212.bufferY[var11]; // L: 212
			var11 = var11 + 1 & 4095; // L: 213
			int var16 = var4 - var8; // L: 214
			int var17 = var5 - var9; // L: 215
			int var13 = var4 - var3.xInset; // L: 216
			int var14 = var5 - var3.yInset; // L: 217
			if (var2.hasArrived(2, var4, var5, var3)) { // L: 218
				class212.field2344 = var4; // L: 219
				class83.field1035 = var5; // L: 220
				return true; // L: 221
			}

			int var15 = class212.distances[var16][var17] + 1; // L: 223
			if (var16 > 0 && class212.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) { // L: 224 225 226 227
				class212.bufferX[var18] = var4 - 1; // L: 228
				class212.bufferY[var18] = var5; // L: 229
				var18 = var18 + 1 & 4095; // L: 230
				class212.directions[var16 - 1][var17] = 2; // L: 231
				class212.distances[var16 - 1][var17] = var15; // L: 232
			}

			if (var16 < 126 && class212.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) { // L: 234 235 236 237
				class212.bufferX[var18] = var4 + 1; // L: 238
				class212.bufferY[var18] = var5; // L: 239
				var18 = var18 + 1 & 4095; // L: 240
				class212.directions[var16 + 1][var17] = 8; // L: 241
				class212.distances[var16 + 1][var17] = var15; // L: 242
			}

			if (var17 > 0 && class212.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) { // L: 244 245 246 247
				class212.bufferX[var18] = var4; // L: 248
				class212.bufferY[var18] = var5 - 1; // L: 249
				var18 = var18 + 1 & 4095; // L: 250
				class212.directions[var16][var17 - 1] = 1; // L: 251
				class212.distances[var16][var17 - 1] = var15; // L: 252
			}

			if (var17 < 126 && class212.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) { // L: 254 255 256 257
				class212.bufferX[var18] = var4; // L: 258
				class212.bufferY[var18] = var5 + 1; // L: 259
				var18 = var18 + 1 & 4095; // L: 260
				class212.directions[var16][var17 + 1] = 4; // L: 261
				class212.distances[var16][var17 + 1] = var15; // L: 262
			}

			if (var16 > 0 && var17 > 0 && class212.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) { // L: 264 265 266 267 268
				class212.bufferX[var18] = var4 - 1; // L: 269
				class212.bufferY[var18] = var5 - 1; // L: 270
				var18 = var18 + 1 & 4095; // L: 271
				class212.directions[var16 - 1][var17 - 1] = 3; // L: 272
				class212.distances[var16 - 1][var17 - 1] = var15; // L: 273
			}

			if (var16 < 126 && var17 > 0 && class212.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) { // L: 275 276 277 278 279
				class212.bufferX[var18] = var4 + 1; // L: 280
				class212.bufferY[var18] = var5 - 1; // L: 281
				var18 = var18 + 1 & 4095; // L: 282
				class212.directions[var16 + 1][var17 - 1] = 9; // L: 283
				class212.distances[var16 + 1][var17 - 1] = var15; // L: 284
			}

			if (var16 > 0 && var17 < 126 && class212.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) { // L: 286 287 288 289 290
				class212.bufferX[var18] = var4 - 1; // L: 291
				class212.bufferY[var18] = var5 + 1; // L: 292
				var18 = var18 + 1 & 4095; // L: 293
				class212.directions[var16 - 1][var17 + 1] = 6; // L: 294
				class212.distances[var16 - 1][var17 + 1] = var15; // L: 295
			}

			if (var16 < 126 && var17 < 126 && class212.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) { // L: 297 298 299 300 301
				class212.bufferX[var18] = var4 + 1; // L: 302
				class212.bufferY[var18] = var5 + 1; // L: 303
				var18 = var18 + 1 & 4095; // L: 304
				class212.directions[var16 + 1][var17 + 1] = 12; // L: 305
				class212.distances[var16 + 1][var17 + 1] = var15; // L: 306
			}
		}

		class212.field2344 = var4; // L: 309
		class83.field1035 = var5; // L: 310
		return false; // L: 311
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-900441843"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsp;",
		garbageValue = "1901804570"
	)
	static IndexedSprite[] method3031() {
		IndexedSprite[] var0 = new IndexedSprite[class492.SpriteBuffer_spriteCount]; // L: 145

		for (int var1 = 0; var1 < class492.SpriteBuffer_spriteCount; ++var1) { // L: 146
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 147
			var2.width = class492.SpriteBuffer_spriteWidth; // L: 148
			var2.height = class492.SpriteBuffer_spriteHeight; // L: 149
			var2.xOffset = class492.SpriteBuffer_xOffsets[var1]; // L: 150
			var2.yOffset = Canvas.SpriteBuffer_yOffsets[var1]; // L: 151
			var2.subWidth = InterfaceParent.SpriteBuffer_spriteWidths[var1]; // L: 152
			var2.subHeight = class144.SpriteBuffer_spriteHeights[var1]; // L: 153
			var2.palette = class181.SpriteBuffer_spritePalette; // L: 154
			var2.pixels = class144.SpriteBuffer_pixels[var1]; // L: 155
		}

		FriendsList.method7473(); // L: 157
		return var0; // L: 158
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1363946201"
	)
	static final void method3030(boolean var0) {
		if (var0) { // L: 3004
			Client.field518 = Login.field914 ? class136.field1594 : class136.field1596; // L: 3005
		} else {
			Client.field518 = WorldMapSectionType.clientPreferences.method2452(Login.Login_username) ? class136.field1593 : class136.field1595; // L: 3008
		}

	} // L: 3010

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-801479046"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.field3091, Client.packetWriter.isaacCipher); // L: 9592
		var2.packetBuffer.writeShort(var1); // L: 9593
		var2.packetBuffer.method8671(var0); // L: 9594
		Client.packetWriter.addNode(var2); // L: 9595
	} // L: 9596
}
