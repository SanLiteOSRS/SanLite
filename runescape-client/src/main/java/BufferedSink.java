import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lv")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("f")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("e")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 992988875
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("y")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1280134095
	)
	@Export("position")
	int position;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1968641393
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("m")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("r")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.outputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1288409472"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) {
			try {
				this.outputStream.close();
				if (this.exception == null) {
					this.exception = new IOException("");
				}
			} catch (IOException var2) {
				if (this.exception == null) {
					this.exception = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-765694644"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) {
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1;
					}

					if (var5 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.limit <= this.capacity) {
							System.arraycopy(var1, var2, this.buffer, this.limit, var3);
						} else {
							int var6 = this.capacity - this.limit;
							System.arraycopy(var1, var2, this.buffer, this.limit, var6);
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6);
						}

						this.limit = (var3 + this.limit) % this.capacity;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			this.closed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position <= this.limit) {
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.outputStream.flush();
					} catch (IOException var11) {
						this.exception = var11;
						return;
					}

					if (this.isClosed()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var12) {
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) {
					this.outputStream.write(this.buffer, this.position, var1);
				} else {
					int var7 = this.capacity - this.position;
					this.outputStream.write(this.buffer, this.position, var7);
					this.outputStream.write(this.buffer, 0, var1 - var7);
				}
			} catch (IOException var10) {
				IOException var2 = var10;
				synchronized(this) {
					this.exception = var2;
					return;
				}
			}

			synchronized(this) {
				this.position = (var1 + this.position) % this.capacity;
			}
		} while(!this.isClosed());

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "14"
	)
	static int method5990(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
		}

		Script.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class262.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			ChatChannel.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class250.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3011 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3011;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-452745506"
	)
	static void method5992() {
		PacketBufferNode var0 = InterfaceParent.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(class302.getWindowedMode());
		var0.packetBuffer.writeShort(AttackOption.canvasWidth);
		var0.packetBuffer.writeShort(class0.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
