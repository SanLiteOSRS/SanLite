import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ni")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("o")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1; // L: 12
		this.socket.setSoTimeout(30000); // L: 13
		this.socket.setTcpNoDelay(true); // L: 14
		this.socket.setReceiveBufferSize(65536); // L: 15
		this.socket.setSendBufferSize(65536); // L: 16
		this.source = new BufferedSource(this.socket.getInputStream(), var2); // L: 17
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3); // L: 18
	} // L: 19

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-17"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-717230257"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "354179744"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "42"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1292249553"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1642633675"
	)
	@Export("close")
	public void close() {
		this.sink.close(); // L: 48

		try {
			this.socket.close(); // L: 50
		} catch (IOException var2) { // L: 52
		}

		this.source.close(); // L: 53
	} // L: 54

	protected void finalize() {
		this.close(); // L: 58
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llc;Ljava/lang/String;Ljava/lang/String;B)Lql;",
		garbageValue = "21"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 92
		int var4 = var0.getFileId(var3, var2); // L: 93
		return class174.method3444(var0, var3, var4); // L: 94
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "-74"
	)
	static int method6883(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1420
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1421
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemId; // L: 1422
			return 1; // L: 1423
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1425
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1426
			if (var3.itemId != -1) { // L: 1427
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1428
			}

			return 1; // L: 1429
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1431
			int var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1432
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1433
			if (var4 != null) { // L: 1434
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 1435
			}

			return 1; // L: 1436
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1438
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1439
			return 1; // L: 1440
		} else if (var0 == 2707) { // L: 1442
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1443
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.method5640() ? 1 : 0; // L: 1444
			return 1; // L: 1445
		} else if (var0 == 2708) { // L: 1447
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1448
			return PacketWriter.method2600(var3); // L: 1449
		} else if (var0 == 2709) { // L: 1451
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1452
			return HealthBar.method2410(var3); // L: 1453
		} else {
			return 2; // L: 1455
		}
	}
}
