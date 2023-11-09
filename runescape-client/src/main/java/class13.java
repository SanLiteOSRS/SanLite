import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("u")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 292
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable(); // L: 297
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3); // L: 301
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2); // L: 305
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqz;II)V",
		garbageValue = "-751482834"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 189
		if (var2) { // L: 190
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 191
		Player var4 = Client.players[var1]; // L: 192
		if (var3 == 0) { // L: 193
			if (var2) { // L: 194
				var4.field1111 = false; // L: 195
			} else if (Client.localPlayerIndex == var1) { // L: 198
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (Decimator.baseX * 64 + var4.pathX[0] >> 13 << 14) + (class7.baseY * 64 + var4.pathY[0] >> 13); // L: 199
				if (var4.field1162 != -1) { // L: 200
					Players.Players_orientations[var1] = var4.field1162;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 201
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 202
				Client.players[var1] = null; // L: 203
				if (var0.readBits(1) != 0) { // L: 204
					class118.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 207
				var5 = var0.readBits(3); // L: 208
				var6 = var4.pathX[0]; // L: 209
				var7 = var4.pathY[0]; // L: 210
				if (var5 == 0) { // L: 211
					--var6; // L: 212
					--var7; // L: 213
				} else if (var5 == 1) { // L: 215
					--var7;
				} else if (var5 == 2) { // L: 216
					++var6; // L: 217
					--var7; // L: 218
				} else if (var5 == 3) { // L: 220
					--var6;
				} else if (var5 == 4) { // L: 221
					++var6;
				} else if (var5 == 5) { // L: 222
					--var6; // L: 223
					++var7; // L: 224
				} else if (var5 == 6) { // L: 226
					++var7;
				} else if (var5 == 7) { // L: 227
					++var6; // L: 228
					++var7; // L: 229
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 231
					var4.resetPath(var6, var7); // L: 232
					var4.field1111 = false; // L: 233
				} else if (var2) { // L: 235
					var4.field1111 = true; // L: 236
					var4.tileX = var6; // L: 237
					var4.tileY = var7; // L: 238
				} else {
					var4.field1111 = false; // L: 241
					var4.method2131(var6, var7, Players.field1298[var1]); // L: 242
				}

			} else if (var3 == 2) { // L: 246
				var5 = var0.readBits(4); // L: 247
				var6 = var4.pathX[0]; // L: 248
				var7 = var4.pathY[0]; // L: 249
				if (var5 == 0) { // L: 250
					var6 -= 2; // L: 251
					var7 -= 2; // L: 252
				} else if (var5 == 1) { // L: 254
					--var6; // L: 255
					var7 -= 2; // L: 256
				} else if (var5 == 2) { // L: 258
					var7 -= 2;
				} else if (var5 == 3) { // L: 259
					++var6; // L: 260
					var7 -= 2; // L: 261
				} else if (var5 == 4) { // L: 263
					var6 += 2; // L: 264
					var7 -= 2; // L: 265
				} else if (var5 == 5) { // L: 267
					var6 -= 2; // L: 268
					--var7; // L: 269
				} else if (var5 == 6) { // L: 271
					var6 += 2; // L: 272
					--var7; // L: 273
				} else if (var5 == 7) { // L: 275
					var6 -= 2;
				} else if (var5 == 8) { // L: 276
					var6 += 2;
				} else if (var5 == 9) { // L: 277
					var6 -= 2; // L: 278
					++var7; // L: 279
				} else if (var5 == 10) { // L: 281
					var6 += 2; // L: 282
					++var7; // L: 283
				} else if (var5 == 11) { // L: 285
					var6 -= 2; // L: 286
					var7 += 2; // L: 287
				} else if (var5 == 12) { // L: 289
					--var6; // L: 290
					var7 += 2; // L: 291
				} else if (var5 == 13) { // L: 293
					var7 += 2;
				} else if (var5 == 14) { // L: 294
					++var6; // L: 295
					var7 += 2; // L: 296
				} else if (var5 == 15) { // L: 298
					var6 += 2; // L: 299
					var7 += 2; // L: 300
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 302
					if (var2) { // L: 306
						var4.field1111 = true; // L: 307
						var4.tileX = var6; // L: 308
						var4.tileY = var7; // L: 309
					} else {
						var4.field1111 = false; // L: 312
						var4.method2131(var6, var7, Players.field1298[var1]); // L: 313
					}
				} else {
					var4.resetPath(var6, var7); // L: 303
					var4.field1111 = false; // L: 304
				}

			} else {
				var5 = var0.readBits(1); // L: 317
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 318
					var6 = var0.readBits(12); // L: 319
					var7 = var6 >> 10; // L: 320
					var8 = var6 >> 5 & 31; // L: 321
					if (var8 > 15) { // L: 322
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 323
					if (var9 > 15) { // L: 324
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 325
					var11 = var9 + var4.pathY[0]; // L: 326
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 327
						if (var2) { // L: 331
							var4.field1111 = true; // L: 332
							var4.tileX = var10; // L: 333
							var4.tileY = var11; // L: 334
						} else {
							var4.field1111 = false; // L: 337
							var4.method2131(var10, var11, Players.field1298[var1]); // L: 338
						}
					} else {
						var4.resetPath(var10, var11); // L: 328
						var4.field1111 = false; // L: 329
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 340
					if (Client.localPlayerIndex == var1) { // L: 341
						class268.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 344
					var7 = var6 >> 28; // L: 345
					var8 = var6 >> 14 & 16383; // L: 346
					var9 = var6 & 16383; // L: 347
					var10 = (Decimator.baseX * 64 + var8 + var4.pathX[0] & 16383) - Decimator.baseX * 64; // L: 348
					var11 = (class7.baseY * 64 + var9 + var4.pathY[0] & 16383) - class7.baseY * 64; // L: 349
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 350
						var4.resetPath(var10, var11); // L: 351
						var4.field1111 = false; // L: 352
					} else if (var2) { // L: 354
						var4.field1111 = true; // L: 355
						var4.tileX = var10; // L: 356
						var4.tileY = var11; // L: 357
					} else {
						var4.field1111 = false; // L: 360
						var4.method2131(var10, var11, Players.field1298[var1]); // L: 361
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 363
					if (Client.localPlayerIndex == var1) { // L: 364
						class268.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 196 205 244 315 342 365

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1238151208"
	)
	static void method165() {
		class116.method2683(24); // L: 1903
		ItemComposition.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1904
	} // L: 1905

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(III)Lgr;",
		garbageValue = "-1254170840"
	)
	static RouteStrategy method164(int var0, int var1) {
		Client.field691.approxDestinationX = var0; // L: 8183
		Client.field691.approxDestinationY = var1; // L: 8184
		Client.field691.approxDestinationSizeX = 1; // L: 8185
		Client.field691.approxDestinationSizeY = 1; // L: 8186
		return Client.field691; // L: 8187
	}
}
