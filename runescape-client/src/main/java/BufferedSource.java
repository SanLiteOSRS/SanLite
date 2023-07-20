import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("aw")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ay")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -391637301
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("am")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 475016461
	)
	@Export("position")
	int position;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1521298383
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("ag")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0; // L: 66
		this.limit = 0; // L: 67
		this.inputStream = var1; // L: 71
		this.capacity = var2 + 1; // L: 72
		this.buffer = new byte[this.capacity]; // L: 73
		this.thread = new Thread(this); // L: 74
		this.thread.setDaemon(true); // L: 75
		this.thread.start(); // L: 76
	} // L: 77

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1308813308"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "647536706"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1535921504"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 142
			if (this.position == this.limit) { // L: 143
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1691910602"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1404907821"
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
			synchronized(this) { // L: 82
				while (true) {
					if (this.exception != null) { // L: 84
						return;
					}

					if (this.position == 0) { // L: 85
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) { // L: 86
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1; // L: 87
					}

					if (var1 > 0) { // L: 88
						break;
					}

					try {
						this.wait(); // L: 90
					} catch (InterruptedException var10) { // L: 92
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

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "9"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = MouseRecorder.getWidgetChild(var1, var2); // L: 10088
		if (var5 != null) { // L: 10089
			if (var5.onOp != null) { // L: 10090
				ScriptEvent var6 = new ScriptEvent(); // L: 10091
				var6.widget = var5; // L: 10092
				var6.opIndex = var0; // L: 10093
				var6.targetName = var4; // L: 10094
				var6.args = var5.onOp; // L: 10095
				GrandExchangeOfferOwnWorldComparator.runScriptEvent(var6); // L: 10096
			}

			boolean var11 = true; // L: 10098
			if (var5.contentType > 0) { // L: 10099
				var11 = class467.method8437(var5);
			}

			if (var11) { // L: 10100
				int var8 = UserComparator8.getWidgetFlags(var5); // L: 10102
				int var9 = var0 - 1; // L: 10103
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10105
				if (var7) { // L: 10107
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10110
						var10 = class503.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 10112
						var10.packetBuffer.writeInt(var1); // L: 10113
						var10.packetBuffer.writeShort(var2); // L: 10114
						var10.packetBuffer.writeShort(var3); // L: 10115
						Client.packetWriter.addNode(var10); // L: 10116
					}

					if (var0 == 2) { // L: 10118
						var10 = class503.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 10120
						var10.packetBuffer.writeInt(var1); // L: 10121
						var10.packetBuffer.writeShort(var2); // L: 10122
						var10.packetBuffer.writeShort(var3); // L: 10123
						Client.packetWriter.addNode(var10); // L: 10124
					}

					if (var0 == 3) { // L: 10126
						var10 = class503.getPacketBufferNode(ClientPacket.field3096, Client.packetWriter.isaacCipher); // L: 10128
						var10.packetBuffer.writeInt(var1); // L: 10129
						var10.packetBuffer.writeShort(var2); // L: 10130
						var10.packetBuffer.writeShort(var3); // L: 10131
						Client.packetWriter.addNode(var10); // L: 10132
					}

					if (var0 == 4) { // L: 10134
						var10 = class503.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 10136
						var10.packetBuffer.writeInt(var1); // L: 10137
						var10.packetBuffer.writeShort(var2); // L: 10138
						var10.packetBuffer.writeShort(var3); // L: 10139
						Client.packetWriter.addNode(var10); // L: 10140
					}

					if (var0 == 5) { // L: 10142
						var10 = class503.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 10144
						var10.packetBuffer.writeInt(var1); // L: 10145
						var10.packetBuffer.writeShort(var2); // L: 10146
						var10.packetBuffer.writeShort(var3); // L: 10147
						Client.packetWriter.addNode(var10); // L: 10148
					}

					if (var0 == 6) { // L: 10150
						var10 = class503.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher); // L: 10152
						var10.packetBuffer.writeInt(var1); // L: 10153
						var10.packetBuffer.writeShort(var2); // L: 10154
						var10.packetBuffer.writeShort(var3); // L: 10155
						Client.packetWriter.addNode(var10); // L: 10156
					}

					if (var0 == 7) { // L: 10158
						var10 = class503.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 10160
						var10.packetBuffer.writeInt(var1); // L: 10161
						var10.packetBuffer.writeShort(var2); // L: 10162
						var10.packetBuffer.writeShort(var3); // L: 10163
						Client.packetWriter.addNode(var10); // L: 10164
					}

					if (var0 == 8) { // L: 10166
						var10 = class503.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 10168
						var10.packetBuffer.writeInt(var1); // L: 10169
						var10.packetBuffer.writeShort(var2); // L: 10170
						var10.packetBuffer.writeShort(var3); // L: 10171
						Client.packetWriter.addNode(var10); // L: 10172
					}

					if (var0 == 9) { // L: 10174
						var10 = class503.getPacketBufferNode(ClientPacket.field3119, Client.packetWriter.isaacCipher); // L: 10176
						var10.packetBuffer.writeInt(var1); // L: 10177
						var10.packetBuffer.writeShort(var2); // L: 10178
						var10.packetBuffer.writeShort(var3); // L: 10179
						Client.packetWriter.addNode(var10); // L: 10180
					}

					if (var0 == 10) { // L: 10182
						var10 = class503.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 10184
						var10.packetBuffer.writeInt(var1); // L: 10185
						var10.packetBuffer.writeShort(var2); // L: 10186
						var10.packetBuffer.writeShort(var3); // L: 10187
						Client.packetWriter.addNode(var10); // L: 10188
					}

				}
			}
		}
	} // L: 10108 10190
}
