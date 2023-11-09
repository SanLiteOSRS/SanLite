import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("aj")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("al")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -215647093
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ab")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1767803785
	)
	@Export("position")
	int position;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1407565077
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("av")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("aq")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.position = 0; // L: 193
		this.limit = 0; // L: 194
		this.outputStream = var1; // L: 199
		this.capacity = var2 + 1; // L: 200
		this.buffer = new byte[this.capacity]; // L: 201
		this.thread = new Thread(this); // L: 202
		this.thread.setDaemon(true); // L: 203
		this.thread.start(); // L: 204
	} // L: 205

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "27683152"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) { // L: 208
			try {
				this.outputStream.close(); // L: 210
				if (this.exception == null) {
					this.exception = new IOException(""); // L: 211
				}
			} catch (IOException var2) { // L: 213
				if (this.exception == null) {
					this.exception = new IOException(var2); // L: 214
				}
			}

			return true; // L: 216
		} else {
			return false; // L: 218
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1927805716"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 268
			synchronized(this) { // L: 269
				if (this.exception != null) { // L: 270
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) { // L: 272
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1; // L: 273
					}

					if (var5 < var3) {
						throw new IOException(""); // L: 274
					} else {
						if (var3 + this.limit <= this.capacity) { // L: 275
							System.arraycopy(var1, var2, this.buffer, this.limit, var3); // L: 276
						} else {
							int var6 = this.capacity - this.limit; // L: 279
							System.arraycopy(var1, var2, this.buffer, this.limit, var6); // L: 280
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6); // L: 281
						}

						this.limit = (var3 + this.limit) % this.capacity; // L: 283
						this.notifyAll(); // L: 284
					}
				}
			}
		} else {
			throw new IOException();
		}
	} // L: 286

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1959704308"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 289
			this.closed = true; // L: 290
			this.notifyAll(); // L: 291
		} // L: 292

		try {
			this.thread.join(); // L: 294
		} catch (InterruptedException var3) { // L: 296
		}

	} // L: 297

	public void run() {
		do {
			int var1;
			synchronized(this) { // L: 224
				while (true) {
					if (this.exception != null) { // L: 226
						return;
					}

					if (this.position <= this.limit) { // L: 227
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit; // L: 228
					}

					if (var1 > 0) { // L: 229
						break;
					}

					try {
						this.outputStream.flush(); // L: 231
					} catch (IOException var11) { // L: 233
						this.exception = var11; // L: 234
						return; // L: 235
					}

					if (this.isClosed()) { // L: 237
						return;
					}

					try {
						this.wait(); // L: 239
					} catch (InterruptedException var12) { // L: 241
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) { // L: 245
					this.outputStream.write(this.buffer, this.position, var1); // L: 246
				} else {
					int var7 = this.capacity - this.position; // L: 249
					this.outputStream.write(this.buffer, this.position, var7); // L: 250
					this.outputStream.write(this.buffer, 0, var1 - var7); // L: 251
				}
			} catch (IOException var10) { // L: 254
				IOException var2 = var10;
				synchronized(this) { // L: 255
					this.exception = var2; // L: 256
					return; // L: 257
				}
			}

			synchronized(this) { // L: 260
				this.position = (var1 + this.position) % this.capacity; // L: 261
			} // L: 262
		} while(!this.isClosed()); // L: 263

	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1819755426"
	)
	static final void method7747(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = Occluder.method4563(var5, var6); // L: 5521
		int var7 = 2048 - var3 & 2047; // L: 5522
		int var8 = 2048 - var4 & 2047; // L: 5523
		int var9 = 0; // L: 5524
		int var10 = 0; // L: 5525
		int var11 = var5; // L: 5526
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5527
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5528
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5529
			var14 = var10 * var13 - var12 * var5 >> 16; // L: 5530
			var11 = var12 * var10 + var13 * var5 >> 16; // L: 5531
			var10 = var14; // L: 5532
		}

		if (var8 != 0) { // L: 5534
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5535
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5536
			var14 = var12 * var11 + var9 * var13 >> 16; // L: 5537
			var11 = var13 * var11 - var12 * var9 >> 16; // L: 5538
			var9 = var14; // L: 5539
		}

		if (Client.isCameraLocked) { // L: 5541
			class364.field4333 = var0 - var9; // L: 5542
			Coord.field3432 = var1 - var10; // L: 5543
			class307.field3449 = var2 - var11; // L: 5544
			WorldMapRectangle.field2963 = var3; // L: 5545
			KeyHandler.field154 = var4; // L: 5546
		} else {
			class381.cameraX = var0 - var9; // L: 5549
			class351.cameraY = var1 - var10; // L: 5550
			class471.cameraZ = var2 - var11; // L: 5551
			class311.cameraPitch = var3; // L: 5552
			class110.cameraYaw = var4; // L: 5553
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX >> 7 != BuddyRankComparator.localPlayer.x >> 7 || ReflectionCheck.oculusOrbFocalPointY >> 7 != BuddyRankComparator.localPlayer.y >> 7)) { // L: 5555 5556
			var12 = BuddyRankComparator.localPlayer.plane; // L: 5557
			var13 = GameEngine.baseX * 64 + (GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX >> 7); // L: 5558
			var14 = class178.baseY * 64 + (ReflectionCheck.oculusOrbFocalPointY >> 7); // L: 5559
			class163.method3359(var13, var14, var12, true); // L: 5560
		}

	} // L: 5563
}
