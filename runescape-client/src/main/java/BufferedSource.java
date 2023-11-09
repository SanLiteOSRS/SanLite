import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("a")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("f")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1382594299
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("x")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1854647413
	)
	@Export("position")
	int position;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 993907297
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("y")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0;
		this.limit = 0; // L: 67
		this.inputStream = var1; // L: 71
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity]; // L: 73
		this.thread = new Thread(this); // L: 74
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "29157"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) { // L: 113
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 114
			synchronized(this) { // L: 115
				int var3;
				if (this.position <= this.limit) { // L: 117
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 118
				}

				if (var3 < var1) { // L: 119
					if (this.exception != null) { // L: 120
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll(); // L: 121
						return false; // L: 122
					}
				} else {
					return true; // L: 124
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2130958003"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) { // L: 129
			int var2;
			if (this.position <= this.limit) { // L: 131
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit; // L: 132
			}

			if (var2 <= 0 && this.exception != null) { // L: 133
				throw new IOException(this.exception.toString()); // L: 134
			} else {
				this.notifyAll(); // L: 136
				return var2; // L: 137
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1744196611"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 142
			if (this.limit == this.position) { // L: 143
				if (this.exception != null) { // L: 144
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 145
				}
			} else {
				int var2 = this.buffer[this.position] & 255; // L: 147
				this.position = (this.position + 1) % this.capacity; // L: 148
				this.notifyAll(); // L: 149
				return var2; // L: 150
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "74"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 155
			synchronized(this) { // L: 156
				int var5;
				if (this.position <= this.limit) { // L: 158
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit; // L: 159
				}

				if (var3 > var5) { // L: 160
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) { // L: 161
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 162
						System.arraycopy(this.buffer, this.position, var1, var2, var3); // L: 163
					} else {
						int var6 = this.capacity - this.position; // L: 166
						System.arraycopy(this.buffer, this.position, var1, var2, var6); // L: 167
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6); // L: 168
					}

					this.position = (var3 + this.position) % this.capacity; // L: 170
					this.notifyAll(); // L: 171
					return var3; // L: 172
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "326056098"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 177
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 178
			}

			this.notifyAll(); // L: 179
		}

		try {
			this.thread.join(); // L: 182
		} catch (InterruptedException var3) { // L: 184
		}

	} // L: 185

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position == 0) {
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) {
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1;
					}

					if (var1 > 0) { // L: 88
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1); // L: 97
				if (var7 == -1) {
					throw new EOFException(); // L: 98
				}
			} catch (IOException var11) { // L: 100
				IOException var3 = var11;
				synchronized(this) { // L: 101
					this.exception = var3; // L: 102
					return; // L: 103
				}
			}

			synchronized(this) { // L: 106
				this.limit = (var7 + this.limit) % this.capacity; // L: 107
			} // L: 108
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIB)[Lri;",
		garbageValue = "-36"
	)
	public static SpritePixels[] method7532(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 64
		boolean var3;
		if (var4 == null) { // L: 65
			var3 = false; // L: 66
		} else {
			class335.SpriteBuffer_decode(var4); // L: 69
			var3 = true; // L: 70
		}

		if (!var3) { // L: 72
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class477.SpriteBuffer_spriteCount]; // L: 75

			for (int var6 = 0; var6 < class477.SpriteBuffer_spriteCount; ++var6) { // L: 76
				SpritePixels var7 = var5[var6] = new SpritePixels(); // L: 77
				var7.width = class477.SpriteBuffer_spriteWidth; // L: 78
				var7.height = class477.SpriteBuffer_spriteHeight; // L: 79
				var7.xOffset = class451.SpriteBuffer_xOffsets[var6]; // L: 80
				var7.yOffset = class319.SpriteBuffer_yOffsets[var6]; // L: 81
				var7.subWidth = class450.SpriteBuffer_spriteWidths[var6]; // L: 82
				var7.subHeight = class477.SpriteBuffer_spriteHeights[var6]; // L: 83
				int var8 = var7.subHeight * var7.subWidth; // L: 84
				byte[] var9 = class453.SpriteBuffer_pixels[var6]; // L: 85
				var7.pixels = new int[var8]; // L: 86

				for (int var10 = 0; var10 < var8; ++var10) { // L: 87
					var7.pixels[var10] = class477.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class451.SpriteBuffer_xOffsets = null; // L: 90
			class319.SpriteBuffer_yOffsets = null; // L: 91
			class450.SpriteBuffer_spriteWidths = null; // L: 92
			class477.SpriteBuffer_spriteHeights = null; // L: 93
			class477.SpriteBuffer_spritePalette = null; // L: 94
			class453.SpriteBuffer_pixels = null; // L: 95
			return var5; // L: 99
		}
	}
}
