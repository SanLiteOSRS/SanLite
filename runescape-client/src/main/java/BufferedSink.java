import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("p")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1278151087
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("n")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1237984471
	)
	@Export("position")
	int position;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1164400029
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("s")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("q")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1606419175"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-45"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1266121497"
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
}
